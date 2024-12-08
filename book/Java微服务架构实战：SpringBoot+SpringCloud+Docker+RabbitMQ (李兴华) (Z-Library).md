![](/images/Image00000.jpg)


**本书封面贴有清华大学出版社防伪标签，无标签者不得销售。**

**版权所有，侵权必究。侵权举报电话：010-62782989　13701121933**

**图书在版编目（CIP）数据**

Java微服务架构实战：SpringBoot+SpringCloud+Docker+RabbitMQ／李兴华编著．---北京：清华大学出版社，2020.1

（名师讲坛）

ISBN 978-7-302-50607-2

Ⅰ．①J...　Ⅱ．①李...　Ⅲ．①JAVA语言－程序设计　Ⅳ．①TP312.8

中国版本图书馆CIP数据核字（2018）第151303号

**责任编辑：** 贾小红

**封面设计：** 魏润滋

**版式设计：** 楠竹文化

**责任校对：** 马军令

**责任印制：** 李红英

**出版发行：** 清华大学出版社

**网　　址：** http://www.tup.com.cn，http://www.wqbook.com

**地　　址：** 北京清华大学学研大厦A座

**邮　　编：** 100084

**社总 机：** 010-62770175

**邮　　购：** 010-62786544

**投稿与读者服务：** 010-62776969，c-service@tup.tsinghua.edu.cn

**质量反馈：** 010-62772015，zhiliang@tup.tsinghua.edu.cn

**印装 者：** 北京密云胶印厂

**经　　销：** 全国新华书店

**开　　本：** 185mm×260mm

**印　　张：** 19

**字　　数：** 475千字

**版　　次：** 2020年1月第1版

**印　　次：** 2020年1月第1次印刷

**定　　价：** 69.80元

*** ** * ** ***

产品编号：080068-01


内容简介 
==============

Java微服务架构是当下最为流行的软件架构设计方案，可以快速地进行代码编写与开发，维护起来也非常方便。利用微架构技术，可以轻松地实现高可用、分布式、高性能的项目结构开发，同时也更加安全。

本书一共15章，核心内容为SpringBoot、SpringCloud、Docker、RabbitMQ消息组件。其中，SpringBoot是SpringMVC技术的延伸，使用它进行程序开发会更简单，服务整合也会更容易。SpringCloud是当前微架构的核心技术方案，属于SpringBoot的技术延伸，它可以整合云服务，基于RabbitMQ和GITHUB进行微服务管理。除此以外，本书还重点分析了OAuth统一认证服务的应用。

本书适用于从事Java开发且有架构与项目重构需求的读者，也适用于相关技术爱好者，同时也可作为应用型高等院校及培训机构的学习教材。


作者简介 
==============

![](/images/Image00001.jpg)

李兴华，著名软件技术讲师，系统架构师，有多年的软件教学经验，技术研究与讲解的主要方向为数据库、编程语言、Web开发、框架服务、系统架构、手机移动开发、大数据等。从2008年开始进行图书创作，出版过Oracle、Android、Java、Python、Web编程等10多本畅销书籍，总销量近50万册，受到广大读者的一致好评。


前言 
============

**我们在用心做事，做最好的教育，写最好的原创图书。**

笔者是一名从事Java开发快二十年的技术爱好者，一位普通的培训班老师，喜欢和学生们一边开着玩笑，一边教会他们当下流行与实用的技术。很多时候我会跟学生说："信息产业是一个不断发展变化的行业，没有人可以精确预测这个行业的未来发展方向，更没有人可以在这个行业里拥有绝对的技术实力。同样，也没有永远不过时的技术。我们能做的只是努力地学习与提升，每一天都要在踩坑与填坑的路上不断爬行，磕磕碰碰习惯了，解决问题所花费的时间就越来越少了。想要在这个行业走得长远，一定要喜欢这个行业，喜欢钻研。"

遥想起2003年开源风在中国兴起时，SSH（Spring 1.x + Struts 1.x + Hibernate 2.x）整合开发框架是当时最大的技术亮点。作为开发者的我们，最大的感受是再也不需要去编写那些重复的代码了，利用开发框架我们几乎可以解决当时所有的问题。然而技术的经典是短暂的，随着时间的流逝，SSH的光环也不再辉煌。后来，有了SSH2（Spring 2.x + Struts 2.x + Hibernate 3.x），又有了SSM（Spring + Shiro + MyBatis）。随着开发框架的不断增加，以及Spring对各类开发框架的不断支持，新的问题出现了---参与整合的配置文件过多，项目的集成化太高。大家转而开始寻找新的解决方案。就在所有人都认为Pivotal公司（Spring项目所属公司）已经停滞不前的时候，其在2016年推出了一套完善的轻量级分布式解决方案，就是今天流行的微架构（或称微服务），之中的主要技术手段是SpringBoot + SpringCloud。

微架构的出现，很好地适应了这个时代对快速发展变化的要求。它不再提倡一体化的项目设计，而是对项目进行有效的"业务区"（可以简单理解为不同的子系统）划分，并利用合理的技术对业务性能做出提升和改善，同时又极大地简化了配置文件的使用与profile配置。总而言之，微架构是开发之中看起来非常简单的一种实现技术，但简单的背后考究的却是开发者对于开源技术的熟练程度。

SpringBoot作为一种Web整合开发框架，很好地解决了Web程序的编写困难，可以更简单、高效地实现MVC设计模式。更为重要的是，它可以轻松地整合当前各类主流的开发项目，如消息组件、SQL数据库、NoSQL数据库、邮件服务等，因此能极大地缩短项目的开发周期，更快地响应客户的需求变更。SpringCloud作为SpringBoot的延续，可以基于Restful流行架构实现RPC业务中心的搭建，可以基于消息组件实现远程配置动态的抓取，还可以与Docker相结合，采用虚拟化手段实现便捷的云服务管理。可以说，微架构的出现与云时代是密不可分的。

本书是笔者多年开发经验的总结，写作时力求能一针见血地分析透Java微服务的设计架构（见下图）与各类技术实现。全书围绕着当前的主流方案（高性能+高可用+分布式）进行展开，不仅讲解了所有微架构中的内容，还给出了真实有效的学习案例；不仅可以与虚拟化Docker整合开发，还可以实现大型企业分布式授权OAuth解决方案。可以说，本书就像Java微服务实现架构的一个技术宝典，读者学习后完全可以直接在实际项目之中进行应用。另外，由于微架构涉及到的技术非常广泛，对于某些技术还不十分清楚的读者，可以登录魔乐科技网站（www.mldn.cn）进行视频学习。  
![](/images/Image00002.jpg)

笔者崇尚原创，所出版的图书也均为原创。笔者将"技术实现优先"这一原则贯穿于全书，采用步骤分解的模式详细讲解每一步的开发，希望读者可以通过本书学习到微服务的技术精髓。另外，由于技术更新迭代过快，加之本人水平有限，书中难免有表达不到位或不明确的地方，欢迎读者批评指正，万分感谢。

创作不易。感谢我最爱的妻子和我的家人，是你们的付出与支持才让我可以安心创作，同时也祝福我年幼的儿子可以健康快乐地成长。

### 本书特色 

![](/images/Image00003.gif) 　资深Java讲师进行技术剖析，全面把握学习命脉，问题分析一针见血。

![](/images/Image00003.gif) 　140个课程案例，完美演示微服务的方方面面。

![](/images/Image00003.gif) 　基于Maven实现项目管理，与真实项目完美衔接。

![](/images/Image00003.gif) 　丰富的架构图示说明，轻松掌握微架构设计方案。

![](/images/Image00003.gif) 　手把手步骤学习法，轻松掌握微架构开发。

![](/images/Image00003.gif) 　OAuth使用分析与代码实现，掌握企业级RPC认证与授权解决方案。

![](/images/Image00003.gif) 　微服务与Docker虚拟化技术结合使用，轻松实现云服务。

### 本书章节安排 

全书涉及到的技术包括：SpringBoot、Thymeleaf、Jetty、Redis整合、C3P0整合、Druid整合、MyBatis整合、ActiveMQ整合、RabbitMQ整合、Kafka整合、Shiro整合、SpringDataJPA整合、Mail整合、Actuator监控、Restful、RestTemplate、Eureka、Ribbon、Feign、Hystrix、Turbine、Zuul、SpringCloudConfig、SpringCloudBus、SpringCloudStream、SpringCloudSleuth、Zipkin、OAuth、RabbitMQ和Docker。

考虑到学习层次，本书共分为3个组成部分：SpringBoot篇、SpringCloud篇和微服务辅助篇。

**第一部分：SpringBoot篇**

![](/images/Image00003.gif) 　**第1章　SpringBoot编程起步：** 本章将为读者讲解SpringBoot的发展背景与SpringBoot编程起步。

![](/images/Image00003.gif) 　**第2章　SpringBoot程序开发：** 本章将为读者详细讲解SpringBoot开发常用的各项技术，包括代码测试、Jetty配置、资源加载、访问路径、profile配置、项目打包等。

![](/images/Image00003.gif) 　**第3章　Thymeleaf模板渲染：** Thymeleaf是模板技术，也是当下Web开发中使用最多的一项技术，在SpringBoot中默认支持有此模板使用，本章将为读者讲解Thyemeleaf之中的使用语法以及与JSP语法的关联。

![](/images/Image00003.gif) 　**第4章　SpringBoot与Web应用：** 主要讲解https协议整合、Tomcat发布、全局异常处理、文件上传等。

![](/images/Image00003.gif) 　**第5章　SpringBoot服务整合：** 主要讲解C3P0、Druid、MyBatis、SpringDataJPA、ActiveMQ、RabbitMQ、Kafka、Redis、Shiro、Mail、Actuator监控等组件的整合应用。

**第二部分：SpringCloud篇**

![](/images/Image00003.gif) 　**第6章　SpringCloud简介：** 主要讲解RPC技术的主要作用及SpringCloud技术实现架构。

![](/images/Image00003.gif) 　**第7章　SpringCloud与Restful：** 主要讲解Restful架构的基础实现方案、RestTemplate调用微服务以及SpringSecurity基础认证处理。

![](/images/Image00003.gif) 　**第8章　Eureka注册服务：** 主要讲解Eureka的作用、Eureka微服务创建、Eureka集群搭建、打包部署等。

![](/images/Image00003.gif) 　**第9章　SpringCloud服务组件：** 主要讲解Ribbon负载均衡、Feign接口转换、Hystrix熔断机制以及Zuul代理机制。

![](/images/Image00003.gif) 　**第10章　SpringCloudConfig：** 与GitHub结合实现分布式配置文件管理、加密处理、SpringCloudBus更新服务。

![](/images/Image00003.gif) 　**第11章　SpringCloudStream：** 讲解微服务中信息采集的搭建，主要与RabbitMQ整合。

![](/images/Image00003.gif) 　**第12章　SpringCloudSleuth：** 讲解微服务调用监控跟踪、Zipkin、数据采集。

![](/images/Image00003.gif) 　**第13章　OAuth认证管理：** 分析SpringSecurity实现方案缺陷、OAuth与RPC结合流程，并基于SQL数据库与Redis数据库实现OAuth认证与授权管理。

**第三部分：微服务辅助篇**

![](/images/Image00003.gif) 　**第14章　RabbitMQ消息组件：** RabbitMQ与Spring微服务有着密不可分的关联，本章将为读者讲解RabbitMQ的安装、管理、Java开发与集群使用。

![](/images/Image00003.gif) 　**第15章　Docker虚拟化容器：** 虚拟化与云开发是流行话题，本章主要讲解Docker虚拟化容器管理技术，同时讲解微服务与Docker的整合开发以及DockerCompose组件的使用。

### 寄语读者 

本书全篇由笔者根据实践项目与教学经验总结而来，虽经过再三斟酌和审校，仍难免存在技术理解上的偏差和解释不到位的地方，欢迎读者批评指正。您的宝贵建议将帮助我们修正此书，大家一起努力，将传道、授业、解惑贯彻到底。

本书用到的程序源代码，读者可扫描下面的"文泉云盘"二维码获取其下载方式，也可登录清华大学出版社网站（www.tup.com.cn）进行下载。技术学习部分，读者可登录魔乐科技官网（http://www.mldn.cn）及沐言优拓官网（http://www.yootk.com）进行学习，也可登录笔者的新浪微博进行留言交流。  
![](/images/Image00004.jpg)

文泉云盘  
获取学习资源

最后，希望本书成为您的良师益友。祝您读书快乐！  
![](/images/Image00005.jpg)


目 录
===

