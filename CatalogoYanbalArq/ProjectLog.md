# Installation, Configuration WAS Liberty - Eclipse
- <http://stackoverflow.com/questions/25870162/project-facet-websphere-web-co-existence-version-8-0-is-not-supported>
- <https://developer.ibm.com/wasdev/getstarted/>
- <http://howtodoinjava.com/random-exceptions/solved-java-lang-classnotfoundexception-org-springframework-web-context-contextloaderlistener/>
- Admin Center
  - <https://developer.ibm.com/wasdev/downloads/#asset/features-com.ibm.websphere.appserver.adminCenter-1.0>
  - <http://www.ibm.com/support/knowledgecenter/SSEQTP_8.5.5/com.ibm.websphere.wlp.doc/ae/twlp_ui_login.html>

    <quickStartSecurity userName="admin" userPassword="adminpwd" />
    <!-- comment basicRegistry-->
- <http://www.ibm.com/support/knowledgecenter/SSRTLW_8.5.1/com.ibm.websphere.wlp.nd.multiplatform.doc/ae/rwlp_dirs.html>
- Use folder, not filset in library <https://developer.ibm.com/answers/questions/19024/how-to-add-log4j-properties-to-liberty-classpath.html>

    <library id="SharedLib">
        <folder
- JDBC name in ibm-web-bnd.xml. En jdbc-context.xml java:comp/env/XYZ enlaza a ibm-web-bnd.xml.
 - Usar jdbc/XYZ en server.xml
 - <http://developerscookbook.blogspot.pe/2009/10/configurar-un-datasource-mediante-jndi.html>
 - <http://www-01.ibm.com/support/docview.wss?uid=swg21106933>
- http://stackoverflow.com/questions/33417740/exceptions-using-latest-websphere-liberty-release/33422266#33422266

    Caused by: java.lang.NoClassDefFoundError: javax/xml/rpc/ServiceException
- Unsolved:

    SRVE8109W: No se ha obtenido la excepción generada por el filtro springSecurityFilterChain: java.lang.ExceptionInInitializerError
     ....
    Caused by: java.lang.NoSuchMethodError: org.apache.commons.logging.LogFactory.getContextClassLoader()Ljava/lang/ClassLoader;

# DB2
- <http://stackoverflow.com/questions/20151009/duplicate-key-error-when-using-insert-default/20154742#20154742>
   
    ALTER TABLE CATALOGO.SOLUCION ALTER COLUMN ID RESTART WITH 75
- <http://blog.idleworx.com/2011/09/mybatis-dao-example-code-tutorial.html>

# MyBatis
- <http://stackoverflow.com/questions/19136784/hibernate-throwing-an-unexpected-token-was-found-following/19138036#19138036>
- <https://www.toadworld.com/platforms/sql-server/w/wiki/10261.stored-procedures-output-parameters-return-values>
- <http://www.ibm.com/support/knowledgecenter/SSEPGG_9.7.0/com.ibm.db2.luw.sql.ref.doc/doc/r0004231.html>
  
# REST API, Spring REST
- <http://www.vinaysahni.com/best-practices-for-a-pragmatic-restful-api>
- <http://www.java2blog.com/2016/04/spring-restful-web-services-crud-example.html>
- <http://websystique.com/springmvc/spring-mvc-4-restful-web-services-crud-example-resttemplate/>
- Validation
 - <http://www.naturalprogrammer.com/spring-framework-rest-api-validation/>
 - <http://springinpractice.com/2013/10/09/generating-json-error-object-responses-with-spring-web-mvc>
 - <http://www.baeldung.com/exception-handling-for-rest-with-spring>
 - <https://spring.io/blog/2013/11/01/exception-handling-in-spring-mvc>.
 - <http://www.leveluplunch.com/java/tutorials/017-validate-spring-rest-webservice-request/>
 - <https://github.com/naturalprogrammer/spring-lemon/tree/master/src/main/java/com/naturalprogrammer/spring/lemon/validation>
 - <http://blog.trifork.com/2009/08/04/bean-validation-integrating-jsr-303-with-spring/>
 
 - <http://docs.spring.io/spring/docs/current/spring-framework-reference/html/validation.html>
 - <http://docs.spring.io/spring/docs/current/spring-framework-reference/html/mvc.html#mvc-config-validation> 
 - <http://www.mkyong.com/spring-mvc/spring-3-mvc-and-jsr303-valid-example/>
 - <http://www.java4s.com/spring-mvc/spring-mvc-annotation-jsr-303-bean-validation-with-valid-example/>
 
 - <http://www.codejava.net/frameworks/spring/spring-mvc-form-validation-example-with-bean-validation-api>
 - <http://hillert.blogspot.pe/2011/12/method-validation-with-hibernate.html>
 - <http://apprize.info/javascript/wrox/16.html>
 - <http://www.programering.com/a/MjM3AzNwATM.html>

