# 第2章 SpringBoot 程序开发

## 2.1 建立统一的pom管理



### 1. 选中文件夹，右键选使用IDEA打开

 ![image-20221005153953931](assets\image-20221005153953931.png)

### 2. 设置项目的Maven参数

* 父pom.xml

  ```xml
  <project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
           xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
      <modelVersion>4.0.0</modelVersion>
  
      <groupId>cn.mldn</groupId>
      <artifactId>mldnboot</artifactId>
      <version>0.0.1</version>
      <packaging>pom</packaging>                    <!-- 定义为pom类型 -->
  
      <name>mldnboot</name>
      <url>https://maven.apache.org</url>
  
      <properties>
          <jdk.version>1.8</jdk.version>
          <spring-boot-dependencies.version>1.5.9.RELEASE</spring-boot-dependencies.version>
          <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
          <project.reporting.outputEncoding>UTF-8</project.reporting.outputEncoding>
          <maven.compiler.encoding>UTF-8</maven.compiler.encoding>
      </properties>
  
      <dependencyManagement>
          <dependencies>
              <dependency>            <!-- 定义SpringBoot依赖管理 -->
                  <groupId>org.springframework.boot</groupId>
                  <artifactId>spring-boot-dependencies</artifactId>
                  <version>${spring-boot-dependencies.version}</version>
                  <type>pom</type>
                  <scope>import</scope>
              </dependency>
          </dependencies>
      </dependencyManagement>
      <modules>
          <module>mldnboot-base</module>
      </modules>
      <build>
          <finalName>mldnboot</finalName>
          <plugins>
              <plugin>                                    <!-- 配置编译插件 -->
                  <groupId>org.apache.maven.plugins</groupId>
                  <artifactId>maven-compiler-plugin</artifactId>
                  <version>3.10.1</version>
                  <configuration>
                      <source>${jdk.version}</source>        <!-- 源代码使用的开发版本 -->
                      <target>${jdk.version}</target>        <!-- 需要生成的目标class文件的编译版本 -->
                      <encoding>${maven.compiler.encoding}</encoding>
                  </configuration>
              </plugin>
          </plugins>
      </build>
  </project>
  ```

   ![image-20221005154712523](assets\image-20221005154712523.png)

* 子pom.xml

  ```xml
  <?xml version="1.0"?>
  <project
          xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd"
          xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance">
      <modelVersion>4.0.0</modelVersion>
      <parent>
          <groupId>cn.mldn</groupId>
          <artifactId>mldnboot</artifactId>
          <version>0.0.1</version>
      </parent>
      <artifactId>mldnboot-base</artifactId>
      <name>mldnboot-base</name>
      <url>https://maven.apache.org</url>
      <properties>
          <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
      </properties>
      <dependencies>
          <dependency>
              <groupId>org.springframework.boot</groupId>
              <artifactId>spring-boot-starter-web</artifactId>
          </dependency>
      </dependencies>
  </project>
  ```

   ![image-20221005154753305](assets\image-20221005154753305.png)

### 3. 分别执行Maven命令：clean和install

 ![image-20221005154224083](assets\image-20221005154224083.png)

### 4. 父项目执行install后，子模块的也编译了

![image-20221005154835175](assets\image-20221005154835175.png)

### 5. 运行Controller

默认端口为  8080

![image-20221005155046353](assets\image-20221005155046353.png)

### 6. 访问应用

```
http://localhost:8080/
```

 ![image-20221005130134671](assets\image-20221005130134671.png)