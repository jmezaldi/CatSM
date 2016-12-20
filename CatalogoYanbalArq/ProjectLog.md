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

    SRVE8109W: No se ha obtenido la excepci�n generada por el filtro springSecurityFilterChain: java.lang.ExceptionInInitializerError
     ....
    Caused by: java.lang.NoSuchMethodError: org.apache.commons.logging.LogFactory.getContextClassLoader()Ljava/lang/ClassLoader;

# DB2
- <http://stackoverflow.com/questions/20151009/duplicate-key-error-when-using-insert-default/20154742#20154742>
   
    ALTER TABLE CATALOGO.SOLUCION ALTER COLUMN ID RESTART WITH 75
- <http://blog.idleworx.com/2011/09/mybatis-dao-example-code-tutorial.html>
  
# REST API
- <http://www.vinaysahni.com/best-practices-for-a-pragmatic-restful-api>
- <http://www.java2blog.com/2016/04/spring-restful-web-services-crud-example.html>

# AngularJs, Router, UI Router, Component, Datatables, Resource
- <https://docs.angularjs.org/api/ng/service/$http>
- <https://docs.angularjs.org/api/ng/directive/ngOptions>
- <https://docs.angularjs.org/api/ng/directive/select>
- <https://docs.angularjs.org/api/ngRoute/directive/ngView>
- <https://docs.angularjs.org/guide/component>

- <https://toddmotto.com/exploring-the-angular-1-5-component-method/>
- <https://velesin.io/2016/05/18/communication-between-angular-1-5-components/>
- <http://www.angularjshub.com/examples/forms/formreset/>

- Ui Router
 - <http://stackoverflow.com/questions/39931983/angularjs-possible-unhandled-rejection-when-using-ui-router>
 - <https://ui-router.github.io/tutorial/ng1/hellosolarsystem>
 - <http://stackoverflow.com/questions/25647454/how-to-pass-parameters-using-ui-sref-in-ui-router-to-controller>
 - <https://github.com/angular-ui/ui-router/wiki/Quick-Reference#ui-sref>
- Compile 
 - <http://stackoverflow.com/questions/19977592/angular-ui-routers-ui-sref-created-dynamically-in-a-directive/24263737#24263737>
 - <https://docs.angularjs.org/api/ng/service/$compile>

- Resource
 - <https://www.sitepoint.com/creating-crud-app-minutes-angulars-resource/>
 - <https://docs.angularjs.org/api/ngResource/service/$resource>
 - <http://www.angularjshub.com/examples/servercalls/resourceservice/>
 