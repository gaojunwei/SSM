#SSM整合项目示例
版本：
spring4.2.4、mybatis3.3.1

##1.1、Spring
Spring 是一个开源框架， Spring 是于 2003  年兴起的一个轻量级的 Java  开发框架，由 Rod Johnson  在其著作 Expert One-On-One J2EE Development and Design 中阐述的部分理念和原型衍生而来。它是为了解决企业应用开发的复杂性而创建的。 Spring 使用基本的 JavaBean 来完成以前只可能由 EJB 完成的事情。然而， Spring 的用途不仅限于服务器端的开发。从简单性、可测试性和松耦合的角度而言，任何 Java 应用都可以从 Spring 中受益。 简单来说， Spring 是一个轻量级的控制反转（ IoC ）和面向切面（ AOP ）的容器框架。

##1.2、SpringMVC
Spring MVC 属于 SpringFrameWork 的后续产品，已经融合在 Spring Web Flow 里面。 Spring MVC  分离了 控制器 、模型 对象 、分派器以及处理程序对象的角色，这种分离让它们更容易进行定制。

##1.3、MyBatis
MyBatis  本是 apache 的一个开源项目 iBatis , 2010 年这个项目由 apache software foundation  迁移到了 google code ，并且改名为 MyBatis  。 MyBatis 是一个基于 Java 的 持久层 框架。 iBATIS 提供的 持久层 框架包括 SQL Maps 和 Data Access Objects （ DAO ） MyBatis  消除了几乎所有的 JDBC 代码和参数的手工设置以及结果集的检索。 MyBatis  使用简单的  XML 或注解用于配置和原始映射，将接口和  Java  的 POJOs （ Plain Old Java Objects ，普通的  Java 对象）映射成数据库中的记录。

##1.4、CXF
Apache CXF 是一个开源的 Services 框架，CXF 帮助您利用 Frontend 编程 API 来构建和开发 Services ，像 JAX-WS 。这些 Services 可以支持多种协议，比如：SOAP、XML/HTTP、RESTful HTTP 或者 CORBA ，并且可以在多种传输协议上运行，比如：HTTP、JMS 或者 JBI，CXF 大大简化了 Services 的创建，同时它继承了 XFire 传统，一样可以天然地和 Spring 进行无缝集成。

##1.5、Quartz
Quartz是OpenSymphony开源组织在Job scheduling领域又一个开源项目，它可以与J2EE与J2SE应用程序相结合也可以单独使用。Quartz可以用来创建简单或为运行十个，百个，甚至是好几万个Jobs这样复杂的程序。Jobs可以做成标准的Java组件或 EJBs。


#目前已经添加的功能
1、文件上传；<br/>
2、数据库的增删改查、及数据库存储过程调用；<br/>
3、事物管理；<br/>
4、添加 CXF 发布 webservice ，使用版本：cxf-core-3.1.8.jar；<br/>
5、添加 Quartz执行定时job ，使用版本：quartz-2.2.3.jar；<br/>