# Spring, Security
- <http://www.java2blog.com/2016/09/spring-rest-spring-security-example.html>
 - <http://docs.spring.io/spring-security/site/docs/3.0.x/reference/appendix-namespace.html>
 - <https://github.com/spring-projects/spring-security/blob/master/web/src/main/java/org/springframework/security/web/authentication/LoginUrlAuthenticationEntryPoint.java>
 - <http://stackoverflow.com/questions/34087954/spring-security-how-to-add-a-redirect-query-parameter-to-the-login-url-to-allow/34091221#34091221>
 - <http://stackoverflow.com/questions/15847932/prevent-redirect-to-login-for-spring-security/15875641#15875641>
- <http://www.baeldung.com/securing-a-restful-web-service-with-spring-security>
- <https://malalanayake.wordpress.com/2014/06/27/spring-security-on-rest-api/>
- <https://spring.io/blog/2015/01/12/spring-and-angular-js-a-secure-single-page-application>
- <https://spring.io/blog/2015/01/12/the-login-page-angular-js-and-spring-security-part-ii>
- <https://spring.io/blog/2015/01/20/the-resource-server-angular-js-and-spring-security-part-iii>  
- <https://spring.io/guides/tutorials/spring-security-and-angular-js/>
- <http://stackoverflow.com/questions/10826293/restful-authentication-via-spring>
- <http://www.mkyong.com/tutorials/spring-security-tutorials/> 
- Token
 - <https://javattitude.com/2014/06/07/spring-security-custom-token-based-rest-authentication/>
 - <https://www.toptal.com/java/rest-security-with-jwt-spring-security-and-java>
- CSRF
 - <https://scotch.io/tutorials/the-ins-and-outs-of-token-based-authentication>
 - <https://stormpath.com/blog/angular-xsrf>
 - <https://docs.spring.io/spring-security/site/docs/current/reference/html/csrf.html>
- CORS
 - <https://gist.github.com/zeroows/80bbe076d15cb8a4f0ad>
 - <http://dontpanic.42.nl/2015/04/cors-with-spring-mvc.html>
- Get User
 - <https://www.mkyong.com/spring-security/get-current-logged-in-username-in-spring-security/> 
 - <http://www.baeldung.com/get-user-in-spring-security>
- 3 to 4
 - http://stackoverflow.com/questions/27469834/spring-security-j-spring-security-check-not-found-404/31497947#31497947

# AngularJs, Router, UI Router, Component, Datatables, Resource
- <https://docs.angularjs.org/api/ng/service/$http>
- <https://docs.angularjs.org/api/ng/directive/ngOptions>
- <https://docs.angularjs.org/api/ng/directive/select>
- <https://docs.angularjs.org/api/ngRoute/directive/ngView>
- <https://docs.angularjs.org/guide/component>

- <https://toddmotto.com/exploring-the-angular-1-5-component-method/>
- <https://velesin.io/2016/05/18/communication-between-angular-1-5-components/>
- <http://www.angularjshub.com/examples/forms/formreset/>

- <http://stackoverflow.com/questions/35639435/how-to-wait-for-binding-in-angular-1-5-component-without-scope-watch/35639523#35639523>

- Datatables
 - <http://l-lin.github.io/angular-datatables/archives/#/gettingStarted>

- Ui Router
 - <http://stackoverflow.com/questions/39931983/angularjs-possible-unhandled-rejection-when-using-ui-router>
 - <https://ui-router.github.io/tutorial/ng1/hellosolarsystem>
 - <http://stackoverflow.com/questions/25647454/how-to-pass-parameters-using-ui-sref-in-ui-router-to-controller>
 - <https://github.com/angular-ui/ui-router/wiki/Quick-Reference#ui-sref>
 - Breadcrumb <https://github.com/ncuillery/angular-breadcrumb/issues/170>
 - Component Resolve
  - <https://ui-router.github.io/guide/ng1/route-to-component>
  - <https://ui-router.github.io/guide/ng1/route-to-component#routed-parentchild-component-communication>
  
- Compile 
 - <http://stackoverflow.com/questions/19977592/angular-ui-routers-ui-sref-created-dynamically-in-a-directive/24263737#24263737>
 - <https://docs.angularjs.org/api/ng/service/$compile>

- Resource
 - <https://docs.angularjs.org/api/ngResource/service/$resource>
 - <https://www.sitepoint.com/creating-crud-app-minutes-angulars-resource/> 
 - <http://www.angularjshub.com/examples/servercalls/resourceservice/>
 
- Growl
 - <http://janstevens.github.io/angular-growl-2/>

- Loading bar
 - <https://github.com/chieffancypants/angular-loading-bar> 
 
- Http interceptor
 - <http://stackoverflow.com/questions/23851424/how-to-detect-when-online-offline-status-changes/24000804#24000804>
 - <http://stackoverflow.com/questions/19446755/on-and-broadcast-in-angular/19446975#19446975> 
 - <http://stackoverflow.com/questions/17494732/how-to-make-a-loading-indicator-for-every-asynchronous-action-using-q-in-an-a/19983576#19983576>
 
# CSS design, templates
- Bootstrap
 - <http://getbootstrap.com/examples/dashboard>
 - <http://getbootstrap.com/javascript/#collapse>
 - <http://www.webdesignerdepot.com/2014/02/how-to-create-horizontal-scrolling-using-display-table-cell/>
 - <http://bootsnipp.com/snippets/featured/navigation-sidebar-with-toggle>
 
 
 