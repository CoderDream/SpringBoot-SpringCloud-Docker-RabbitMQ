# SpringBoot-SpringCloud-Docker-RabbitMQ
名师讲坛——Java微服务架构实战 SpringBoot+SpringCloud+Docker+RabbitMQ



### 目录
### 目  录
# 第一部分 SpringBoot篇 
## 第1章 SpringBoot编程起步 3
### 1.1 传统开发中痛的领悟 3
### 1.2 SpringBoot简介 4
### 1.3 SpringBoot编程起步 4
### 1.4 本章小结 8
## 第2章 SpringBoot程序开发 9
### 2.1 建立统一父pom管理 9
### 2.2 SpringBoot程序测试 12
### 2.3 SpringBoot注解分析 13
### 2.4 配置访问路径 14
### 2.5 SpringBoot调试 16
### 2.6 使用内置对象 16
### 2.7 使用Jetty容器 18
### 2.8 配置环境属性 18
### 2.9 读取资源文件 20
### 2.10 整合Spring配置 21
### 2.11 SpringBoot项目打包发布 24
### 2.12 profile配置 25
### 2.13 本章小结 27
## 第3章 Thymeleaf模板渲染 28
### 3.1 Thymeleaf简介 28
### 3.2 Thymeleaf编程起步 29
### 3.3 Thyemeleaf静态资源 31
### 3.4 读取资源文件 32
### 3.5 路径处理 33
### 3.6 内置对象操作支持 35
### 3.7 对象输出 36
### 3.8 页面逻辑处理 38
### 3.9 数据迭代处理 39
### 3.10 包含指令 42
### 3.11 Thymeleaf数据处理 43
### 3.12 本章小结 45
## 第4章 SpringBoot与Web应用 46
### 4.1 配置Tomcat运行 46
### 4.2 https安全访问 48
### 4.3 数据验证 50
### 4.4 配置错误页 53
### 4.5 全局异常处理 54
### 4.6 文件上传 56
### 4.6.1 基础上传 56
### 4.6.2 上传文件限制 58
### 4.6.3 上传多个文件 59
### 4.7 拦截器 61
### 4.8 AOP拦截器 62
### 4.9 本章小结 64
## 第5章 SpringBoot服务整合 65
### 5.1 SpringBoot整合数据源 65
### 5.1.1 SpringBoot整合C3P0数据库连接池 65
### 5.1.2 SpringBoot整合Druid数据库连接池 68
### 5.2 SpringBoot整合ORM开发框架 69
### 5.2.1 SpringBoot整合MyBatis开发框架 69
### 5.2.2 SpringBoot整合JPA开发框架 72
### 5.2.3 事务处理 75
### 5.3 SpringBoot整合消息服务组件 77
### 5.3.1 SpringBoot整合ActiveMQ消息组件 77
### 5.3.2 SpringBoot整合RabbitMQ消息组件 79
### 5.3.3 SpringBoot整合Kafka消息组件 82
### 5.4 SpringBoot整合Redis数据库 84
### 5.4.1 SpringBoot整合RedisTemplate操作Redis 85
### 5.4.2 Redis对象序列化操作 86
### 5.4.3 配置多个RedisTemplate 88
### 5.5 SpringBoot整合安全框架 92
### 5.5.1 SpringBoot整合Shiro开发框架 93
### 5.5.2 SpringBoot基于Shiro整合OAuth统一认证 98
### 5.6 SpringBoot整合邮件服务器 103
### 5.7 定时调度 105
### 5.8 Actuator监控 107
### 5.9 本章小结 110
# 第二部分 SpringCloud篇
## 第6章 SpringCloud简介 113
### 6.1 RPC分布式开发技术 113
### 6.2 RPC实现技术 114
### 6.3 SpringCloud技术架构 117
### 6.4 本章小结 120
## 第7章 SpringCloud与Restful 121
### 7.1 搭建SpringCloud项目开发环境 121
### 7.2 Restful基础实现 122
### 7.2.1 建立公共API模块：mldncloud-api 124
### 7.2.2 建立部门微服务：mldncloud-dept- service-8001 125
### 7.2.3 建立Web消费端：mldncloud- consumer-resttemplate 129
### 7.3 Restful接口描述 132
### 7.4 SpringSecurity安全访问 134
### 7.4.1 微服务安全验证 135
### 7.4.2 消费端安全访问 136
### 7.4.3 StatelessSession 137
### 7.4.4 安全配置模块 138
### 7.5 本章小结 140
## 第8章 Eureka注册服务 141
### 8.1 Eureka简介 141
### 8.2 定义Eureka服务端 142
### 8.3 向Eureka中注册微服务 144
### 8.4 Eureka服务信息 145
### 8.5 Eureka发现管理 147
### 8.6 Eureka安全配置 149
### 8.7 Eureka-HA机制 150
### 8.8 Eureka服务发布 153
### 8.9 本章小结 155
## 第9章 SpringCloud服务组件 156
### 9.1 Ribbon负载均衡组件 156
### 9.1.1 Ribbon基本使用 156
### 9.1.2 Ribbon负载均衡 158
### 9.1.3 Ribbon负载均衡策略 161
### 9.2 Feign远程接口映射 163
### 9.2.1 Feign接口转换 163
### 9.2.2 Feign相关配置 166
### 9.3 Hystrix熔断机制 167
### 9.3.1 Hystrix基本使用 168
### 9.3.2 失败回退 169
### 9.3.3 HystrixDashboard 172
### 9.3.4 Turbine聚合监控 174
### 9.4 Zuul路由网关 176
### 9.4.1 Zuul整合微服务 177
### 9.4.2 Zuul访问过滤 179
### 9.4.3 Zuul路由配置 181
### 9.4.4 Zuul服务降级 183
### 9.4.5 上传微服务 185
### 9.5 本章小结 190
## 第10章 SpringCloudConfig 191
### 10.1 SpringCloudConfig简介 191
### 10.2 配置SpringCloudConfig服务端 192
### 10.3 SpringCloudConfig客户端抓取配置信息 195
### 10.4 单仓库目录匹配 197
### 10.5 多仓库自动匹配 199
### 10.6 仓库匹配模式 200
### 10.7 密钥加密处理 200
### 10.8 KeyStore加密处理 201
### 10.9 SpringCloudConfig高可用 203
### 10.10 SpringCloudBus服务总线 205
### 10.11 本章小结 210
## 第11章 SpringCloudStream 211
### 11.1 SpringCloudStream简介 211
### 11.2 Stream生产者 212
### 11.3 Stream消费者 215
### 11.4 自定义消息通道 216
### 11.5 分组与持久化 218
### 11.6 RoutingKey 219
### 11.7 本章小结 220
## 第12章 SpringCloudSleuth 221
### 12.1 SpringCloudSleuth简介 221
### 12.2 搭建SpringCloudSleuth微服务 222
### 12.3 Sleuth数据采集 224
### 12.4 本章小结 229
## 第13章 OAuth认证管理 230
### 13.1 SpringCloud与OAuth 230
### 13.2 搭建OAuth基础服务 232
### 13.3 使用数据库保存客户信息 235
### 13.4 使用数据库保存微服务认证信息 240
### 13.5 建立访问资源 245
### 13.6 使用Redis保存token令牌 246
### 13.7 SpringCloud整合OAuth 248
### 13.8 本章小结 252
# 第三部分 微服务辅助篇 
## 第14章 RabbitMQ消息组件 255
### 14.1 RabbitMQ简介 255
### 14.2 配置Erlang开发环境 257
### 14.3 安装并配置RabbitMQ 258
### 14.4 使用Java访问RabbitMQ 259
### 14.4.1 创建消息生产者 261
### 14.4.2 创建消息消费者 262
### 14.4.3 消息持久化 264
### 14.4.4 虚拟主机 264
### 14.5 发布订阅模式 265
### 14.5.1 广播模式 265
### 14.5.2 直连模式 267
### 14.5.3 主题模式 269
### 14.6 Spring整合RabbitMQ 270
### 14.7 镜像队列 273
### 14.8 本章小结 276
## 第15章 Docker虚拟化容器 277
### 15.1 Docker简介 277
### 15.2 Docker安装 279
### 15.3 Docker配置与使用 280
### 15.3.1 获取并使用Docker镜像 280
### 15.3.2 Docker镜像 281
### 15.3.3 Docker容器 282
### 15.4 Docker镜像管理 284
### 15.4.1 通过文件保存Docker镜像 284
### 15.4.2 DockerHub 285
### 15.4.3 构建Docker镜像 286 
### 15.5 微服务与Docker 287
### 15.5.1 使用Docker发布微服务 287
### 15.5.2 使用DockerCompose编排顺序 291
### 15.6 本章小结 293

