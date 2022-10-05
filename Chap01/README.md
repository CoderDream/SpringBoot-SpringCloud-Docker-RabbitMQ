

## 1.3 SpringBoot 编程起步



### 1. 选中文件夹，右键选使用IDEA打开

 ![image-20221005125628929](assets\image-20221005125628929.png)

### 2. 设置项目的Maven参数

 ![image-20221005125738341](assets\image-20221005125738341.png)

### 3. 分别执行Maven命令：clean和install

 ![image-20221005125437822](assets\image-20221005125437822.png)

### 4. 打开入口源文件，运行

 ![image-20221005125342014](assets\image-20221005125342014.png)

### 5. 控制台显示启动成功

默认端口为  8080

```
D:\03_Dev\jdk1.8.0_231\bin\java.exe ...
Connected to the target VM, address: '127.0.0.1:7779', transport: 'socket'

  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::        (v1.5.9.RELEASE)

2022-10-05 13:03:02.626  INFO 25580 --- [           main] cn.mldn.bootstart.SampleController       : Starting SampleController on CD_Y9000P with PID 25580 (D:\04_GitHub\SpringBoot-SpringCloud-Docker-RabbitMQ\Chap01\bootstart\target\classes started by CoderDream in D:\04_GitHub\SpringBoot-SpringCloud-Docker-RabbitMQ\Chap01\bootstart)
2022-10-05 13:03:02.632  INFO 25580 --- [           main] cn.mldn.bootstart.SampleController       : No active profile set, falling back to default profiles: default
2022-10-05 13:03:02.740  INFO 25580 --- [           main] ationConfigEmbeddedWebApplicationContext : Refreshing org.springframework.boot.context.embedded.AnnotationConfigEmbeddedWebApplicationContext@33065d67: startup date [Wed Oct 05 13:03:02 CST 2022]; root of context hierarchy
2022-10-05 13:03:05.516  INFO 25580 --- [           main] s.b.c.e.t.TomcatEmbeddedServletContainer : Tomcat initialized with port(s): 8080 (http)
2022-10-05 13:03:05.528  INFO 25580 --- [           main] o.apache.catalina.core.StandardService   : Starting service [Tomcat]
2022-10-05 13:03:05.529  INFO 25580 --- [           main] org.apache.catalina.core.StandardEngine  : Starting Servlet Engine: Apache Tomcat/8.5.23
2022-10-05 13:03:05.680  INFO 25580 --- [ost-startStop-1] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring embedded WebApplicationContext
2022-10-05 13:03:05.680  INFO 25580 --- [ost-startStop-1] o.s.web.context.ContextLoader            : Root WebApplicationContext: initialization completed in 2940 ms
2022-10-05 13:03:05.912  INFO 25580 --- [ost-startStop-1] o.s.b.w.servlet.ServletRegistrationBean  : Mapping servlet: 'dispatcherServlet' to [/]
2022-10-05 13:03:05.919  INFO 25580 --- [ost-startStop-1] o.s.b.w.servlet.FilterRegistrationBean   : Mapping filter: 'characterEncodingFilter' to: [/*]
2022-10-05 13:03:05.919  INFO 25580 --- [ost-startStop-1] o.s.b.w.servlet.FilterRegistrationBean   : Mapping filter: 'hiddenHttpMethodFilter' to: [/*]
2022-10-05 13:03:05.919  INFO 25580 --- [ost-startStop-1] o.s.b.w.servlet.FilterRegistrationBean   : Mapping filter: 'httpPutFormContentFilter' to: [/*]
2022-10-05 13:03:05.919  INFO 25580 --- [ost-startStop-1] o.s.b.w.servlet.FilterRegistrationBean   : Mapping filter: 'requestContextFilter' to: [/*]
2022-10-05 13:03:06.420  INFO 25580 --- [           main] s.w.s.m.m.a.RequestMappingHandlerAdapter : Looking for @ControllerAdvice: org.springframework.boot.context.embedded.AnnotationConfigEmbeddedWebApplicationContext@33065d67: startup date [Wed Oct 05 13:03:02 CST 2022]; root of context hierarchy
2022-10-05 13:03:06.535  INFO 25580 --- [           main] s.w.s.m.m.a.RequestMappingHandlerMapping : Mapped "{[/]}" onto public java.lang.String cn.mldn.bootstart.SampleController.home()
2022-10-05 13:03:06.544  INFO 25580 --- [           main] s.w.s.m.m.a.RequestMappingHandlerMapping : Mapped "{[/error]}" onto public org.springframework.http.ResponseEntity<java.util.Map<java.lang.String, java.lang.Object>> org.springframework.boot.autoconfigure.web.BasicErrorController.error(javax.servlet.http.HttpServletRequest)
2022-10-05 13:03:06.545  INFO 25580 --- [           main] s.w.s.m.m.a.RequestMappingHandlerMapping : Mapped "{[/error],produces=[text/html]}" onto public org.springframework.web.servlet.ModelAndView org.springframework.boot.autoconfigure.web.BasicErrorController.errorHtml(javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)
2022-10-05 13:03:06.615  INFO 25580 --- [           main] o.s.w.s.handler.SimpleUrlHandlerMapping  : Mapped URL path [/webjars/**] onto handler of type [class org.springframework.web.servlet.resource.ResourceHttpRequestHandler]
2022-10-05 13:03:06.615  INFO 25580 --- [           main] o.s.w.s.handler.SimpleUrlHandlerMapping  : Mapped URL path [/**] onto handler of type [class org.springframework.web.servlet.resource.ResourceHttpRequestHandler]
2022-10-05 13:03:06.686  INFO 25580 --- [           main] o.s.w.s.handler.SimpleUrlHandlerMapping  : Mapped URL path [/**/favicon.ico] onto handler of type [class org.springframework.web.servlet.resource.ResourceHttpRequestHandler]
2022-10-05 13:03:06.957  INFO 25580 --- [           main] o.s.j.e.a.AnnotationMBeanExporter        : Registering beans for JMX exposure on startup
2022-10-05 13:03:07.008  INFO 25580 --- [           main] s.b.c.e.t.TomcatEmbeddedServletContainer : Tomcat started on port(s): 8080 (http)
2022-10-05 13:03:07.014  INFO 25580 --- [           main] cn.mldn.bootstart.SampleController       : Started SampleController in 5.355 seconds (JVM running for 10.379)

```

![image-20221005130444096](assets\image-20221005125256244.png)

### 6. 访问应用

```
http://localhost:8080/
```

 ![image-20221005130134671](assets\image-20221005130134671.png)