[前言](text00004.html#pre3_3)

[第一部分　SpringBoot篇](text00006.html#isbn9787302506072_1)

[第1章　SpringBoot编程起步](text00007.html#isbn9787302506072_1_1)

[1.1　传统开发中痛的领悟](text00007.html#isbn9787302506072_1_1_1_1)

[1.2　SpringBoot简介](text00007.html#isbn9787302506072_1_1_1_2)

[1.3　SpringBoot编程起步](text00007.html#isbn9787302506072_1_1_1_3)

[1.4　本章小结](text00007.html#isbn9787302506072_1_1_1_4)

[第2章　SpringBoot程序开发](text00008.html#isbn9787302506072_1_2)

[2.1　建立统一父pom管理](text00008.html#isbn9787302506072_1_2_1_1)

[2.2　SpringBoot程序测试](text00008.html#isbn9787302506072_1_2_1_2)

[2.3　SpringBoot注解分析](text00008.html#isbn9787302506072_1_2_1_3)

[2.4　配置访问路径](text00008.html#isbn9787302506072_1_2_1_4)

[2.5　SpringBoot调试](text00008.html#isbn9787302506072_1_2_1_5)

[2.6　使用内置对象](text00008.html#isbn9787302506072_1_2_1_6)

[2.7　使用Jetty容器](text00008.html#isbn9787302506072_1_2_1_7)

[2.8　配置环境属性](text00008.html#isbn9787302506072_1_2_1_8)

[2.9　读取资源文件](text00008.html#isbn9787302506072_1_2_1_9)

[2.10　整合Spring配置](text00008.html#isbn9787302506072_1_2_1_10)

[2.11　SpringBoot项目打包发布](text00008.html#isbn9787302506072_1_2_1_11)

[2.12　profile配置](text00008.html#isbn9787302506072_1_2_1_12)

[2.13　本章小结](text00008.html#isbn9787302506072_1_2_1_13)

[第3章　Thymeleaf模板渲染](text00009.html#isbn9787302506072_1_3)

[3.1　Thymeleaf简介](text00009.html#isbn9787302506072_1_3_1_1)

[3.2　Thymeleaf编程起步](text00009.html#isbn9787302506072_1_3_1_2)

[3.3　Thyemeleaf静态资源](text00009.html#isbn9787302506072_1_3_1_3)

[3.4　读取资源文件](text00009.html#isbn9787302506072_1_3_1_4)

[3.5　路径处理](text00009.html#isbn9787302506072_1_3_1_5)

[3.6　内置对象操作支持](text00009.html#isbn9787302506072_1_3_1_6)

[3.7　对象输出](text00009.html#isbn9787302506072_1_3_1_7)

[3.8　页面逻辑处理](text00009.html#isbn9787302506072_1_3_1_8)

[3.9　数据迭代处理](text00009.html#isbn9787302506072_1_3_1_9)

[3.10　包含指令](text00009.html#isbn9787302506072_1_3_1_10)

[3.11　Thymeleaf数据处理](text00009.html#isbn9787302506072_1_3_1_11)

[3.12　本章小结](text00009.html#isbn9787302506072_1_3_1_12)

[第4章　SpringBoot与Web应用](text00010.html#isbn9787302506072_1_4)

[4.1　配置Tomcat运行](text00010.html#isbn9787302506072_1_4_1_1)

[4.2　https安全访问](text00010.html#isbn9787302506072_1_4_1_2)

[4.3　数据验证](text00010.html#isbn9787302506072_1_4_1_3)

[4.4　配置错误页](text00010.html#isbn9787302506072_1_4_1_4)

[4.5　全局异常处理](text00010.html#isbn9787302506072_1_4_1_5)

[4.6　文件上传](text00010.html#isbn9787302506072_1_4_1_6)

[4.6.1　基础上传](text00010.html#isbn9787302506072_1_4_1_6_1)

[4.6.2　上传文件限制](text00010.html#isbn9787302506072_1_4_1_6_2)

[4.6.3　上传多个文件](text00010.html#isbn9787302506072_1_4_1_6_3)

[4.7　拦截器](text00010.html#isbn9787302506072_1_4_1_7)

[4.8　AOP拦截器](text00010.html#isbn9787302506072_1_4_1_8)

[4.9　本章小结](text00010.html#isbn9787302506072_1_4_1_9)

[第5章　SpringBoot服务整合](text00011.html#isbn9787302506072_1_5)

[5.1　SpringBoot整合数据源](text00011.html#isbn9787302506072_1_5_1_1)

[5.1.1　SpringBoot整合C3P0数据库连接池](text00011.html#isbn9787302506072_1_5_1_1_1)

[5.1.2　SpringBoot整合Druid数据库连接池](text00011.html#isbn9787302506072_1_5_1_1_2)

[5.2　SpringBoot整合ORM开发框架](text00011.html#isbn9787302506072_1_5_1_2)

[5.2.1　SpringBoot整合MyBatis开发框架](text00011.html#isbn9787302506072_1_5_1_1_3)

[5.2.2　SpringBoot整合JPA开发框架](text00011.html#isbn9787302506072_1_5_1_1_4)

[5.2.3　事务处理](text00011.html#isbn9787302506072_1_5_1_1_5)

[5.3　SpringBoot整合消息服务组件](text00011.html#isbn9787302506072_1_5_1_3)

[5.3.1　SpringBoot整合ActiveMQ消息组件](text00011.html#isbn9787302506072_1_5_1_1_6)

[5.3.2　SpringBoot整合RabbitMQ消息组件](text00011.html#isbn9787302506072_1_5_1_1_7)

[5.3.3　SpringBoot整合Kafka消息组件](text00011.html#isbn9787302506072_1_5_1_1_8)

[5.4　SpringBoot整合Redis数据库](text00011.html#isbn9787302506072_1_5_1_4)

[5.4.1　SpringBoot整合RedisTemplate操作Redis](text00011.html#isbn9787302506072_1_5_1_1_9)

[5.4.2　Redis对象序列化操作](text00011.html#isbn9787302506072_1_5_1_1_10)

[5.4.3　配置多个RedisTemplate](text00011.html#isbn9787302506072_1_5_1_1_11)

[5.5　SpringBoot整合安全框架](text00011.html#isbn9787302506072_1_5_1_5)

[5.5.1　SpringBoot整合Shiro开发框架](text00011.html#isbn9787302506072_1_5_1_1_12)

[5.5.2　SpringBoot基于Shiro整合OAuth统一认证](text00011.html#isbn9787302506072_1_5_1_1_13)

[5.6　SpringBoot整合邮件服务器](text00011.html#isbn9787302506072_1_5_1_6)

[5.7　定时调度](text00011.html#isbn9787302506072_1_5_1_7)

[5.8　Actuator监控](text00011.html#isbn9787302506072_1_5_1_8)

[5.9　本章小结](text00011.html#isbn9787302506072_1_5_1_9)

[第二部分　SpringCloud篇](text00012.html#isbn9787302506072_2)

[第6章　SpringCloud简介](text00013.html#isbn9787302506072_2_6)

[6.1　RPC分布式开发技术](text00013.html#isbn9787302506072_2_6_1_1)

[6.2　RPC实现技术](text00013.html#isbn9787302506072_2_6_1_2)

[6.3　SpringCloud技术架构](text00013.html#isbn9787302506072_2_6_1_3)

[6.4　本章小结](text00013.html#isbn9787302506072_2_6_1_4)

[第7章　SpringCloud与Restful](text00014.html#isbn9787302506072_2_7)

[7.1　搭建SpringCloud项目开发环境](text00014.html#isbn9787302506072_2_7_1_1)

[7.2　Restful基础实现](text00014.html#isbn9787302506072_2_7_1_2)

[7.2.1　建立公共API模块：mldncloud-api](text00014.html#isbn9787302506072_2_7_1_2_1)

[7.2.2　建立部门微服务：mldncloud-dept-service-8001](text00014.html#isbn9787302506072_2_7_1_2_2)

[7.2.3　建立Web消费端：mldncloud-consumer-resttemplate](text00014.html#isbn9787302506072_2_7_1_2_3)

[7.3　Restful接口描述](text00014.html#isbn9787302506072_2_7_1_3)

[7.4　SpringSecurity安全访问](text00014.html#isbn9787302506072_2_7_1_4)

[7.4.1　微服务安全验证](text00014.html#isbn9787302506072_2_7_1_2_4)

[7.4.2　消费端安全访问](text00014.html#isbn9787302506072_2_7_1_2_5)

[7.4.3　StatelessSession](text00014.html#isbn9787302506072_2_7_1_2_6)

[7.4.4　安全配置模块](text00014.html#isbn9787302506072_2_7_1_2_7)

[7.5　本章小结](text00014.html#isbn9787302506072_2_7_1_5)

[第8章　Eureka注册服务](text00015.html#isbn9787302506072_2_8)

[8.1　Eureka简介](text00015.html#isbn9787302506072_2_8_1_1)

[8.2　定义Eureka服务端](text00015.html#isbn9787302506072_2_8_1_2)

[8.3　向Eureka中注册微服务](text00015.html#isbn9787302506072_2_8_1_3)

[8.4　Eureka服务信息](text00015.html#isbn9787302506072_2_8_1_4)

[8.5　Eureka发现管理](text00015.html#isbn9787302506072_2_8_1_5)

[8.6　Eureka安全配置](text00015.html#isbn9787302506072_2_8_1_6)

[8.7　Eureka-HA机制](text00015.html#isbn9787302506072_2_8_1_7)

[8.8　Eureka服务发布](text00015.html#isbn9787302506072_2_8_1_8)

[8.9　本章小结](text00015.html#isbn9787302506072_2_8_1_9)

[第9章　SpringCloud服务组件](text00016.html#isbn9787302506072_2_9)

[9.1　Ribbon负载均衡组件](text00016.html#isbn9787302506072_2_9_1_1)

[9.1.1　Ribbon基本使用](text00016.html#isbn9787302506072_2_9_1_1_1)

[9.1.2　Ribbon负载均衡](text00016.html#isbn9787302506072_2_9_1_1_2)

[9.1.3　Ribbon负载均衡策略](text00016.html#isbn9787302506072_2_9_1_1_3)

[9.2　Feign远程接口映射](text00016.html#isbn9787302506072_2_9_1_2)

[9.2.1　Feign接口转换](text00016.html#isbn9787302506072_2_9_1_1_4)

[9.2.2　Feign相关配置](text00016.html#isbn9787302506072_2_9_1_1_5)

[9.3　Hystrix熔断机制](text00016.html#isbn9787302506072_2_9_1_3)

[9.3.1　Hystrix基本使用](text00016.html#isbn9787302506072_2_9_1_1_6)

[9.3.2　失败回退](text00016.html#isbn9787302506072_2_9_1_1_7)

[9.3.3　HystrixDashboard](text00016.html#isbn9787302506072_2_9_1_1_8)

[9.3.4　Turbine聚合监控](text00016.html#isbn9787302506072_2_9_1_1_9)

[9.4　Zuul路由网关](text00016.html#isbn9787302506072_2_9_1_4)

[9.4.1　Zuul整合微服务](text00016.html#isbn9787302506072_2_9_1_1_10)

[9.4.2　Zuul访问过滤](text00016.html#isbn9787302506072_2_9_1_1_11)

[9.4.3　Zuul路由配置](text00016.html#isbn9787302506072_2_9_1_1_12)

[9.4.4　Zuul服务降级](text00016.html#isbn9787302506072_2_9_1_1_13)

[9.4.5　上传微服务](text00016.html#isbn9787302506072_2_9_1_1_14)

[9.5　本章小结](text00016.html#isbn9787302506072_2_9_1_5)

[第10章　SpringCloudConfig](text00017.html#isbn9787302506072_2_10)

[10.1　SpringCloudConfig简介](text00017.html#isbn9787302506072_2_10_1_1)

[10.2　配置SpringCloudConfig服务端](text00017.html#isbn9787302506072_2_10_1_2)

[10.3　SpringCloudConfig客户端抓取配置信息](text00017.html#isbn9787302506072_2_10_1_3)

[10.4　单仓库目录匹配](text00017.html#isbn9787302506072_2_10_1_4)

[10.5　多仓库自动匹配](text00017.html#isbn9787302506072_2_10_1_5)

[10.6　仓库匹配模式](text00017.html#isbn9787302506072_2_10_1_6)

[10.7　密钥加密处理](text00017.html#isbn9787302506072_2_10_1_7)

[10.8　KeyStore加密处理](text00017.html#isbn9787302506072_2_10_1_8)

[10.9　SpringCloudConfig高可用](text00017.html#isbn9787302506072_2_10_1_9)

[10.10　SpringCloudBus服务总线](text00017.html#isbn9787302506072_2_10_1_10)

[10.11　本章小结](text00017.html#isbn9787302506072_2_10_1_11)

[第11章　SpringCloudStream](text00018.html#isbn9787302506072_2_11)

[11.1　SpringCloudStream简介](text00018.html#isbn9787302506072_2_11_1_1)

[11.2　Stream生产者](text00018.html#isbn9787302506072_2_11_1_2)

[11.3　Stream消费者](text00018.html#isbn9787302506072_2_11_1_3)

[11.4　自定义消息通道](text00018.html#isbn9787302506072_2_11_1_4)

[11.5　分组与持久化](text00018.html#isbn9787302506072_2_11_1_5)

[11.6　RoutingKey](text00018.html#isbn9787302506072_2_11_1_6)

[11.7　本章小结](text00018.html#isbn9787302506072_2_11_1_7)

[第12章　SpringCloudSleuth](text00019.html#isbn9787302506072_2_12)

[12.1　SpringCloudSleuth简介](text00019.html#isbn9787302506072_2_12_1_1)

[12.2　搭建SpringCloudSleuth微服务](text00019.html#isbn9787302506072_2_12_1_2)

[12.3　Sleuth数据采集](text00019.html#isbn9787302506072_2_12_1_3)

[12.4　本章小结](text00019.html#isbn9787302506072_2_12_1_4)

[第13章　OAuth认证管理](text00020.html#isbn9787302506072_2_13)

[13.1　SpringCloud与OAuth](text00020.html#isbn9787302506072_2_13_1_1)

[13.2　搭建OAuth基础服务](text00020.html#isbn9787302506072_2_13_1_2)

[13.3　使用数据库保存客户信息](text00020.html#isbn9787302506072_2_13_1_3)

[13.4　使用数据库保存微服务认证信息](text00020.html#isbn9787302506072_2_13_1_4)

[13.5　建立访问资源](text00020.html#isbn9787302506072_2_13_1_5)

[13.6　使用Redis保存token令牌](text00020.html#isbn9787302506072_2_13_1_6)

[13.7　SpringCloud整合OAuth](text00020.html#isbn9787302506072_2_13_1_7)

[13.8　本章小结](text00020.html#isbn9787302506072_2_13_1_8)

[第三部分　微服务辅助篇](text00021.html#isbn9787302506072_3)

[第14章　RabbitMQ消息组件](text00022.html#isbn9787302506072_3_14)

[14.1　RabbitMQ简介](text00022.html#isbn9787302506072_3_14_1_1)

[14.2　配置Erlang开发环境](text00022.html#isbn9787302506072_3_14_1_2)

[14.3　安装并配置RabbitMQ](text00022.html#isbn9787302506072_3_14_1_3)

[14.4　使用Java访问RabbitMQ](text00022.html#isbn9787302506072_3_14_1_4)

[14.4.1　创建消息生产者](text00022.html#isbn9787302506072_3_14_1_4_1)

[14.4.2　创建消息消费者](text00022.html#isbn9787302506072_3_14_1_4_2)

[14.4.3　消息持久化](text00022.html#isbn9787302506072_3_14_1_4_3)

[14.4.4　虚拟主机](text00022.html#isbn9787302506072_3_14_1_4_4)

[14.5　发布订阅模式](text00022.html#isbn9787302506072_3_14_1_5)

[14.5.1　广播模式](text00022.html#isbn9787302506072_3_14_1_4_5)

[14.5.2　直连模式](text00022.html#isbn9787302506072_3_14_1_4_6)

[14.5.3　主题模式](text00022.html#isbn9787302506072_3_14_1_4_7)

[14.6　Spring整合RabbitMQ](text00022.html#isbn9787302506072_3_14_1_6)

[14.7　镜像队列](text00022.html#isbn9787302506072_3_14_1_7)

[14.8　本章小结](text00022.html#isbn9787302506072_3_14_1_8)

[第15章　Docker虚拟化容器](text00023.html#isbn9787302506072_3_15)

[15.1　Docker简介](text00023.html#isbn9787302506072_3_15_1_1)

[15.2　Docker安装](text00023.html#isbn9787302506072_3_15_1_2)

[15.3　Docker配置与使用](text00023.html#isbn9787302506072_3_15_1_3)

[15.3.1　获取并使用Docker镜像](text00023.html#isbn9787302506072_3_15_1_3_1)

[15.3.2　Docker镜像](text00023.html#isbn9787302506072_3_15_1_3_2)

[15.3.3　Docker容器](text00023.html#isbn9787302506072_3_15_1_3_3)

[15.4　Docker镜像管理](text00023.html#isbn9787302506072_3_15_1_4)

[15.4.1　通过文件保存Docker镜像](text00023.html#isbn9787302506072_3_15_1_3_4)

[15.4.2　DockerHub](text00023.html#isbn9787302506072_3_15_1_3_5)

[15.4.3　构建Docker镜像](text00023.html#isbn9787302506072_3_15_1_3_6)

[15.5　微服务与Docker](text00023.html#isbn9787302506072_3_15_1_5)

[15.5.1　使用Docker发布微服务](text00023.html#isbn9787302506072_3_15_1_3_7)

[15.5.2　使用DockerCompose编排顺序](text00023.html#isbn9787302506072_3_15_1_3_8)

[15.6　本章小结](text00023.html#isbn9787302506072_3_15_1_6)


第一部分
SpringBoot篇 
=========================================

**•　SpringBoot与Restful标准**

**•　SpringBoot微服务创建**

**•　Thymeleaf语法标准**

**•　SpringBoot与服务整合**


第1章　SpringBoot编程起步 
===========================================

**通过本章学习，可以达到以下目标：**

1．理解基于Maven的传统项目开发问题。

2．理解SpringBoot开发框架的主要作用。

3．编写第一个SpringBoot程序。

SpringBoot是当下最为流行的Java Web端开发框架，该框架由Spring（Pivotal公司）开源组织提供，使用该框架可以解决传统项目之中混乱的Maven依赖管理问题，同时可以基于Maven快速进行项目的打包与发布。

### 1.1　传统开发中痛的领悟 

在Java项目开发中，MVC已经成为了一种深入人心的设计模式，几乎所有正规的项目之中都会使用到MVC设计模式。采用MVC设计模式可以有效地实现显示层、控制层、业务层、数据层的结构分离，如图1-1所示。  
![](/images/Image00006.jpg)

图1-1　MVC设计模式

虽然MVC开发具有良好的可扩展性，但是在实际的开发过程中，许多开发者依然会感受到如下的问题。

![](/images/Image00003.gif) 　采用原生Java程序实现MVC设计模式时，一旦整体项目设计不到位，就会存在大量的重复代码，并且项目维护困难。

![](/images/Image00003.gif) 　为了简化MVC各个层的开发，可以引用大量的第三方开发框架，如Spring、Hibernate、MyBatis、Shiro、JPA、SpringSecurity等，但这些框架都需要在Spring中实现整合，其结果就是会存在大量的配置文件。

![](/images/Image00003.gif) 　当使用一些第三方的服务组件（如RabbitMQ、Kafka、JavaMail等）时，需要编写大量重复的配置文件，而且还需要根据环境定义不同的profile（如dev、beta、product）。

![](/images/Image00003.gif) 　使用Maven作为构建工具时，需要配置大量的依赖关系，且程序需要被打包为\*.war文件并部署到应用服务器上才可以执行。

![](/images/Image00003.gif) 　Restful作为接口技术应用得越来越广泛，但如果使用Spring来搭建Restful服务，则需要引入大量的Maven依赖库，并且需要编写许多的配置文件。

基于以上种种因素，很多人开始寻求更加简便的开发方式，而遗憾的是，这种简便的开发没有被官方的JavaEE所支持。JavaEE官方支持的技术标准依然只提供最原始的技术支持。

### 1.2　SpringBoot简介 

SpringBoot是Spring开发框架提供的一种扩展支持，其主要目的是希望通过简单的配置实现开发框架的整合，使开发者的注意力可以完全放在程序业务功能的实现上，其核心在于通过"零配置"的方式来实现快速且简单的开发。图1-2显示了Spring官方网站中SpringBoot项目，图1-3显示了SpringBoot当前的开发版本。  
![](/images/Image00007.jpg)

图1-2　SpringBoot项目站点  
![](/images/Image00008.jpg)

图1-3　SpringBoot支持版本

Spring Boot开发框架有如下核心功能。

![](/images/Image00003.gif) 　独立运行的Spring项目：SpringBoot可以以jar包的形式直接运行在拥有JDK的主机上。

![](/images/Image00003.gif) 　内嵌Web容器：SpringBoot内嵌了Tomcat容器与Jetty容器，这样可以不局限于war包的部署形式。

![](/images/Image00003.gif) 　简化Maven配置：在实际开发中需要编写大量的Maven依赖，在SpringBoot中会提供一系列使用starter的依赖配置来简化Maven配置文件的定义。

![](/images/Image00003.gif) 　自动配置Spring：采用合理的项目组织结构，使Spring的配置注解自动生效。

![](/images/Image00003.gif) 　减少XML配置：在SpringBoot中依然支持XML配置，同时也可以利用Bean和自动配置机制减少XML配置文件的定义。

### 1.3　SpringBoot编程起步 

SpringBoot编程需要依赖于Maven或Gradle构建工具完成，这里将直接使用Maven进行开发，同时利用Eclipse来建立Maven项目。

1．在Eclipse中创建一个新的Maven项目，项目类型为quickstart，如图1-4所示。  
![](/images/Image00009.jpg)

图1-4　Eclipse创建Maven项目

2．设置Maven项目的信息（Group Id、Artifact Id、Version等），本例建立的项目名称为bootstart，如图1-5所示。  
![](/images/Image00010.jpg)

图1-5　设置Maven的配置信息

3．修改pom.xml配置文件，追加SpringBoot的依赖配置与相关插件。  
![](/images/Image00011.jpg)

本程序采用官方文档给出的配置方式实现了SpringBoot项目的创建。这里，spring-boot-starter-parent就是官方给出的快速构建SpringBoot项目的公共父pom.xml配置文件支持。  
**注意：配置完成后要更新项目。**

本例的项目开发是基于Eclipse完成的，开发者修改完pom.xml配置文件之后，一定要更新项目（快捷键为Alt + F5），如图1-6所示。  
![](/images/Image00012.jpg)

图1-6　更新Eclipse项目

4．编写第一个SpringBoot程序。  
![](/images/Image00013.jpg)

5．这里使用了Eclipse-STS（Spring Source Tool）插件，所以可以直接运行，如图1-7所示。  
![](/images/Image00014.jpg)

图1-7　运行SpringBoot项目  
**提示：采用Maven工具直接运行。**

如果Eclipse工具中没有安装STS开发插件，也可以通过Maven的方式运行。直接输入spring-boot:run，就可以启动SpringBoot项目了，如图1-8所示。  
![](/images/Image00015.jpg)

图1-8　使用Maven运行SpringBoot程序

考虑到代码编写的方便，本书强烈建议读者安装STS开发插件。本书中所有的项目也都是通过STS插件的方式开发的。同时需要提醒读者的是，当使用Eclipse-STS建立了SpringBoot项目时，会在项目后面标记"\[boot\]"提示信息。

6．SpringBoot项目启动之后，开发者可以直接通过控制台看到如图1-9所示的信息提示，完成后的项目结构如图1-10所示。  
![](/images/Image00016.jpg)

图1-9　SpringBoot启动提示信息  
![](/images/Image00017.jpg)

图1-10　项目结构

同时也可以在控制台中看到如下的日志信息：  
![](/images/Image00018.jpg)

由于SpringBoot自带Tomcat容器，所以项目启动后通过浏览器输入http://localhost:8080，就可以直接访问控制器返回的信息，如图1-11所示。  
![](/images/Image00019.jpg)

图1-11　SpringBoot运行界面

### 1.4　本章小结 

1．SpringBoot提倡的是一种简洁的开发模式，可保证用户不被大量的配置文件和依赖关系所困扰。

2．SpringBoot开发需要Maven或Gradle构建工具支持。

3．SpringBoot使用一系列的注解来简化开发过程。


第2章　SpringBoot程序开发 
===========================================

**通过本章学习，可以达到以下目标：**

1．掌握SpringBoot开发标准。

2．掌握SpringBoot中的常用注解。

3．掌握内置对象在SpringBoot中的使用。

4．掌握SpringBoot项目的打包与发布处理。

5．掌握Spring多开发环境（profile）的配置。

6．掌握Spring错误处理以及错误跳转处理。

7．掌握Spring与Tomcat的结合使用。

SpringBoot项目的实现主要依赖于构建工具，在使用构建工具定义的过程中往往需要提供一个标准的父pom定义。同时，一个良好的SpringBoot程序中会使用大量的注解来代替配置文件，以轻松实现项目的打包与部署。本章将为读者进一步详细讲解与SpringBoot有关的开发支持。

### 2.1　建立统一父pom管理 

在项目中使用SpringBoot，往往会需要引入一个标准的父pom配置。  
![](/images/Image00020.jpg)

利用这个父pom文件，可以方便地进行核心依赖库的导入，并且由父pom统一管理所有的开发版本。但在实际的Maven项目开发中，开发团队往往会根据自己的需要来自定义属于自己的父pom，这样就会造成冲突。为了解决这样的问题，在SpringBoot里面，用户也可以直接以依赖管理的形式使用SpringBoot。

1．【mldnboot项目】建立一个用于管理父pom的Maven项目mldnboot，如图2-1所示。  
![](/images/Image00021.jpg)

图2-1　建立一个新的Maven项目

2．【mldnboot项目】修改pom.xml配置文件，追加相关依赖配置项。  
![](/images/Image00022.jpg)

3．【mldnboot项目】在mldnboot父项目之中建立一个新的Maven模块mldnboot-base，如图2-2所示。  
![](/images/Image00023.jpg)

图2-2　建立mldnboot-base子模块

4．【mldnboot-base项目】修改pom.xml配置文件，追加要引入的SpringBoot依赖配置。  
![](/images/Image00024.jpg)

5．【mldnboot-base项目】编写程序，实现SpringBoot基础开发。  
![](/images/Image00025.jpg)

本程序与第1章中的SpringBoot程序功能相同，正常启动SpringBoot后就可以通过浏览器得到相应的结果了。

### 2.2　SpringBoot程序测试 

SpringBoot程序开发完成之后，需要对程序的功能进行测试，这时需要启动Spring容器。开发者可以直接利用SpringBoot提供的依赖包来实现控制层方法测试。

1．【mldnboot-base项目】修改pom.xml配置文件，引入测试相关依赖包。  
![](/images/Image00026.jpg)

2．【mldnboot-base项目】编写一个测试程序类。  
![](/images/Image00027.jpg)

3．【mldnboot-base】测试程序编写完成之后，就可以启动测试了。如果测试通过，则返回如图2-3所示的界面。  
![](/images/Image00028.jpg)

图2-3　SpringBoot测试成功

### 2.3　SpringBoot注解分析 

通过前面的学习可以发现，在整个SpringBoot程序里面使用了许多注解，这些注解的作用如表2-1所示。  
**表2-1　SpringBoot注解**
![](/images/Image00029.jpg)

在给定的几个注解中，@EnableAutoConfiguration为整个SpringBoot的启动注解配置，也就是说，这个注解应该随着程序的主类一起进行定义。但是该注解有一个前提，就是只能够扫描在同一程序类包中的配置程序，很明显其功能是不足的。

对于控制器程序类，由于在项目中有许多的控制器，那么最好将这些类统一保存在一个包中（如将所有的控制器程序类保存在cn.mldn.mldnboot.controller中，这是cn.mldn.mldnboot子包），在这样的环境下建议开发者使用@SpringBootApplication注解实现启动配置。  
**注意：请严格遵守SpringBoot的自动配置约束。**

在SpringBoot开发过程中，为了简化开发配置，往往会在SpringBoot启动类下创建若干个子包，这样子包中的注解就都可以自动扫描到（@EnableAutoConfiguration注解不支持此功能），并且可以实现依赖关系的自动配置。以本程序为例，如果要进行标准开发，则程序的开发包结构如图2-4所示。  
![](/images/Image00030.jpg)

图2-4　SpringBoot项目结构

此时保存在cn.mldn.mldnboot下的所有子包中配置的注解都可以被Spring容器自动扫描。如果不在指定的子包中，程序启动类就需要配置@ComponentScan注解设置扫描包。这样的配置会显得整个项目非常啰嗦，如果不是必须的情况下，不建议这样配置。

可以简单地将@SpringBootApplication理解为：@SpringBootApplication=@EnableAuto Configuration +@ComponentScan（扫描父包）。

1．【mldnboot-base项目】建立一个控制器类。  
![](/images/Image00031.jpg)

2．【mldnboot-base项目】编写程序启动类（SpringBootStartApplication），使用@SpringBootApplication进行注解。  
![](/images/Image00032.jpg)

由于启动程序类保存在cn.mldn.mldnboot父包下，所以该包中所有的子包都将被自动扫描，而后自动实现配置。

### 2.4　配置访问路径 

在实际的项目开发中，控制器的路径可能会有许多个。在进行控制器编写的时候，也会有以下两种运行模式。

![](/images/Image00003.gif) 　控制器跳转模式：可以使用@Controller注解定义，如果要实现Restful显示，也可以联合@ResponseBody注解一起使用。

![](/images/Image00003.gif) 　Restful显示：可以使用@RestController注解，里面所有路径访问的信息都以Restful形式展示。

1．【mldnboot-base项目】定义MessageController控制器程序类，使用Restful风格显示。  
![](/images/Image00033.jpg)

此时的控制器程序类上使用了@RestController注解，这样就可以避免在方法上使用@ResponseBody注解。此时，MessageController类中的所有映射路径都会以Restful形式展示。  
**提示：Restful是SpringCloud技术的实现核心。**

在控制器里面一旦使用了@RestController注解，则意味着所有方法都将以Restful风格展示。这种做法未必适合于SpringBoot项目，因为在很多时候需要通过控制器跳转到显示层页面，而Restful是SpringCloud技术的实现关键。

2．【mldnboot-base项目】前面定义的控制器类只能进行简单的信息返回，实际上也可以进行参数的接收处理。传递参数到控制器中最简单的做法是使用地址重写传递"访问路径?参数名称=内容"，在MessageController控制器程序类之中扩充一个新的echo()方法。  
![](/images/Image00034.jpg)

此时如果要进行该路径的访问，则可以直接通过地址栏传递参数（http://localhost:8080/echo?msg=www.mldn.cn），并且参数的名称应该默认使用msg，程序执行后的界面如图2-5所示。  
![](/images/Image00035.jpg)

图2-5　echo()方法返回信息

3．【mldnboot-base项目】由于SpringBoot支持Restful风格处理，所以参数的接收可以采用路径参数的形式完成，但是需要在控制器方法的参数声明上使用@PathVariable注解与访问路径的参数进行关联。  
![](/images/Image00036.jpg)

本程序需要通过地址传递参数，地址设置为http://localhost:8080/echo/www.mldn.cn，程序显示结果如图2-6所示。  
![](/images/Image00037.jpg)

图2-6　通过地址传递参数  
**提示：关于传递参数的选择。**

在Restful架构中请求路径受多类语法支持，开发者可以结合HTTP请求模式（GET、POST、PUT、DELETE等）与路径，实现多种组合，以处理不同类型的用户请求。参数的传递模式可以由开发团队自行定义。

### 2.5　SpringBoot调试 

在项目开发的过程中经常需要对代码进行反复修改，这样就会导致SpringBoot运行容器反复启动。为了解决这种频繁重启问题，SpringBoot提供了自动加载配置的依赖库，以实现代码的动态加载。

**范例：** 【mldnboot-base项目】修改pom.xml配置文件，追加自动加载依赖库配置。  
![](/images/Image00038.jpg)

项目中配置了以上两个开发包之后，每当用户修改项目中程序类的时候都会由SpringBoot自动加载更新后的程序代码，同时也可以在项目名称上看到如图2-7所示的标记"\[devtools\]"。  
![](/images/Image00039.jpg)

图2-7　SpringBoot动态加载更新程序

### 2.6　使用内置对象 

通过SpringBoot程序可以发现，SpringBoot中控制器的形式和SpringMVC中是一样的，因此在程序中使用JSP的内置对象也可以按照与SpringMVC同样的方式进行。

1．【mldnboot-base项目】在MessageController控制器类之中追加新的方法，用于实现内置对象获取。  
![](/images/Image00040.jpg)

此时采用了与SpringMVC同样的方式来获取内置对象，并且将所有的信息保存在Map集合中，最后以Restful形式返回获取的信息（将Map集合自动变为JSON数据），程序运行界面如图2-8所示。  
![](/images/Image00041.jpg)

图2-8　获取内置对象信息

2．【mldnboot-base项目】除了在控制器的方法上使用参数来接收内置对象外，也可以利用ServletRequestAttributes形式来获取内置对象。  
![](/images/Image00042.jpg)

本程序实现了与上一程序完全相同的处理效果，唯一的区别是，控制器的方法不再需要明确地接收内置对象的参数，程序运行效果与图2-8相同。

### 2.7　使用Jetty容器 

SpringBoot在项目启动时默认情况下使用的是Tomcat容器，这一点可以通过日志直观看到。  
![](/images/Image00043.jpg)

在实际的开发过程中，开发者往往会选择Jetty作为Web容器，由于SpringBoot也支持Jetty容器，所以开发者只需要修改pom.xml配置文件即可。

1．【mldnboot-base项目】修改pom.xml文件，使用Jetty容器运行。  
![](/images/Image00044.jpg)

2．【mldnboot-base项目】修改完pom.xml文件后，需要重新启动SpringBoot项目，此时就可以在日志中看到如下信息。  
![](/images/Image00045.jpg)

程序可以使用小巧的Jetty容器来运行SpringBoot项目，但是这种做法也仅仅是在开发过程中使用，在实际的生产环境下依然推荐使用Tomcat作为Web容器。

### 2.8　配置环境属性 

SpringBoot提倡的是一种"零配置"的设计框架，所以提供有许多默认的配置项。例如，SpringBoot项目默认运行的8080端口就是一种默认配置。如果开发者需要修改SpringBoot的这种默认配置，可以在项目所在的CLASSPATH下添加application.properties配置文件。

1．【mldnboot-base项目】建立一个新的源文件目录src/main/resources。

2．【mldnboot-base项目】在src/main/resources源文件目录中建立application.properties配置文件，目录结构如图2-9所示。  
![](/images/Image00046.jpg)

图2-9　定义配置文件  
**注意：配置文件名称要相同。**

SpringBoot开发框架对一些结构（子包扫描）和配置文件（application.properties）做出了限定，这样开发者在使用框架开发的时候可以减少配置。如果开发者定义的配置文件名称不是application.properties，那么SpringBoot将无法加载。

在本文件中进行SpringBoot项目默认端口的变更，将其修改为80端口运行。  
![](/images/Image00047.jpg)

修改完成后重新启动SpringBoot项目（使用的是Tomcat容器），可以看到提示信息：Tomcat started on port(s): 80 (http)，表示当前的项目可以直接运行在80端口上。

3．【mldnboot-base项目】SpringBoot项目默认情况下会将程序发布在根目录下，如果有需要，也可以配置上下文路径（ContextPath）。  
![](/images/Image00048.jpg)

本程序追加了一个context-path配置，所以项目的访问路径为http://localhost/mldnjava/echo/www.mldn.cn（追加了/mldnjava的路径前缀），页面运行效果如图2-10所示。  
![](/images/Image00049.jpg)

图2-10　增加ContextPath配置

4．【mldnboot-base项目】在SpringBoot中可以使用的配置文件类型有两种：application.properties和application.yml，这两种配置文件都可以实现对SpringBoot环境的修改。下面将application. properties配置替换为application.yml，内容如下：  
![](/images/Image00050.jpg)

此时实现了与之前完全相同的配置，读者可以发现使用application.yml配置文件的结构要比使用application.properties更加清晰。  
**提示：关于yml配置文件说明。**

yml实际上是YAML（Yet Another Markup Languange，一种标记语言）文件，这是一种结构化的数据文件，大量应用在各种开源项目之中，如Apache Storm。

Spring官方推荐使用application.yml来进行SpringBoot或SpringCloud框架的配置定义。如果项目中同时存在application.yml与application.properties配置文件并且配置冲突，将以application.properties文件中的配置为参考。在本书后面讲解的过程中，如无意外，将全部使用application.yml进行SpringBoot项目的配置。

### 2.9　读取资源文件 

在实际的项目开发中，资源文件不可或缺，因为所有的提示文字信息都要在资源文件中进行定义，而且资源文件是实现国际化技术的主要手段。如果想在SpringBoot里面进行资源文件的配置，只需要做一些简单的application.yml配置即可，而且所有注入的资源文件都可以像最初的Spring处理那样，直接使用MessageSource进行读取。

1．【mldnboot-base项目】在src/main/resources源文件夹下创建一个i18n的子目录（包）。

2．【mldnboot-base项目】建立src/main/resources/i18n/Messages.properties文件，文件内容定义如下：  
![](/images/Image00051.jpg)

3．【mldnboot-base项目】修改application.yml配置文件，追加资源文件配置，项目结构如图2-11所示。  
![](/images/Image00052.jpg)  
![](/images/Image00053.jpg)

图2-11　资源文件配置

4．【mldnboot-base项目】在MessageController控制器中注入org.springframework.context.MessageSource接口对象，并且利用此对象实现资源文件读取。  
![](/images/Image00054.jpg)

当程序中配置了资源文件之后，就可以通过MessageSource接口中提供的getMessage()方法进行资源的读取。本程序的运行效果如图2-12所示。  
![](/images/Image00055.jpg)

图2-12　读取资源文件  
**提示：可以借用此机制实现国际化开发。**

当程序可以实现资源文件读取的时候，就意味着可以实现国际化开发处理了。可以发现，MessageSource接口中的getMessage()方法里面需要接收一个Locale类的对象，此时就可以通过Locale类的设置来获取不同的资源文件。当然，也需要在项目中配置好不同语言的资源文件。例如，本程序在src/main/resources/i18n目录中又创建了Messages_zh_CN.properties和Messages_en_US.properties（注意baseName的名称相同），如图2-13所示。  
![](/images/Image00056.jpg)

图2-13　国际化配置

这样，当读取时可以采用不同的Locale对象实现指定语言的资源读取。例如，使用如下代码就可以实现Messages_en_US.properties资源文件的读取：  
![](/images/Image00057.jpg)

需要提醒读者的是，即使提供了不同语言的资源文件，在SpringBoot中也依然需要提供Messages.properties配置文件，否则将无法实现资源文件的读取。

### 2.10　整合Spring配置 

在进行Spring项目配置的时候，可以通过\*.xml文件配置，也可以通过Bean（@Configuration注解）配置。SpringBoot延续了Spring这一特点，在SpringBoot项目中依然可以使用配置文件定义。

1．【mldnboot-base项目】建立一个MessageUtil的工具类，该类的主要功能是进行配置的演示。  
![](/images/Image00058.jpg)

在MessageUtil类中定义一个getInfo()方法，该方法的主要功能是返回一个提示信息。  
**提示：可以使用@Component注解。**

MessageUtil类直接放在了程序启动类所在包的子包之中。在真实的开发中，开发者选择@Component或@Repository这样的注解是最方便的。本部分主要是为读者讲解配置文件与配置Bean的整合，所以没有采用注解配置。

2．【mldnboot-base项目】在src/main/resources目录中创建spring的子目录，并且建立spring-util.xml配置文件。  
![](/images/Image00059.jpg)

3．【mldnboot-base项目】在MessageController程序类中注入MessageUtil类对象，并且调用方法返回信息。  
![](/images/Image00060.jpg)

4．【mldnboot-base项目】修改程序启动主类，定义要导入的Spring配置文件。  
![](/images/Image00061.jpg)

本程序在定义启动主类时，利用@ImportResource注解导入了所需要的Spring配置文件，而后会自动将配置文件中定义bean对象注入到MessageController类的属性中，程序运行结果如图2-14所示。  
![](/images/Image00062.jpg)

图2-14　Spring配置文件

5．【mldnboot-base项目】SpringBoot强调的就是"零配置"，虽然其本身支持配置文件定义，但很明显这样的处理形式不是最好的。如果确定要引入其他配置，强烈建议使用Bean的配置形式来完成。  
![](/images/Image00063.jpg)

DefaultConfig定义在程序主类所在的子包之中，这样就可以在SpringBoot程序启动时自动扫描配置并进行加载。对于程序的主类，也就没有必要使用@ImportResource注解读取配置文件了。  
**提问：实际开发中使用配置文件还是使用Bean类配置？**

在编写SpringBoot项目的过程之中，是采用\*.xml配置更好，还是利用Bean类配置会更好？

**回答：崇尚"零配置"的SpringBoot项目建议使用Bean配置。**

在SpringBoot项目中进行配置的时候，实际上有3种支持，按照优先选择顺序为：application.yml、Bean配置和\*.xml配置文件。大部分的配置都可以在application.yml（相当于传统项目中的profile配置作用）里面完成，但很多情况下会利用Bean类来进行扩展配置（本书主要使用此形式来作为扩展配置）。之所以提供\*.xml配置文件的支持，主要目的是帮助开发者用已有代码快速整合SpringBoot开发框架。

### 2.11　SpringBoot项目打包发布 

SpringBoot作为微架构的主要实现技术，其发布项目的方式极为简单，只需要在项目中配置好插件，然后打包执行就可以了，并且这个执行不需要特别复杂的配置。

1．【mldnboot-base项目】修改pom.xml配置文件，配置SpringBoot的打包插件。  
![](/images/Image00064.jpg)

2．【mldnboot-base项目】由于Maven增加了新的插件配置，所以需要对项目进行更新，如图2-15所示。更新时选择mldnboot-base项目，如图2-16所示。  
![](/images/Image00065.jpg)

图2-15　Maven项目更新  
![](/images/Image00066.jpg)

图2-16　选择要更新的项目

3．【mldnboot-base项目】将当前项目模块进行打包处理（clean package），如图2-17所示。打包完成后，会在项目的target目录下生成mldnboot-base.jar程序文件。  
![](/images/Image00067.jpg)

图2-17　SpringBoot项目打包

4．【mldnboot-base项目】将mldnboot-base.jar文件复制到D盘根目录下，随后通过命令行方式执行此文件。  
![](/images/Image00068.jpg)

此时，SpringBoot项目将以一个独立的\*.jar文件的方式执行。将此jar文件上传到任何配置有JDK的系统内，可以轻松实现项目的发布。

### 2.12　profile配置 

在项目开发过程中需要考虑不同的运行环境：开发环境（dev）、测试环境（beta）和生产环境（product）。在以往的开发过程中通常使用Maven构建工具进行控制，但却需要进行大量的配置。SpringBoot考虑到此类问题，专门设计了profile支持。

1．【mldnboot-base项目】修改application.yml配置文件，让其支持多profile配置。  
![](/images/Image00069.jpg)

在本配置文件中一共定义了3个环境（不同的profile之间使用"---"分割）。

![](/images/Image00003.gif) 　开发环境（profiles=dev、默认）：端口定义为7070。

![](/images/Image00003.gif) 　测试环境（profiles=beta）：端口定义为8080。

![](/images/Image00003.gif) 　生产环境（profiles=product）：端口定义为80。

2．【mldnboot项目】如果要正常进行打包，还需要修改pom.xml文件，追加resource配置。  
![](/images/Image00070.jpg)

本程序主要的功能是进行源文件夹中内容的打包输出，配置完成后可以将配置文件打包到\*.jar文件中。

3．【mldnboot-base项目】为项目打包，这里直接通过Eclipse进行打包配置（此时无法设置profile），如图2-18所示。  
![](/images/Image00071.jpg)

图2-18　项目打包

4．【mldnboot-base项目】项目打包完成后一定要运行程序，如果不做出任何的指派，那么默认配置的活跃profile（dev）就将直接起作用（java -jar mldnboot-base.jar）。

5．【mldnboot-base项目】如果要切换到不同的profile环境，可以在启动时动态配置。  
![](/images/Image00072.jpg)

此时在程序运行时将使用product作为运行环境配置。  
**提示：\*.properties与\*.yml配置不同。**

使用application.yml进行多profile配置的时候，只需要在一个配置文件中使用"---"分割不同的profile配置。但是此类模式不适合于application.properties配置，此时应该采用不同的\*.properties保存不同的配置，才可以实现多profile。

**范例：** 定义3个针对不同运行环境的application.properties配置文件。  
![](/images/Image00073.jpg)

随后还是需要有一个公共的application.properties配置文件，用于指派可以使用的profile配置。

**范例：** 定义公共的application.properties配置文件。  

```
     spring.profiles.active=beta
```

随后的使用形式与application.yml配置相同。

### 2.13　本章小结 

1．SpringBoot的依赖管理除了可以作为项目的父pom引入之外，也可以采用依赖管理的形式进行配置。

2．SpringBoot程序测试专门提供了spring-boot-starter-test依赖库，在测试时需要使用@SpringBootTest注解。

3．在定义SpringBoot程序主类时使用@SpringBootApplication注解，可以自动扫描子包中的配置项，实现自动配置。

4．@Controller注解采用的是普通控制器的形式定义，而@RestController注解可以直接以Restful方式运行。

5．SpringBoot默认使用的是Tomcat容器，开发时也可以配置spring-boot-starter-jetty依赖库，使用Jetty容器。但是在实际部署时，建议使用Tomcat容器。

6．SpringBoot支持\*.properties和\*.yml两类配置文件，在实际开发中建议通过application.yml实现环境配置。

7．SpringBoot项目可以通过spring-boot-maven-plugin实现打包处理，这样就可以方便地通过\*.jar文件来实现项目的发布。


第3章　Thymeleaf模板渲染 
==========================================

**通过本章学习，可以达到以下目标：**

1．掌握Thymeleaf模板的作用以及相关配置。

2．掌握Thymeleaf中路径访问处理支持。

3．掌握Thymeleaf页面处理语法。

SpringBoot除了可以进行Restful运行之外，也可以像传统MVC设计模式那样，实现控制层与显示层的跳转处理。但SpringBoot所支持的显示层不再只是简单的JSP页面，而是Thymeleaf模板页面。此页面下利用模板语法，可以在HTML文件中实现JSP的相关逻辑。

### 3.1　Thymeleaf简介 

传统的JSP开发需要编写大量的Scriptlet程序代码，这样就使得页面非常混乱。虽然在JSP的后续发展中提供了标签编程与JSTL标签库，但其页面处理逻辑仍然是复杂的。

为了解决JSP代码过于臃肿的问题，在SpringBoot中默认引入了Thymeleaf模板程序。Thymeleaf是XML、XHTML、HTML5模板引擎，可以用于Web与非Web应用。

Thymeleaf提供了一种可以被浏览器正确显示、格式良好的模板创建方式，开发者可以通过它来创建经过验证的XML与HTML模板。相对于传统的逻辑程序代码，开发者只需将标签属性添加到模板中即可，而后这些标签属性就会在DOM（文档对象模型）上执行预先制定好的逻辑，这样就极大地简化了显示层的程序逻辑代码。

1．【mldnboot项目】本程序为了与之前的项目有所区分，将创建一个新的mldnboot-thymeleaf模块，并修改父pom.xml的定义，追加新模块配置。  
![](/images/Image00074.jpg)

2．【mldnboot-thymeleaf项目】修改pom.xml配置文件，追加Thymeleaf依赖库的配置。  
![](/images/Image00075.jpg)

这样就可以在项目中使用Thymeleaf语法来实现显示层逻辑处理。

### 3.2　Thymeleaf编程起步 

Thymeleaf需要按照传统MVC设计模式的方式来进行处理，所以在定义控制器的时候必须使用@Controller注解来完成。通过控制器的Model类对象，可以传递相应属性到页面中显示。

1．【mldnboot-thymeleaf项目】建立ThymeleafController程序类，该类将跳转到Thyemelaf模板页面。  
![](/images/Image00076.jpg)

2．【mldnboot-thymeleaf项目】ThymeleafController控制器会跳转到message目录下的message_show.html页面进行显示，而该页面一定要在CLASSPATH路径下配置。为了结构清晰，本程序将建立一个src/main/view的源文件，并且必须建立templates目录，随后在这个目录下创建所需要的子目录（本程序需要创建message子目录）。项目最终的目录结构如图3-1所示。  
![](/images/Image00077.jpg)

图3-1　Thymeleaf模板目录结构  
**提示：修改Thymeleaf的默认配置。**

SpringBoot项目中Thymeleaf的动态页面需要保存在templates目录中，页面的扩展名默认使用的是\*.html，如果开发者觉得这样的设计不合理，也可以通过application.yml配置文件自行修改。

**范例：** 修改Thyemeleaf的配置项。  
![](/images/Image00078.jpg)

虽然SpringBoot中可以修改Thymeleaf的默认配置项，但是在实际开发中不建议修改，还是遵从默认配置比较合理。

3．【mldnboot-thymeleaf项目】编写message_show.html页面，实现控制层传递属性输出。  
![](/images/Image00079.jpg)

本程序使用\<p\>元素设定了要输出的内容。要想使用Thymeleaf的功能，必须以"th:属性"的形式处理，th:text的主要作用是进行文本输出。而要想输出request属性中的内容，则需要采用"${属性名称}"的语法格式完成。随后启动程序，输入访问地址http://localhost/view?mid=mldnjava，页面运行效果如图3-2所示。  
![](/images/Image00080.jpg)

图3-2　Thymeleaf模板运行  
**提示：传递HTML元素信息。**

在本程序中，如果控制器传递的是一个HTML元素，那么对于Thymeleaf页面而言，就需要使用th:utext来显示HTML元素内容。

**范例：** 【mldnboot-thymeleaf项目】修改ThymeleafController控制器，传递HTML元素。  
![](/images/Image00081.jpg)

**范例：** 【mldnboot-thymeleaf项目】修改message_show.html页面。  
![](/images/Image00082.jpg)

本程序为了说明问题，特意使用了th:text和th:utext来输出url属性内容，程序执行结果如图3-3所示。  
![](/images/Image00083.jpg)

图3-3　传递HTML元素

另外需要注意的是，在Thymeleaf语法里面也可以直接使用各种运算符。  
![](/images/Image00084.jpg)

此时，Thyemeleaf模板页面会自动根据运算的数据类型和运算符进行计算。

### 3.3　Thyemeleaf静态资源 

在进行Web信息显示的过程中，除了可以配置动态显示页面之外，也可以配置静态资源（如\*.html、\*.css、\*.js等）。对于静态资源，要求其必须放在源文件夹的static目录中。本项目的页面结构如图3-4所示。  
![](/images/Image00085.jpg)

图3-4　项目结构

1．【mldnboot-thymeleaf项目】建立项目所需要的CSS样式文件以及JS脚本文件。  
![](/images/Image00086.jpg)

messge_index.js文件的主要功能是在控制台进行提示信息输出。

2．【mldnboot-thymeleaf项目】在src/main/view/static目录下建立message_index.html页面。  
![](/images/Image00087.jpg)

本程序修改了页面运行的icon图标，并且引入了相应的静态资源，页面运行效果如图3-5所示。  
![](/images/Image00088.jpg)

图3-5　Thymeleaf静态页面

### 3.4　读取资源文件 

SpringBoot项目中的资源文件会统一在application.yml配置文件中定义。当页面需要使用的时候，可以像输出属性一样完成，唯一的区别是需要通过"#{key}"的形式来获取资源内容。

1．【mldnboot-thymeleaf项目】在application.yml配置文件中定义资源文件配置。  
![](/images/Image00089.jpg)

2．【mldnboot-thymeleaf项目】在Messages.properties配置文件里面定义资源内容。  
![](/images/Image00090.jpg)

3．【mldnboot-thymeleaf项目】要读取资源文件，需要动态页面的支持。在Thyemeleaf Controller控制器中建立一个新的方法，用于跳转到前端页面。  
![](/images/Image00091.jpg)

4．【mldnboot-thymeleaf项目】在src/main/view/templates/message目录中创建message_value.html页面，用于读取资源文件内容并进行显示。  
![](/images/Image00092.jpg)

在Thyemeleaf模板页面中直接使用资源的key获取资源信息，页面运行效果如图3-6所示。  
![](/images/Image00093.jpg)

图3-6　Thyemeleaf模板页面读取资源文件

### 3.5　路径处理 

Web开发过程中，路径的处理操作是最为麻烦的。如果要进行准确的路径定位，最好使用完整的路径，并明确写上用户的协议、主机名称、端口以及虚拟目录的名称。这些处理的难点在于Thymeleaf彻底消失了，因为其路径访问变得相当容易，只需要在动态页面中使用"@{路径}"即可访问。  
**提示：回顾原始实现。**

在进行Web项目开发的过程中，相信不少开发者都编写过如下的类似代码：  
![](/images/Image00094.jpg)

而后再使用\<base\>元素（\<base href="\<%=basePath%\>"/\>）进行引用，可以解决路径操作问题。

1．【mldnboot-thymeleaf项目】在ThymeleafController中创建一个新的方法，用于跳转。  
![](/images/Image00095.jpg)

2．【mldnboot-thymeleaf项目】建立src/main/view/templates/message/message_path.html页面。  
![](/images/Image00096.jpg)

在message_path.html页面中继续引用之前定义了的资源，而采用"@{路径}"的形式使得资源引用也十分简单，页面运行效果如图3-7所示。  
![](/images/Image00097.jpg)

图3-7　Web资源引入

### 3.6　内置对象操作支持 

在模板页面中，最为常用的功能就是输出控制器传递的属性。为了方便用户开发，Thymeleaf支持内置对象的直接使用，也可以直接调用内置对象所提供的处理方法。

在通过控制器传递属性到Thymeleaf操作的时候，默认支持的属性获取范围为request（${属性名称}）。如果要接收其他属性范围的内容，则需要指明范围，如session范围（${session.属性名称}）、application范围（${application.属性名称}）。

1．【mldnboot-thymeleaf项目】修改ThymeleafController控制器程序类，追加属性传递。本程序将传递request、session和application 3种属性范围的信息。  
![](/images/Image00098.jpg)

2．【mldnboot-thymeleaf项目】定义src/main/view/templates/message/message_attr.html页面，进行属性内容输出。  
![](/images/Image00099.jpg)

本程序在Thymeleaf模板页面中输出了控制器中传递的不同范围的属性内容。可以发现，只有request范围的属性可以直接通过表达式语法输出，而session与application范围的属性输出时，必须要有相应的范围标记，否则获取的内容就是null。本程序的执行结果如图3-8所示。  
![](/images/Image00100.jpg)

图3-8　Thymeleaf输出不同属性范围的信息

3．【mldnboot-thymeleaf项目】在Thymeleaf中也支持对内置对象的直接处理。修改message_attr.html页面，增加内置对象的方法调用。  
![](/images/Image00101.jpg)

本程序利用内置对象提供的方法获取了IP地址、request属性、sessionId以及项目真实路径，程序运行结果如图3-9所示。  
![](/images/Image00102.jpg)

图3-9　直接调用内置对象方法

### 3.7　对象输出 

在实际页面中进行信息显示的时候，需要通过VO对象进行信息的传递。此时可以直接利用"${属性名称.成员属性}"的格式在页面中进行对象内容的输出。

1．【mldnboot-thymeleaf项目】定义一个VO类Member。  
![](/images/Image00103.jpg)

2．【mldnboot-thymeleaf项目】修改ThymeleafController控制器程序，向页面传递对象信息。  
![](/images/Image00104.jpg)

3．【mldnboot-thymeleaf项目】建立src/main/view/templates/message/message_member.html页面，进行对象输出。  
![](/images/Image00105.jpg)

本程序在页面中使用"${属性名称.成员属性}"获取了request属性范围中传递的member对象的全部信息，页面执行结果如图3-10所示。  
![](/images/Image00106.jpg)

图3-10　页面输出对象  
**提示：Thymeleaf支持有简化的对象输出处理。**

在Thyemleaf模板页面中可以发现，默认支持的对象成员获取语法需要频繁使用属性名称。为了简化输出，可以采用th:object标签处理。

**范例：** 对象信息输出。  
![](/images/Image00107.jpg)

本程序使用了一个\<div\>元素，并在此元素中利用th:object= "${member}"将需要输出的对象信息定义在父元素上，而后此元素的所有子元素就可以利用"\*{成员属性}"获取对象中全部属性的内容。

另外需要提醒读者的是，$访问完整对象信息，\*访问指定对象中的属性内容。如果访问的只是普通的内容（如传递字符串信息），两者在使用效果上没有区别。

### 3.8　页面逻辑处理 

Thymeleaf页面模板支持逻辑处理功能，如判断、循环处理等操作。开发者在页面中处理逻辑时，可以使用and、or、关系比较（\>、\<、\>=、\<=、==、!=、lt、gt、le、ge、eq、ne）等运算符来完成。

1．【mldnboot-thymeleaf项目】修改src/main/view/templates/message/message_member.html页面，追加逻辑判断。  
![](/images/Image00108.jpg)

本程序在页面中追加了判断逻辑（年龄是否为大于或等于18岁、姓名是否为指定的字符串），这样会根据传递过来的Member对象的属性进行判断，页面运行效果如图3-11所示。  
![](/images/Image00109.jpg)

图3-11　页面逻辑判断

2．【mldnboot-thymeleaf项目】在Thymeleaf之中，如果使用th:if判断条件不满足时，也可以使用th:unless处理。  
![](/images/Image00110.jpg)

3．【mldnboot-thymeleaf项目】页面中可以使用switch-case来实现开关逻辑处理。  
![](/images/Image00111.jpg)

本程序使用th:switch="\*{mid}"语句对mid属性的内容进行switch判断。如果有匹配的信息，则进行内容输出；如果没有，则执行th:case="\*"的信息输出，页面运行效果如图3-12所示。  
![](/images/Image00112.jpg)

图3-12　switch判断

### 3.9　数据迭代处理 

数据迭代显示是显示层的一个重要技术手段，在Thymeleaf模板中可以使用th:each指令实现List与Map集合的迭代输出。

1．【mldnboot-thymeleaf项目】在ThymeleafController控制器中追加一个方法，该方法将创建一个List集合，随后通过request属性传递到页面。  
![](/images/Image00113.jpg)

2．【mldnboot-thymeleaf项目】建立src/main/view/templates/message/message_list.html页面。  
![](/images/Image00114.jpg)

本程序在页面中使用了th:each指令进行List集合输出，而后将每一次迭代的结果都赋值给member对象，并将每一次迭代的基本信息都赋值给memberStat对象（可根据需要选择是否要使用此对象），这样就可以实现List集合显示，页面运行效果如图3-13所示。  
![](/images/Image00115.jpg)

图3-13　迭代输出List集合

除了支持List集合输出之外，也可以采用同样的形式实现Map集合的输出。

3．【mldnboot-thymeleaf项目】在ThymeleafController控制器中追加Map集合设置。  
![](/images/Image00116.jpg)

4．【mldnboot-thymeleaf项目】建立src/main/view/templates/message/message_map.html页面。  
![](/images/Image00117.jpg)

在进行Map集合输出时，每一次迭代所取出的对象类型都是Map.Entry接口实例，所以本程序使用memberEntry接收该接口对象，随后输出每一个Map.Entry对象中所保存的key与value信息，页面运行效果如图3-14所示。  
![](/images/Image00118.jpg)

图3-14　输出Map集合

### 3.10　包含指令 

在页面开发中，包含是一个重要的指令，利用包含指令可以实现页面代码的重用处理。Thymeleaf也同样支持数据的包含处理，而对于包含操作，在Thymeleaf模板中提供了两种支持语法。

![](/images/Image00003.gif) 　**th:replace：** 使用标签进行替换，原始的宿主标签还在，但是包含标签不在。

![](/images/Image00003.gif) 　**th:include：** 进行包含，原始的宿主标签消失，只保留包含的标签。

1．【mldnboot-thymeleaf项目】建立src/main/view/templates/commons/footer.html页面。  
![](/images/Image00119.jpg)

本程序设置了一个包含的名称信息为companyInfo，同时还需要包含页面向本页面传递title与url两个参数信息。

2．【mldnboot-thymeleaf项目】在ThymeleafController控制器类中追加一个新的方法，用于页面跳转。  
![](/images/Image00120.jpg)

3．【mldnboot-thymeleaf项目】建立src/main/view/templates/message/message_include.html页面。  
![](/images/Image00121.jpg)

本程序使用th:include指令（替换掉父元素\<div\>）实现了页面的包含处理，同时利用th:with命令向被包含页面传递了两个参数。此时的页面运行效果如图3-15所示。  
![](/images/Image00122.jpg)

图3-15　页面包含

### 3.11　Thymeleaf数据处理 

在Thymeleaf模板中还支持集合方法调用、字符串方法调用、日期格式化等操作。例如，在使用List集合的时候可以考虑采用get()方法获取指定索引的数据，那么在使用Set集合的时候会考虑使用contains()来判断某个数据是否存在，使用Map集合的时候也可以使用containsKey()判断某个key是否存在，以及使用get()根据key获取对应的value。

1．【mldnboot-thymeleaf项目】修改src/main/view/templates/message/message_map.html页面，调用Map方法。  
![](/images/Image00123.jpg)

2．【mldnboot-thymeleaf项目】如果传递的是Set集合，也可以利用Set接口中的contains()方法判断某个值是否存在。

![](/images/Image00003.gif) 　在ThymeleafController控制器中追加一个新的方法，利用Set传递属性。  
![](/images/Image00124.jpg)

![](/images/Image00003.gif) 　建立src/main/view/templates/message/message_set.html页面，判断某一个内容是否在集合中存在。  

```
     <p th:if="$"

>存在有“mldn”的信息！</p>
```

此时会判断在allInfos集合中是否存在mldn的内容，同时也可以利用size()方法获取集合长度，页面运行效果如图3-16所示。  
![](/images/Image00125.jpg)

图3-16　判断Set集合是否有指定数据

3．【mldnboot-thymeleaf项目】在进行数据处理的时候，也可以直接使用字符串String类中定义的方法。

![](/images/Image00003.gif) 　在ThymeleafController控制器中追加一个新的方法，用于传递字符串属性。  
![](/images/Image00126.jpg)

![](/images/Image00003.gif) 　建立src/main/view/templates/message/message_string.html页面，以处理字符串。  
![](/images/Image00127.jpg)

在进行字符串数据处理时，可以直接使用控制器传递过来的属性，也可以直接定义具体的字符串内容。本程序处理后的结果如图3-17所示。  
![](/images/Image00128.jpg)

图3-17　字符串处理

4．【mldnboot-thymeleaf项目】在Thyemeleaf中还可以对输出的日期类型进行格式化处理。

![](/images/Image00003.gif) 　在ThymeleafController控制器中追加一个新的方法，用于传递Date属性。  
![](/images/Image00129.jpg)

![](/images/Image00003.gif) 　建立src/main/view/templates/message/message_date.html页面，以格式化日期显示。  
![](/images/Image00130.jpg)

本程序使用两种方式实现了日期时间的格式化处理，页面运行效果如图3-18所示。  
![](/images/Image00131.jpg)

图3-18　格式化日期时间

### 3.12　本章小结 

1．在SpringBoot中如果要引入Thymeleaf模板，需要配置spring-boot-starter-thymeleaf依赖包。

2．Thymeleaf可以有效地取代JSP页面，实现页面动态逻辑处理。

3．Thymeleaf分为动态页面（templates）和静态资源（static）两类资源。

4．Thymeleaf不仅仅可以实现控制器传递的属性输出，也可以实现资源文件的内容输出。

5．在Thymeleaf中可以使用"@{路径}"的形式实现资源引入与跳转配置。

6．Thymeleaf中可以使用判断、循环逻辑进行处理，也可以利用各种内置操作在页面上实现List、Map、Set、字符串等数据处理，还可以使用日期格式化指令进行日期显示格式的处理。


第4章　SpringBoot与Web应用 
=============================================

**通过本章学习，可以达到以下目标：**

1．掌握SpringBoot项目war包的生成与Tomcat发布。

2．掌握SpringBoot基于https运行模式的配置。

3．掌握SpringBoot错误处理。

4．掌握SpringBoot与文件上传处理。

5．掌握SpringBoot与拦截器的使用。

SpringBoot虽然极大地简化了Web项目开发与部署环节的配置，但是其依然属于Web项目，因此在实际工作中需要考虑与Tomcat的整合，当需要安全访问时还应该提供https支持。在本章中将为读者讲解SpringBoot项目与Tomcat的结合处理、错误处理机制、文件上传处理以及拦截器的使用。

### 4.1　配置Tomcat运行 

在SpringBoot中默认支持Tomcat容器，所以当一个SpringBoot项目打包生成\*.jar文件并且直接执行的时候就会自动启动内部的Tomcat容器。除了此种模式之外，也可以将Web项目打包为\*.war文件，采用部署的形式通过Tomcat进行发布处理。  
**提示：Tomcat部署时的配置。**

在将SpringBoot打包为\*.war文件的时候，如果想正常部署一定要注意以下两点：

1．取消项目中的Jetty容器的配置。

2．将所有的源文件夹目录设置输出资源，修改父pom.xml中的\<resource\>配置。

1．【mldnboot-web项目】修改pom.xml配置文件，将程序的打包类型定义为\*.war。  

```
     <packaging>war</packaging>      <!-- 项目打包类型 -->
```

2．【mldnboot-web项目】修改pom.xml配置文件，追加war文件打包插件。  
![](/images/Image00132.jpg)

3．【mldnboot-web项目】更新Maven项目，随后会提醒开发者当前项目中缺少WEB-INF/web.xml配置文件，此时需要开发者手工创建。创建完成的目录结构如图4-1所示。  
![](/images/Image00133.jpg)

图4-1　创建Web项目

4．【mldnboot-web项目】如果现在项目要以Tomcat的形式运行，那么需要修改SpringBoot程序启动类定义，该类必须要继承SpringBootServletInitializer父类，同时还需要覆写configure()方法。  
![](/images/Image00134.jpg)

5．【mldnboot-web项目】对项目进行打包部署（clean package），成功之后会在target目录中形成mldn.war程序文件，随后可以将此文件直接复制到Tomcat所在目录之中，而后启动Tomcat进行项目发布。

### 4.2　https安全访问 

SpringBoot启动时默认采用http进行通信协议定义，考虑到安全，往往会使用https进行访问。正常来讲，https的访问是需要证书的，并且为了保证这个证书的安全，一定要在项目中使用CA进行认证。下面只是在本机做一个简单的模拟，利用Java提供的keytool命令实现证书的生成。

1．【操作系统】利用keytool生成一个证书。  
![](/images/Image00135.jpg)

该程序执行完成后会生成一个名称为keystore.p12的证书文件，该证书的别名为mytomcat，访问密码为mldnjava。

2．【mldnboot-web项目】将生成的keystore.p12复制到src/main/resources目录中，如图4-2所示。  
![](/images/Image00136.jpg)

图4-2　配置安全访问

3．【mldnboot-web项目】修改application.yml文件，配置ssl安全访问。  
![](/images/Image00137.jpg)

4．【mldnboot项目】资源目录中增加了\*.p12文件，要想让其正常执行，还需要修改resource配置，追加输出文件类型配置。  
![](/images/Image00138.jpg)

5．【mldnboot-web项目】虽然现在程序配置了https支持，但考虑到用户访问时可能会使用http访问，所以需要做一个Web配置，使得通过http的80端口访问的请求直接映射到https的443端口上。  
![](/images/Image00139.jpg)

此时程序在通过80端口访问时，会自动跳转到https访问的443端口上。

### 4.3　数据验证 

在进行Web开发过程中，用户提交数据的合法性是最基础的验证手段，在SpringBoot中可以直接使用hibernate-vidator组件包实现验证处理，而此组件包中支持的验证注解如表4-1所示。  
**表4-1　hibernate-vidator验证注解**
![](/images/Image00140.jpg)

1．【mldnboot-web项目】在src/main/resources目录下创建ValidationMessages.properties（文件名称为默认设置，不可更改）文件，该文件中要保留所有的错误提示信息。  
![](/images/Image00141.jpg)

2．【mldnboot-web项目】建立一个Member程序类，并且在该类上使用验证注解。同时，验证出错时的错误信息引用之前ValidationMessages.properties文件中的定义。  
![](/images/Image00142.jpg)

3．【mldnboot-web项目】建立一个MemberController控制器程序类。  
![](/images/Image00143.jpg)

本程序为了方便读者理解，除了将错误提示信息以Restful方式返回之外，还直接在后台进行了错误信息的打印。如果用户输入的内容全部正确，则会返回用户输入的信息。

4．【mldnboot-web项目】在src/main/view源文件夹中创建templates/member_add.html页面，定义用户信息增加表单。  
![](/images/Image00144.jpg)

本程序由于存在Member数据验证逻辑，在用户信息输入正确时将返回如图4-3所示的界面。如果输入错误，则会返回如图4-4所示的界面。  
![](/images/Image00145.jpg)

图4-3　信息输入正确时返回Member对象  
![](/images/Image00146.jpg)

图4-4　信息输入错误时返回错误信息

### 4.4　配置错误页 

在Web项目开发过程中，错误信息提示页是一个重要的组成部分。无论多么合理的项目，也很难保证不出现类似于404或500的错误问题，而让用户直接看见满是异常信息的页面明显不是一个好的选择。这时，就需要有一个错误信息提示页。

1．【mldnboot-web项目】错误页面一般都属于静态页面，这里在src/main/view/static目录下创建error-404.html和error-500.html两个页面，项目结构如图4-5所示。  
![](/images/Image00147.jpg)

图4-5　错误页结构  
![](/images/Image00148.jpg)

2．【mldnboot-web项目】建立错误页配置。  
![](/images/Image00149.jpg)

配置完错误页之后，会根据用户请求时的http状态码跳转到不同的页面进行显示。

### 4.5　全局异常处理 

全局异常处理指的是针对程序中产生的Exception进行的处理。产生了异常之后，可以统一跳转到一个页面进行错误提示，也可以通过Restful形式返回错误信息。  
**提示：关于全局错误与全局异常。**

全局错误指的是对http状态码进行的错误跳转处理，全局异常指的是发生某些异常（如果处理的是Exception，则表示处理全部异常）之后的跳转页面。两者属于并行的概念，在项目开发中建议同时配置两者。

另外，如果想方便地观察本程序的执行结果，建议先将错误页的配置取消。

1．【mldnboot-web项目】建立一个全局异常处理，该类可以处理所有的Exception异常。  
![](/images/Image00150.jpg)

2．【mldnboot-web项目】建立src/main/view/templates/error.html页面，进行错误信息显示。  
![](/images/Image00151.jpg)

3．【mldnboot-web项目】建立一个控制器，主要功能是产生一个异常信息，以观察全局异常处理是否生效。  
![](/images/Image00152.jpg)

在本程序中，只要访问/info路径，就会产生异常，而产生异常之后将统一跳转到error.html页面。本程序运行结果如图4-6所示。  
![](/images/Image00153.jpg)

图4-6　错误页跳转  
**提示：基于Restful错误信息提示。**

本程序在发生异常之后采用跳转的形式来处理，而SpringBoot最大的特点是支持Restful处理，因此为了描述异常，也可以直接采用Restful的形式回应异常信息，即不再跳转到HTML页面进行显示。

**范例：** 修改GlobalExceptionAdvice程序类，将其修改为Restful风格显示。  
![](/images/Image00154.jpg)

本程序使用了@RestControllerAdvice注解，则此时的异常处理将使用Restful风格，程序发生异常之后的运行效果如图4-7所示。  
![](/images/Image00155.jpg)

图4-7　使用Restful处理全局异常

### 4.6　文件上传 

文件上传功能是Web开发的一项重要技术手段，SpringBoot本身也支持文件上传操作，并且其实现原理与SpringMVC相同，唯一的差异是配置相对减少了许多。

#### 4.6.1　基础上传 

SpringBoot采用FileUpload组件实现上传处理，在控制器中可以使用MultipartFile类进行接收。

1．【mldnboot-web项目】建立上传控制器UploadController，利用MultipartFile将上传文件保存在本地磁盘。  
![](/images/Image00156.jpg)

2．【mldnboot-web项目】建立src/main/view/templates/upload.html页面。  
![](/images/Image00157.jpg)

本程序通过表单传递了姓名（文本）和图片（二进制数据）两个数据信息。控制器接收到此请求信息后，如果有上传文件存在，则会直接返回上传信息（开发者也可以根据情况选择将文件保存），程序运行效果如图4-8所示。  
![](/images/Image00158.jpg)

图4-8　文件上传

#### 4.6.2　上传文件限制 

在实际项目开发中，需要对用户上传文件的大小进行限制，这样才可以保证服务器的资源不被浪费。

1．【mldnboot-web项目】修改application.yml配置文件，增加上传限制。  
![](/images/Image00159.jpg)

2．【mldnboot-web项目】对于上传限制，也可以利用Bean实现同样的效果。  
![](/images/Image00160.jpg)

此时如果用户上传的内容超过了配置的限制，就会利用全局异常处理，上传出错后页面执行的效果，如图4-9所示。  
![](/images/Image00161.jpg)

图4-9　上传限制

#### 4.6.3　上传多个文件 

如果要进行多个文件的上传，需要通过MultipartHttpServletRequest进行文件接收。

1．【mldnboot-web项目】修改upload.html页面，定义多个文件上传控件。  
![](/images/Image00162.jpg)

2．【mldnboot-web项目】修改UploadController控制器，实现多个文件上传。  
![](/images/Image00163.jpg)

本程序为了方便文件上传，在控制器类中定义了一个saveFile()方法，以进行文件的保存，同时利用此方法返回了上传文件的保存路径。  
**提示：上传图片应该保存在图片服务器中。**

在本书所讲解的文件上传处理过程中，都是将图片保存到本地的Web服务端，但是从实际的开发来讲，这种操作是不可行的。在当今的项目开发中，最流行的设计理念是高可用、高并发、分布式设计，所以在实际项目中需要搭建专门的图片服务器进行上传资源的保存。如图4-10所示给读者简单地描述了一个Web集群与图片服务器集群的搭建关系。  
![](/images/Image00164.jpg)

图4-10　简化的Web与图片服务器集群设计

在本书中，由于只涉及SpringBoot开发框架的使用，所以不会对此部分的内容进行讲解，有兴趣的读者可以登录www.mldn.cn自行学习。

### 4.7　拦截器 

在Web请求处理的过程中，拦截器是服务器端进行数据处理的最后一道屏障，可以将所有用户请求的信息在拦截器中进行验证。在SpringBoot中可以继续使用SpringMVC所提供的拦截器进行处理。

1．【mldnboot-web项目】定义一个拦截器处理类。  
![](/images/Image00165.jpg)

在拦截器中最需要用户处理的方法是preHandle()，此方法会在控制层的方法执行之前进行调用。

2．【mldnboot-web项目】如果要拦截器生效，则还需要定义一个拦截器的配置类。  
![](/images/Image00166.jpg)

本程序将拦截器配置到了Web项目中，配置的访问路径为全部请求路径，这样不管用户如何访问都会先执行拦截器中的处理方法。

### 4.8　AOP拦截器 

AOP（面向切面编程）是Spring提供的重要技术工具，其主要功能是对业务层的方法调用进行拦截处理。SpringBoot默认情况下并没有配置AOP拦截器，开发者需要在项目中手动引入spring-boot-starter-aop依赖库后才可以使用。

1．【mldnboot-web项目】修改pom.xml配置文件，配置spring-boot-starter-aop依赖库。  
![](/images/Image00167.jpg)

2．【mldnboot-web项目】定义业务层接口。  
![](/images/Image00168.jpg)

3．【mldnboot-web项目】定义业务层接口实现子类。  
![](/images/Image00169.jpg)

4．【mldnboot-web项目】定义AOP程序类，对业务方法进行拦截，本例使用环绕通知处理。  
![](/images/Image00170.jpg)

5．【mldnboot-web项目】编写测试类，测试ServiceAspect拦截是否生效。  
![](/images/Image00171.jpg)

本程序由于将切入点设置在了所有的业务层上，所以在调用IMessageService接口方法时会自动执行AOP拦截。

### 4.9　本章小结 

1．SpringBoot项目可以将程序打包为war文件，并且部署到Tomcat容器上执行。

2．SpringBoot可以像web.xml文件一样设置状态码的错误跳转页，也可以设置异常的错误跳转页。

3．SpringBoot与SpringMVC上传文件的处理形式相同，但是配置更加简化。

4．SpringBoot可以使用HandlerInterceptor拦截器对控制层的请求进行拦截。

5．SpringBoot可以直接导入spring-boot-starter-aop编写AOP拦截器，实现业务层拦截。


第5章　SpringBoot服务整合 
===========================================

**通过本章学习，可以达到以下目标：**

1．掌握SpringBoot与DataSource数据源整合。

2．掌握SpringBoot与MyBatis开发框架整合。

3．掌握SpringBoot与SpringDataJPA开发框架整合。

4．掌握SpringBoot与消息组件（ActiveMQ、RabbitMQ、Kafka）整合。

5．掌握SpringBoot与邮件服务整合。

6．掌握SpringBoot与定时调度服务整合。

7．掌握SpringBoot与Redis数据库整合。

8．掌握SpringBoot与Restful服务整合。

在实际的项目开发中，Spring开发框架几乎无处不在，相信有过框架开发经验的读者都有过被成堆的Spring配置文件搞疯的经历。幸运的是，SpringBoot开发框架极大地简化了与第三方框架及第三方服务之间的整合处理。本章将为读者讲解SpringBoot与常见开发框架的整合。  
**提示：本章不涉及具体的服务部署。**

众所周知，当前的项目不再由某一种单独的Web服务提供支持，而是由一整套的集群服务在为每一个使用者提供支持。本章讲解中将涉及MyBatis、JPA（SpringDataJPA）、Druid、C3P0、ActiveMQ、RabbitMQ、Kafka、Mail、Redis、线程池等概念，这些内容不再讲解其基本使用与服务部署，对这些概念不熟悉的读者可以登录www.mldn.cn自行学习，本章只是讲解服务整合处理。

### 5.1　SpringBoot整合数据源 

在实际项目开发中任何项目都很难脱离数据库而单独存在，所以为了提高数据库的操作性能，开发者往往会借助于数据库连接池来进行处理，同时在项目中利用DataSource进行数据源的连接。常用的有C3P0和Druid两类数据库连接池，下面一一进行介绍。

#### 5.1.1　SpringBoot整合C3P0数据库连接池 

C3P0是一个开源的JDBC连接池，它实现了数据源和JNDI绑定，支持JDBC3规范和JDBC2的标准扩展，同时在Hibernate、Spring项目开发中被广泛应用。

1．【mldnboot项目】修改父pom.xml配置文件，追加C3P0依赖支持管理。  
![](/images/Image00172.jpg)

2．【mldnboot-integration项目】修改pom.xml配置文件，引入C3P0的相关依赖支持库。  
![](/images/Image00173.jpg)

3．【mldnboot-integration项目】修改application.yml配置文件，追加C3P0数据库连接池配置信息。  
![](/images/Image00174.jpg)

4．【mldnboot-integration项目】建立C3P0数据源连接池配置类，此时设置的Bean名称为dataSource。  
![](/images/Image00175.jpg)

5．【mldnboot-integration项目】编写测试类，测试当前DataSource配置是否正确。  
![](/images/Image00176.jpg)

本程序在确保使用的MySQL数据库服务正常开启后，就可以通过C3P0工具获取数据库连接。

#### 5.1.2　SpringBoot整合Druid数据库连接池 

Druid是阿里巴巴推出的一款数据库连接池组件（可以理解为C3P0的下一代产品），也是一个用于大数据实时查询和分析的高容错、高性能开源分布式系统，可高效处理大规模的数据并实现快速查询和分析。

1．【mldnboot项目】修改父pom.xml文件，引入Druid的相关依赖库。  
![](/images/Image00177.jpg)

2．【mldnboot-integration项目】修改pom.xml配置文件，追加Druid依赖配置。  
![](/images/Image00178.jpg)

3．【mldnboot-integration项目】修改application.yml配置文件，追加Druid的连接配置。  
![](/images/Image00179.jpg)

此时，项目中就可以采用Druid数据库连接池来进行数据库操作了。  
**提示：进行连接测试前需要导入相应ORM框架的依赖支持包。**

在本程序中，如果要进行DataSource连接测试，则需要导入ORM依赖关联包。例如，可以在本程序中导入MyBatis的ORM开发包。  
![](/images/Image00180.jpg)

导入以上开发包之后，可以正常测试。如果未导入，则程序测试时会出现Unsatisfied DependencyException异常信息。

### 5.2　SpringBoot整合ORM开发框架 

在使用Spring整合ORM组件的过程中，为了达到简化的目的，往往会进行大量的配置。利用SpringBoot可以进一步实现配置的简化，在本章中将为读者讲解两种常用的ORM组件的整合：MyBatis和JPA。

#### 5.2.1　SpringBoot整合MyBatis开发框架 

MyBatis是一款常用并且配置极为简单的ORM开发框架。其与Spring结合后，可以利用Spring的特征实现DAO接口的自动配置。在SpringBoot中，又对MyBatis框架的整合进行了进一步简化。想实现这种配置，需要在项目中引入mybatis-spring-boot- starter依赖支持库。  
**提示：需要数据库连接池支持。**

SpringBoot与ORM开发框架整合时，如无特殊说明，将使用Druid作为数据库连接池。同时，数据库名称统一设置为mldn，数据表也统一使用如下的脚本创建。  
![](/images/Image00181.jpg)

此表表示部门信息，除了自动增长的主键之外，只提供了部门名称（dname）一个字段。

1．【mldnboot-integration项目】建立VO类，并且所有VO类的所在包均为cn.mldn.mldnboot.vo。  
![](/images/Image00182.jpg)

2．【mldnboot-integration项目】在src/main/resources目录中创建mybatis/mybatis.cfg.xml配置文件。  
![](/images/Image00183.jpg)

3．【mldnboot-integration项目】修改application.yml配置文件，追加MyBatis配置。  
![](/images/Image00184.jpg)

4．【mldnboot-integration项目】建立IDeptDAO接口，该接口将由Spring自动实现。  
![](/images/Image00185.jpg)

5．【mldnboot-integration项目】定义IDeptService业务层接口。  
![](/images/Image00186.jpg)

6．【mldnboot-integration项目】定义DeptServiceImpl业务层实现子类。  
![](/images/Image00187.jpg)

7．【mldnboot-integration项目】编写测试类，测试IDeptService业务方法。  
![](/images/Image00188.jpg)

读者可以发现，MyBatis的原始配置并没有做任何改变。整体开发对于Spring的整合，只需要修改application.yml的几个配置项就可以实现了。

#### 5.2.2　SpringBoot整合JPA开发框架 

JPA是官方推出的Java持久层操作标准（现主要使用Hibernate实现），使用SpringData技术和JpaRepository接口技术，也可以达到简化数据层的目的。要在SpringBoot中使用SpringDataJPA，需要spring-boot-starter-data-jpa依赖库的支持。

1．【mldnboot-integration项目】修改pom.xml配置文件，引入相关依赖包。  
![](/images/Image00189.jpg)

2．【mldnboot-integration项目】建立持久化类Dept。  
![](/images/Image00190.jpg)

3．【mldnboot-integration项目】定义IDeptDAO接口，此接口继承JpaRepository父接口。  
![](/images/Image00191.jpg)

4．【mldnboot-integration项目】定义IDeptService业务层接口。  
![](/images/Image00192.jpg)

5．【mldnboot-integration项目】定义DeptServiceImpl业务层实现子类。  
![](/images/Image00193.jpg)

6．【mldnboot-integration项目】修改程序启动主类，追加Repository扫描配置。  
![](/images/Image00194.jpg)

7．【mldnboot-integration项目】编写测试类，测试IDeptService业务方法。  
![](/images/Image00195.jpg)

本程序利用SpringBoot调用了SpringDataJPA，并且利用JpaRepository实现了DAO接口的自动实现。需要注意的是，如果想启用Repository配置，则需要在程序启动主类时使用@EnableJpaRepositories注解配置扫描包，而后才可以正常使用。

#### 5.2.3　事务处理 

SpringBoot中可以使用PlatformTransactionManager接口来实现事务的统一控制，而进行控制的时候也可以采用注解或者AOP切面配置形式来完成。

1．【mldnboot-integration项目】在业务层的方法上启用事务控制。  
![](/images/Image00196.jpg)

2．【mldnboot-integration项目】在程序主类中还需要配置事务管理注解。  
![](/images/Image00197.jpg)

项目中利用业务层中定义的@Transactional注解就可以实现事务的控制，但是这样的事务控制过于复杂。在一个大型项目中可能存在成百上千的业务接口，全部使用注解控制必然会造成代码的大量重复。在实际工作中，SpringBoot与事务结合最好的控制方法就是定义一个事务的配置类。

3．【mldnboot-integration项目】取消事务注解配置，并定义TransactionConfig配置类。  
![](/images/Image00198.jpg)  
![](/images/Image00199.jpg)

此时程序中的事务控制可以利用TransactionConfig类结合AspectJ切面与业务层中的方法匹配，而后就不再需要业务方法使用@Transactional注解重复定义了。

### 5.3　SpringBoot整合消息服务组件 

在进行分布式系统设计时，经常会使用消息服务组件进行系统整合与异步服务通信，其基本结构为生产者与消费者处理，如图5-1所示。常用的消息组件主要包括两类：JMS标准（ActiveMQ）和AMQP标准（RabbitMQ、Kafka），本章将为读者讲解这两类组件与SpringBoot的整合。  
![](/images/Image00200.jpg)

图5-1　消息组件处理结构

#### 5.3.1　SpringBoot整合ActiveMQ消息组件 

ActiveMQ是Apache提供的开源组件，是基于JMS标准的实现组件。下面将利用SpringBoot整合ActiveMQ组件，实现队列消息的发送与接收。

1．【mldnboot-integration项目】修改pom.xml配置文件，追加spring-boot-starter-activemq依赖库。  
![](/images/Image00201.jpg)

2．【mldnboot-integration项目】修改application.yml配置文件，进行ActiveMQ的配置。  
![](/images/Image00202.jpg)

3．【mldnboot-integration项目】定义消息消费监听类。  
![](/images/Image00203.jpg)

4．【mldnboot-integration项目】定义消息生产者业务接口。  
![](/images/Image00204.jpg)

5．【mldnboot-integration项目】定义消息业务实现类。  
![](/images/Image00205.jpg)

6．【mldnboot-integration项目】定义JMS消息发送配置类，该类主要用于配置队列信息。  
![](/images/Image00206.jpg)

本例利用ActiveMQ实现了消息的发送与接收处理。每当有消息接收到时，都会自动执行MessageConsumer类，进行消息消费。

#### 5.3.2　SpringBoot整合RabbitMQ消息组件 

RabbitMQ是一个在AMQP基础上构建的新一代企业级消息系统，该组件由Pivotal公司提供，使用ErLang语言开发。本小节将为读者讲解如何使用SpringBoot实现指定RoutingKey的消息处理。  
**提示：RabbitMQ与SpringCloud整合之中意义重大。**

SpringCloud是在SpringBoot基础上构建的微架构技术开发框架，其中的SpringCloudConfig自动刷新机制就基于消息组件完成，并且推荐使用RabbitMQ消息组件（同属于Pivotal公司产品）。在SpringCloudStream中也使用RabbitMQ作为服务组件。

1．【mldnboot-integration项目】修改pom.xml配置文件，追加spring-boot-starter-amqp依赖包。  
![](/images/Image00207.jpg)

2．【mldnboot-integration项目】修改yml.xml配置文件，进行RabbitMQ的相关配置。  
![](/images/Image00208.jpg)

3．【mldnboot-integration项目】为了可以正常使用RabbitMQ进行消息处理，还需要做一个消息生产配置类。  
![](/images/Image00209.jpg)

4．【mldnboot-integration项目】建立消息发送接口。  
![](/images/Image00210.jpg)

5．【mldnboot-integration项目】建立消息业务实现子类。  
![](/images/Image00211.jpg)

6．【mldnboot-integration项目】建立一个消息消费端的配置程序类。  
![](/images/Image00212.jpg)

7．【mldnboot-integration项目】定义监听处理类。  
![](/images/Image00213.jpg)

此时程序实现了与RabbitMQ消息组件的整合，同时在整个程序中只需要调用IMessageProducer接口中的send()方法就可以正常发送，而后会找到设置同样ROUTINGKEY的消费者进行消息消费。

#### 5.3.3　SpringBoot整合Kafka消息组件 

Kafka是新一代的消息系统，也是目前性能最好的消息组件，在数据采集业务中被广泛应用。本程序中配置的Kafka将基于Kerberos认证实现消息组件处理。

1．【操作系统-Windows】定义一个Kerberos客户端文件，路径为d:\\kafka_client_jaas.conf。  
![](/images/Image00214.jpg)

2．【mldnboot-integration项目】修改pom.xml配置文件，追加依赖库配置。  
![](/images/Image00215.jpg)

3．【mldnboot-integration项目】修改application.yml配置文件，进行Kafka配置项编写。  
![](/images/Image00216.jpg)

4．【mldnboot-integration项目】定义消息业务发送接口。  
![](/images/Image00217.jpg)

5．【mldnboot-integration项目】使用Kafka消息机制实现消息发送接口。  
![](/images/Image00218.jpg)

6．【mldnboot-integration项目】建立一个Kafka消息的消费程序类。  
![](/images/Image00219.jpg)

7．【mldnboot-integration项目】由于此时Kafka采用Kerberos认证，因此需要修改程序启动主类。  
![](/images/Image00220.jpg)

此时，可以通过测试程序调用IMessageProducer接口进行消息发送，由于Kafka已经配置了自动创建主题，所以即使现在主题不存在，也不影响程序执行。

### 5.4　SpringBoot整合Redis数据库 

Redis是当下最流行的用于实现缓存机制的NoSQL数据库，其主要通过key-value存储，支持高并发访问。在实际工作中，Redis结合SpringData技术后可以方便地实现序列化对象的存储。SpringBoot很好地支持了Redis，可以在项目中使用SpringData进行Redis数据操作。

#### 5.4.1　SpringBoot整合RedisTemplate操作Redis 

RedisTemplate是SpringData提供的Redis操作模板，该操作模板主要以Jedis驱动程序为实现基础，进行数据操作封装，所以可以直接调用Redis中的各种数据处理命令进行数据库操作。

1．【mldnboot-integration项目】修改项目中的pom.xml配置文件，追加Redis的依赖引用。  
![](/images/Image00221.jpg)

2．【mldnboot-integration项目】修改application.yml配置文件，引入Redis相关配置项。  
![](/images/Image00222.jpg)

3．【mldnboot-integration项目】在application.yml配置文件中定义完Redis的相关配置后，就可以通过程序来利用RedisTemplate模板进行数据处理了。下面直接编写一个测试类进行测试。  
![](/images/Image00223.jpg)

本程序在测试类中直接注入了RedisTemplate模板对象，并且利用模板对象中提供的方法实现了key-value数据的保存与获取。

#### 5.4.2　Redis对象序列化操作 

在实际项目开发中，使用RedisTemplate操作Redis数据库不仅可以方便地进行命令的操作，还可以结合对象序列化操作，实现对象的保存。

1．【mldnboot-integration项目】定义对象的序列化配置类，以实现RedisSerializer接口。  
![](/images/Image00224.jpg)

2．【mldnboot-integration项目】要让建立的对象序列化管理类生效，还需要建立一个RedisTemplate的配置类。  
![](/images/Image00225.jpg)

3．【mldnboot-integration项目】建立一个待序列化的VO类对象。  
![](/images/Image00226.jpg)

4．【mldnboot-integration项目】建立测试类，实现对象信息保存。  
![](/images/Image00227.jpg)

此时的程序可以使用String作为key类型，Object作为value类型，直接利用RedisTemplate可以将对象序列化保存在Redis数据库中，也可以利用指定的key通过Redis获取对应信息。

#### 5.4.3　配置多个RedisTemplate 

SpringBoot通过配置application.yml，只能够注入一个RedisTemplate对象。从事过实际开发的读者应该清楚，在实际的使用中有可能会在项目中连接多个Redis数据源，这时将无法依靠SpringBoot的自动配置实现，只能够由用户自己来创建RedisTemplate对象。

1．【mldnboot-integration项目】为了规范配置，需要在application.yml中进行两个Redis数据库连接的配置。  
![](/images/Image00228.jpg)

2．【mldnboot-integration项目】修改pom.xml配置文件。  
![](/images/Image00229.jpg)

3．【mldnboot-integration项目】编写自定义的Redis配置类。  
![](/images/Image00230.jpg)  
![](/images/Image00231.jpg)

4．【mldnboot-integration项目】编写测试类，使用两个RedisTemplate进行数据操作。  
![](/images/Image00232.jpg)

本程序利用RedisConfig程序类注入了两个RedisTemplate对象，因此该程序具备了两个Redis数据库的操作能力。

### 5.5　SpringBoot整合安全框架 

Shiro是Apache推出的新一代认证与授权管理开发框架，可以方便地与第三方的认证机构进行整合。前面的整合过程中已经充分考虑到了分布式会话管理操作，所以本节程序将直接采用自定义缓存类来实现多个Redis数据库信息的保存，架构如图5-2所示。  
![](/images/Image00233.jpg)

图5-2　SpringBoot与Shiro整合

#### 5.5.1　SpringBoot整合Shiro开发框架 

SpringBoot与Shiro的整合处理，本质上和Spring与Shiro的整合区别不大，但开发者需要注意以下3点：

![](/images/Image00003.gif) 　SpringBoot可以自动导入一系列的开发包，但是这些开发包里面不包含对Shiro的支持，所以还需要配置shiro的开发依赖库。

![](/images/Image00003.gif) 　SpringBoot不提倡使用spring-shiro.xml文件进行配置，需要将配置文件转为Bean的形式（需要考虑缓存的调度时间问题）。

![](/images/Image00003.gif) 　Shiro在进行一些Session管理以及缓存配置时要用到shiro-quartz依赖包，该依赖包使用的是QuartZ-1.X版本，而现在能找到的都是QuartZ-2.x版本。因此，如果不使用SpringBoot，那么这样的使用差别不大；如果使用了SpringBoot集成，就会产生后台的异常信息。  
**提示：本例只讲解Shiro整合的核心配置。**

Shiro的创建与配置操作有很多，在笔者出版的其他图书中进行了完整讲解。本章只讲解SpringBoot与Shiro的核心配置，完整代码可以通过本书配套资料获得。不清楚的读者可以学习"名师讲坛"系列的其他图书或登录www.mldn.cn自行学习。

考虑到本开发只是在模拟环境中运行，所以并未建立多个Redis实例，而是直接使用不同的Redis数据库来实现多数据库模拟。

1．【mldnboot项目】修改pom.xml配置文件，追加Shiro的相关依赖包。  
![](/images/Image00234.jpg)

2．【mldnboot-shiro项目】修改pom.xml配置文件，追加依赖库配置。  
![](/images/Image00235.jpg)

3．【mldnboot-shiro项目】建立ShiroConfig的配置程序类，将所有Shiro的配置项都写在此配置类中。  
![](/images/Image00236.jpg)  
![](/images/Image00237.jpg)  
![](/images/Image00238.jpg)  
![](/images/Image00239.jpg)

在本配置程序之中，最为重要的一个配置方法就是getQuartzSessionValidationScheduler()，这也是SpringBoot整合Shiro中最为重要的一点。之所以重新配置，主要原因是SpringBoot整合Shiro时的定时调度组件版本落后，所以才需要由用户自定义一个SessionValidationScheduler接口子类。

4．【mldnboot-shiro项目】在使用Shiro的过程中，除了需要对控制层与业务层的拦截过滤之外，对于页面也需要有所支持，而SpringBoot本身不提倡使用JSP页面，所以就需要引入一个支持Shiro处理的Thymeleaf命名空间。  

```
<html xmlns:th="http://www.thymeleaf.org"

 xmlns:shiro="http://www.pollix.at/thymeleaf/ shiro"

>
```

配置完命名空间之后，Shiro就可以使用\<shiro:hasRole/\>、\<shiro:principal/\>这样的标签来进行Shiro操作。

#### 5.5.2　SpringBoot基于Shiro整合OAuth统一认证 

在实际项目开发过程中，随着项目功能不断推出，会出现越来越多的子系统，如图5-3所示。很明显，这样就需要使用统一的登录认证处理。在一个良好的系统设计中一般都会存在有一个单点登录，而OAuth正是现在最流行的单点登录协议。  
![](/images/Image00240.jpg)

图5-3　OAuth单点登录

1．【mldnboot项目】修改pom.xml配置文件，引入oltu相关依赖包。  
![](/images/Image00241.jpg)

2．【mldnboot-shiro项目】修改pom.xml配置文件，在SpringBoot项目中引入相关依赖。  
![](/images/Image00242.jpg)

3．【mldnboot-shiro项目】对于OAuth整合的处理里面，最为重要的就是为项目指明OAuth的相关处理路径，修改application.yml信息，配置OAuth相关属性。  
![](/images/Image00243.jpg)

4．【mldnboot-shiro项目】一旦项目中引入OAuth处理，则Realm一定会发生更改，定义一个新的OAuthRealm类（代替之前的MemberRealm程序类）。  
![](/images/Image00244.jpg)  
![](/images/Image00245.jpg)

5．【mldnboot-shiro项目】此时基本的OAuth整合环境已经配置成功，随后还需要建立一个执行OAuth认证的过滤器，在这个过滤器中主要是要获取一个OAuth-Token信息（建立一个OAuthToken类，该类继承UsernamePasswordToken父类，里面保存有principal、authcode两个属性信息）。  
![](/images/Image00246.jpg)  
![](/images/Image00247.jpg)

此时成功地实现了SpringBoot + Shiro + OAuth的整合处理，而这样的整合模式也是实际项目开发中的最佳组合。

### 5.6　SpringBoot整合邮件服务器 

Java本身提供了JavaMail标准以实现邮件的处理，同时用户也可以搭建属于自己的邮件服务器或者直接使用各个邮箱系统实现邮件的发送处理。本节将利用SpringBoot整合邮件服务，同时使用QQ邮箱系统进行服务整合。

1．【QQ邮箱】登录QQ邮箱，进入邮箱设置页面，如图5-4所示。  
![](/images/Image00248.jpg)

图5-4　进入QQ邮箱设置页面

2．【QQ邮箱】找到邮件服务配置项，如图5-5所示。  
![](/images/Image00249.jpg)

图5-5　进入POP 3服务

3．【QQ邮箱】开启邮箱的邮件服务后，将得到一个唯一的授权码，如图5-6所示。  
![](/images/Image00250.jpg)

图5-6　开启邮箱服务

4．【mldnboot-integration项目】修改pom.xml配置文件，引入依赖库。  
![](/images/Image00251.jpg)

5．【mldnboot-integration项目】修改application.yml配置文件，实现邮件配置。  
![](/images/Image00252.jpg)

6．【mldnboot-integration项目】编写测试类，进行邮件发送测试。  
![](/images/Image00253.jpg)

由于SpringBoot中已经进行了大量的简化配置，所以此时的程序只需要注入JavaMailSender对象，并设置好邮件内容，就可以实现邮件信息的发送。

### 5.7　定时调度 

在企业项目开发中，定时调度是一项重要的技术组成，利用定时调度可以帮助用户实现无人值守程序执行，在Spring中提供了简单的SpringTask调度执行任务，利用此组件可以实现间隔调度与CRON调度处理。

1．【mldnboot-integration项目】定义一个线程调度类。  
![](/images/Image00254.jpg)

2．【mldnboot-integration项目】为了让多个任务并行执行，还需要建立一个定时调度池的配置类。  
![](/images/Image00255.jpg)

3．【mldnboot-integration项目】在程序启动类上追加定时任务配置注解。  
![](/images/Image00256.jpg)

本程序同时启动了两个定时调度，为了使两个线程调度之间不受影响，开辟了一个线程池，可以并行执行多个任务。

### 5.8　Actuator监控 

Actuator是SpringBoot中一个用来实现系统健康检测的模块，它提供一个Resetful的API接口，可以将系统运行过程中的磁盘空间、线程数以及程序连接的数据库情况通过JSON返回，然后再结合预警、监控模块进行实时系统监控。Actuctor包括如下访问路径，如表5-1所示。  
**表5-1　Actuator监控路径**
![](/images/Image00257.jpg)

1．【mldnboot-integration项目】修改pom.xml配置文件，追加依赖库。  
![](/images/Image00258.jpg)

2．【mldnboot-integration项目】修改application.yml配置文件，关闭系统的安全配置。  
![](/images/Image00259.jpg)

配置完以上程序代码之后，用户就可以通过表5-1给出的路径进行相应信息的查看。

![](/images/Image00003.gif) 　查看环境信息：http://localhost/env。

![](/images/Image00003.gif) 　查看配置Bean：http://localhost/beans。

3．【mldnboot-integration项目】虽然现在可以实现Actuator监控，但却需要关闭安全配置。很显然，这样的配置并不合理，最好的做法是由开发者自行定义相应项目信息。下面将为项目建立一个健康信息。  
![](/images/Image00260.jpg)

本程序模拟了一个健康状态的处理，开发者可以通过其他程序来生成一个errorCode错误状态码，用户可以通过http://localhost/health路径进行健康信息访问。

4．【mldnboot-integration项目】SpringBoot构建的主要是微服务，由于微服务中需要为开发者或使用者提供大量的信息，为此在Actuator中提供了信息访问路径（/info），这些服务信息可以直接通过application.yml文件进行配置。  
![](/images/Image00261.jpg)

5．【mldnboot项目】信息配置需要Maven插件支持，为了让所有子模块都支持这种配置，修改pom.xml配置文件。

![](/images/Image00003.gif) 　添加maven-resources-plugin插件。  
![](/images/Image00262.jpg)

![](/images/Image00003.gif) 　修改资源操作，启用过滤。  
![](/images/Image00263.jpg)

此时，程序启动之后，可以输入信息访问路径http://localhost/info，得到如图5-7所示的信息内容。  
![](/images/Image00264.jpg)

图5-7　微服务信息

6．【mldnboot项目】在开发中这种提示信息会成为微服务的重要组成部分，如果重复进行配置文件的定义，那么会比较麻烦。最简单的做法是直接做一个配置程序类，进行信息的配置。  
![](/images/Image00265.jpg)

此时可以直接通过配置类获取微服务信息，这里的信息内容如图5-8所示。  
![](/images/Image00266.jpg)

图5-8　Bean定义微服务信息

### 5.9　本章小结 

1．SpringBoot可以方便地与常用ORM设计框架整合（MyBatis、JPA），同时也可以实现DataSource的自动引入。

2．SpringBoot整合消息组件时，只需要在application.yml配置文件中进行配置即可使用。

3．SpringBoot整合Redis数据库时，可以使用RedisTemplate模板进行数据库操作，也可以通过序列化操作，保存对象到数据库之中。

4．SpringBoot默认只支持单个Redis数据库连接的配置，如果需要配置多个Redis数据库连接，则需要由开发者自行定义配置程序类来完成。

5．SpringBoot属于Web应用，可以使用Shiro实现认证与授权处理，同时也可以结合OAuth实现单点登录控制。


第二部分
SpringCloud篇 
==========================================

**•　RPC标准与SpringCloud**

**•　SpringCloud与Restful访问**

**•　Eureka注册中心**

**•　Ribbon、Feign、Hystrix和Zuul**

**•　SpringCloudConfig分布式配置管理**

**•　SpringCloudStream**

**•　SpringCloudSleuth**


第6章　SpringCloud简介 
==========================================

**通过本章学习，可以达到以下目标：**

1．掌握RPC技术的主要作用。

2．了解常见RPC开发技术及主要特点。

3．了解SpringCloud开发框架的系统架构。

RPC（Remote Procedure Call，远程过程调用）技术是进行项目业务拆分的重要技术手段，SpringCloud是新一代的RPC技术，其在SpringBoot技术上进行构建，基于Restful架构，采用标准数据结构（JSON）进行数据交互。本章将为读者讲解RPC技术的发展过程及SpringCloud的整体架构。

### 6.1　RPC分布式开发技术 

项目的设计与开发实质上是业务层设计与业务功能的完善，在传统的单主机项目中，业务层的变化一般很少，所以可以直接将业务层定义在Web之中，如图6-1所示。  
![](/images/Image00267.jpg)

图6-1　单主机项目开发

在互联网时代，为了应对业务需求的变更以及用户访问量的迅猛增加，同时也为了程序的可维护性，RPC技术的应用非常广泛。利用RPC技术可以方便地帮助企业搭建业务中心，这样所有的Web端就可以利用远程接口技术实现业务中心方法的调用，从而单独进行业务中心的维护，如图6-2所示。

利用RPC技术除了可以实现业务中心的创建之外，最重要的作用是可以为一个业务实现多个RPC服务端的创建。当多个RPC服务端实现同一个业务时，可以利用代理软件实现负载均衡。这样的设计不仅可以提升性能，也方便了高峰时期的业务端扩展，从而实现高并发、高可用、分布式的项目结构设计，如图6-3所示。  
![](/images/Image00268.jpg)

图6-2　RPC项目结构  
![](/images/Image00269.jpg)

图6-3　RPC高可用设计  
**提示：关于高并发、高可用和分布式设计。**

在实际开发中，业务层的调用除了可发生于Web端，还可能存在于移动端。为了满足大量的并发访问，必须尽可能提升业务层的处理能力。由于单主机的性能是有限的，所以往往会建立业务层设计集群，使用多台主机共同实现业务层的高性能处理。这种设计中，即使业务集群中的某一台主机出现问题，也不会影响到整体业务的执行，从而实现高可用的处理机制。同时，分布式的业务中心也更便于维护以及业务设计人员进行业务完善。

### 6.2　RPC实现技术 

RPC技术采用客户端与服务端的处理模式实现分布式开发调用，其本身是一个标准，并没有定义任何传输协议，所以用户可以使用各种技术来实现。但随着技术的发展，目前也出现了一些RPC的实现技术。

![](/images/Image00003.gif) 　CORBA（Common Object Request Broker Architecture，公共对象请求代理架构）是由OMG组织制订的一种标准的面向对象应用程序体系规范。该标准可以使用任何语言实现，同时需要编写IDL接口描述文件。

![](/images/Image00003.gif) 　RMI（Remote Method Invocation，远程方法调用）是在JDK 1.1版本中提供的分布式开发技术，在实现过程中需要创建骨架与存根后才可以使用。随着JDK版本的提升，存根也可以自动生成。RMI的基础架构如图6-4所示。  
![](/images/Image00270.jpg)

图6-4　RMI技术实现架构

![](/images/Image00003.gif) 　EJB（Enterprise JavaBean）是SUN公司（已被Oracle公司收购）推出的基于RMI技术的分布式开发技术，是一个开发基于组件的企业多重应用程序的标准。在EJB技术中主要分为3种Bean：会话Bean（业务层）、实体Bean（数据层）和消息驱动Bean（消息队列中间件）。这3种Bean的对应关系如图6-5所示。  
![](/images/Image00271.jpg)

图6-5　EJB设计架构  
**提示：EJB最后只剩下了理论价值。**

EJB技术是SUN公司当年的重头戏，它提出了完善的分布式业务中心设计理念，但由于在实现上存在偏差以及EJB容器过于昂贵，EJB技术并没有真正"火"起来。其后来推出的EJB 3.x标准多数情况下还需要与WebService相结合，不得不说这是一个失败的实现。但EJB并非毫无用处，其设计理念造就了今天开源框架的发展，所以它依然是一个里程碑一样的技术。

![](/images/Image00003.gif) 　WebService（Web服务）技术使得运行在不同机器上的应用无需借助附加的、专门的第三方软件或硬件，就可相互交换数据或集成。其主要使用XML作为接口描述，同时利用SOAP（Simple Object Access Protocol，简单对象访问协议）进行通信，基本结构如图6-6所示。WebService是一个开发标准，可以直接运行在Web容器中，而后陆续出现了许多开发组件，如Axis、XFire、CXF。除了这些技术之外，还需要使用者利用工具生成一系列的伪代码，而后才可以正常实现远程接口调用。  
![](/images/Image00272.jpg)

图6-6　WebService技术操作

![](/images/Image00003.gif) 　RPC开发框架：WebService是一个大型的重量级标准，可以方便地实现异构系统架构的整合，但是其性能却经常被开发者所诟病。在其之后，许多技术开发公司陆续推出了属于自己的RPC开发框架（如阿里巴巴-Dubbo、阿里巴巴-High Speed Framework、Facebook-thrift、Google-grpc、Twitter-finagle等），这些RPC开发框架在项目中使用得也非常广泛。

![](/images/Image00003.gif) 　Restful（也可简称为Rest，指Representational State Transfer，表现层状态转换）是目前最流行的一种互联网软件架构。它结构清晰，符合标准，易于理解，方便扩展，所以逐渐得到越来越多网站的采用。SpringBoot与SpringCloud都可以方便地利用Restful标准进行构建。除了SpringCloud技术外，开发者还可以利用Jersey框架构建基于Restful风格的WebService服务。  
**提示：Rest提出者Roy Thomas Fielding。**

Rest是Roy Thomas Fielding（见图6-7）在其2000年的博士论文中提出的。他是HTTP（1.0版和1.1版）的主要设计者，Apache服务器软件的作者之一，Apache基金会的第一任主席。  
![](/images/Image00273.jpg)

图6-7　Roy Thomas Fielding

### 6.3　SpringCloud技术架构 

SpringCloud是一套技术架构（主要使用的是netflix技术产品），其整体的架构核心是围绕Restful展开的，并且以SpringBoot技术为核心基础进行构建的RPC分布式技术。在SpringCloud技术中，对于Restful处理过程中一定要有两个端：服务的提供者（Provider）和服务的消费者（Consumer），基本架构如图6-8所示。  
![](/images/Image00274.jpg)

图6-8　SpringCloud与Restful  
**提示：SpringCloud以SpringBoot为实现基础。**

在SpringBoot中如果要将控制层的处理方法以Restful形式返回，那么往往需要使用@Controller + @ResponseBody或者@RestController注解才可以实现。而SpringCloud技术是在SpringBoot的基础上构建的RPC应用，主要以Restful设计架构进行异构系统的数据交互，即SpringCloud中是不存在控制层跳转到显示页面处理操作的。

SpringCloud的本质虽然是基于Restful的一种应用，但它依然属于RPC的一种技术实现。与传统RPC不一样的地方在于，SpringCloud使用了一系列的开源组件进行整合应用，其中包含有如下5个基本组件。

**1．微服务注册中心。** 微服务的核心意义在于将一个总体的业务端拆分到不同的业务主机上，所有微服务的Restful访问地址非常多。为了统一管理这些地址信息，可以即时地告诉用户哪些服务不可用，应该准备一个分布式的注册中心，并且该注册中心支持HA（High Available，高可用性集群）机制。为了高速并且方便地进行所有服务的注册操作，在SpringCloud里面提供了一个Eureka的注册中心，如图6-9所示，所有的微服务都可以在此注册中心中进行注册。  
**提示：HA机制。**

HA是保证业务连续性的有效解决方案，一般有两个或两个以上的节点，且分为活动节点及备用节点。可以简单地理解为：如果班长在，则班长负责安排同学；如果班长不在，则副班长顶替班长完成任务。  
![](/images/Image00275.jpg)

图6-9　Eureka注册中心

**2．Ribbon负载均衡。** 单台主机的性能是有限的，如果要处理并发访问量高的微服务，就必须创建多个相同的微服务，同时采用负载均衡设计，使每一个微服务都可以为项目提供服务支持。SpringCloud中引入了Ribbon，在客户端实现了负载均衡，如图6-10所示。  
![](/images/Image00276.jpg)

图6-10　SpringCloud负载均衡

**3．Feign接口映射。** RPC开发技术遵循了客户端与服务端开发模式，且客户端使用远程接口来实现远程业务调用是最为合理的。SpringCloud技术依赖于Restful架构，开发者可以使用Feign技术实现远程接口以及远程Restful服务的映射处理，如图6-11所示。

**4．Zuul网关代理。** 为了保证微服务调用的安全性以及统一性，所有的微服务都可以采用统一的服务网关技术，通过映射名称访问相应的微服务资源。这样更好地体现了Java中key=value的设计思想。而且所有的微服务通过Zuul进行代理后，也可以更加合理地进行名称的隐藏，如图6-12所示。  
![](/images/Image00277.jpg)

图6-11　Feign接口映射  
![](/images/Image00278.jpg)

图6-12　Zuul代理网关

**5．SpringCloudConfig远程配置。** 在SpringCloud中通常会存在成百上千个微服务（有些大型项目中微服务甚至更多），为保持高效运转，其配置文件需要进行统一管理。在SpringCloud技术中实现SpringCloudConfig微服务定义，该微服务可以直接注册到Eureka中，以实现HA机制，而所有提供业务支持的微服务都通过SpringCloudConfig从GIT或SVN服务器上抓取用户配置信息，因此可以将配置资源进行统一管理，而后可以利用SpringCloudBus技术实现动态配置更新，如图6-13所示。  
![](/images/Image00279.jpg)

图6-13　SpringCloudConfig

以上几项是SpringCloud构建RPC微服务的重要实现技术。除了这些之外，在SpringCloud中充分考虑到了HA处理机制。同时SpringCloud也可以基于SpringSecurity技术实现安全访问，或者集成OAuth实现统一认证授权管理。

### 6.4　本章小结 

1．RPC是实现远程过程调用的技术标准，可以使用各种语言实现。SpringCloud是基于Restful架构实现的RPC技术。

2．SpringCloud在实现微服务的定义时，主要使用Netflix公司的产品（如Eureka、Zuul、Feign、Ribbon等）实现架构整合。

3．SpringCloud可以结合SpringSecurity技术进行安全访问。


第7章　SpringCloud与Restful 
================================================

**通过本章学习，可以达到以下目标：**

1．掌握SpringCloud与SpringBoot的关系，利用SpringCloud实现Restful服务发布。

2．掌握RestTemplate操作类的使用，利用此类实现Restful业务调用。

3．了解SpringSecurity与SpringCloud结合的意义，使用SpringSecurity实现安全认证。

4．了解Swagger工具，可以利用Swagger工具实现Restful业务接口描述。

SpringCloud是建立在SpringBoot基础上的，所以开发者必须掌握SpringBoot开发框架。由于SpringCloud是基于Restful架构的RPC开发实现，所以微架构设计中往往在客户端利用RestTemplate来实现远程Restful业务调用。为了保证系统安全，也可以使用SpringSecurity进行安全访问控制。

### 7.1　搭建SpringCloud项目开发环境 

SpringCloud（如图7-1所示）技术与SpringBoot技术一样，都提供了统一的pom.xml配置项，配置好相应的版本之后就可以在各个Maven子模块中进行依赖支持库的简单引用。SpringCloud技术与传统开发不一样的地方在于，其版本号并未采用数字，而是使用了一系列英国的地名作为标注。本例使用的版本为Edgware，如图7-2所示。  
![](/images/Image00280.jpg)

图7-1　SpringCloud图标  
![](/images/Image00281.jpg)

图7-2　SpringCloud版本

1．【Eclipse工具】创建一个新的Maven项目mldncloud，项目类型为Quick Start，如图7-3所示。

2．【mldncloud项目】修改pom.xml配置文件。如果要开发SpringCloud，则一定要引入SpringBoot依赖支持，核心配置内容如下。  
![](/images/Image00282.jpg)

图7-3　创建新的Maven项目  
![](/images/Image00283.jpg)

本配置文件中只引入了SpringBoot与SpringCloud的依赖支持包，其他的相关支持包将在讲解过程中根据需求逐步进行依赖配置。

### 7.2　Restful基础实现 

不管使用何种技术实现的RPC项目开发，采用的均为服务端与客户端结构。为了保证服务端定义与客户端访问的标准性，可以单独创建一个远程接口的描述项目。这里建立的项目结构如图7-4所示。  
**提示：Maven模块项目命名。**

在本节讲解过程中，由于SpringCloud开发框架需要建立一系列的微服务，为了让读者清楚每一个微服务的作用，将直接在项目名称上做出描述。例如，部门微服务的项目名称为mldncloud-dept-service-8001，其中，dept为微服务的作用描述，而8001描述的是启动端口。  
![](/images/Image00284.jpg)

图7-4　项目描述  
**提示：关于TO类（Transfer Object，数据传输对象）的作用。**

在建立Spring微服务的时候，数据库的ORM开发框架是不可少的。为了方便，这里将使用JPA开发框架结合SpringDataJPA技术实现数据层的访问。为了对外部隐藏PO类，在mldncloud-api项目中会建立一个与指定微服务中PO类结构相同的TO类，进行数据传输。在微服务控制器中只使用Bean拷贝技术，实现PO与TO的内容拷贝处理，这样的实现会更加安全。

由于微服务需要与数据库进行整合处理操作，所以在本程序中将利用SpringDataJPA技术实现数据层开发。为了简化，本例将创建如下数据库。

**范例：** 【MySQL数据库】定义数据库创建脚本。  
![](/images/Image00285.jpg)

本数据库名称为dept8001，而后该数据库将被SpringCloud微服务访问，作为服务提供者；而SpringBoot将作为服务消费者，实现远程业务调用。本程序的基本处理结构如图7-5所示。  
![](/images/Image00286.jpg)

图7-5　微服务基础架构

在本程序中，RPC服务端使用SpringCloud技术结合SpringDataJPA技术实现数据库操作。为了访问安全，在Web消费端与RPC服务端之间依靠数据传输对象（结构与实体类完全一致）进行数据交互，而后在业务层利用Spring开发框架提供的BeanUtils类实现对象拷贝处理。

#### 7.2.1　建立公共API模块：mldncloud-api 

mldncloud-api项目模块的主要作用是定义所有微服务之中的业务接口与传输类。该类不涉及具体的业务逻辑开发，只是定义了标准。

1．【mldncloud项目】创建mldncloud-api项目模块，如图7-6所示。  
![](/images/Image00287.jpg)

图7-6　建立mldncloud-api项目

2．【mldncloud-api项目】建立描述部门类的TO类。  
![](/images/Image00288.jpg)

3．【mldncloud-api项目】建立IDeptService业务接口。  
![](/images/Image00289.jpg)

公共API项目建立完成之后，可以直接在微服务的提供者项目与微服务消费者项目中引入该模块。

#### 7.2.2　建立部门微服务：mldncloud-dept-service-8001 

部门微服务项目主要是进行部门业务的实现，同时为了简化实体层开发，本例将直接利用SpringDataJPA开发框架实现数据库访问。本例程序要使用的数据库创建脚本如下。

1．【mldncloud项目】创建新的子模块mldncloud-dept-service-8001，如图7-7所示。  
![](/images/Image00290.jpg)

图7-7　建立部门微服务项目

2．【mldncloud项目】修改pom.xml配置文件，追加数据库与ORM框架依赖配置。  
![](/images/Image00291.jpg)

3．【mldncloud-dept-service-8001项目】修改pom.xml配置文件，引入相关依赖包。  
![](/images/Image00292.jpg)

4．【mldncloud-dept-service-8001项目】在application.yml配置文件中定义相关配置属性。  
![](/images/Image00293.jpg)

5．【mldncloud-dept-service-8001项目】建立持久化对象Dept。  
![](/images/Image00294.jpg)

6．【mldncloud-dept-service-8001项目】定义IDeptDAO接口，利用SpringDataJPA自动进行配置。  
![](/images/Image00295.jpg)

7．【mldncloud-dept-service-8001项目】定义业务层接口实现子类DeptServiceImpl。  
![](/images/Image00296.jpg)

8．【mldncloud-dept-service-8001项目】定义部门Rest控制类。  
![](/images/Image00297.jpg)

本程序中为了实现部门数据的增加操作，需要接收消费端传递过来的对象，所以使用了@RequestBody注解进行声明，同时在根据部门编号获取部门信息时，采用路径参数的方式进行传递，使用了@PathVariable("deptno")注解。

9．【mldncloud-dept-service-8001项目】定义程序启动类。  
![](/images/Image00298.jpg)

10．【操作系统】为了方便进行微服务的访问，建议修改hosts主机名称，追加主机映射。  

```
127.0.0.1 dept-8001.com
```

对于部门微服务，此时主要通过以下3个地址进行访问：

![](/images/Image00003.gif) 　**【GET请求】获取部门信息地址为http://dept-8001.com:8001/dept/get/部门编号。**

![](/images/Image00003.gif) 　**【GET请求】部门列表地址为http://dept-8001.com:8001/dept/list。**

![](/images/Image00003.gif) 　**【POST请求】增加部门地址为http://dept-8001.com:8001/dept/add。**

#### 7.2.3　建立Web消费端：mldncloud-consumer-resttemplate 

在Web端如果要进行Restful服务端的调用，可以利用RestTemplate类实现GET或POST请求的服务调用。

1．【mldncloud项目】创建一个新的子模块mldncloud-consumer-resttemplate，如图7-8所示。

2．【mldncloud-consumer-resttemplate项目】修改pom.xml配置文件，除了引入SpringBoot的相关依赖包之外，还需要引入公共mldncloud-api模块，这样就可以使用DTO类进行数据接收。  
![](/images/Image00299.jpg)

图7-8　创建新的Maven模块  
![](/images/Image00300.jpg)

3．【mldncloud-consumer-resttemplate项目】建立一个配置类，该类主要用于定义RestTemplate对象。  
![](/images/Image00301.jpg)

4．【mldncloud-consumer-resttemplate项目】定义控制器，该控制器将利用RestTemplate进行访问。  
![](/images/Image00302.jpg)

5．【mldncloud-consumer-resttemplate项目】建立src/main/resources/application.yml配置文件，使程序运行在80端口。  
![](/images/Image00303.jpg)

6．【mldncloud-consumer-resttemplate项目】建立消费端程序启动类。  
![](/images/Image00304.jpg)

7．【操作系统】为了验证方便，修改hosts配置文件，追加主机映射。  

```
127.0.0.1 consumer.com
```

8．【客户端测试】此时程序准备完毕，开发者可以使用如下的消费端访问路径来调用远程微服务。  
![](/images/Image00305.jpg)

### 7.3　Restful接口描述 

利用SpringCloud开发技术可以方便地实现Restful技术标准。从另外一个方面来说，这些接口如果要给其他消费端程序使用，就需要有良好的接口说明信息，可以明确地将服务接口以及参数的作用告诉使用者，此时就可以利用Swagger技术实现。  
**提示：基于mldncloud-dept-service-8001进行复制。**

本节讲解的内容属于SpringCloud的辅助技术，读者可以用此技术作为接口描述。为了方便读者理解核心配置，本项目中会将mldncloud-dept-service-8001项目复制为mldncloud-dept-service-swagger项目。

由于Swagger技术与SpringCloud技术的整体联系不大，所以本例将不再进行mldncloud父pom.xml文件的配置，只在子项目中进行依赖库引入。

1．【mldncloud-dept-service-swagger项目】修改pom.xml配置文件，引入Swagger相关依赖库。  
![](/images/Image00306.jpg)

2．【mldncloud-dept-service-swagger项目】建立Swagger配置类，定义接口描述基础信息。  
![](/images/Image00307.jpg)

3．【mldncloud-dept-service-swagger项目】修改DeptRest程序类，使用Swagger进行接口描述。  
![](/images/Image00308.jpg)

本程序为Restful控制器中追加了接口的注解描述，当程序启动后可以通过swagger-ui.html地址进行访问，页面运行后的效果如图7-9所示。  
![](/images/Image00309.jpg)

图7-9　Swagger接口描述

### 7.4　SpringSecurity安全访问 

微服务需要通过Web服务器进行发布，而所有的业务接口最终都会暴露在公网上。为了保证业务的安全性，需要引入安全管理机制。在SpringCloud中可以利用SpringSecurity进行安全访问（见图7-10），即在访问某一个微服务前首先进行用户认证，认证通过后才可以访问目标微服务；如果认证失败，则返回错误信息。  
**提示：不使用数据库保存认证信息。**

在本节讲解的SpringSecurity整合处理中，将采用固定的用户名和密码进行配置，暂不与数据库进行整合处理。在本书第13章将利用OAuth整合SpringCloud进行安全配置。  
![](/images/Image00310.jpg)

图7-10　SpringSecurity安全访问

#### 7.4.1　微服务安全验证 

SpringSecurity的配置只需要在项目中引入spring-boot-starter-security依赖库即可实现。其默认的用户名为user，由于认证密码会在每一次微服务启动时动态生成，不利于微服务的消费端调用，所以在本例中将配置固定的用户名mldnjava与密码hello。

1．【mldncloud-dept-service-8001项目】修改pom.xml配置文件，追加依赖库配置。  
![](/images/Image00311.jpg)

2．【mldncloud-dept-service-8001项目】修改application.yml配置文件，配置用户名和密码。  
![](/images/Image00312.jpg)

本程序配置了微服务的认证信息。用户启动微服务并输入地址（http://dept-8001.com:8001/dept/list）后，可以看见如图7-11所示的登录界面，输入配置的用户名和密码，就能访问部门微服务信息，如图7-12所示。

在认证微服务访问时，也可以利用地址的方式进行认证信息传递，此时只需要在访问地址前追加用户名和密码即可，访问路径为http://mldnjava:hello@dept-8001.com:8001/dept/list。  
![](/images/Image00313.jpg)

图7-11　用户认证信息  
![](/images/Image00314.jpg)

图7-12　部门列表

#### 7.4.2　消费端安全访问 

Restful服务端配置了安全认证之后，此时的消费端将无法正常访问，需要配置认证请求头信息才可以实现正常的服务调用。

1．【mldncloud-consumer-resttemplate项目】修改RestfulConfig配置类，增加HTTP访问头信息配置Bean。  
![](/images/Image00315.jpg)

2．【mldncloud-consumer-resttemplate项目】修改DeptController程序类，访问前追加头信息配置。  
![](/images/Image00316.jpg)

此时消费端配置了认证的头部信息，而后可以正常地实现部门微服务的访问。

#### 7.4.3　StatelessSession 

在实际开发中，所有的Restful都是基于HTTP的一种应用，所有的Web应用都会运行在Web容器中。Web容器一般都会提供一个Session的管理机制，开发者可以直接通过配置实现以下两种Session管理机制。  
**提示：Spring的Session管理策略应以无状态（STATELESS）为主。**

org.springframework.security.config.http.SessionCreationPolicy枚举类中定义了4种会话管理状态：ALWAYS、NEVER、IF_REQUIRED和STATELESS，在实际使用中应该以STATELESS为主。在SpringCloud中默认的会话状态也是无状态会话（STATELESS）。

【mldncloud-dept-service-8001项目】修改application.yml配置文件，进行Session管理配置。  
![](/images/Image00317.jpg)

很明显，让微服务端一直维持着用户请求的会话状态是一件很浪费性能的配置，因为微服务的并发访问量巨大，所以这样的Session创建与销毁机制就会带来严重的性能问题。在实际使用中，应该以无状态会话机制为主。

#### 7.4.4　安全配置模块 

在进行Restful服务开发的时候，为了保证安全，所有程序都需要进行SpringSecurity安全认证处理。如果所有的认证处理都需要在application.yml配置文件完成，这样的配置明显是重复的。在很多时候进行微服务调用时往往需要统一用户名和密码，所以此时最简单的做法是可以单独创建一个安全配置模块，在需要的时候引入依赖模块配置即可。

1．【mldncloud项目】建立一个安全配置模块mldncloud-security，创建的时候需要定义好包名称，如图7-13所示。  
![](/images/Image00318.jpg)

图7-13　建立mldncloud-security模块

2．【mldncloud-security项目】修改pom.xml配置文件，追加依赖库配置。  
![](/images/Image00319.jpg)

3．【mldncloud-security项目】建立统一安全配置类，并且通过程序配置认证与授权信息。  
![](/images/Image00320.jpg)

4．【mldncloud项目】修改pom.xml配置文件，追加mldncloud-security模块依赖管理。  
![](/images/Image00321.jpg)

5．【mldncloud-dept-service-8001项目】修改pom.xml配置文件，引入安全模块。  
![](/images/Image00322.jpg)

由于mldncloud-security中包含有spring-boot-starter-security依赖库，所以在部门微服务中将不再需要重复引入安全配置，同时由于通过Bean进行配置也不再需要通过application.yml配置。

### 7.5　本章小结 

1．SpringCloud是基于Restful实现的RPC技术，并且需要SpringBoot技术支持。

2．在微服务的创建过程中为了保证服务访问的安全，需要配置DTO数据传输类，对请求和返回数据进行封装。

3．RestTemplate是消费端进行Restful服务端访问的程序类，通过地址即可访问。

4．微服务的信息可以通过Swagger框架进行接口描述定义。

5．为了保证微服务的安全，应该在项目中引入SpringSecurity，进行用户认证与授权信息配置。

6．微服务如果要承受高并发访问，则一定要采用无状态（STATELESS）Session配置。


第8章　Eureka注册服务 
=======================================

**通过本章学习，可以达到以下目标：**

1．掌握Eureka的主要作用与服务搭建。

2．掌握微服务注册Eureka处理。

3．掌握Eureka服务信息与发现服务配置。

4．掌握Eureka-HA机制实现原理与实现。

5．掌握Eureka服务发布。

在实际的开发环境中会存在大量的微服务，为了更方便地进行微服务的统一管理，则需要使用注册中心。在SpringCloud中推荐使用的注册中心为Eureka，本章将为读者讲解Eureka的作用以及服务注册等相关内容。  
**提示：本章暂不考虑消费端调用。**

本章所讲解的程序只针对微服务与Eureka注册中心的使用，不涉及消费端的Restful接口调用，在第9章中将会为读者详细讲解消费端整合处理。

### 8.1　Eureka简介 

RestTemplate在进行微服务访问的时候，需要明确地通过微服务的地址进行调用。这样直接利用地址的调用，一旦出现服务端主机地址变更，则消费端就需要进行大量的修改。同时，微服务的主要目的是提高业务处理能力，因此往往会若干个相同业务的微服务一同参与运算。为了解决这样的问题，在微服务的使用中需要采用Eureka注册中心对所有微服务进行管理。所有的微服务在启动后需要全部向Eureka中进行服务注册，而后客户端直接利用Eureka进行服务信息的获得，以实现微服务调用。其基本使用架构如图8-1所示。  
![](/images/Image00323.jpg)

图8-1　Eureka服务注册

### 8.2　定义Eureka服务端 

在SpringCloud中大量使用了Netflix的开源项目，而其中Eureka就属于Netflix提供的发现服务组件，该应用程序需要由开发者自行定义。

1．【mldncloud项目】创建新的子模块mldncloud-eureka-7001，该注册中心将运行在7001端口上。

2．【mldncloud-eureka-7001项目】修改pom.xml配置文件，除了引入SpringBoot相关依赖库之外，还需要引入Eureka相关依赖库。  
![](/images/Image00324.jpg)

3．【mldncloud-eureka-7001项目】修改application.yml配置文件，进行Eureka服务器配置。  
![](/images/Image00325.jpg)

4．【mldncloud-eureka-7001项目】定义程序启动主类，添加Eureka相关注解。  
![](/images/Image00326.jpg)

5．【操作系统】修改hosts配置文件，追加主机配置。  

```
127.0.0.1 eureka-7001.com
```

此时配置的主机名称eureka-7001.com与application.yml中配置的Eureka运行主机名称相同。

6．【mldncloud-eureka-7001项目】启动Eureka服务端，随后输入访问地址http://eureka-7001.com:7001/，可以看见如图8-2所示的管理界面。  
![](/images/Image00327.jpg)

图8-2　EurekaServer管理界面  
**提示：关于程序运行中的TransportException异常。**

虽然现在已经配置完了Eureka注册中心，但在运行中却会发现控制台上会输出如下错误信息：  
![](/images/Image00328.jpg)

之所以会有这些错误信息，主要是因为Eureka在默认配置下自己也是一个微服务，并且该微服务应该向Eureka中注册，但却无法找到主机所导致的。要想解决这个问题，需要修改application.yml配置文件，追加配置项。

【mldncloud-eureka-7001项目】修改application.yml配置文件，追加如下配置。  
![](/images/Image00329.jpg)

此时的程序配置了微服务要注册的Eureka服务地址，但是服务信息注册没有意义，所以配置了register-with-eureka与fetch-registry选项，不再在Eureka注册中心中显示该微服务信息。

### 8.3　向Eureka中注册微服务 

Eureka注册中心搭建成功后，所有的微服务都应该向Eureka中进行注册，此时应该进行微服务程序的配置，在微服务中引入Eureka客户端依赖，并且配置Eureka地址。

1．【mldncloud-dept-service-8001项目】修改pom.xml配置文件，引入相关依赖库。  
![](/images/Image00330.jpg)

2．【mldncloud-dept-service-8001项目】修改application.yml配置文件，追加Eureka客户端配置。  
![](/images/Image00331.jpg)

3．【mldncloud-dept-service-8001项目】如果要向Eureka中进行微服务注册，还需要为当前微服务定义名称。  
![](/images/Image00332.jpg)

4．【mldncloud-dept-service-8001项目】修改StartDeptServiceApplication8001程序启动类。  
![](/images/Image00333.jpg)

这里定义了@EnableEurekaClient注解信息，微服务启动之后，该服务会自动注册到Eureka服务器之中。分别启动Eureka注册中心微服务与部门微服务之后，就可以通过Eureka注册中心观察到所注册的微服务信息，如图8-3所示。  
![](/images/Image00334.jpg)

图8-3　Eureka中服务信息

### 8.4　Eureka服务信息 

前面实现了微服务向Eureka中的注册处理，但是此时微服务的注册信息并不完整，开发者可以通过微服务的进一步配置，实现更加详细的信息显示。

1．【mldncloud-dept-service-8001项目】修改application.yml配置文件，追加微服务所在主机名称的显示。  
![](/images/Image00335.jpg)

配置完成后，会在Eureka控制中心上显示微服务所在的主机名称，如图8-4所示。  
![](/images/Image00336.jpg)

图8-4　在控制中心显示服务主机信息

2．【mldncloud-dept-service-8001项目】修改application.yml，修改服务信息的连接主机为IP地址。  
![](/images/Image00337.jpg)

追加prefer-ip-address配置项之后，会在显示链接信息处显示IP地址，如图8-5所示。

用户打开微服务的信息之后，可以使用/info路径查看信息。由于默认状态下无法显示，此时可以使用Actuator显示微服务信息（此配置与SpringBoot中的Actuator相同）。  
![](/images/Image00338.jpg)

图8-5　链接信息显示IP地址

3．【mldncloud-dept-service-8001项目】要查看微服务详细信息，需要修改pom.xml文件，追加actuator依赖。  
![](/images/Image00339.jpg)

4．【mldncloud项目】修改pom.xml文件，追加信息处理的插件。  
![](/images/Image00340.jpg)

5．【mldncloud-dept-service-8001项目】修改application.yml配置文件，追加info的相关信息。  
![](/images/Image00341.jpg)

此时，当用户通过Eureka打开微服务时就可以显示微服务的相应信息，如图8-6所示。  
![](/images/Image00342.jpg)

图8-6　查看微服务信息

### 8.5　Eureka发现管理 

Eureka的主要作用是进行微服务注册。在整个微服务的运行过程中，Eureka也需要对微服务的状态进行监听，对无用的微服务可以进行清除处理，也可以通过发现管理查看Eureka信息。

1．【mldncloud-eureka-7001项目】修改applicaiton.yml配置文件，设置微服务清理间隔。  
![](/images/Image00343.jpg)

本程序为了方便读者观察，将微服务的清除设置为每秒一触发。一旦触发清理操作后，会在控制台显示如下信息：  

```
[a-EvictionTimer] c.n.e.registry.AbstractInstanceRegistry : Running the evict task with compensationTime 0ms
```

过于频繁的清理会造成Eureka的性能下降，所以一般情况下建议使用其默认设置。

2．【mldncloud-eureka-7001项目】在Eureka使用过程中经常会看见如下所示的提示文字：  
![](/images/Image00344.jpg)

该提示的核心意义在于：当某一个微服务不可用时（可能出现了更名或者是宕机等因素），由于所有的微服务提供有保护模式，所以Eureka是不会对微服务信息进行清理的。如果希望关闭这种保护模式（一般不推荐），则可以通过修改application.yml来实现。在Eureka中增加如下配置：  
![](/images/Image00345.jpg)

3．【mldncloud-dept-service-8001项目】所有注册到Eureka中的微服务如果要与Eureka之间保持联系，依靠的是心跳机制。用户可以根据网络环境自行进行心跳机制的配置，只需要修改微服务中的application.yml即可。  
![](/images/Image00346.jpg)

4．【mldncloud-dept-service-8001项目】所有注册到Eureka中的微服务均可以定义Eureka发现信息，只需要在相应的微服务中获取DiscoveryClient对象即可。修改DeptRest程序类，追加新的方法。  
![](/images/Image00347.jpg)

5．【mldncloud-dept-service-8001项目】在程序启动类中追加发现服务配置注解。  
![](/images/Image00348.jpg)

程序启动之后通过访问地址http://mldnjava:hello@dept-8001.com:8001/dept/discover，可以查询到微服务的相关信息，如图8-7所示。  
![](/images/Image00349.jpg)

图8-7　Eureka发现信息

### 8.6　Eureka安全配置 

在整个SpringCloud微服务架构中，Eureka是一个重要的注册中心，并且只能够注册自己所需要的微服务。为了保证Eureka安全，需要为Eureka引入SpringSecurity实现安全配置。

1．【mldncloud-eureka-7001项目】修改pom.xml配置文件，引入SpringSecurity的依赖包。  
![](/images/Image00350.jpg)

2．【mldncloud-eureka-7001项目】修改application.yml配置文件，追加安全配置。  
![](/images/Image00351.jpg)

在本配置中追加了新的用户名edmin/mldnajva，而Eureka微服务本身也需要设置一个Eureka服务器的访问地址，所以要修改defaultZone的访问路径，追加认证信息。

3．【mldncloud-dept-service-8001项目】修改application.yml配置文件，进行授权的注册连接。  
![](/images/Image00352.jpg)

此时，只有认证信息正确的微服务才可以在Eureka中进行注册。

### 8.7　Eureka-HA机制 

Eureka是整个微服务架构中的核心组件，如果Eureka服务器出现问题，则所有的微服务都无法注册，这样整个项目就会彻底瘫痪。为了避免出现这样的问题，可采用Eureka集群的模式来处理，即使用多台主机共同实现Eureka注册服务，这样即使有一台主机出现问题，另外的主机也可以正常提供服务支持。如图8-8所示给出了2台Eureka主机的集群搭建，如图8-9所示给出了3台Eureka主机的集群搭建。  
![](/images/Image00353.jpg)

图8-8　2台集群主机  
![](/images/Image00354.jpg)

图8-9　3台集群主机

通过图8-8与图8-9可以发现，在实现Eureka集群时最重要的实现形式就是某一台Eureka主机（客户端）需要向其他的Eureka主机进行注册。本例将为读者演示3台Eureka主机的HA集群配置。

1．【操作系统】修改hosts主机文件，追加3个主机名称，与要创建的3个Eureka微服务对应。  
![](/images/Image00355.jpg)

2．【mldncloud-eureka-server-a项目】修改application.yml配置文件，追加集群环境配置。  
![](/images/Image00356.jpg)

3．【mldncloud-eureka-server-b项目】修改application.yml配置文件，追加集群环境配置。  
![](/images/Image00357.jpg)

4．【mldncloud-eureka-server-c项目】修改application.yml配置文件，追加集群环境配置。  
![](/images/Image00358.jpg)

5．【mldncloud-dept-service-8001项目】修改application.yml配置文件，向3台主机同时注册微服务。  
![](/images/Image00359.jpg)

6．【mldncloud-eureka-server-\*项目】启动所有的Eureka服务，登录其中任意一台Eureka控制台，就可以看见Eureka-HA集群主机，同时注册的微服务会在3台主机上同时存在，如图8-10所示。  
![](/images/Image00360.jpg)

图8-10　Eureka副本  
**提示：后续讲解依然以单节点Eureka为主。**

Eureka-HA机制需要多台主机共同支持才可以实现微服务注册，这一机制只在实际的项目环境中存在。因此本书后续讲解时将继续以单节点Eureka为主，使用mldncloud-eureka-7001项目。

### 8.8　Eureka服务发布 

Eureka作为独立的微服务存在，也需要进行项目打包与部署。在实际项目环境中，由于Eureka需要HA机制的支撑，所以本节将利用profile实现多个环境的配置。

1．【mldncloud-eureka-profile项目】修改application.yml配置文件，设置多个profile配置。  
![](/images/Image00361.jpg)  
![](/images/Image00362.jpg)

2．【mldncloud-eureka-profile项目】修改pom.xml配置文件，追加打包插件。  
![](/images/Image00363.jpg)

3．【mldncloud-eureka-profile项目】通过Maven打包clean package，如图8-11所示。随后就可以在项目的目录中发现生成的eureka-server.jar文件。  
![](/images/Image00364.jpg)

图8-11　项目打包

4．【操作系统】使用默认配置启动Eureka服务java -jar eureka-server.jar。

5．【操作系统】使用其他profile启动Eureka。

![](/images/Image00003.gif) 　运行product-7102：java -jar eureka-server.jar --spring.profiles.active=product-7102。

![](/images/Image00003.gif) 　运行product-7103：java -jar eureka-server.jar --spring.profiles.active=product-7103。

### 8.9　本章小结 

1．Eureka提供微服务的注册服务，所有的微服务都需要在Eureka中注册并进行服务发布。

2．Eureka提供发现管理，利用DiscoveryClient类可以实现发现信息。

3．Eureka提供默认服务注册，开发者也可以根据实际情况配置心跳时间、清除时间等。

4．Eureka使用SpringSecurity实现安全机制，以保证注册中心的安全。

5．Eureka支持HA机制，以避免单节点导致的服务瘫痪问题。


第9章　SpringCloud服务组件 
============================================

**通过本章学习，可以达到以下目标：**

1．掌握客户端负载均衡组件Ribbon的使用。

2．掌握Restful接口转换Feign组件的使用。

3．理解Hystrix熔断机制的作用与配置。

4．掌握Zuul组件的使用与代理转换处理。

5．掌握Zuul与上传微服务的使用。

SpringCloud微架构开发中存在着众多的微服务，这些微服务之间也会存在互相的调用关联，为了防止某一个微服务不可用时关联微服务出现问题，需要引入Hystrix熔断处理机制。同时，微服务的调用形式在消费端应该以远程接口的形式出现，为此SpringCloud家族提供了Feign转换技术。为了保证微服务的安全访问，还提供了类似网关的Zuul组件支持。

### 9.1　Ribbon负载均衡组件 

所有的微服务都需要注册到Eureka服务中，因此可以通过Eureka对所有微服务进行管理。消费端应该通过Eureka来进行微服务接口调用，这种调用可以利用Ribbon技术来实现。

#### 9.1.1　Ribbon基本使用 

Ribbon是一个与Eureka结合的组件，其主要作用是进行Eureka中的服务调用。要使用Ribbon，需要在项目中配置spring-cloud-starter-ribbon依赖库。同时对于所有注册到Eureka中的微服务也要求有微服务的名称，如图9-1所示，在消费端将通过微服务的名称进行微服务调用。  
![](/images/Image00365.jpg)

图9-1　Eureka中注册的微服务名称

1．【mldncloud-consumer-ribbon项目】修改pom.xml配置文件，引入Ribbon依赖库。  
![](/images/Image00366.jpg)

2．【mldncloud-consumer-ribbon项目】修改RestfulConfig配置类，追加Ribbon注解。  
![](/images/Image00367.jpg)

3．【mldncloud-consumer-ribbon项目】修改application.yml配置文件，追加Eureka访问地址。  
![](/images/Image00368.jpg)

4．【mldncloud-consumer-ribbon项目】在DeptController控制器类中通过微服务名称调用微服务，此时不再需要知道微服务的具体主机信息。  
![](/images/Image00369.jpg)

5．【mldncloud-consumer-ribbon项目】修改程序启动类，追加Eureka客户端注解。  
![](/images/Image00370.jpg)

此时，消费端就可以实现Eureka中注册微服务的调用，并且在消费端通过名称实现微服务调用。以消费端调用部门微服务的部门列表（dept/list）操作为例，如图9-2所示。  
![](/images/Image00371.jpg)

图9-2　消费端调用部门列表微服务

#### 9.1.2　Ribbon负载均衡 

微服务搭建的业务中心可以通过多台业务功能相同的微服务构建微服务集群，所有的微服务为了可以动态维护，都需要将其注册到Eureka之中，这样消费端就可以利用Ribbon与Eureka的服务主机列表实现微服务轮询调用，以实现负载均衡，如图9-3所示。需要注意的是，Ribbon提供的是一种客户端的负载均衡配置。  
![](/images/Image00372.jpg)

图9-3　Ribbon负载均衡  
**提示：关于项目搭建。**

为了使读者观察方便，本节的程序将进行模拟环境下的集群配置，即将部门微服务项目复制两份，这样就可以有3个不同的微服务实现相同的业务功能，然后3个微服务应该拥有各自不同的数据库（数据库脚本在各个项目中已经提供），但是数据库的信息应该相同。本节使用的项目基本信息如表9-1所示。  
**表9-1　部门业务负载均衡**
![](/images/Image00373.jpg)

项目创建后，修改各自的application.yml配置文件，修改运行端口号，并且在hosts配置文件中追加新的主机名称。另外需要提醒读者的是，本程序暂不去考虑数据库之间的数据同步与负载均衡问题。

1．【mldncloud-dept-service-800\*项目】要实现负载均衡，首先要保证注册到Eureka中的所有微服务的名称相同。修改application.yml配置文件，实现服务名称定义。  
![](/images/Image00374.jpg)

2．【mldncloud-dept-service-800\*】启动所有的微服务，并且同时向Eureka中进行注册。通过如图9-4所示的结果可以发现，针对这些相同名称的微服务，会有3台主机提供服务支持。  
![](/images/Image00375.jpg)

图9-4　Eureka中同一微服务注册多台主机

此时的程序就实现了部门业务的集群配置。由于在消费端已经配置了@LoadBalanced注解，因此会采用自动轮询的模式实现不同业务主机的服务调用。读者运行程序后会发现，每一次都会通过不同的微服务主机执行业务。  
**提问：能否不使用Eureka而直接通过Ribbon调用微服务？**

所有的微服务都在Eureka中注册，如果不通过Eureka，能否直接使用Ribbon进行微服务调用？

**回答：可以禁用Eureka，而直接利用Ribbon调用微服务，但是不推荐。**

在Ribbon中有一个服务器信息列表，开发者可以利用它配置所要访问的微服务列表，以实现微服务的调用，如图9-5所示。  
![](/images/Image00376.jpg)

图9-5　Ribbon直接访问微服务

然后需要在消费端的application.yml配置文件中进行如下配置。

**范例：** 直接使用Ribbon访问微服务。  
![](/images/Image00377.jpg)

此时直接在消费端配置了所有的微服务信息列表，而调用的形式也必须通过Ribbon特定的LoadBalancerClient类才可以完成访问。这里面最麻烦的问题在于：使用过程中如果有某台微服务主机出现宕机现象，Ribbon会自动将其剔除，但是在其恢复之后，开发者需要手动将其添加到Ribbon服务器列表之中才可以继续使用。从这一点来讲，并不如Eureka智能。在进行微服务的开发中，强烈建议使用Eureka来负责所有微服务的注册，这样可以实现服务端列表的动态更新。

#### 9.1.3　Ribbon负载均衡策略 

默认情况下，Ribbon中采用服务列表的顺序模式实现负载均衡处理，开发者也可以根据自身的情况实现自定义的负载均衡配置。Ribbon中，有如下3种核心配置策略（接口和类都在com.netflix.loadbalancer包中）。

![](/images/Image00003.gif) 　**.IRule：** Ribbon的负载均衡策略（所有的负载均衡策略均继承自IRule接口，常用子类如表9-2所示），默认采用ZoneAvoidanceRule实现，该策略能够在多区域环境下选出最佳区域的实例进行访问。

![](/images/Image00003.gif) 　**IPing：** Ribbon的实例检查策略，默认采用NoOpPing子类实现。该检查策略是一个特殊的实现，实际上它并不会检查实例是否可用，而是始终返回true，默认认为所有服务实例都是可用的。如果用户有需要，也可以更换为PingUrl子类。

![](/images/Image00003.gif) 　**ILoadBalancer：** 负载均衡器，默认采用ZoneAwareLoadBalancer实现，具备区域感知的能力。  
**表9-2　IRule接口常用子类**
![](/images/Image00378.jpg)

由于Ribbon是工作在消费端的程序，所以本例中进行负载均衡策略配置时，只需要在消费端进行处理。注意，不要将配置类放在SpringBoot程序启动时可以扫描到的子包中。

1．【mldncloud-consumer-ribbon项目】追加一个LoadBalance的配置类，此类要放在Spring启动时无法扫描到的包中。  
![](/images/Image00379.jpg)

2．【mldncloud-consumer-ribbon项目】在程序启动类中使用@RibbonClient注解引入配置。  
![](/images/Image00380.jpg)

这里采用自定义的负载均衡策略与主机检测策略实现了微服务调用。

3．【mldncloud-consumer-ribbon项目】在通过Ribbon调用微服务过程中，还可以利用LoadBalancerClient获取要调用的微服务端信息。修改DeptController控制器程序类，追加资源注入。  
![](/images/Image00381.jpg)  
![](/images/Image00382.jpg)

本程序使用了LoadBalancerClient类进行客户端信息的注入，并且利用此对象根据微服务的名称MICROCLOUD-DEPT-SERVICE来获取客户端要调用的微服务的基础信息。

### 9.2　Feign远程接口映射 

SpringCloud是以Restful为基础实现的开发框架，在整体调用过程中，即使引入了Eureka，也需要消费端使用完整的路径才可以正常访问远程接口，同时还需要开发者手动利用RestTemplate进行调用与返回结果的转换。为了解决这种复杂的调用逻辑，在SpringCloud中提供Feign技术（依赖于Ribbon技术支持），利用此技术可以将远程的Restful服务映射为远程接口，消费端可通过远程接口实现远程方法调用，如图9-6所示。  
![](/images/Image00383.jpg)

图9-6　Feign接口转换

#### 9.2.1　Feign接口转换 

Feign接口转换技术是针对Restful访问地址的封装，即同一组Restful访问地址应该变为一个远程接口中的业务方法，提供给消费端使用。  
**提示：在mldncloud-api项目中进行远程接口描述。**

在SpringCloud项目中为了明确地描述接口定义，专门提供了mldncloud-api项目模块，不仅Restful服务提供者可以使用此模块，消费端也可以使用此模块，所以本次的讲解直接在api模块中进行功能扩充。而在实际开发中，开发者可以根据业务功能再定义其他的项目模块。

1．【mldncloud-api项目】修改pom.xml配置文件，引入Feign依赖库（会自动引入Ribbon依赖）。  
![](/images/Image00384.jpg)

2．【mldncloud-api项目】由于此时服务端需要通过认证访问，因此需要建立一个Feign的配置类，配置认证请求。  
![](/images/Image00385.jpg)

3．【mldncloud-api项目】修改IDeptService接口定义，追加Feign处理相关注解。  
![](/images/Image00386.jpg)

4．【mldncloud-consumer-feign项目】此时消费端不再需要通过RestTemplate来进行Restful服务访问。直接在控制器中注入IDeptService，即可实现微服务调用。  
![](/images/Image00387.jpg)

5．【mldncloud-consumer-feign项目】修改启动类，配置Feign转换接口扫描包。  
![](/images/Image00388.jpg)

在消费端进行远程业务调用时，所有的访问地址都与IDeptService接口中的方法对应，这样消费端调用远程操作中就感觉像在本地调用一样。  
**注意：远程POST请求时需要关闭CSRF。**

在本程序中对于部门增加业务使用了POST请求模式处理，这样就会出现跨域访问问题（consumer.com访问dept-8001.com）。为了实现调用，需要修改SpringSecurity配置类，关闭CSRF（Cross-Site Request Forgery，跨站请求伪造）校验检测。

**范例：** 【mldncloud-security项目】修改SpringSecurity配置类。  
![](/images/Image00389.jpg)

此时，程序就可以实现跨域的POST请求访问，业务接口中的方法就可以正常实现Restful接口映射。

#### 9.2.2　Feign相关配置 

Feign的核心作用是将Restful服务的信息转换为接口，在整体的处理过程中依然需要进行JSON（或者XML、文本传输）数据的传递。为了避免长时间占用网络带宽，提升数据传输效率，往往需要对数据进行压缩。

1．【mldncloud-consumer-feign项目】修改application.yml，进行数据压缩配置。  
![](/images/Image00390.jpg)

2．【mldncloud-consumer-feign项目】在SpringBoot项目启动过程中，对于Feign接口与远程Restful地址的映射也可以通过日志信息进行详细显示，修改application.yml进行日志级别变更。  
![](/images/Image00391.jpg)

3．【mldncloud-api项目】修改FeignClientConfig配置类，追加日志配置。  
![](/images/Image00392.jpg)

配置完成后重新启动消费端项目（mldncloud-consumer-feign），在第一次进行接口调用时，可以通过控制台看到如下的重要提示信息：  
![](/images/Image00393.jpg)

通过上述提示信息可以发现，Feign在进行接口转换时集成了Ribbon负载均衡机制，微服务消费端和提供端之间的信息采用JSON结构进行传递，并且可以自动将相应的返回数据变为目标类型。

### 9.3　Hystrix熔断机制 

在实际项目中，由于业务功能的不断扩充，会出现大量的微服务互相调用的情况。如图9-7所示，微服务1要想完成功能，需要调用微服务2、微服务3、微服务4，一旦这个时候微服务4出现问题（其他微服务没有问题），则微服务1、2、3就有可能出现错误。这样的问题在微服务开发中称为雪崩效应。  
![](/images/Image00394.jpg)

图9-7　微服务雪崩效应

为了防止这种雪崩效应的出现，在SpringCloud中引入了Hystrix熔断机制。在大部分开发状态下，开发者可以直接使用Hystrix的默认配置。如果有需要，开发者也可以使用如下几类常用配置项。

1．微服务执行相关配置项。

![](/images/Image00003.gif) 　hystrix.command.default.execution.isolation.strategy（默认为thread）：隔离策略，可选用thread或semaphore。

![](/images/Image00003.gif) 　hystrix.command.default.execution.isolation.thread.timeoutInMilliseconds（默认为1000ms）：命令执行超时时间。

![](/images/Image00003.gif) 　hystrix.command.default.execution.timeout.enabled（默认为true）：执行是否启用超时配置。

![](/images/Image00003.gif) 　hystrix.command.default.execution.isolation.thread.interruptOnTimeout（默认为true）：发生超时时是否中断。

![](/images/Image00003.gif) 　hystrix.command.default.execution.isolation.semaphore.maxConcurrentRequests（默认为10）：最大并发请求数，该参数在使用ExecutionIsolationStrategy.SEMAPHORE策略时才有效。如果达到最大并发请求数，请求会被拒绝。理论上选择semaphore size和选择thread size一致，但选用semaphore时每次执行的单元要比较小且执行速度较快（ms量级），否则应该选用thread。semaphore一般占整个容器（Tomcat或Jetty）线程池的一小部分。

2．失败回退（fallback）相关配置项。

![](/images/Image00003.gif) 　hystrix.command.default.fallback.isolation.semaphore.maxConcurrentRequests（默认为10）：如果并发数达到该设置值，请求会被拒绝，抛出异常，并且失败回退，不会被调用。

![](/images/Image00003.gif) 　hystrix.command.default.fallback.enabled（默认为true）：当执行失败或者请求被拒绝时，是否会调用fallback方法。

3．熔断处理相关的配置项。

![](/images/Image00003.gif) 　hystrix.command.default.circuitBreaker.enabled（默认为true）：跟踪circuit的健康性，如果出现问题，则请求熔断。

![](/images/Image00003.gif) 　hystrix.command.default.circuitBreaker.sleepWindowInMilliseconds（默认为5000）：触发熔断时间。

![](/images/Image00003.gif) 　hystrix.command.default.circuitBreaker.errorThresholdPercentage（默认为50）：错误比率阀值，如果错误率≥该值，circuit会被打开，并短路所有请求触发失败回退。

![](/images/Image00003.gif) 　hystrix.command.default.circuitBreaker.forceOpen（默认为false）：强制打开熔断器。如果打开这个开关，将拒绝所有用户请求。

![](/images/Image00003.gif) 　hystrix.command.default.circuitBreaker.forceClosed（默认为false）：强制关闭熔断器。

4．线程池（ThreadPool）相关配置项。

![](/images/Image00003.gif) 　hystrix.threadpool.default.coreSize（默认为10）：并发执行的最大线程数。

![](/images/Image00003.gif) 　hystrix.threadpool.default.maxQueueSize（默认为−1）：BlockingQueue的最大队列数。值为−1时，使用同步队列（SynchronousQueue）；值为正数时，使用LinkedBlcokingQueue。

#### 9.3.1　Hystrix基本使用 

Hystrix的主要功能是对出现问题的微服务调用采用熔断处理，可以直接在微服务提供方上进行配置。

1．【mldncloud-dept-service-8001项目】修改pom.xml配置文件，追加Hystrix依赖配置。  
![](/images/Image00395.jpg)

2．【mldncloud-dept-service-8001项目】修改程序启动主类，增加熔断注解配置。  
![](/images/Image00396.jpg)

此时的程序配置了熔断机制，这样即使有更多层级的微服务调用，也不会因为某一个微服务出现问题而导致所有的微服务均不可用。

#### 9.3.2　失败回退 

失败回退（fallback）也被称为服务降级，指的是当某个服务不可用时默认执行的处理操作。Hystrix中的失败回退是在客户端实现的一种处理机制。

1．【mldncloud-api项目】如果要定义失败回退处理，建议通过FallbackFactory接口来进行实现。  
![](/images/Image00397.jpg)

2．【mldncloud-api项目】修改IDeptService接口定义，追加fallbackFactory处理。  
![](/images/Image00398.jpg)

在进行Feign接口转换中，使用fallback设置当微服务不可用时的返回处理执行类。这样调用失败后，会返回DeptServiceFallback子类中所实现的方法内容。  
**提示：也可以单独定义为一个接口定义Fallback处理类。**

在进行Fallback类定义时，用户还可以直接创建IDeptService的失败回退子类（DeptServiceFallback），而后在通过@FeignClient注解中的fallback属性（fallback=DeptServiceFallback.class）进行配置。

这种子类配置有可能造成业务接口对象的注入混淆，所以不建议使用。

3．【mldncloud-consumer-feign项目】修改程序启动主类，追加扫描包配置，需要将配置的Fallback处理类进行配置。  
![](/images/Image00399.jpg)

这样当微服务关闭之后，由于服务提供方不再可用，所以此时会自动调用DeptServiceFallback类中的相应方法进行处理，返回的都是固定的"失败"信息，如图9-8所示。  
![](/images/Image00400.jpg)

图9-8　调用fallback处理

#### 9.3.3　HystrixDashboard 

Hystrix提供了监控功能，这个功能就是Hystrix Dashboard，可以利用它来进行某一个微服务的监控操作。

1．【mldncloud-hystrix-dashboard、mldncloud-dept-service-8001项目】修改pom.xml配置文件，追加依赖库。  
![](/images/Image00401.jpg)

2．【mldncloud-dept-service-8001项目】微服务如果需要被监控，则要引入actuator依赖库。  
![](/images/Image00402.jpg)

3．【mldncloud-dept-service-8001项目】在需要进行监控的控制器方法上追加@HystrixCommand注解。  
![](/images/Image00403.jpg)

本程序在控制器中的add()、get()、list()3个方法上使用了@HystrixCommand注解，这样只有这3个方法的状态可以被监控到。  
**提示：@HystrixCommand也可以配置失败回退处理。**

对于失败回退，也可以直接在控制层进行定义，此时只需要在控制层的相应方法上使用@HystrixCommand注解中的fallbackMethod属性定义。

**范例：** 在控制层上定义失败回退。  
![](/images/Image00404.jpg)

此时，当list()方法执行有问题时，会自动调用listFallback()方法进行失败处理。

4．【mldncloud-dept-service-8001项目】修改微服务启动类，追加Hystrix支持。  
![](/images/Image00405.jpg)

5．【mldncloud-hystrix-dashboard项目】修改application.yml配置文件，修改运行端口。  
![](/images/Image00406.jpg)

6．【mldncloud-hystrix-dashboard项目】定义程序启动主类。  
![](/images/Image00407.jpg)

7．【操作系统】修改hosts配置文件，追加主机信息。  

```
127.0.0.1 dashboard.com
```

程序配置完成后分别启用所需要的Eureka微服务（mldncloud-eureka-7001）、部门微服务（mldncloud-dept-service-8001）、HystrixDashboard微服务（mldncloud-hystrix-dashboard）、消费端微服务（mldncloud-consumer-feign）。服务启动后通过Dashboard访问地址http://dashboard.com:9001/hystrix，并且输入监控地址http://mldnjava:hello@dept-8001.com:8001/hystrix.stream，界面如图9-9所示。当通过消费端访问微服务之后，会针对微服务的状态进行跟踪，如图9-10所示。  
![](/images/Image00408.jpg)

图9-9　HystrixDashboard启动界面  
![](/images/Image00409.jpg)

图9-10　微服务监控界面

#### 9.3.4　Turbine聚合监控 

HystrixDashboard只能够针对某一个微服务进行监控，如果项目中有许多个微服务，且需要对所有微服务统一监控的时候，就可以使用Turbine来实现聚合监控。

1．【mldncloud-hystrix-turbine项目】修改pom.xml配置文件，引入Turbine依赖库。  
![](/images/Image00410.jpg)

2．【mldncloud-hystrix-turbine项目】修改application.yml，进行Turbine聚合配置。  
![](/images/Image00411.jpg)

3．【mldncloud-security项目】如果要对所有的微服务进行监控，则在定义微服务时需要配置认证信息。由于这种认证信息只能够在访问微服务的路径中进行配置，所以需要修改安全配置类，取消对监控路径的安全限制。  
![](/images/Image00412.jpg)

在本配置中，忽略了Web安全访问（WebSecurity）下/hystrix.stream、/turbine.stream两个路径的认证，所以对这两个路径不再进行安全认证处理。

4．【mldncloud-hystrix-turbine项目】定义程序启动类，使用Turbine注解。  
![](/images/Image00413.jpg)

本程序在启动主类上使用@EnableTurbine注解，这样就可以启动Turebine聚合监控了。

5．【操作系统】修改hosts主机配置，增加新的主机名称。  

```
127.0.0.1 turbine.com
```

启动所有相关的微服务，随后通过HystrixDashboard启动监控程序，如图9-11所示，输入Turbine的监控路径（http://turbine.com:9101/turbine.stream）并且利用消费端访问相应的微服务信息，就可以得到如图9-12所示的监控结果。  
![](/images/Image00414.jpg)

图9-11　Dashboard监控界面  
![](/images/Image00415.jpg)

图9-12　利用Turebine对微服务进行聚合监控

### 9.4　Zuul路由网关 

微服务创建是一个庞大的系统工程，在一个整体项目中往往会存在着若干类的微服务。例如，要开发一个企业管理程序，有可能会用到3类微服务集群：内部员工操作微服务集群、外部客户操作微服务集群和网站管理操作微服务集群，如图9-13所示。而此时就可以采用网关的概念来对相关微服务集群进行隔离，这就是Zuul的主要作用。  
![](/images/Image00416.jpg)

图9-13　Zuul路由网关

#### 9.4.1　Zuul整合微服务 

Zuul实现的是路由网关微服务，为了方便Zuul的统一管理，所有的Zuul微服务需要向Eureka注册，然后Zuul才可以利用Eureka获取所有的微服务信息，而后客户端再通过Zuul调用微服务，整体流程如图9-14所示。  
![](/images/Image00417.jpg)

图9-14　Zuul路由网关与微服务调用  
**提示：本程序暂时取消部门微服务的认证处理。**

通过Zuul代理访问微服务时，无法指定微服务认证信息的传递，必须通过Zuul的过滤访问来进行。为了帮助读者更好地理解问题，本例中部门微服务暂时取消掉mldncloud-security配置模块，即暂不对部门微服务进行认证保护。

1．【mldncloud-zuul-gateway-9501项目】修改pom.xml配置文件，追加Zuul相关依赖包。  
![](/images/Image00418.jpg)

2．【mldncloud-zuul-gateway-9501项目】Zuul需要向Eureka中注册，同时也需要通过Eureka获取微服务信息。修改application.yml配置文件如下：  
![](/images/Image00419.jpg)

3．【mldncloud-zuul-gateway-9501项目】修改程序启动主类，追加Zuul注解配置。  
![](/images/Image00420.jpg)

4．【操作系统】修改hosts主机配置文件，追加新的主机名称。  

```
127.0.0.1 gateway-9501.com
```

5．【mldncloud-\*】启动相应微服务。通过Eureka控制中心可以发现，Zuul微服务信息依然会保存到Eureka注册中心，如图9-15所示。  
![](/images/Image00421.jpg)

图9-15　Eureka注册中心

6．【mldncloud-zuul-gateway-9501项目】微服务可以通过Zuul代理访问。由于此时没有进行任何配置，所以可以直接通过Eureka注册的微服务代理http://gateway-9501.com:9501/mldncloud-dept-service/dept/list进行访问，提示信息如下：  
![](/images/Image00422.jpg)

可以发现，当进行Zuul代理访问时，默认情况下采用的就是Eureka的注册名称。

#### 9.4.2　Zuul访问过滤 

Zuul本质上就属于一个网关代理操作。在实际使用中，所有的微服务都要有自己的认证信息，因此，如果用户当前所代理的微服务具有认证信息，就必须在其访问前追加认证的头部操作。这样的功能需要通过Zuul的过滤操作完成。  
**提示：关于Zuul网关代理认证设计。**

在本例讲解过程中将首先恢复部门微服务中的认证管理，同时将通过Zuul进行微服务认证的配置。程序进行认证信息定义与处理的过程中采用的基本流程为：Zuul通过过滤器配置微服务的认证信息，而后Zuul再通过SpringSecurity定义Zuul的认证信息，如图9-16所示。  
![](/images/Image00423.jpg)

图9-16　Zuul代理认证

这样的设计结构，密码管理会非常混乱。如果是小型开发，则可以使用。如果是大型开发，则整体项目一旦出现问题，维护成本是相当高的，所以这种认证机制将在后续通过OAuth代替。

1．【mldncloud-zuul-gateway-9501项目】建立认证请求过滤器，该过滤器必须继承ZuulFilter父类。  
![](/images/Image00424.jpg)

在进行Zuul过滤的时候可以设置其过滤执行的位置（filterType()方法定义），那么此时有如下4种类型。

![](/images/Image00003.gif) 　pre：在请求发出之前执行过滤。如果要进行访问，在请求前设置头信息。

![](/images/Image00003.gif) 　route：在进行路由请求的时候被调用。

![](/images/Image00003.gif) 　post：在路由之后发送请求信息的时候被调用。

![](/images/Image00003.gif) 　error：出现错误之后进行调用。

2．【mldncloud-zuul-gateway-9501项目】定义Zuul路由配置Bean。  
![](/images/Image00425.jpg)

3．【mldncloud-zuul-gateway-9501项目】可以对微服务的访问密码进行过滤配置，此时通过Zuul代理的微服务将不再需要进行认证密码的配置。这样的配置是不安全的，所以下面要对Zuul代理进行安全配置。修改pom.xml配置文件，引入spring-boot-starter-security依赖库。  
![](/images/Image00426.jpg)

4．【mldncloud-zuul-gateway-9501项目】修改application.yml配置文件，追加认证信息。  
![](/images/Image00427.jpg)

微服务访问地址为http://zdmin:mldnjava@gateway-9501.com:9501/mldncloud-dept-service/dept/list。此时通过Zuul代理访问时就可以直接使用以上认证信息，而后Zuul会通过配置的ZuulFilter自动匹配微服务的认证信息。  
**提示：可以通过配置文件实现过滤器的启用或关闭。**

本程序通过配置类实现了ZuulFilter配置，这个时候如果要停用ZuulFilter，也可以修改application.yml，进行指定过滤器的禁用。

**范例：** 【mldncloud-zuul-gateway-9501项目】禁用过滤器。  
![](/images/Image00428.jpg)

此时将禁止AuthenticationRequestZuulFilter的使用。

#### 9.4.3　Zuul路由配置 

在默认情况下，Zuul是直接通过Eureka中注册的微服务名称进行代理访问的（/mldncloud-dept-service/\*）。这样直接通过微服务的名称进行访问是不安全的，这个时候可以通过Zuul为具体的访问微服务定义别名。

1．【mldncloud-zuul-gateway-9501项目】修改application.yml配置文件，追加微服务名称代理映射。  
![](/images/Image00429.jpg)

本程序为mldncloud-dept-service微服务定义了一个映射路径/dept-proxy/\*\*，这样就可以通过映射路径进行代理访问http://zdmin:mldnjava@gateway-9501.com:9501/dept-proxy/dept/list。同时可以在控制台发现如下信息：  
![](/images/Image00430.jpg)

2．【mldncloud-zuul-gateway-9501项目】通过提示信息可以发现，虽然此时配置了代理路径，但依然可以通过原始的微服务名称进行代理访问。为了停用这种通过微服务名称访问的操作，修改application.yml配置文件。  
![](/images/Image00431.jpg)

此程序启动之后，只能够通过配置的代理名称来进行微服务访问。  
**提示：对于路由代理地址访问的其他配置形式。**

对于代理地址的配置，还有如下两种做法。

**范例：** 【mldncloud-zuul-gateway-9501项目】定义微服务路径与服务名称。  
![](/images/Image00432.jpg)

访问地址为http://zdmin:mldnjava@gateway-9501.com:9501/dept-proxy/dept/list。

**范例：** 【mldncloud-zuul-gateway-9501项目】定义微服务代理地址与url地址。  
![](/images/Image00433.jpg)

访问地址为http://zdmin:mldnjava@gateway-9501.com:9501/dept-proxy/list。

在本书中建议使用传统方式进行配置，这样的配置相对会简洁一些。

3．【mldncloud-zuul-gateway-9501项目】设置公共前缀。  
![](/images/Image00434.jpg)

在进行访问时需要追加http://zdmin:mldnjava@gateway-9501.com:9501/mldn-proxy/dept-proxy/dept/list前缀。  
**提示：消费端通过Zuul代理访问。**

Zuul已经成功地配置了代理与部门微服务之间的访问，所有微服务的认证信息都在Zuul代理中进行了配置，此时消费端必须通过Zuul进行访问。

**范例：** 【mldncloud-api】修改IDeptService接口，通过Zuul微服务访问。  
![](/images/Image00435.jpg)

**范例：** 【mldncloud-api】修改FeignClientConfig配置类，设置Zuul访问密码。  
![](/images/Image00436.jpg)

此时就可以通过消费端调用Zuul代理的部门微服务。

#### 9.4.4　Zuul服务降级 

服务降级指的是当某个微服务不可用时，可以使用默认的信息进行数据返回的处理机制。Zuul本身是一个微服务的代理网关，本身也提供有服务降级机制。  
**提示：客户端与Zuul网关服务降级。**

前面讲解了利用Hystrix熔断机制实现的服务降级，该降级机制属于客户端降级。本节所讲解的是针对Zuul网关的实现的降级机制，如图9-17所示。  
![](/images/Image00437.jpg)

图9-17　服务降级

**范例：** 【mldncloud-zuul-gateway-9501项目】建立Zuul网关的失败回退类。  
![](/images/Image00438.jpg)

此时，当部门微服务不可用时，会返回Zuul服务降级信息，返回结果如图9-18所示。  
![](/images/Image00439.jpg)

图9-18　Zuul失败回退

#### 9.4.5　上传微服务 

微服务除了可以进行业务处理之外，也可以针对上传功能进行创建，所有的上传微服务依然需要向Eureka中注册，这样就可以在Zuul中进行微服务代理操作。  
**注意：不建议构建上传微服务。**

在实际的开发过程中，利用微服务端实现上传业务并不是合理做法，从实际开发来讲，上传的功能一般都在Web消费端完成，最好的做法是直接利用Web消费端将上传文件保存到文件服务器中（如FastDFS）。即使现在使用了微服务做上传，那么一般情况下也会将其保存到文件服务器中。所以本节只针对Zuul的功能进行技术性的讨论。

1．【mldncloud-upload-service-8101项目】修改application.yml配置文件，追加上传配置。  
![](/images/Image00440.jpg)

2．【mldncloud-upload-service-8101项目】定义上传Rest微服务。  
![](/images/Image00441.jpg)

3．【操作系统】修改hosts配置文件，增加新的主机信息。  

```
127.0.0.1 upload-8101.com
```

4．【mldncloud-upload-service-8101项目】启动上传微服务，然后可以利用curl命令进行上传测试，测试成功会返回相应的上传信息。  

```
curl -F "photo=@jixianit.png" http://mldnjava:hello@upload-8101.com:8101/upload
```

5．【mldncloud-zuul-gateway-9501项目】如果需要Zuul进行上传微服务代理，还需要修改application.yml，追加微服务的代理配置项。  
![](/images/Image00442.jpg)

开启代理之后，就可以使用curl命令通过Zuul代理进行上传，但是如果Zuul要代理上传微服务则必须在代理路径前追加zuul/\*\*（表示将所有上传操作交由目标微服务控制）才可以访问，测试命令如下：  

```
curl -F "photo=@jixianit.png" http://zdmin:mldnjava@gateway-9501.com:9501/zuul/mldn-proxy/upload-proxy/upload
```

6．【mldncloud-consumer-upload项目】如果消费端要调用上传微服务，则无法使用Feign进行接口转换，而要利用httpclient依赖库进行处理。修改pom.xml配置文件，追加依赖库配置。  
![](/images/Image00443.jpg)

7．【mldncloud-consumer-upload项目】建立src/main/view目录，将其提升为源文件目录，随后将所需要的Thymeleaf页面文件保存到此目录中，并且在里面建立templates子目录。

8．【mldncloud-consumer-upload项目】建立src/main/view/templates/upload.html页面。  
![](/images/Image00444.jpg)

9．【mldncloud-consumer-upload项目】建立一个ConsumerUploadController控制层程序类。  
![](/images/Image00445.jpg)

在此程序类中将伪造一个POST请求，将上传文件发送到上传微服务，上传成功后就可以看见微服务返回的信息。

### 9.5　本章小结 

1．Ribbon是一个工作在消费端的负载均衡组件，SpringBoot消费端可以通过Ribbon调用Eureka中注册的微服务。

2．SpringCloud微服务的负载均衡采用的是服务名称的管理，即同一个服务名称的微服务会自动注册到同一组微服务信息中，Ribbon中可以利用IRule接口子类配置负载均衡策略。

3．Feign是基于Ribbon组件的应用，可以利用Feign实现远程Restful与接口间的映射转换。

4．Hystrix提供的是熔断机制，可以在某一个微服务出现问题后自动熔断，以防止雪崩效应出现。

5．HystrixDashboard提供微服务访问监控，利用Turbine可以实现一组微服务的监控。但对于认证的微服务，则需要进行安全访问排除。

6．Zuul提供有网关路由功能，利用Zuul可以实现一组微服务的划分。同时利用路由配置，可以使微服务的访问更加安全。


第10章　SpringCloudConfig 
================================================

**通过本章学习，可以达到以下目标：**

1．理解SpringCloudConfig与集群微服务的配置管理。

2．掌握SpringCloudConfig集成配置与信息抓取处理。

3．掌握SpringCloudConfig与仓库匹配模式。

4．掌握SpringCloudConfig加密访问处理。

5．掌握SpringCloudConfig高可用配置。

6．掌握SpringCloudBus服务总线配置，并且可以利用RabbitMQ实现自动配置抓取。

SpringCloudConfig是专门为微服务提供的统一配置中心，其利用Git或SVN这样的版本控制工具实现配置文件的分布式存储，而后所有的微服务都可以通过SpringCloudConfig进行微服务配置项的动态抓取，也可以方便地实现不同profile配置间的切换。

### 10.1　SpringCloudConfig简介 

在传统单实例的项目环境中，为了方便配置文件的使用，往往将其直接定义在实例主机之内，如图10-1所示。随着业务的不断拆分与微服务实例的不断增加，这样的配置方式必然会造成配置文件的维护困难。最好的方法是对配置文件进行统一管理，例如将配置文件保存到Git或SVN这样的版本控制工具中，然后利用SpringCloudConfig实现配置文件的抓取与使用，如图10-2所示。  
![](/images/Image00446.jpg)

图10-1　传统微服务每台主机维护配置文件

通过图10-2可以发现，所有的SpringCloudConfig微服务都可以统一注册到Eureka中，这样就可以定义多个SpringCloudConfig微服务，从而实现微服务的集群设计。但是，即使在项目中引入SpringCloudConfig到每一个微服务中，也依然需要提供核心的配置文件（SpringCloudConfig微服务地址等信息）。  
![](/images/Image00447.jpg)

图10-2　SpringCloudConfig管理配置文件

### 10.2　配置SpringCloudConfig服务端 

SpringCloudConfig是以微服务的形式存在的，所以需要开发者自己创建配置服务器。此后，所有需要抓取配置文件的微服务都可以通过此服务器实现配置文件抓取。本例讲解的SpringCloudConfig将基于Git实现配置文件管理，需要把所有的配置文件保存在GitHub服务器中。  
**提示：关于Config微服务。**

本例程序中已经实现了主机与GitHub之间的SSH免登录配置，可以直接进行仓库的克隆与推送。同时，定义配置服务器的过程中使用了之前配置的mldncloud-security模块，微服务的认证信息为mldnjava/hello。

1．【GITHUB】SpringCloudConfig是基于版本控制工具实现的，本例将选择GitHub作为配置文件的保存点，因此需要先在GitHub上创建相应的仓库mldncloud，如图10-3所示。  
![](/images/Image00448.jpg)

图10-3　创建新的仓库

仓库创建完成后，会给出仓库的访问地址git@github.com:mldn/mldncloud.git。

2．【操作系统】通过git命令克隆远程仓库git clone git@github.com:mldn/mldncloud.git，此时会在操作目录中形成mldncloud目录（里面包含有.git仓库文件）。

3．【操作系统】在mldncloud仓库目录中创建application.yml配置文件，具体内容如下。  
![](/images/Image00449.jpg)

在配置文件中定义了两个profile环境（dev、product），这样在访问时就可以根据profile名称加载不同配置项。  
**提示：注意文件编码。**

通过GitHub保存配置文件且文件中存在中文信息时，编码一定要使用UTF-8编码，否则在进行加载时会出现属性加载失败的错误提示信息。

4．【操作系统】将本地仓库创建的application.yml配置文件上传到远程GitHub之中。  
![](/images/Image00450.jpg)

随后可以在GitHub上看见上传的application.yml配置文件，如图10-4所示。  
![](/images/Image00451.jpg)

图10-4　在GitHub上保存配置文件

5．【mldncloud-config-server-7501项目】修改pom.xml配置文件，追加config相关依赖库。  
![](/images/Image00452.jpg)

6．【mldncloud-config-server-7501项目】修改application.yml配置文件，追加Git仓库配置项。  
![](/images/Image00453.jpg)

7．【mldncloud-config-server-7501项目】定义程序启动类。  
![](/images/Image00454.jpg)

8．【操作系统】修改hosts配置文件，追加新的主机配置。  

```
127.0.0.1 config-7501.com
```

9．【mldncloud-config-server-7501项目】启动微服务，随后可以通过如下形式进行远程Git服务器中的配置加载。

![](/images/Image00003.gif) 　**访问形式一，/{application}-{profile}.yml。**

**\|-　获取dev环境：** http://mldnjava:hello@config-7501.com:7501/application-dev.yml。

**\|-　获取product环境：** http://mldnjava:hello@config-7501.com:7501/application-product.yml。

![](/images/Image00003.gif) 　**访问形式二，/{application}/{profile}\[/{label}\]。**

**\|-　获取dev环境：** http://mldnjava:hello@config-7501.com:7501/application/dev/master。

**\|-　获取product环境：** http://mldnjava:hello@config-7501.com:7501/application/product/master。

![](/images/Image00003.gif) 　**访问形式三，/{label}/{application}-{profile}.yml。**

**\|-　获取dev环境：** http://mldnjava:hello@config-7501.com:7501/master/application-dev.yml。

**\|-　获取product环境：** http://mldnjava:hello@config-7501.com:7501/master/application-product.yml。

在实际的项目开发中，master分支肯定是不能够进行修改更新的，也就是说master上的内容一定是可以使用的，所以往往会设置一个dev分支处理项，这样如果使用/{label}/{application}-{profile}.yml格式，将可以更好地进行分支的定位。  
**提示：使用properties实现SpringCloudConfig配置。**

本程序采用yml配置文件实现了配置。如果想采用properties文件处理，就必须准备多个properties，如application-dev.properties、application- beta.properties等。

### 10.3　SpringCloudConfig客户端抓取配置信息 

SpringCloudConfig服务端搭建完成后，可以与GitHub连接，获取相关profile的配置信息。而后这些读取的信息应该与具体的微服务结合（SpringCloudConfig客户端），实现配置信息的统一管理。

1．【GitHub】定义mldncloud-config-client.yml配置文件（与要创建的微服务名称相同），并推送到GitHub之中。  
![](/images/Image00455.jpg)

2．【mldncloud-config-client项目】修改pom.xml配置文件，追加相关的依赖库。  
![](/images/Image00456.jpg)

3．【mldncloud-config-client项目】建立src/main/resources/bootstrap.yml配置文件，定义SpringCloudConfig服务信息。  
![](/images/Image00457.jpg)

在本程序定义的配置文件中直接设置了SpringCloudConfig服务地址，并且定义了要通过配置服务器抓取的配置文件名称为mldncloud-config-client、profile为dev，所在仓库为master。  
**提示：关于application.yml与bootstrap.yml配置文件的说明。**

![](/images/Image00003.gif) 　application.yml：对应的是用户级的资源配置。

![](/images/Image00003.gif) 　bootstrap.yml：对应的是系统级的资源配置，其优先级会更高。

4．【mldncloud-config-client项目】建立ConfigClientRest程序类，读取配置文件信息。  
![](/images/Image00458.jpg)

5．【操作系统】修改hosts配置文件，追加主机配置项。  

```
127.0.0.1 config-client.com
```

当程序启动之后会通过SpringCloudConfig抓取指定的配置文件信息，同时控制台会输出如下提示信息：  
![](/images/Image00459.jpg)

当配置项抓取成功后，就会利用GitHub保存的配置文件对项目进行配置。当开发者需要切换配置时，直接修改profile的名称即可。  
**提示：远程配置优先。**

如果本地项目中提供的application.yml配置与SpringCloudConfig服务端远程抓取的配置重复，则会以远程配置为优先考虑。

### 10.4　单仓库目录匹配 

在实际项目开发过程中，为了方便管理配置文件，往往需要在仓库中创建多个微服务配置的目录，并在目录中提供相应的配置资源文件，而后所有的微服务就可以通过SpringCloudConfig服务端进行目录匹配，以实现配置项加载，如图10-5所示。  
![](/images/Image00460.jpg)

图10-5　单仓库目录匹配

1．【GITHUB】在mldncloud仓库之中建立mldncloud-config-client目录，并将mldncloud-config-client.yml配置文件保存到此目录中，随后将其提交到GitHub中，保存后的路径如图10-6所示。  
![](/images/Image00461.jpg)

图10-6　GitHub目录保存结构

2．【mldncloud-config-server-7501项目】修改src/main/resources/application.yml配置文件。  
![](/images/Image00462.jpg)

3．【mldncloud-config-server-7501项目】启动配置微服务，就可以通过指定GitHub加载指定配置目录下的配置目录，访问路径为http://mldnjava:hello@config-7501.com:7501/master/mldn cloud-config-client-dev.yml。  
**提示：使用\*实现目录匹配。**

在本程序中使用search-paths定义了仓库中的目录名称。如果目录有很多，整体配置就会非常复杂。这个时候如果仓库中的所有目录都是以mldncloud开头的，则可以使用mldncloud-\*的形式匹配所有相关目录。

### 10.5　多仓库自动匹配 

为了方便进行配置文件管理，也可以在GitHub上建立多个应用仓库，利用不同的仓库保存不同的微服务配置文件，然后利用微服务的名称进行应用仓库的自动匹配，如图10-7所示。

1．【GITHUB】在GitHub上创建一个新的仓库mldncloud-config-client，如图10-8所示。

2．【操作系统】将远程仓库克隆到本地（git clone git@github.com:mldn/mldncloud-config-client.git）。  
![](/images/Image00463.jpg)

图10-7　多仓库自动匹配  
![](/images/Image00464.jpg)

图10-8　创建新仓库

3．【操作系统】在mldncloud-config-client目录中创建mldncloud-config-client.yml配置文件，内容与之前相同，并且将配置文件推送到GitHub中。

4．【mldncloud-config-server-7501项目】修改application.yml配置文件，追加仓库匹配。  
![](/images/Image00465.jpg)

访问地址为http://mldnjava:hello@config-7501.com:7501/master/mldncloud-config-client-dev.yml。此时会根据{application}自动匹配要使用的仓库，而在进行访问的时候需要开发者输入仓库名称，而后会自动加载仓库中的application.yml文件。

### 10.6　仓库匹配模式 

仓库匹配模式指的是在进行仓库配置资源获得的时候，可以通过一些限制让用户无法获得某些资源（只能够获得指定资源）。例如，10.5节虽然进行了多仓库的配置，但是在配置的过程中发现用户可以加载所有的profile信息。接下来，需要设置一些规则，让用户只能够加载指定的内容。

**范例：** 【mldncloud-config-server-7501项目】修改application.yml配置文件。  
![](/images/Image00466.jpg)

此时，配置只允许访问mldncloud-config-client仓库中的dev环境。当加载product环境时，将不会得到任何的配置信息。

### 10.7　密钥加密处理 

在实际开发中，一些重要的信息（资源访问密码等信息）是不可能采用明文的方式保存在GitHub中的，必须对其进行加密处理。SpringCloud中提供了密钥加密处理功能，即加密方和解密方可使用统一的密钥进行数据的加密。如果要使用密钥进行解密，则必须在加密的配置项上使用{cipher}标注。  
**提示：需要更换jce_policy策略包。**

如果要进行加密处理，则需要通过Oracle官方网站下载最新的jce_policy支持包，下载地址为http://www.oracle.com/technetwork/java/javase/downloads/jce8- download-2133166.html。而后将下载后的内容保存到JAVA_HOME\\jre\\lib\\security目录中进行内容替换（jre同时替换）。同时还需要考虑SpringCloud（Dalston.SR1版本可以正常使用，后续版本无法正常使用）配置的版本，不同的版本即使更换了策略包，可能也会出现问题（{"description":"No key was installed for encryption service","status":"NO_KEY"}）。

1．【mldncloud-config-server-7501项目】修改application.yml配置文件，追加密钥配置。  
![](/images/Image00467.jpg)

2．【操作系统】启动mldncloud-config-server-7501微服务，并且通过curl进行信息加密。  
![](/images/Image00468.jpg)

3．【操作系统】如果要对加密后的数据进行解密处理，则可以通过/decrypt路径访问。  
![](/images/Image00469.jpg)

此时，就可以通过指定的加密解密路径进行密钥加密。

4．【Git本地仓库】采用加密信息定义要上传的信息，修改mldncloud-config-encrypt.yml文件，随后将其上传到GitHub服务器的mldncloud仓库中。需要进行加密处理的配置前必须要有{cipher}标记。  
![](/images/Image00470.jpg)

5．【mldncloud-config-server-7501项目】启动微服务，加载远程GitHub中的mldncloud-config-encrypt.yml配置文件，地址为http://mldnjava:hello@config-7501.com:7501/master/mldncloud-config-encrypt-dev.yml。此时加密的信息将以明文的形式进行显示，而未加密的信息将正常显示。

### 10.8　KeyStore加密处理 

还有一种加密的方式会更加方便，就是直接利用JKS操作来完成。通过这种方式实现的加密更加安全，且只需要有一个JKS配置文件即可实现加密与解密。

1．【操作系统】生成一个JKS配置文件，执行后可以获得keystore.p12文件。  
![](/images/Image00471.jpg)

2．【mldncloud-config-server-7501项目】将生成的keystore.jks文件配置到src/main/resources目录中，如图10-9所示。  
![](/images/Image00472.jpg)

图10-9　保存keystore.jks文件

3．【mldncloud-config-server-7501项目】修改application.yml，追加keystore相关配置。  
![](/images/Image00473.jpg)

4．【mldncloud项目】修改资源配置，允许\*.jks输出。  
![](/images/Image00474.jpg)

5．【mldncloud-config-server-7501项目】启动微服务，进行加密与解密处理。  
![](/images/Image00475.jpg)

此时会取得一个很长的JKS加密信息，并且将这些保存在mldncloud-config-encrypt.yml配置文件中。与密钥加密相同，JKS也需要在加密信息处使用{cipher}标记进行声明。

### 10.9　SpringCloudConfig高可用 

SpringCloudConfig服务可以实现配置文件的动态加载处理，如果SpringCloudConfig服务出现问题，则会造成整体微服务的瘫痪，所以引入SpringCloudConfig高可用机制可以避免单主机使用缺陷。SpringCloudConfig实现高可用机制主要可以依靠Eureka注册中心实现，而后所有的微服务客户端就可以通过Eureka中提供的SpringCloudConfig服务名称进行服务连接，如图10-10所示。

1．【mldncloud项目】建立3个微服务项目：mldncloud-config-server-7501、mldncloud-config-server-7502和mldncloud-config-server-7503。  
![](/images/Image00476.jpg)

图10-10　SpringCloudConfig高可用

2．【mldncloud-config-server-\*项目】修改application.yml配置文件。3个SpringCloudConfig服务器都与mldncloud仓库连接，同时设置的微服务名称均为mldncloud-config-server，唯一不同的是每个微服务的端口号与Eureka中绑定的主机名称。  
![](/images/Image00477.jpg)

3．【操作系统】修改hosts配置文件，追加主机名称。  
![](/images/Image00478.jpg)

4．【mldncloud-config-server-\*项目】启动Eureka注册服务，同时启动3个SpringCloudConfig服务，而后可以通过Eureka注册中心看到如图10-11所示信息。  
![](/images/Image00479.jpg)

图10-11　Eureka注册信息

5．【Git本地仓库】在本地仓库中建立mldncloud-config-client.yml文件，并将其提交到GitHub之中。  
![](/images/Image00480.jpg)

6．【mldncloud-config-client项目】修改application.yml配置文件，由于此时需要通过Eureka获取SpringCloudConfig服务信息，因此需要在此配置文件中定义Eureka的访问地址。  
![](/images/Image00481.jpg)

此时，SpringCloudConfig客户端程序将通过Eureka中提供的微服务名称MLDNCLOUD-CONFIG-SERVER连接SpringCloudConfig服务器信息，如果某一台配置服务器出现问题，则其他服务主机会自动更换至其他可用主机提供支持。

### 10.10　SpringCloudBus服务总线 

SpringCloudBus是SpringCloud消息总线，主要功能是通过消息组件代理各个连接分布点，这样当配置文件发生变更之后就可以通过SpringCloudBus实现配置信息的动态抓取，以实现配置项的动态更新，具体操作如图10-12所示。  
![](/images/Image00482.jpg)

图10-12　SpringCloudBus

在图10-12中可以看到，当Git仓库中的配置文件发生信息更新之后，将会通过SpringCloudConfig向消息组件中发出一个更新消息。消息消费者（微服务）接收到此消息之后，会通过SpringCloudConfig重新进行配置抓取。

1．【GIT本地仓库】建立mldncloud-config-client.yml配置文件，并且将此配置文件上传到mldncloud仓库中。  
![](/images/Image00483.jpg)

2．【mldncloud-config-server-7501、mldncloud-config-client项目】修改pom.xml配置文件，追加依赖库。  
![](/images/Image00484.jpg)

3．【mldncloud-config-server-7501项目】修改application.yml配置文件，追加RabbitMQ连接配置。  
![](/images/Image00485.jpg)

当微服务启动时，会在后台发现/bus/refresh、/refresh两个路径信息。

4．【mldncloud-security项目】如果要实现SpringCloudBus更新，则需要修改安全策略，追加新的角色。  
![](/images/Image00486.jpg)

5．【mldncloud-config-client项目】所有微服务作为RabbitMQ消息消费端，修改application.yml配置消息组件。  
![](/images/Image00487.jpg)

6．【mldncloud-config-client项目】建立一个InfoConfig配置类，该类实现mldncloud-config-client.yml配置文件信息。  
![](/images/Image00488.jpg)

7．【mldncloud-config-client项目】建立一个新的控制器，读取InfoConfig信息。  
![](/images/Image00489.jpg)

此时程序启动之后，mldncloud-config-client微服务（消息消费者）会通过mldncloud-config-server-7501微服务（消息提供者）抓取配置信息，同时在RabbitMQ中也会建立新的交换空间，如图10-13所示。  
![](/images/Image00490.jpg)

图10-13　交换空间

当用户更改mldncloud仓库中的mldncloud-config-client.yml配置文件后，默认情况下InfoConfigClientRest程序类将无法抓取到最新的配置信息，只有执行以下命令才可以抓取到新的配置。  

```
curl -X POST http://mldnjava:hello@config-7501.com:7501/bus/refresh
```

执行完本程序后会在控制台出现重新抓取配置的提示信息，当再次访问InfoConfigClientRest程序时就可以实现配置的动态加载，同时RabbitMQ中也会出现消息访问记录，如图10-14所示。  
![](/images/Image00491.jpg)

图10-14　RabbitMQ执行监控  
**提示：配置SpringCloudBus跟踪。**

如果用户有需要，也可以获取一些跟踪轨迹信息，映射路径为/trace。要想实现这样的更新处理，必须在mldncloud-config-server-7501项目中追加一个新的配置项。

**范例：** 修改application.yml配置文件，追加spring.cloud.bus.trace.enabled=true配置项。  
![](/images/Image00492.jpg)

这个时候就可以通过trace进行配置的更新追踪（http://mldnjava:hello@config-7501.com :7501/trace）。

虽然此时可以通过手动实现配置刷新，但是这种刷新不够智能。如果现在开发者在GitHub上保存了配置文件，则可以利用mldncloud仓库中的Webhooks调用/bus/refresh路径动态刷新，如图10-15与图10-16所示。如果想正常配置，则需要开发者提供公网服务地址。  
![](/images/Image00493.jpg)

图10-15　配置仓库的Webhooks  
![](/images/Image00494.jpg)

图10-16　配置服务地址

### 10.11　本章小结 

1．SpringCloudConfig是提供配置文件统一管理的微服务，可以利用软件版本控制仓库（Git、SVN）实现配置保存。

2．SpringCloudConfig服务端可以在一个仓库中实现多个配置文件的抓取，也可以通过应用仓库自动选择实现多个仓库配置文件的抓取。

3．SpringCloudConfig客户端要通过bootstrap.yml配置SpringCloudConfig服务端地址，这样在客户端启动时就可以自动实现配置文件加载。

4．在SpringCloudConfig中利用密钥与KeyStore实现重要信息加密。

5．SpringCloudConfig服务端作为一个微服务，可以在Eureka中注册，以实现配置微服务的高可用。

6．利用SpringCloudBus可以实现配置文件的动态抓取，并且可以结合GitHub中的Webhooks实现配置自动更新。


第11章　SpringCloudStream 
================================================

**通过本章学习，可以达到以下目标：**

1．理解SpringCloudStream的主要作用与设计结构。

2．使用RabbitMQ与SpringCloudStream整合实现流数据处理。

SpringCloudStream是构建消息驱动的微服务应用程序的框架。其基于SpringBoot建立独立的生产级Spring应用程序，并且可以方便地与RabbitMQ实现整合应用。

### 11.1　SpringCloudStream简介 

在企业项目处理中，消息组件是进行业务加强的主要技术手段，利用消息组件不仅可以提升系统操作的吞吐量，也可以避免大并发状态下的用户业务处理问题，SpringCloud技术作为微服务的一种实现架构，能很好地支持消息组件的整合应用。SpringCloudStream的整合架构如图11-1所示。  
![](/images/Image00495.jpg)

图11-1　SpringCloudStream架构

开发者通过定义绑定器作为中间层，实现了应用程序与消息中间件细节之间的隔离。通过向应用程序暴露统一的Channel通道，使得应用程序不需要再考虑各种不同消息中间件的实现。当需要升级消息中间件，或者更换其他消息中间件产品时，开发需要做的就是更换对应的Binder绑定器，而不需要修改任何应用逻辑。  
**提问：直接使用消息组件也可以实现，为什么还需要SpringCloudStream？**

如果开发者直接使用RabbitMQ也可以实现消息的生产者与消费者处理，为什么还要单独去提供SpringCloudStream？

**回答：SpringCloudStream可发挥出Restful特点。**

之所以需要提供SpringCloudStream，主要原因在于SpringCloud与Restful之间存在联系。最简单的理解就是：当用户使用自定义类对象进行传输时，SpringCloud会结合Jackson，将对象转换为JSON处理结构，而SpringCloudStream继续发挥此特点，基于消息组件实现了对象与JSON间的转换及传输，这样开发者处理起来会更加方便。

### 11.2　Stream生产者 

在整合消息系统的过程中，一定会有一个消息的生产者，同时为了使用者开发方便，往往也会建立单独的消息发送业务接口。本例将使用RabbitMQ实现消息的发送。

1．【mldncloud-stream-provider-8201项目】修改pom.xml配置文件，引入依赖库。  
![](/images/Image00496.jpg)

2．【mldncloud-stream-provider-8201项目】修改application.yml配置文件，引入相关配置。  
![](/images/Image00497.jpg)

3．【mldncloud-stream-provider-8201项目】建立一个消息发送接口。  
![](/images/Image00498.jpg)

在本业务接口中要发送的是一个DTO对象，这个对象在发送时将自动转为JSON数据格式进行传输。

4．【mldncloud-stream-provider-8201项目】建立消息发送接口实现子类。  
![](/images/Image00499.jpg)

本程序中注入了MessageChannel对象，利用该对象可以加载application.yml中的配置，进行消息的发送操作。  
**提示：关于org.springframework.cloud.stream.messaging.Source接口。**

Source接口中定义了相应的发送管道信息配置，具体代码定义如下。

**范例：** Source接口定义。  
![](/images/Image00500.jpg)

本程序定义的发送通道为output，这与application.yml中配置的bindings.output名称相同。而在随后定义的消费端程序处也会有一个与之对应的Sink接口，里面定义了输入管道配置。

5．【mldncloud-stream-provider-8201项目】编写测试类，实现消息发送配置。  
![](/images/Image00501.jpg)

启动测试程序类后，会在RabbitMQ控制台中发现相关的Exchange定义，如图11-2所示。  
![](/images/Image00502.jpg)

图11-2　RabbitMQ控制台信息

当消息成功发送之后，可以通过RabbitMQ看见相关的数据访问监控，如图11-3所示。  
![](/images/Image00503.jpg)

图11-3　消息监控界面

### 11.3　Stream消费者 

如果要通过RabbitMQ获取消息，则一定要创建消息消费端程序。由于SpringCloudStream实现的是消息与Restful之间的转换处理，所以消费者可以通过接收的JSON数据，实现与类对象间的转换。

1．【mldncloud-stream-consumer-8202项目】本项目使用的依赖库与mldncloud-stream-provider-8201项目一样，区别在于需要针对application.yml进行消费配置。  
![](/images/Image00504.jpg)

本项目的配置与生产者最大的区别在于bindings中配置的是input管道。

2．【mldncloud-stream-consumer-8202项目】定义消息监听程序类。  
![](/images/Image00505.jpg)

配置完成后可以启动消费端程序，而后就可以实现Stream消息的发送。发送和接收过程中都是以JSON为数据交互格式，在消费端接收后可以自动将JSON数据转为DTO对象。在RabbitMQ控制台可以看见如图11-4所示的信息。  
![](/images/Image00506.jpg)

图11-4　RabbitMQ控制台信息

### 11.4　自定义消息通道 

一套完整的SpringCloudStream中会包含消息的生产者与发送者，生产者要利用Source配置消息生产通道，消费者也需要通过Sink配置消息消费通道。如果开发者有需要，也可以自定义新的消息通道。

1．【mldncloud-api项目】由于生产者与消费者需要进行消费通道更改，可以在公共API项目中进行通道定义。首先修改pom.xml配置文件，引入依赖包。  
![](/images/Image00507.jpg)

2．【mldncloud-api项目】定义公共通道。  
![](/images/Image00508.jpg)

3．【mldncloud-stream-provider-8201项目】修改application.yml，使用自定义通道名称。  
![](/images/Image00509.jpg)

4．【mldncloud-stream-provider-8201项目】修改MessageProviderImpl实现子类。  
![](/images/Image00510.jpg)

5．【mldncloud-stream-consumer-8202项目】修改application.yml，使用自定义通道名称。  
![](/images/Image00511.jpg)

6．【mldncloud-stream-consumer-8202项目】修改MessageListener程序类。  
![](/images/Image00512.jpg)

此时，就可以利用自定义通道实现消息的发送与消费处理。

### 11.5　分组与持久化 

在上面的程序里面成功地实现了消息的发送及接收，但是需要注意一个问题，所发送的消息在默认情况下属于一种临时消息，也就是说，如果现在没有消费者进行消费处理，那么该消息是不会被保留的。要想实现持久化的消息处理，重点在于消息的消费端配置，同时也需要考虑到一个分组的情况（有分组就表示该消息可以进行持久化）。

**范例：** 【mldncloud-stream-consumer-8202项目】修改application.yml配置文件，追加分组配置。  
![](/images/Image00513.jpg)

此时在消费端配置了group分支项，随后运行程序，可以通过RabbitMQ控制台看到如图11-5所示的信息。  
![](/images/Image00514.jpg)

图11-5　消息持久化

在SpringCloudStream中如果要设置持久化队列，则名称格式为destination.group。此时关闭消费端的微服务之后，该队列信息依然会被保留在RabbitMQ中，只有当消费端取走数据后，该消息才会被删除。

### 11.6　RoutingKey 

默认情况下，之前的程序都是属于广播消息。也就是说，所有的消费者都可以接收发送消息内容。在RabbitMQ里面支持有直连消息，而直连消息主要是通过RoutingKey来实现，利用直连消息可以实现准确的消息消费端的接收处理。

1．【mldncloud-stream-provider-8201项目】修改application.yml配置文件，追加RoutingKey配置。  
![](/images/Image00515.jpg)

2．【mldncloud-stream-consumer-8202项目】修改application.yml配置文件，追加RoutingKey配置。  
![](/images/Image00516.jpg)

此时，生产者与消费者配置了相同的RoutingKey信息，所以可以正常实现消息处理。如果消费端配置的RoutingKey不同，将无法接收到消息。

### 11.7　本章小结 

1．SpringCloudStream可以实现消息驱动微服务的搭建。

2．SpringCloudStream最大的特征是用户采用对象的形式进行程序处理，而在消息传递中可以将对象自动转换为JSON结构，同时在消费端也可以实现JSON数据与对象之间的转换。

3．SpringCloudStream支持RabbitMQ与Kafka两类消息组件，建议采用RabbitMQ整合。

4．SpringCloudStream默认通道使用的是Source与Sink接口，如果开发者有需要，也可以自定义通道配置。

5．SpringCloudStream结合RabbitMQ时，可以利用消费端的分组配置实现消息持久化存储。


第12章　SpringCloudSleuth 
================================================

**通过本章学习，可以达到以下目标：**

1．理解微服务开发问题与环形调用。

2．理解Sleuth跟踪服务的主要作用与调用监控。

3．理解Sleuth数据采集处理。

微服务的开发与调用是一个周期很长并且非常繁杂的处理过程，为了可以监控各个微服务之间的调用情况，在SpringCloud里面提供Sleuth跟踪技术，可以针对微服务的调用实现信息采集处理。本章将对SpringCloudSleuth的使用进行讲解。

### 12.1　SpringCloudSleuth简介 

微服务是一种子业务的拆分处理机制，在微服务处理架构过程中经常会出现若干个微服务互相调用的情况，如图12-1所示。  
![](/images/Image00517.jpg)

图12-1　微服务调用

图12-1给出的是一种实际开发中可能存在的调用过程，有可能是几个微服务之间互相调用，也有可能为完成某一个大型的业务需要几十个微服务之间互相调用。在这样的场景中，就有可能出现如下几个问题：

![](/images/Image00003.gif) 　当业务处理执行速度变慢时，有可能是某一个或某几个微服务处理性能不高。该如何去追踪这些处理速度较慢的微服务，从而实现性能的整体提升？

![](/images/Image00003.gif) 　如果某一个微服务出现问题，应该如何快速找到出现问题的微服务并且加以修复？

![](/images/Image00003.gif) 　如果现在微服务变为环形调用，那么这些关系该如何描述出来？

所以，一个完善的微服务并不只是简单地进行RPC的功能实现，还应该对整体的微服务执行进行监控。SpringCloud中提供的Sleuth技术就可以实现微服务的调用跟踪，它可以自动形成一个调用连接线，通过这个连接线开发者可以轻松找到所有微服务间的关系。所有微服务的调用信息都自动发送到Sleuth中，如图12-2所示。这样不仅可以采集到微服务调用的关系，也可以获取微服务所耗费的时间，从而进行整体微服务状态的监控以及相应的数据分析。  
![](/images/Image00518.jpg)

图12-2　微服务数据采集

在图12-2中可以看到，所有微服务发送到Sleuth采集微服务上的信息都是以Span描述的，每一个Span包含4个组成部分。

![](/images/Image00003.gif) 　cs-Client Sent：客户端发出一个请求，描述的是一个Span开始。

![](/images/Image00003.gif) 　sr-Server Received：服务端接收请求，sr-cs表示发送的网络延迟。

![](/images/Image00003.gif) 　ss-Server Sent：服务端发送请求（回应处理），ss-sr表示服务端的消耗时间。

![](/images/Image00003.gif) 　cr-Client Received：客户端接收到服务端数据，cr-ss表示回复所需要的时间。

### 12.2　搭建SpringCloudSleuth微服务 

SpringCloudSleuth使用的核心组件是Twitter推出的Zipkin监控组件，所以这里配置的模块需要包含Zipkin相关配置依赖。为了方便读者理解，本例所采用的微服务调用结构如图12-3所示。  
![](/images/Image00519.jpg)

图12-3　微服务调用结构

1．【mldncloud-sleuth-8601项目】修改pom.xml配置文件，追加如下依赖库。  
![](/images/Image00520.jpg)

2．【mldncloud-sleuth-8601项目】修改application.yml配置文件。  
![](/images/Image00521.jpg)

3．【mldncloud-sleuth-8601项目】修改程序启动类。  
![](/images/Image00522.jpg)

4．【操作系统】修改hosts主机配置文件。  

```
127.0.0.1 zipkin.com
```

5．【mldncloud-dept-service-8001项目、mldncloud-consumer项目、mldncloud-zuul-gateway-9501项目】在需要监控的微服务中引入spring-cloud-starter-zipkin依赖库。  
![](/images/Image00523.jpg)

6．【mldncloud-dept-service-8001项目、mldncloud-consumer项目、mldncloud-zuul-gateway-9501项目】修改application.yml配置文件，配置Sleuth连接信息。  
![](/images/Image00524.jpg)

在本配置中，抽样比率指的是访问次数百分比，即如果采用默认的0.1，则表示每10次访问进行一次抽样。这里为了让读者观察清晰，将每一次访问都进行了记录。

7．依次启动所有相关的微服务，并且通过消费端进行部门微服务的调用，随后就可以通过Zipkin地址检测到访问信息。图12-4显示了所监测到的访问信息列表，图12-5显示了其中一次访问监测信息。  
![](/images/Image00525.jpg)

图12-4　微服务访问监测列表  
![](/images/Image00526.jpg)

图12-5　一次微服务访问关联

### 12.3　Sleuth数据采集 

现在已经成功地实现了一个SpringCloudSleuth基础操作。此时需要考虑一个实际的问题：当前所有发送到Sleuth服务端的统计汇总操作都是记录在内存中的，也就是说，如果开发者关闭了Zipkin服务端，那么这些统计信息将消失。这样的设计明显是不合理的，应该将这些统计的数据记录保存下来。同时，有可能一个项目中存在许多微服务，这样就需要发送大量的数据信息进入，为了解决这种高并发的问题，可以结合消息组件（Stream）进行缓存处理。本例为了方便，将统计结果保存在数据库之中（MySQL），程序的操作结构如图12-6所示。  
![](/images/Image00527.jpg)

图12-6　微服务监控数据采集

1．【MySQL数据库】本次以MySQL作为数据采集存储介质，所以执行以下脚本，进行数据库创建。  
![](/images/Image00528.jpg)

2．【mldncloud-sleuth-8601项目】修改pom.xml配置文件，追加相关依赖库。  
![](/images/Image00529.jpg)

需要注意的是，此时需要删除spring-cloud-starter-zipkin依赖库。

3．【mldncloud-sleuth-8601项目】修改application.yml配置文件，追加MySQL连接与RabbitMQ消息组件配置。  
![](/images/Image00530.jpg)

4．【mldncloud-dept-service-8001项目、mldncloud-consumer项目、mldncloud-zuul-gateway-9501项目】修改pom.xml配置文件，追加依赖配置。  
![](/images/Image00531.jpg)

5．【mldncloud-dept-service-8001项目、mldncloud-consumer项目、mldncloud-zuul-gateway-9501项目】修改application.yml配置文件，由于此时是通过消息组件进行采集信息的发送，所以删除zipkin.base-url配置，追加RabbitMQ相关配置，这几个微服务将作为消息生产者存在。  
![](/images/Image00532.jpg)

6．【mldncloud-sleuth-8601项目】修改程序，启动注解。  
![](/images/Image00533.jpg)

此时启动各个微服务，这样所有被监听的微服务都将成为消息的生产者，然后Sleuth将作为消息消费者，将收到的消息保存到数据库中存储。图12-7显示了RabbitMQ消息组件监控到的信息。  
![](/images/Image00534.jpg)

图12-7　Sleuth消息监控

### 12.4　本章小结 

1．SpringCloudSleuth是数据采集微服务，可以与Zipkin结合，实现微服务的调用结构观察。

2．SpringCloudSleuth可以与RabbitMQ与MySQL结合，实现数据采集。也可以与ELK结合，进行数据采集后的分析。


第13章　OAuth认证管理 
========================================

**通过本章学习，可以达到以下目标：**

1．理解传统RPC认证的问题以及OAuth统一认证的特点。

2．掌握SpringCloud与OAuth统一认证的结合使用。

3．掌握ClientDetailsService、UserDetailsService的作用。

4．掌握授权管理控制。

SpringCloud作为当下最优秀的RPC开发框架，除了其本身的特点之外，最大的优势在于其可以与OAuth一起实现统一认证与授权管理架构，这样就为微架构的开发提供了良好的安全机制。本章将为读者讲解如何进行SpringCloud与OAuth的整合开发。

### 13.1　SpringCloud与OAuth 

OAuth是一个统一的认证标准，其使用范围很广，远不止于Web客户登录。在实际的开发过程中，SpringCloud开发技术越来越普及，其中的各类认证与授权处理问题也日益突出。

SpringCloud在整个RPC技术的实现过程中虽然定义了许多技术，但真正核心的技术只有Restful、Feign、Ribbon、Hystrix、Zuul和Eureka。消费端主要采用的是OAuth，可以结合Shiro实现授权管理，并且利用Web端的OAuth实现统一认证中心，如图13-1所示。  
![](/images/Image00535.jpg)

图13-1　完整的微服务架构  
**提示：关于本书之前章节中的安全管理。**

在之前讲解SpringCloud开发内容时，为了帮助读者理解认证问题，采用一个固定用户名和密码进行认证信息的保存，同时为了方便，直接使用一个专门的安全管理配置模块来实现整体的认证信息定义。但没有数据库的支持，这样的认证会显得比较尴尬。例如，如果用户名和密码都不改变，之前的架构没有任何问题；如果要对不同用户进行分别的认证以及授权处理，那么就需要通过数据库来进行认证内容的保存。而且只是简单地采用数据库保存，整体的安全访问依然会存在问题，因为需要配置多个数据源。很明显，这样的设计是不合理的。本章讲解的OAuth认证是现在最合理的安全机制。

通过图13-1可以看到，在整体微服务设计架构处理中，一般会存在两个OAuth认证，一个是针对于前端的认证与授权控制，另一个就是后端RPC的OAuth认证处理。本章所要讨论的就是RPC端的OAuth认证。  
**提示：传统的SpringSecurity单机认证。**

在之前的SpringCloud技术开发项目中，对部门微服务使用了一套认证密码mldnjava/hello，对网关微服务也使用了一套认证密码zdmin/mldnjava，因此要管理多组密码才可以访问。可见，单独使用SpringSecurity进行认证管理是非常复杂的，而OAuth的设计目的正是为了简化这一问题。

如果要结合OAuth实现SpringCloud统一认证服务，那么Zuul除了要实现路由网关功能之外，也需要参与到OAuth认证过程中，具体操作如图13-2所示。  
![](/images/Image00536.jpg)

图13-2　RPC与OAuth

在SpringCloud开发过程中，Zuul作为网关代理，只能实现微服务代理转发。但是在OAuth认证中，Zuul网关需要通过OAuth获取authcode以及token认证信息操作。这个认证信息将作为后续微服务的认证标记，可以表示用户的身份，而用户的身份就是整个的微服务之中OAuth的核心所在。SpringCloud + OAuth整合的基本流程如下。

![](/images/Image00003.gif) 　【Zuul网关】通过Zuul发出用户身份信息（用户名、密码），同时还需要发出client_id信息。当OAuth接收到此信息之后，首先会检测用户名和密码是否合法，如果合法，则进入数据库中进行client_id的合法性检测。如果通过，则返回一个authcode信息。

![](/images/Image00003.gif) 　【ZUUL网关】根据authcode信息再发送client_id、client_secret到Oauth服务端，并且利用服务端进行客户身份的验证，验证通过之后会将用户信息直接保存在redis里面（身份及授权信息）。

![](/images/Image00003.gif) 　【部门微服务】在部门微服务进行具体操作的时候，要根据Zuul传递过来的token进行用户信息获取。如果可以获取用户信息，则表示当前用户身份合法，就可以直接调用微服务的方法获取相关操作数据。如果不合法或者没有指定的token，那么将出现授权错误。

### 13.2　搭建OAuth基础服务 

在Spring中搭建一个OAuth的认证服务是很容易的，只需要引入spring-cloud- starter-oauth2依赖库即可实现。同时，Spring中的OAuth服务是在SpringSecurity基础上搭建的，当引入此依赖包后会自动引入SpringSecurity依赖库。  
**提示：项目启动环境。**

本例讲解的是OAuth的整合处理，在整个处理之中将使用如下的项目模块。

![](/images/Image00003.gif) 　mldncloud-api：定义公共的DTO与远程接口。

![](/images/Image00003.gif) 　mldncloud-eureka-7001：微服务注册中心。

![](/images/Image00003.gif) 　mldncloud-zuul-gateway-9501：Zuul网关路由微服务。

![](/images/Image00003.gif) 　mldncloud-dept-service-8001：部门微服务（SpringDataJPA），连接dept8001数据库。

![](/images/Image00003.gif) 　mldncloud-consumer：SpringBoot项目，实现微服务调用。

在整体项目中并没有使用SpringSecurity进行安全认证处理，开发者应该首先建立一个新的mldncloud-oauth-server-8701项目模块。此外，本项目模块暂时不使用数据库保存认证信息。

1．【mldncloud-oauth-server-8701项目】修改pom.xml配置文件，引入相关依赖库。  
![](/images/Image00537.jpg)

2．【mldncloud-oauth-server-8701项目】定义用户认证配置类。  
![](/images/Image00538.jpg)

3．【mldncloud-oauth-server-8701项目】要进行Authcode的获取，还需要有client_id、client_secret信息。此时可以再建立一个单独的配置类，进行授权服务配置。  
![](/images/Image00539.jpg)

本程序类配置有一个client认证信息cmldn/cjava，这样当客户端通过地址进行访问时，只需要配置好相应的客户端认证信息，就可以获取授权码（authcode）。  
**提示：关于autoApprove(true)。**

在本程序中配置client认证信息时使用了autoApprove(true)语句，该语句的主要作用是不等待用户授权，如果没有配置此语句，则在程序执行时会出现如图13-3所示的确认界面。很明显，在RPC的访问过程中是不应该出现确认界面的。  
![](/images/Image00540.jpg)

图13-3　授权界面

4．【mldncloud-oauth-server-8701项目】修改程序启动类，追加认证服务注解。  
![](/images/Image00541.jpg)

5．【操作系统】修改hosts配置文件，追加新的主机名称。  

```
127.0.0.1  oauth-server.com
```

6．【mldncloud-oauth-server-8701项目】此时一个基于固定认证信息的OAuth服务端搭建完成。当进行微服务启动时，可以在控制台看到如下提示信息。  
![](/images/Image00542.jpg)

7．【浏览器访问】输入如下访问地址，获取authcode信息。  
![](/images/Image00543.jpg)

该访问地址包含client_id信息，由于设置了返回路径redirect_uri=http://www.mldn.cn，所以当成功获取了authcode授权码之后，就可以看见如图13-4所示的信息，此时返回的授权码内容为cN2WeJ（参数名称为code）。  
![](/images/Image00544.jpg)

图13-4　获取authcode信息

8．【操作系统】获取authcode之后需要得到token信息，此时可以通过curl命令来实现。  
![](/images/Image00545.jpg)

其中"access_token":"1d7fb0c7-85f1-4e84-99ec-fcb0f9a16e78"是返回的token信息，该配置在43199秒内有效，此时一个基础的OAuth服务搭建完成。

### 13.3　使用数据库保存客户信息 

在基础OAuth微服务里面，为了保存客户信息，专门配置了一个AuthorizationServerConfigurerAdapter子类，并且定义了一个固定的客户信息cmldn/cjava。要针对客户信息进行统一的管理，最好的做法是将这些客户信息保存到数据库中。要想实现这样的处理，需要使用ClientDetailsService接口来处理。  
**提示：实际开发中需要做加密处理。**

在实际的开发过程中，客户端信息要采用加密形式来进行处理，为了安全还有可能要进行客户端信息的变更。这些都属于OAuth的功能扩展，可以由开发者自行完成。编写本例时考虑到入门读者的学习需要，不采用加密处理形式。

1．【MySQL数据库】编写数据库脚本，进行客户与授权信息保存（ER关系见图13-5）。  
![](/images/Image00546.jpg)  
![](/images/Image00547.jpg)

图13-5　客户信息ER图

2．【mldncloud-oauth-server-8701项目】由于要基于SpringDataJPA实现访问，所以建立Client持久化类。  
![](/images/Image00548.jpg)

3．【mldncloud-oauth-server-8701项目】创建IClientDAO接口。  
![](/images/Image00549.jpg)

在本程序中，IClientDAO扩充了一个新的查询方法，同时该方法将使用原生SQL查询模式，通过关联表查询用户角色。

4．【mldncloud-oauth-server-8701项目】定义IClientService业务接口。  
![](/images/Image00550.jpg)

5．【mldncloud-oauth-server-8701项目】定义ClientServiceImpl子类。  
![](/images/Image00551.jpg)

6．【mldncloud-oauth-server-8701项目】定义ClientDetailsService接口子类，并与IClientService业务接口整合。  
![](/images/Image00552.jpg)

7．【mldncloud-oauth-server-8701项目】修改DefaultAuthorizationServerConfig程序类，与ClientDetailsService子类整合。  
![](/images/Image00553.jpg)

此时，客户端信息已经基于数据库实现了保存。如果在用户访问时客户认证信息正确，则可以获取到authcode与token信息；如果客户信息不正确，则会出现如图13-6所示的错误信息提示。  
![](/images/Image00554.jpg)

图13-6　客户端信息错误

### 13.4　使用数据库保存微服务认证信息 

在OAuth整合中，客户信息主要负责实现使用者的身份认证，而用户认证信息才是微服务进行安全检测的重要屏障。开发者可以使用UserDetailsService接口，实现用户信息配置。

1．【MySQL数据库】编写数据库脚本，数据表关系如图13-7所示。  
![](/images/Image00555.jpg)  
![](/images/Image00556.jpg)

图13-7　用户信息表

2．【mldncloud-oauth-server-8701项目】建立Member实体类。  
![](/images/Image00557.jpg)

3．【mldncloud-oauth-server-8701项目】建立IMemberDAO接口。  
![](/images/Image00558.jpg)

4．【mldncloud-oauth-server-8701项目】建立用户业务接口。  
![](/images/Image00559.jpg)

5．【mldncloud-oauth-server-8701项目】建立IMemberService接口子类。  
![](/images/Image00560.jpg)

6．【mldncloud-oauth-server-8701项目】建立UserDetailsService接口子类，并调用IMemberService业务方法。  
![](/images/Image00561.jpg)

7．【mldncloud-oauth-server-8701项目】修改DefaultWebSecurityConfig配置类，整合DefaultUserDetailsService类。  
![](/images/Image00562.jpg)

此时，OAuth服务就可以利用member表中提供的用户名和密码进行访问了，从而对微服务的认证信息实现了统一管理。

### 13.5　建立访问资源 

在OAuth认证之后获取和保存了token，其核心作用在于资源的获得。本例就来进行资源信息的获得以及配置处理操作。

1．【mldncloud-oauth-server-8701项目】编写一个可以获取资源的Restful服务接口。  
![](/images/Image00563.jpg)

2．【mldncloud-oauth-server-8701项目】如果已经获取了token，并且发出请求后token验证通过了，就可以返回用户资源信息。如果想正常进行信息的获得（token合法），还需要追加一个资源安全配置类。  
![](/images/Image00564.jpg)

3．【mldncloud-oauth-server-8701项目】如果要通过application.yml配置文件进行用户信息的认证，那么已经可以正常使用了。如果要通过安全配置类来进行处理，那么将无法正常使用，因为安全配置项存在重复。下面修改application.yml配置文件，资源访问是在整个OAuth认证流程中的第三步。  
![](/images/Image00565.jpg)

如果没有配置此操作项，则@EnableResourceServer无法正确进行资源控制。配置完成后重新启动微服务，当token正确的时候可以进行正常的访问。如果token有错误，将出现如图13-8所示的错误信息。  
![](/images/Image00566.jpg)

图13-8　token错误返回信息

### 13.6　使用Redis保存token令牌 

在整个OAuth处理中，除了要进行客户端的认证之外，还有一个重要的问题---就是进行token的保存。现在的token实际上是直接保存在内存中的，这样的做法不利于程序的扩展与高性能处理。从开发角度来讲，最好的做法是将其直接保存在Redis数据库中。

1．【mldncloud-oauth-server-8701项目】修改pom.xml配置文件，引入Redis相关依赖。  
![](/images/Image00567.jpg)

2．【mldncloud-oauth-server-8701项目】修改application.yml配置文件，追加Redis的相关配置项。  
![](/images/Image00568.jpg)

3．【mldncloud-oauth-server-8701项目】修改DefaultAuthorizationServerConfig配置类，追加Redis处理。  
![](/images/Image00569.jpg)

通过此时的配置，就可以将token保存在Redis数据库中。执行后，可以在Redis中看到如图13-9所示的内容。  
![](/images/Image00570.jpg)

图13-9　Redis保存token信息

### 13.7　SpringCloud整合OAuth 

OAuth的统一认证中心搭建完成之后，下面需要将其与微服务进行整合处理，操作流程如图13-10所示。在进行微服务整合处理的时候，一定要清楚以下两个核心原则：

![](/images/Image00003.gif) 　所有的具体微服务信息（dept微服务）只需要获得资源即可。

![](/images/Image00003.gif) 　所有的authcode与token操作都应该通过网关（Zuul）来完成。  
![](/images/Image00571.jpg)

图13-10　SpringCloud整合OAuth

1．【mldncloud-dept-service-8001、mldncloud-zuul-gateway-9501项目】修改pom.xml配置文件，引入OAuth相关依赖库。  
![](/images/Image00572.jpg)

2．【mldncloud-dept-service-8001项目】修改application.yml配置文件，进行resource的资源配置。  
![](/images/Image00573.jpg)

3．【mldncloud-dept-service-8001项目】建立一个资源服务访问的安全配置类。  
![](/images/Image00574.jpg)

部门微服务配置完以上操作后，将无法直接进行访问。也就是说，此时必须要通过Zuul来代理访问。

4．【mldncloud-zuul-gateway-9501项目】修改application.yml配置文件，追加OAuth客户端的配置。  
![](/images/Image00575.jpg)

5．【mldncloud-zuul-gateway-9501项目】建立安全配置类。  
![](/images/Image00576.jpg)

配置完成之后，将可以通过Zuul代理进行微服务访问。同时消费端也可以进行微服务的调用。

6．【mldncloud-consumer项目】此时微服务的访问密码只需要使用member表中定义的信息即可，所以可以修改FeignClientConfig配置类中的密码定义。  
![](/images/Image00577.jpg)

这样就可以实现微服务的调用，而整体的用户信息认证都可以通过OAuth统一完成。  
**提示：关于消费端Feign映射失败。**

在使用消费端进行微服务调用时，有可能出现认证信息无法传输的问题。问题的根源可能是feign-httpclient依赖库问题，所以最好的解决方案是进行该依赖库的单独引入配置。

**范例：** 【mldncloud项目】修改pom.xml配置文件，引入feign-httpclient依赖库。  
![](/images/Image00578.jpg)

**范例：** 【mldncloud-api】Feign接口转换在公共API项目中完成，修改pom.xml配置文件，进行依赖配置。  
![](/images/Image00579.jpg)

配置完成就可以解决Feign的信息传输问题。

7．【mldncloud-dept-service-8001项目】当获取了OAuth统一认证后，实际上不仅仅是为了进行所谓的认证使用，还有授权检测处理问题，在OAuth定义的时候提供有角色信息，而这样的角色信息可以拿来进行授权检测。修改部门的微服务提供的Res程序，追加一个授权检测。  
![](/images/Image00580.jpg)

8．【mldncloud-dept-service-8001项目】授权检测如果要生效，还需要做一个方法的拦截配置。修改微服务启动主类。  
![](/images/Image00581.jpg)

只有在程序启动主类配置了@EnableGlobalMethodSecurity注解之后，DeptRest类中方法上的@PreAuthorize注解才会生效，这样的配置就可以实现项目角色的统一管理。

### 13.8　本章小结 

1．OAuth除了可以在Web端实现单点登录整合之外，也可以与SpringCloud结合使用。

2．OAuth在与SpringCloud整合时，可以使用ClientDetailsService与UserDetailsService实现数据库信息的访问。

3．OAuth访问获得的token信息一定要保存在Redis中，并且获取token认证信息的请求可以通过token获取用户完整资源。

4．SpringCloud在与OAuth整合时，一定要修改application.yml配置的security.oauth2.resource.filter-order选项，否则用户token将不会被检测。

5．SpringCloud整合OAuth时，需要在Zuul网关中生成token，而后在具体微服务访问时只需要通过token获取用户资源即可，同时也可以针对用户的角色进行统一管理。


第三部分
微服务辅助篇 
====================================

**•　RabbitMQ消息组件**

**•　Docker虚拟化容器**


第14章　RabbitMQ消息组件 
===========================================

**通过本章学习，可以达到以下目标：**

1．理解JMS与AMQP的区别。

2．掌握RabbitMQ的安装与配置。

3．掌握RabbitMQ与Java程序访问。

4．掌握Spring与RabbitMQ整合。

RabbitMQ是AMQP（Advanced Message Queuing Protocol，高级消息队列协议）的技术实现，也是高性能消息服务组件的代表之作。由于其隶属于Pivotal公司，所以与Spring的整合效果是最完善的。在SpringCloud开发技术中大量使用了RabbitMQ消息组件，本章将为读者详细地讲解RabbitMQ组件的安装与使用方法（基于Linux配置）。

### 14.1　RabbitMQ简介 

RabbitMQ是一种消息队列服务，同样也是在进行系统整合时的一种通信手段，其运行模式遵循"生产者---消费者"模型，即会存在若干个消息生产者以及若干个消息消费者。与JavaEE提出的JMS标准不同之处在于：RabbitMQ是由ERLang开发的基于AMQP应用层协议标准的一种消息组件，所以其处理性能要比JMS组件更高。RabbitMQ官方网站的网址为http://www.rabbitmq.com，其界面如图14-1所示。  
![](/images/Image00582.jpg)

图14-1　RabbitMQ官方站点  
**提示：常见消息组件。**

消息组件主要划分为JMS组件和AMQP组件两类。

![](/images/Image00003.gif) 　JMS（Java Message Service）组件：ActiveMQ性能较差。

![](/images/Image00003.gif) 　AMQP组件（协议）：性能是最高的，而AMQP有两个主要的开源。

\|-　RabbitMQ：使用最为广泛，响应速度快。

\|-　Kafka：是大数据时代作为数据采集的重要组件，处理速度更高。

RabbitMQ是由RabbitMQ Technologies Ltd开发并且提供商业支持的。该公司在2010年4月被SpringSource（VMWare的一个部门）收购，在2013年5月被并入Pivotal。

RabbitMQ最初起源于金融系统，用于在分布式系统中存储转发消息，在易用性、扩展性、高可用性等方面表现不俗。具体特点包括以下几个方面。

![](/images/Image00003.gif) 　**可靠性（Reliability）：** RabbitMQ使用一些机制来保证可靠性，如持久化、传输确认、发布确认等。

![](/images/Image00003.gif) 　**灵活的路由（Flexible Routing）：** 所有的消息要通过Exchange来进行路由处理，对于复杂路由也可以将多个Exchange绑定在一起使用。

![](/images/Image00003.gif) 　**消息集群（Clustering）：** RabbitMQ可以采用镜像集群的模式使消息的安全性与处理能力得到提升。

![](/images/Image00003.gif) 　**多种协议（Multi-protocol）：** RabbitMQ支持多种消息队列协议，如STOMP、MQTT等。

![](/images/Image00003.gif) 　**多语言客户端（Many Clients）：** RabbitMQ几乎支持所有常用语言，如Java、.NET、Ruby等。

![](/images/Image00003.gif) 　**管理界面（Management UI）：** RabbitMQ提供用户管理界面，使开发者可以监控和管理消息。

![](/images/Image00003.gif) 　**跟踪机制（Tracing）：** RabbitMQ提供消息跟踪机制，方便排查消息异常。

RabbitMQ除了可实现基本的消息生产与消费之外，还提供了更加完善的消息处理机制。图14-2显示了RabbitMQ的技术架构。  
![](/images/Image00583.jpg)

图14-2　RabbitMQ技术架构

通过图14-2可以看到，在RabbitMQ消息组件中提供如下的核心概念。

![](/images/Image00003.gif) 　Broker：消息队列服务主机。

![](/images/Image00003.gif) 　Exchange：消息交换机，指定消息按什么规则、路由到哪个队列。

![](/images/Image00003.gif) 　Queue：消息队列载体，每个消息都会被投入到一个或多个队列中。

![](/images/Image00003.gif) 　Binding：绑定，把Exchange和Queue按照路由规则绑定起来。

![](/images/Image00003.gif) 　RoutingKey：路由关键字，Exchange根据这个关键字进行消息投递。

![](/images/Image00003.gif) 　vhost：虚拟主机，一个broker里可设多个vhost，实现用户的权限分离。

![](/images/Image00003.gif) 　producer：消息生产者。

![](/images/Image00003.gif) 　consumer：消息消费者。

![](/images/Image00003.gif) 　Channel：消息通道，在客户端的每个连接里可建立多个Channel，每个Channel代表一个会话任务。

### 14.2　配置Erlang开发环境 

RabbitMQ依靠的开发语言为Erlang，所以如果想使用RabbitMQ服务，首先一定要在系统中进行此开发环境的配置。

1．【rabbitmq-single主机】将Erlang的开发包otp_src_19.2.tar.gz上传到系统之中，而后进行解压缩。  

```
tar xzvf /srv/ftp/otp_src_19.2.tar.gz -C /usr/local/src/
```

2．【rabbitmq-single主机】要想进行Erlang编译，需要安装一个组件包。  

```
apt-get -y install libncurses5-dev
```

3．【rabbitmq-single主机】将组件解压缩到源代码目录之中。  

```
tar xzvf /srv/ftp/otp_src_19.2.tar.gz -C /usr/local/src/
```

4．【rabbitmq-single主机】进入到Erlang源代码所在路径。  

```
cd /usr/local/src/otp_src_19.2
```

5．【rabbitmq-single主机】首先进行安装的配置。  

```
./configure --prefix=/usr/local/erlang
```

6．【rabbitmq-single主机】进行编译与安装。  

```
make && make install
```

7．【rabbitmq-single主机】为了方便使用Erlang环境，建议修改一下环境配置文件，追加ERLANG_HOME配置项。  
![](/images/Image00584.jpg)

8．【rabbitmq-single主机】用Erlang语言编写一个Hello World。  
![](/images/Image00585.jpg)

此时，如果可以正常执行，则表示Erlang安装完成。如果要退出Erlang开发环境，则直接输入halt().命令即可。

### 14.3　安装并配置RabbitMQ 

通过RabbitMQ官方网站下载RabbitMQ的开发包，本例使用的开发包版本为3.6.6，由于是在Linux下进行配置的，所以下载的文件名称为rabbitmq-server-generic-unix-3.6.6.tar.xz。

1．【rabbitmq-single主机】将RabbitMQ开发包rabbitmq-server-generic-unix-3.6.6.tar.xz上传到Linux系统中。

2．【rabbitmq-single主机】将rabbitmq-server-generic-unix-3.6.6.tar.xz开发包进行解压缩。

![](/images/Image00003.gif) 　由于上传文件是采用xz格式进行压缩的，所以首先需要将tar.xz进行解压缩。  

```
xz -d /srv/ftp/rabbitmq-server-generic-unix-3.6.6.tar.xz
```

解压完成后可以得到rabbitmq-server-generic-unix-3.6.6.tar文件。

![](/images/Image00003.gif) 　将文件解压缩到指定的目录。  

```
tar xvf /srv/ftp/rabbitmq-server-generic-unix-3.6.6.tar -C /usr/local/
```

3．【rabbitmq-single主机】为了方便进行命令，做一个更名处理。  

```
mv /usr/local/rabbitmq_server-3.6.6/ /usr/local/rabbitmq；
```

4．【rabbitmq-single主机】当一切都准备完毕之后，可以启动RabbitMQ组件。  

```
/usr/local/rabbitmq/sbin/rabbitmq-server start
```

以上的启动方式为前台启动，用户也可以使用后台启动，代码为/usr/local/rabbitmq/sbin/rabbitmq-server -detached。

5．【rabbitmq-single主机】配置完成之后需要为RabbitMQ配置一个管理员的账户（mldn/java）。  

```
/usr/local/rabbitmq/sbin/rabbitmqctl add_user mldn java
```

6．【rabbitmq-single主机】现在只是创建了一个普通用户，而不是管理员用户，所以需要将其更改为管理员权限。  

```
/usr/local/rabbitmq/sbin/rabbitmqctl set_user_tags mldn administrator
```

7．【rabbitmq-single主机】启动RabbitMQ的管理控制台（Web形式运行，自带监控）。  

```
/usr/local/rabbitmq/sbin/rabbitmq-plugins enable rabbitmq_management
```

当管理控制台启动之后，会自动在15672的端口上运行一个Web监控程序。

8．【rabbitmq-single主机】修改mldn用户可以使用的虚拟主机名称（也可以通过控制台修改）。  

```
/usr/local/rabbitmq/sbin/rabbitmqctl set_permissions  -p  / mldn ConfP  WriteP  ReadP
```

9．【操作系统】RabbitMQ自带管理控制台，但是需要输入完整的主机IP地址。为了方便访问，可以修改hosts主机配置文件，增加新的主机名称。本例RabbitMQ所在主机的IP地址为192.168.68.150。  

```
192.168.68.150  rabbitmq-single
```

配置完成后就可以通过浏览器进行访问，地址为http://rabbitmq-single:15672，随后会出现如图14-3所示的登录界面，此时输入之前配置的mldn/java账号，就可以进入如图14-4所示的管理界面。  
![](/images/Image00586.jpg)

图14-3　RabbitMQ管理控制台登录界面  
![](/images/Image00587.jpg)

图14-4　RabbitMQ管理控制台

### 14.4　使用Java访问RabbitMQ 

要使用RabbitMQ组件，首先要获取RabbitMQ的相关驱动程序。为了方便管理，本例将利用Maven管理工具进行项目依赖包的配置。下面将创建一个mldnrabbitmq的父项目，其中对于pom.xml文件定义如下。

**范例：【** mldnrabbitmq项目**】** 定义统一父pom.xml配置文件。  
![](/images/Image00588.jpg)

本配置文件中重点引入的是amqp-client依赖库，随后将依照此父pom创建其余的Maven子模块。

#### 14.4.1　创建消息生产者 

消息生产者的主要作用是向RabbitMQ消息组件发送消息。在RabbitMQ中所有的消息都需要有主题名称，该主题可以通过RabbitMQ控制台创建，也可以通过程序执行时动态创建，本例将采用动态创建的形式完成。

1．【mldnrabbitmq项目】创建新的项目模块mldnrabbitmq-queue-provider。

2．【mldnrabbitmq-queue-provider项目】修改pom.xml配置文件，追加RabbitMQ相关依赖库。  
![](/images/Image00589.jpg)

3．【mldnrabbitmq-queue-provider项目】建立消息发送程序类。  
![](/images/Image00590.jpg)

本程序动态地创建了一个mldn.msg.queue队列，由于该队列并不存在，所以会自动进行创建，而后通过控制台可以看到相应的队列信息，如图14-5所示。  
![](/images/Image00591.jpg)

图14-5　创建消息队列

#### 14.4.2　创建消息消费者 

消息消费者的主要功能是开启对RabbitMQ组件的监听，每当有消息发送后都可以及时地进行消息的处理（消费）。如果创建的是非持久化消息（临时消息），则消费端不开启，消息不会保存；如果创建的是持久化队列，则消息会一直等待消费后才会被删除。

1．【mldnrabbitmq项目】创建新的项目模块mldnrabbitmq-consumer-a。

2．【mldnrabbitmq-consumer-a项目】修改pom.xml配置文件，配置amqp-client依赖库。

3．【mldnrabbitmq-consumer-a项目】建立消费端程序。  
![](/images/Image00592.jpg)

本程序对指定的消息队列mldn.msg.queue进行了消费监听，当有消息发送后会自动进行消费处理，同时也可以在RabbitMQ中监测到相应信息，如图14-6所示。  
![](/images/Image00593.jpg)

图14-6　消费端控制台信息

如果消息量很大，那么一个消费者是不够使用的，可以考虑建立多个消费者。一旦建立了多个消费者，那么将自动实现消费者集群。如果有多个消费者，那么RabbitMQ会自动指定消息消费的调用轮询。

#### 14.4.3　消息持久化 

在进行消息处理的时候会发现存在一个持久化的配置选项。持久化的本质在于：即使RabbitMQ停机之后，未消费的消息也可以保存下来，而后等待重新启动之后再进行消费处理。

1．【mldnrabbitmq-queue-provider项目】将第二个参数（durable）设置为false，那么就表示该消息队列的信息会被持久化保存；但是如果设置为false，则在重新启动之后，队列将消失，而其对应的消息也会消失。  

```
     channel.queueDeclare(QUEUE_NAME, false, false, true, null) ;
```

2．【mldnrabbitmq-queue-provider】定义持久化消息。  
![](/images/Image00594.jpg)

在进行消息组件设置的时候，一定要使用持久化的消息存储。

#### 14.4.4　虚拟主机 

虚拟主机是RabbitMQ中提出的消息隔离机制，即不同的消息生产者与消费者可以在不同的虚拟主机中进行消息处理，这样就避免了消息冲突问题。在默认状态下RabbitMQ提供一个"/"虚拟主机，如图14-7所示。如果开发者有需要，也可以通过控制台进行虚拟主机的配置。例如，本例将配置一个名称为info的虚拟主机，同时允许mldn用户访问，如图14-8所示。  
![](/images/Image00595.jpg)

图14-7　默认虚拟主机  
![](/images/Image00596.jpg)

图14-8　增加新的虚拟主机

1．【mldnrabbitmq-\*】在生产者与消费者程序中定义一个虚拟主机的常量。  

```
     private static final String VHOST = "info" ;      // 定义一个虚拟主机
```

2．【mldnrabbitmq-\*】如果生产者和消费者要进行通信，则必须处于同一个虚拟主机之中，修改程序的连接配置。  
![](/images/Image00597.jpg)

此时，生产者与消费者将不再使用默认虚拟主机，而使用info虚拟主机进行队列消息通信。

### 14.5　发布订阅模式 

在RabbitMQ进行消息生产与消费处理中除了可以实现基本的队列消息外，最为重要的就是Exchange（交换空间）概念，在RabbitMQ中对于交换空间有topic（主题订阅）、direct（直连）、fanout（广播）3种类型。  
**提示：请使用不同交换空间。**

在RabbitMQ中交换空间是不可以混用的，即fanout的交换空间只能留给广播模式，如果在此交换空间上使用direct模式，则程序无法执行。

#### 14.5.1　广播模式 

广播模式指的是同一个消息可以被若干个消费者共同消费。广播模式这种操作需要利用Exchange来完成，它的处理结构如图14-9所示。  
![](/images/Image00598.jpg)

图14-9　Fanout广播模式

1．【mldnrabbitmq-queue-provider项目】修改消息发送程序类。  
![](/images/Image00599.jpg)

2．【mldnrabbitmq-consumer-\*项目】消费者也配置相同的Exchange信息。  
![](/images/Image00600.jpg)

此时实现了广播模式，这样所有的消费者启动之后，将会收到相同的消息内容。

#### 14.5.2　直连模式 

直连模式的主要特点是需要一个点对点的连接处理，通过直连模式需要定义一个RoutingKey信息，而后具有相同RoutingKey信息的消费端才能够进行此消息的消费，如图14-10所示。  
![](/images/Image00601.jpg)

图14-10　直连模式

1．【mldnrabbitmq-queue-provider项目】修改消息生产者，在消息发送时追加RoutingKey配置项。  
![](/images/Image00602.jpg)

2．【mldnrabbitmq-consumer-\*项目】修改消费端，使用直连模式并设置RoutingKey信息。  
![](/images/Image00603.jpg)

此时，具有相同类型的Exchange，而后当RoutingKey的内容完全一致的时候才可以实现消息的接收处理。在整体的设计中Exchange可以管理多个队列信息，所以消费端并没有创建自定义队列名称，而是通过Channel自动定义了一个通道。

#### 14.5.3　主题模式 

主题模式可以理解为多个直连模式的应用，即消费端可以使用RoutingKey匹配模式来实现指定主题的消息获取，如图14-11所示。  
![](/images/Image00604.jpg)

图14-11　主题消息

在进行主题消息匹配时给出了如下两种匹配标记。

![](/images/Image00003.gif) 　**"主题名称.\*"** ：可以匹配一组任意副标题名称。例如，mldn-key.\*可以匹配mldn-key.message或mldn-key.java的RoutingKey信息。

![](/images/Image00003.gif) 　**"主题名称.#"：** 可以匹配多组任意副标题名称。例如，mldn-key.#可以匹配mldn-key.message.java的RoutingKey信息。

1．【mldnrabbitmq-queue-provider项目】修改消息生产者类，采用主题模式。  
![](/images/Image00605.jpg)

2．【mldnrabbitmq-consumer-\*项目】修改消费者类，匹配任意多级副标题。  
![](/images/Image00606.jpg)

本程序在消费端使用mldn-key.#配置了RoutingKey信息，这样就可以匹配以mldn-key开头的任意消息。

### 14.6　Spring整合RabbitMQ 

在整个消息组件处理中，实际上开发者只关心两个问题：消息如何发送以及消息如何接收。为了实现这一目的，不得不去编写大量的程序代码。为了简化这些代码，可以直接引入Spring进行管理，这样也可以方便地与其他项目进行整合。

1．【mldnrabbitmq项目】为了让读者观察清楚，本例将创建两个新的项目模块：生产者（mldnrabbitmq-spring-provider）和消费者（mldnrabbitmq-spring-consumer）。

2．【mldnrabbitmq项目】修改pom.xml配置文件，除了引入Spring相关依赖包外，还需要引入spring-rabbit依赖库。  
![](/images/Image00607.jpg)

3．【mldnrabbitmq-spring-provider、mldnrabbitmq-spring-consumer项目】在子模块中引入依赖库。  
![](/images/Image00608.jpg)

4．【mldnrabbitmq-spring-provider项目】建立rabbitmq.properties配置文件，保存RabbitMQ核心配置项。  
![](/images/Image00609.jpg)

5．【mldnrabbitmq-spring-provider项目】建立src/main/resources/spring-base.xml配置文件。  
![](/images/Image00610.jpg)

6．【mldnrabbitmq-spring-provider项目】建立src/main/resources/spring-rabbitmq.xml配置文件。  
![](/images/Image00611.jpg)

7．【mldnrabbitmq-spring-provider项目】消息发送应该以一个服务接口的形式出现。建立IMessageService业务接口。  
![](/images/Image00612.jpg)

8．【mldnrabbitmq-spring-provider项目】实现消息发送服务处理。  
![](/images/Image00613.jpg)

9．【mldnrabbitmq-spring-provider项目】编写测试类，实现消息的发送。  
![](/images/Image00614.jpg)

10．【mldnrabbitmq-spring-consumer项目】建立一个消息监听类（消费者）。  
![](/images/Image00615.jpg)

11．【mldnrabbitmq-spring-consumer项目】创建Spring配置文件，此时可以将生产者中的spring-base.xml配置文件与rabbitmq.properties配置文件复制过来，然后还需要创建spring-rabbitmq-consumer.xml，在该配置文件中除了要配置连接之外，最重要的就是需要配置消费端的监听程序。  
![](/images/Image00616.jpg)

12．【mldnrabbitmq-spring-consumer项目】编写测试类启动消费者，由于消费者监听类需要一直存在，所以可以直接设置一个长时间修改。  
![](/images/Image00617.jpg)

此时，项目已经实现了基于Spring管理的RabbitMQ消息生产与消费处理。可以发现，传统框架的整合过程与SpringBoot相比，配置项过于烦琐与重复，这也是SpringBoot可以迅速流行的主要原因。

### 14.7　镜像队列 

在实际的开发过程中，单主机即便配置再高，也会存在性能瓶颈问题。同样，在整个架构设计之中，消息组件是一个重要的缓冲组件，如果消息组件的性能不足，整个项目就会出现问题，所以就需要使用多个消息组件进行整体设计。本例将为读者讲解RabbitMQ集群配置，使用的注解列表如表14-1所示。  
**表14-1　RabbitMQ集群主机**
![](/images/Image00618.jpg)

1．【rabbitmq-cluster-\*】3台主机已经在各自的/etc/hosts文件里面设置好了主机名称。  
![](/images/Image00619.jpg)

2．【rabbitmq-cluster-\*】要想实现3台RabbitMQ同步处理，必须保证.erlang.cookie的文件内容是同步的，默认路径为\~/.erlang.cookie。

3．【rabbitmq-cluster-\*】启动RabbitMQ服务：/usr/local/rabbitmq/sbin/rabbitmq-server start。

4．【rabbitmq-cluster-a】进行集群搭建前，其他主机要以rabbitmq-cluster-a主机为主要的master，因此需要查看一下rabbitmq-cluster-a主机当前的集群状态：/usr/local/rabbitmq/sbin/rabbitmqctlcluster_status。  
![](/images/Image00620.jpg)

5．【rabbitmq-cluster-b、rabbitmq-cluster-c】配置rabbitmq-cluster-b主机与rabbitmq-cluster-c主机加入到rabbitmq-cluster-a主机的集群，此时需要停止RabbitMQ的主服务。  

```
/usr/local/rabbitmq/sbin/rabbitmqctl stop_app
```

6．【rabbitmq-cluster-b、rabbitmq-cluster-c】将主机加入到rabbitmq-cluster-a主机的服务之中。  

```
/usr/local/rabbitmq/sbin/rabbitmqctl join_cluster rabbit@rabbitmq-cluster-a
```

7．【rabbitmq-cluster-b、rabbitmq-cluster-c】恢复节点执行。  

```
/usr/local/rabbitmq/sbin/rabbitmqctl start_app
```

8．【rabbitmq-cluster-a】查看当前的集群状态：/usr/local/rabbitmq/sbin/rabbitmqctl cluster_status。  
![](/images/Image00621.jpg)

9．【rabbitmq-cluster-a】追加一个新的管理员账户mldn/java。

![](/images/Image00003.gif) 　追加新的用户：/usr/local/rabbitmq/sbin/rabbitmqctl add_user mldn java。

![](/images/Image00003.gif) 　追加到管理组中：/usr/local/rabbitmq/sbin/rabbitmqctl set_user_tags mldn administrator。

![](/images/Image00003.gif) 　设置虚拟主机：/usr/local/rabbitmq/sbin/rabbitmqctl set_permissions -p / mldn ConfP WriteP ReadP。

10．【操作系统】修改hosts配置文件，追加主机配置。  
![](/images/Image00622.jpg)

11．【操作系统】输入地址http://rabbitmq-cluster-a:15672进行访问，可以看到如图14-12所示的提示信息。  
![](/images/Image00623.jpg)

图14-12　集群主机环境

12．【客户端】集群控制必须满足一个前提：当前用户操作的rabbitmq-cluster-a主机宕机之后，其他主机（rabbitmq-cluster-b或rabbitmq-cluster-c）可以继续提供这些未消费的消息。这个配置称为镜像队列，需要用户自己手动开启，通过控制台的管理中心进行配置，如图14-13所示。  
![](/images/Image00624.jpg)

图14-13　配置镜像队列  
**提示：此时并非HA机制。**

在RabbitMQ中并不支持HA机制，只是镜像配置。因为Java客户端（不使用Spring）直接连接RabbitMQ时，只能够连接一台RabbitMQ主机，这样当客户端连接rabbitmq-cluster-a主机并且rabbitmq-cluster-a主机宕机后，实际上这个客户端就无法进行消息的发送或消费了。

Spring整合后的RabbitMQ消除了此限制（提升了RabbitMQ的HA能力），可以配置多台主机。即使有一台主机出现了问题，也可以使用其他正常主机实现操作。

13．【mldnrabbitmq-spring-\*项目】修改rabbitmq.properties配置文件，配置多台主机地址。  
![](/images/Image00625.jpg)

14．【mldnrabbitmq-spring-\*项目】修改spring-rabbitmq-\*.xml配置文件。  
![](/images/Image00626.jpg)

此时，基于Spring框架之后，就可以结合RabbitMQ镜像队列实现RabbitMQ的HA机制。

### 14.8　本章小结 

1．RabbitMQ是一款基于AMQP的消息组件，其处理性能要比JMS组件更高。

2．RabbitMQ需要Erlang语言环境支持，并且提供完善的管理控制中心。

3．RabbitMQ可以创建临时消息或持久化消息，消息类型由用户创建的队列类型来决定。

4．RabbitMQ中支持虚拟主机，以实现不同用户与不同队列之间的隔离。

5．RabbitMQ中交换空间有topic（主题订阅）、direct（直连）和fanout（广播）3种类型。

6．RabbitMQ集群需要配置镜像队列后才可以实现消息在多个主机里的保存，但HA机制可以依靠Spring框架补充完成。


第15章　Docker虚拟化容器 
==========================================

**通过本章学习，可以达到以下目标：**

1．掌握Docker的主要作用。

2．掌握Docker的安装与配置方法。

3．掌握DockerHub的使用。

4．掌握Docker镜像文件管理。

5．掌握SpringBoot（SpringCloud）与Docker整合开发。

Docker是虚拟化云平台技术，利用Docker可以极大地简化开发人员与运维人员的工作压力，并且可以在一台主机中运行多个Docker容器。最为重要的是，Spring微架构也是云服务的一种实现，与Docker的联系也是极为紧密的。本章将为读者讲解Docker技术的使用。

### 15.1　Docker简介 

Docker是一种虚拟化容器技术，开发者可以将应用服务封装到Docker容器中，随后再根据需要进行Docker容器的部署，这样就可以快速地实现项目的发布，也降低了运维人员的环境部署困难程度。  
**提示：Docker产生背景。**

在传统项目开发过程中经常会出现这样一些问题。项目开发者根据业务需求开发项目代码，而后将成品代码交由运维人员进行生产环境的服务搭建。一位资深的运维人员可以快速、清晰地明白开发者的运行环境，但如果是一些初级运维人员则可能弄不清楚项目的运行环境，甚至有一些冷门的服务根本不会部署，这样就需要不断与开发人员沟通。一旦沟通出现问题，开发人员将不得不自己去进行项目部署。正是在这样的背景下，Docker虚拟化技术产生了。

Docker的Logo采用了一种集装箱的设计风格，而其应用效果也正如集装箱一样，每一个Docker容器都可以运行各自的服务，而后被封装起来不会互相影响（每一个集装箱都是独立的）。

Docker是一个开源的应用容器引擎，开发者可以打包他们的应用及依赖包到一个可移植的容器中，然后发布到任何流行的Linux机器上，从而实现虚拟化。容器完全使用沙箱机制，相互之间不会有任何接口。Docker官方网站为https://www.docker.com/，如图15-1所示。

Docker采用的是C/S的处理结构，需要有客户端与服务端。一个完整的Docker架构（见图15-2）由以下5个部分组成。  
![](/images/Image00627.jpg)

图15-1　Docker官方网站  
![](/images/Image00628.jpg)

图15-2　Docker架构

![](/images/Image00003.gif) 　Docker Client客户端：Docker的开发环境，可以有多种操作系统支持。

![](/images/Image00003.gif) 　Docker Daemon守护进程：Docker的服务端进程。

![](/images/Image00003.gif) 　Docker Image镜像：一台主机中可以存放多个Docker镜像，每一个Docker镜像都是一组服务。

![](/images/Image00003.gif) 　Docker Container容器：提供一个独立的运行系统，可以实现组件部署。

![](/images/Image00003.gif) 　Docker Registry仓库：Docker提供有DockerHub公共仓库，进行镜像统一管理。  
**提示：Docker容器与镜像的关系。**

Docker容器通过Docker镜像来创建，容器与镜像的关系类似于面向对象编程中对象与类之间的关系。

![](/images/Image00003.gif) 　Docker镜像=类。

![](/images/Image00003.gif) 　Docker容器=对象。

### 15.2　Docker安装 

Docker可以在各个主流操作系统上进行安装与配置，并且生成的镜像对于所有的系统都是适用的。本例为了方便，将直接使用Ubuntu系统进行Docker的安装与使用。

1．【Linux系统】Docker要求Ubuntu系统的内核版本高于3.10，可以通过如下命令查看当前的内核版本。  

```
uname -r
```

此时，系统之中返回的信息为4.4.0-109-generic，则表示具备Docker安装环境要求。

2．【Linux系统】如果要安装Docker，建议先更新一下本地软件库。  

```
apt-get update
```

3．【Linux系统】更新成功后，可以使用如下命令进行Docker的安装。  

```
apt-get -y install docker.io
```

4．【Linux系统】启动Docker服务。  

```
systemctl start docker
```

5．【Linux系统】也可以通过如下命令将Docker设置为自动运行。  

```
systemctl enable docker
```

6．【Linux系统】核对当前Docker版本。  
![](/images/Image00629.jpg)

如果可以看到以上的版本信息，则表示已经成功安装了Docker。

### 15.3　Docker配置与使用 

安装了Docker工具后，开发者就可以直接在本地进行Docker镜像的使用了。Docker镜像可以直接通过DockerHub进行抓取，随后启动Docker镜像即可实现虚拟化处理。

#### 15.3.1　获取并使用Docker镜像 

Docker中所有可以使用的虚拟操作系统都是通过Docker镜像定义的。刚刚完成安装的Docker主机不存在镜像，可以直接通过DockerHub抓取镜像，已经抓取到的镜像则可以直接运行，如图15-3所示。  
![](/images/Image00630.jpg)

图15-3　Docker镜像使用

在Linux系统中有一个/bin/echo命令，该命令的主要功能是对输入的数据进行回显处理。本例将利用Docker容器实现这一命令。

1．【Linux系统】Docker的所有命令都是以docker开头的，要想运行Docker镜像（会产生Docker容器），需要执行如下命令。  

```
docker run ubuntu /bin/echo "Hello World"
```

本程序将直接运行名称为ubuntu的镜像文件，由于此镜像文件并不存在于本地，所以会通过DockerHub进行镜像抓取，而后再执行镜像中的/bin/echo命令。执行后，会出现如图15-4所示的提示信息。  
![](/images/Image00631.jpg)

图15-4　下载Docker镜像

2．【Linux系统】除了可以在外部直接执行Docker镜像之外，也可以进入镜像中进行执行。  

```
docker run -i -t ubuntu
```

以上命令也可以简写为docker run -it ubuntu，其中两个参数的作用如下。

![](/images/Image00003.gif) 　i：在新容器之中指定一个终端。

![](/images/Image00003.gif) 　t：允许直接对容器内的终端进行交互操作处理。

镜像启动之后，会自动分配一个镜像启动容器的ID，此编号是唯一的，并且一个镜像可以启动多个容器。

3．【Linux系统】如果要退出使用的终端，可以按Ctrl + D快捷键。退出之后，还可以通过Docker给出的命令查看当前正在运行的容器。  

```
docker ps
```

如果要想查询详细的Docker进程信息，则可以使用docker ps -a的参数来运行。

#### 15.3.2　Docker镜像 

镜像是整个Docker的核心，而只有镜像存在才可以产生Docker容器。同时，通过镜像也可以方便地管理各个服务信息。

1．【Linux系统】查看本机镜像信息。  

```
docker images
```

由于此时系统中只有一个ubuntu镜像，所以此处只会返回一个镜像信息。

2．【Linux系统】在Docker中提供有镜像信息的查询功能。如果要想查询镜像，可以使用search指令完成。  

```
docker search ubuntu
```

执行之后会通过DockerHub搜索具有关键字ubuntu的镜像信息，并将所有版本都进行列表。如果开发者需要指定版本，也可以直接采用如下命令指定镜像版本标记（使用15版本）。  

```
docker search ubuntu:15
```

3．【Linux系统】通过DockerHub抓取某一个镜像文件。  

```
docker pull bharath23/ubuntu-core-15.04-amd64
```

本命令执行之后将进入镜像下载处理，下载完成后可以查看所有的镜像信息，然后得到如图15-5所示的信息。  
![](/images/Image00632.jpg)

图15-5　Docker镜像列表

4．【Linux系统】对于已经下载的Docker镜像，开发者随时都可以启动容器进行镜像的配置。

![](/images/Image00003.gif) 　进入ubuntu镜像docker run -it ubuntu，此时会分配一个b4ba10b146df容器ID。

![](/images/Image00003.gif) 　在ID为b4ba10b146df的容器中进行更新：apt-get update。

![](/images/Image00003.gif) 　更新完成后，该容器的内容会比原始镜像中多，在不退出的情况下可以进行镜像的保存。

5．【Linux系统】当用户在容器中进行内容修改后，实际上并不会影响到原始镜像文件，所以可以单独启动一个系统连接，将指定容器ID的信息保存到新的镜像之中。  

```
docker commit -m="mldn-docker" -a="Lee" b4ba10b146df mldn/ubuntu:base
```

本程序中两个参数的作用如下。

![](/images/Image00003.gif) 　"-m"：表示进行说明的定义，本处定义为-m="mldn-docker"。

![](/images/Image00003.gif) 　"-a"：表示作者，本处定义为-a="Lee"。

6．【Linux系统】镜像保存完成后可以退出容器，而后查看全部镜像，可以得到如图15-6所示的信息。  
![](/images/Image00633.jpg)

图15-6　Docker镜像列表

#### 15.3.3　Docker容器 

本例将利用mldn/ubuntu:base镜像进行容器配置，主要是在镜像中配置JDK与Tomcat访问环境。

1．【Linux系统】将JDK与Tomcat的开发包上传到/srv/ftp目录中。

2．【Linux系统】启动Docker容器（容器ID为0598185621f1，启动后不要退出容器）。  

```
docker run -it mldn/ubuntu:base
```

3．【Linux系统】将系统中保存的JDK复制到Docker容器之中。  

```
docker cp /srv/ftp/jdk-8u73-linux-x64.tar.gz 0598185621f1:/usr/
```

4．【Linux系统】将系统中保存的Tomcat复制到Docker容器之中。  

```
docker cp /srv/ftp/apache-tomcat-9.0.4.tar.gz 0598185621f1:/usr/
```

5．【Docker-0598185621f1容器】开发包复制完毕之后，可以直接返回已经启动的Docker镜像中查看文件是否存在。如果存在，则表示复制成功。随后对这两个开发包进行解压缩，解压缩到/usr/local目录中。  
![](/images/Image00634.jpg)

6．【Docker-0598185621f1容器】为方便管理，进行JDK与Tomcat目录更名配置。  
![](/images/Image00635.jpg)

7．【Docker-0598185621f1容器】为方便配置，可以下载vim程序：apt-get -y install vim。

8．【Docker-0598185621f1容器】修改Tomcat配置文件，追加JAVA_HOME、JRE_HOME。

![](/images/Image00003.gif) 　打开配置文件vim /usr/local/tomcat/bin/setclasspath.sh。

![](/images/Image00003.gif) 　追加环境配置项。  
![](/images/Image00636.jpg)

9．【Linux系统】环境配置完成之后，为方便后续使用，可以在外部系统中保存当前配置好的容器为新的镜像。  

```
docker commit -m="mldn-tomcat" -a="Lee" 0598185621f1 mldn/ubuntu-tomcat:base
```

保存之后可以通过docker images命令查看镜像，得到如图15-7所示的列表信息。  
![](/images/Image00637.jpg)

图15-7　镜像列表

10．【Linux系统】如果在Docker容器内部启动Tomcat使用的是Docker容器中的8080端口，会发现这个端口无法被外部主机用户所访问，需要进行一个端口映射。先退出Docker-0598185621f1容器（Ctrl + D），而后采用端口映射的模式启动mldn/ubuntu-tomcat:base镜像。  

```
docker run -p 80:8080 -it mldn/ubuntu-tomcat:base
```

这里将外部的80端口与Docker容器内部的8080端口进行映射，随后会分配一个新的容器编号616a352c93aa。

11．【Docker- 616a352c93aa容器】启动Tomcat进程：/usr/local/tomcat/bin/catalina.sh start，此时就可以在外部通过80端口访问Docker中8080端口运行的Tomcat服务了。

如果要退出当前Docker容器，不能再使用Ctrl + D快捷键，此命令表示一旦退出，服务就停止了。运行在Docker中的Tomcat肯定是希望可以在后台继续执行，这时可以使用Ctrl + P +Q组合键让其在后台继续执行。

### 15.4　Docker镜像管理 

配置完成Docker之后，该配置的镜像需要提供给运维人员进行部署处理操作。为了能够部署，需要将Docker镜像保存下来。Docker镜像的保存方式有两种：直接利用文件保存和通过DockerHub保存。

#### 15.4.1　通过文件保存Docker镜像 

在Docker工具安装完成后会提供一个save命令，利用此命令即可实现镜像文件的保存。

1．【Linux系统】将mldn/ubuntu:base镜像保存到/srv/ftp目录之中，名称为mldn.base。  

```
docker save -o /srv/ftp/mldn.base mldn/ubuntu:base
```

2．【Linux系统】为了观察镜像导入处理，将原始的mldn/ubuntu:base镜像删除。  

```
docker rmi mldn/ubuntu:base
```

执行之后再次查询全部镜像，可以发现该镜像已经不在镜像列表之中。  
**提示：关于后台运行容器冲突。**

如果要删除指定的镜像，则必须保证该镜像已经没有运行的容器存在。如果存在，则会出现如下所示的错误提示信息：  
![](/images/Image00638.jpg)

这个时候需要查看一下是否有运行的容器，结束容器运行后再进行删除。使用docker ps -a可查看所有后台运行的容器信息，使用如下的命令可结束容器的运行。

![](/images/Image00003.gif) 　停止正在运行的容器：docker stop容器ID。

![](/images/Image00003.gif) 　结束一个容器运行：docker rm容器ID。

![](/images/Image00003.gif) 　结束全部的后台运行的Docker容器：docker rm -f 'docker ps -a -q'。

3．【Linux系统】将保存的镜像文件导入Docker中。  

```
docker load --input /srv/ftp/mldn.base
```

此时再次查询镜像信息，可以发现mldn/ubuntu:base镜像已经恢复，如图15-8所示。  
![](/images/Image00639.jpg)

图15-8　镜像列表

#### 15.4.2　DockerHub 

虽然镜像管理提供了镜像文件的导出与导入支持，但是这种环境只适合于小范围的应用。为了对所有的镜像进行管理，也为了帮助开发者进行个人镜像的分享，在Docker中提供有DockerHub的站点，开发者可以进行免费注册，并且可以将个人镜像提交到公共仓库中以实现分享。DockerHub官方网站地址为https://hub.docker.com，界面如图15-9所示。  
![](/images/Image00640.jpg)

图15-9　DockerHub官方站点

1．【Linux系统】要进行镜像上传，应该使用dokcer login命令在本地客户端进行登录。  

```
docker login -u用户名 -p密码
```

2．【Linux系统】将mldn/ubuntu:base镜像提交到DockerHub中。  

```
docker push mldn/ubuntu:base
```

镜像发送完成之后，可以通过DockerHub看到如下镜像信息，如图15-10所示。  
![](/images/Image00641.jpg)

图15-10　DockerHub镜像列表  
**提示：需要有用户名做前缀。**

在本程序中创建的镜像名称为mldn/ubuntu:base，该名称的前缀为当前DockerHub的用户名，如果此处配置的用户名不正确，则执行会出现requested access to the resource is denied错误信息。

3．【Linux系统】有需要的时候可以进行Docker下载。  

```
docker pull mldn/ubuntu:base
```

随着开发者项目的深入，一定会有越来越多的镜像出现。通过DockerHub不仅可以方便地进行远程镜像管理，也可以实现镜像的分享。

#### 15.4.3　构建Docker镜像 

构建Docker镜像时，除了可下载后启动容器配置之外，也可以直接通过Docker的脚本文件进行创建，但是不管采用何种创建模式，都必须有一个基础镜像进行操作。创建Dockerfile脚本文件时需要考虑文件的命令格式，常用的命令如表15-1所示。  
**表15-1　创建Dockerfile文件常用命令**
![](/images/Image00642.jpg)

1．【网络主机】镜像里面有一个程序包的获取问题，为了方便下载，可以由开发者自己创建一个Web主机，随后通过给定的地址下载程序包。例如，本例中软件获取地址如下。

![](/images/Image00003.gif) 　JDK的下载地址：http://192.168.1.101:8080/mldn/jdk-8u73-linux-x64.tar.gz。

![](/images/Image00003.gif) 　Tomcat的下载地址：http://192.168.1.101:8080/mldn/apache-tomcat-9.0.4.tar.gz。

2．【Linux系统】这里使用ubuntu镜像作为基础镜像，因此需要将所有的操作步骤更改为脚本文件，且这个脚本文件的名称应该为Dockerfile，完整路径为/srv/ftp/Dockerfile。  

```
vim /srv/ftp/Dockerfile
```

3．【Linux系统】编写Dockerfile文件。  
![](/images/Image00643.jpg)

4．【Linux系统】运行脚本，构建Docker镜像。  

```
docker build -t mldn/ubuntu-test:dev /srv/ftp/
```

5．【Linux系统】配置完成后可以直接进行端口映射启动。  

```
docker run -p 80:8080 -it mldn/ubuntu-test:dev
```

此时，利用脚本就可以轻松实现镜像创建，使用脚本也可以让镜像的传输更加方便。

### 15.5　微服务与Docker 

SpringCloud作为微服务开发技术，其主要特征是进行业务拆分。但如果业务拆分得过细，则会造成服务器的成本攀高。为了解决这样的问题，往往会在项目中整合Docker进行微服务部署，这样一台服务器上就可以同时运行多个SpringCloud微服务，从而降低服务器运行成本，维护起来也更加方便。

#### 15.5.1　使用Docker发布微服务 

要将SpringCloud微服务程序打包到Docker镜像中，需要开启Docker的API进程，同时还需要在项目中追加相应的打包插件，这样就可以直接将打包后的应用以镜像文件的形式发送到指定主机上。配置后，也可以将制作的镜像文件直接上传到DockerHub中。本例将为读者演示如何将Eureka注册中心打包为Docker镜像文件。

1．【Linux系统】编辑Docker服务配置文件docker.service。  

```
vim /lib/systemd/system/docker.service
```

2．【Linux系统】在docker.service文件中进行配置，修改ExecStart配置项，追加API进程。  

```
ExecStart=/usr/bin/dockerd -H fd:// -H tcp://0.0.0.0:2375
```

此时的API进程运行在本地主机的2375端口。

3．【Linux系统】重新加载Docker守护配置项。  

```
systemctl daemon-reload
```

4．【Linux系统】重新启动Docker服务进程。  

```
service docker restart
```

5．【操作系统】Docker重新启动完成后可以通过curl命令进行测试，如果可以看到版本信息返回，则表示配置成功。  
![](/images/Image00644.jpg)

6．【操作系统】如果要将微服务打包到DockerHub中，则还需要在Maven的配置文件（conf/settings.xml）中追加DockerHub的相关信息。  
![](/images/Image00645.jpg)

7．【mldncloud-eureka-profile项目】修改pom.xml配置文件，配置docker-maven-plugin插件。  
![](/images/Image00646.jpg)

本配置之中有如下几个重要的配置项。

![](/images/Image00003.gif) 　**serverId：** Maven配置文件（settings.xml）中定义的服务连接ID。

![](/images/Image00003.gif) 　**dockerHost：** 配置Docker主机，并且要求此主机开启API进程。

![](/images/Image00003.gif) 　**imageTags：** 定义镜像的标签，默认会使用latest。

![](/images/Image00003.gif) 　**imageName：** 镜像名称，该镜像名称需要满足"正则\[a-z0-9-_.\]"，必须有用户名做前缀。

![](/images/Image00003.gif) 　**baseImage：** 要使用的基础镜像名称，如果本地Docker不存在，则会自动抓取镜像信息。

![](/images/Image00003.gif) 　**entryPoint：** Docker镜像执行时的命令为java -jar xxx.jar。

8．【mldncloud-eureka-profile项目】程序打包编译clean package docker:build -DpushImage，如图15-11所示。  
![](/images/Image00647.jpg)

图15-11　自动打包Docker镜像  
**提示：打包后会自动生成Dockerfile文件。**

在程序执行打包之后，会自动根据插件配置在target/docker目录中生成的Dockerfile文件。此文件内容如下：  
![](/images/Image00648.jpg)

通过配置文件描述可以发现，此时设置了基础镜像来源，同时在镜像中加入eureka-server.jar文件，以及Docker镜像启动后自动执行命令。

此时，如果本地没有java镜像，文件会自动下载，而后会利用此镜像对生成的eureka-server.jar进行Docker创建。随后再通过docker images查看所有镜像，可以发现提供有mldncloud-eureka的镜像信息，如图15-12所示。同时在DockerHub中也会出现有镜像信息，如图15-13所示。  
![](/images/Image00649.jpg)

图15-12　Docker本地镜像  
![](/images/Image00650.jpg)

图15-13　DockerHub中的镜像信息

9．【Linux系统】运行指定Docker镜像。  

```
docker run -p 7001:7001 -itd mldncloud-eureka
```

在启动指定镜像文件时，需要设置映射端口，同时为了保护微服务执行，应该使用-d参数将其设置为后台启动。

#### 15.5.2　使用DockerCompose编排顺序 

在一个系统中通常存在大量的微服务，即使具有Docker容器支持，也需要解决启动顺序问题。为了方便项目部署，以及更好地应用Docker镜像，往往会结合DockerCompose工具来对Docker镜像的启动顺序进行编排处理。

下面将为读者讲解如何在一个Docker主机中实现Eureka-HA处理机制。为了方便读者理解，本例将通过Docker镜像与profile共同实现集群部署。运行的Docker容器关系如图15-14所示。  
![](/images/Image00651.jpg)

图15-14　基于Docker实现Eureka-HA机制

1．【mldncloud-eureka-profile项目】为了方便处理，本例将通过profile配置实现多个Eureka微服务。修改application.yml，追加多个profile环境。  
![](/images/Image00652.jpg)

2．【Linux系统】docker-compose软件包需要单独安装，利用apt-get命令获取。  

```
apt-get -y install docker-compose
```

3．【Linux系统】下载完成后查看docker-compose版本。  

```
docker-compose --version
```

此时，返回版本信息为docker-compose version 1.8.0。

4．【Linux系统】在/usr/local目录下编写docker-compose.yml（或docker-compose.yaml）文件。  
![](/images/Image00653.jpg)

5．【Linux系统】在docker-compose.yml所在的目录下执行启动命令。  

```
docker-compose up -d
```

本程序采用-d参数进行镜像服务的后台启动，而后docker-compose会按照定义的顺序进行镜像启动，可以通过environment属性配置不同的profile信息，容器启动后打开任意一个Eureka控制台，就可以看到HA信息，如图15-15所示。  
![](/images/Image00654.jpg)

图15-15　Eureka-HA正常启动

### 15.6　本章小结 

1．Docker是基于云服务的一种应用，可以在一台主机上实现若干服务的部署。

2．一个Docker镜像可以创建出若干个Docker容器，每一个Docker容器独立存在。

3．Docker镜像可以通过文件保存或加载，也可以提交到DockerHub中进行统一管理。

4．微服务可以利用Maven插件实现Docker镜像的创建，同时也可以将Docker镜像直接提交到DockerHub中。

5．当需要限定微服务启动顺序时，可以利用DockerCompose编排服务启动顺序，简化项目部署流程。


