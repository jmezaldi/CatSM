package com.yanbal.catalogo.util;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.zip.GZIPOutputStream;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletResponseWrapper;

import org.springframework.http.HttpHeaders;

public class CompressionFilter implements Filter {

    public void destroy() {
    }

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest httpRequest = (HttpServletRequest) request;
        HttpServletResponse httpResponse = (HttpServletResponse) response;
        if (acceptsGZipEncoding(httpRequest)) {
        	GZIPResponseWrapper gzipResponse = 
            		new GZIPResponseWrapper(httpResponse);
            chain.doFilter(request, gzipResponse);
            gzipResponse.finishResponse();
            return;
        }
        chain.doFilter(request, response);
    }

    public void init(FilterConfig filterConfig) throws ServletException {
    }
    private boolean acceptsGZipEncoding(HttpServletRequest httpRequest) {
        String acceptEncoding = httpRequest.getHeader(HttpHeaders.ACCEPT_ENCODING);

        return acceptEncoding != null && acceptEncoding.indexOf("gzip") != -1;
    }
}

class GZIPResponseWrapper extends HttpServletResponseWrapper {
	  protected HttpServletResponse origResponse = null;
	  protected ServletOutputStream stream = null;
	  protected PrintWriter writer = null;

	  public GZIPResponseWrapper(HttpServletResponse response) {
	    super(response);
	    origResponse = response;
	  }

	  public ServletOutputStream createOutputStream() throws IOException {
	    return (new GZIPResponseStream(origResponse));
	  }

	  public void finishResponse() {
	    try {
	      if (writer != null) {
	        writer.close();
	      } else {
	        if (stream != null) {
	          stream.close();
	        }
	      }
	    } catch (IOException e) {}
	  }

	  public void flushBuffer() throws IOException {
	    stream.flush();
	  }

	  public ServletOutputStream getOutputStream() throws IOException {
	    if (writer != null) {
	      throw new IllegalStateException("getWriter() has already been called!");
	    }

	    if (stream == null)
	      stream = createOutputStream();
	    return (stream);
	  }

	  public PrintWriter getWriter() throws IOException {
	    if (writer != null) {
	      return (writer);
	    }

	    if (stream != null) {
	      throw new IllegalStateException("getOutputStream() has already been called!");
	    }

	   stream = createOutputStream();
	   writer = new PrintWriter(new OutputStreamWriter(stream, "UTF-8"));
	   return (writer);
	  }

	  public void setContentLength(int length) {}
	}

class GZIPResponseStream extends ServletOutputStream {
	protected ByteArrayOutputStream baos = null;
	protected GZIPOutputStream gzipstream = null;
	protected boolean closed = false;
	protected HttpServletResponse response = null;
	protected ServletOutputStream output = null;

	public GZIPResponseStream(HttpServletResponse response) throws IOException {
		super();
		closed = false;
		this.response = response;
		this.output = response.getOutputStream();
		baos = new ByteArrayOutputStream();
		gzipstream = new GZIPOutputStream(baos);
	}

	public void close() throws IOException {
		if (closed) {
			throw new IOException("This output stream has already been closed");
		}
		gzipstream.finish();

		byte[] bytes = baos.toByteArray();

		response.addHeader(HttpHeaders.CONTENT_LENGTH, 
				Integer.toString(bytes.length));
		response.addHeader(HttpHeaders.CONTENT_ENCODING, "gzip");
		output.write(bytes);
		output.flush();
		output.close();
		closed = true;
	}

	public void flush() throws IOException {
		if (closed) {
			throw new IOException("Cannot flush a closed output stream");
		}
		gzipstream.flush();
	}

	public void write(int b) throws IOException {
		if (closed) {
			throw new IOException("Cannot write to a closed output stream");
		}
		gzipstream.write((byte) b);
	}

	public void write(byte b[]) throws IOException {
		write(b, 0, b.length);
	}

	public void write(byte b[], int off, int len) throws IOException {
		if (closed) {
			throw new IOException("Cannot write to a closed output stream");
		}
		gzipstream.write(b, off, len);
	}

	public boolean closed() {
		return (this.closed);
	}

	public void reset() {
		// noop
	}
}