# 基本知识与关系模型
## 1.数据库与管理信息
我们主要学习的是关系数据库
  
数据库：数据库是电子化信息的集合，即相互关联的数据的集合，若干张表的集合
### 1.数据库系统  
数据库系统（是工作环境）包括：  
* 数据库(DB):Database
* 数据库管理系统(DBMS):DataBase Management System 如：MySQL, Oracle, DB 2, SQL Server等
* 数据库应用(DBAP)： DataBase Application 如：Navicat
* 数据库管理员(DBA)： DataBase Administrator  
* 计算机基本系统：计算机硬件及网络

### 2.数据库管理系统
定义： 定义数据库中Table的名称，标题（内含的属性名称及对该属性的值的要求）等
  
* DBMS提供一套数据定义语言(DDL:Data Definition Language)给用户  
  用户使用DDL描述其所要建立表的格式  
  DBMS按照用户的定义，创建数据库及其中的Table

* DBMS提供一组数据操纵语言(DML:Data Manipulation Language)给用户  
  用户使用DML描述其所要进行的增删改查等操作  
  DBMS依照用户的操作描述，实际执行这些操作

* DBMS提供一组数据控制语言(DCL:Data Control Language)给用户
  使用DCL控制不同用户的权限
  
  数据库管理系统的功能包括：对数据库进行定义，操纵，控制

### 3.数据库的标准结构  
DBMS数据管理的三个层次  
* 外部层次  
* 概念层次  
* 内部层次  

#### 三层模式两层映像：
* 三层模式：
   * 外部模式(外模式， 用户模式)             ---->对应外部视图
   * 模式(概念模式,逻辑模式, 全局模式)        ---->对应概念视图    
   * 内部模式（内模式， 物理模式）            ---->对应内部视图
* 两层映像：
   * (E-C映像)外部模式映射为概念模式：支持实现数据概念视图向外部视图的转换     
   * (C-I映像)概念模式映射内部模式： 支持实现数据概念视图向内部视图的转换
   
   
   
# SQL语言及其应用
# 数据建模与数据库设计
# 数据库管理与维护