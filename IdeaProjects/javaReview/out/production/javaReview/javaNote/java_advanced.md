# javaWeb核心内容

## 1.web的相关概念回顾

### 软件架构
1.C/S架构: 客户端/服务器端
2.B/S架构: 浏览器/服务器端
### 资源分类
1.静态资源 :所有用户访问后得到的结果都是一样的  
html, css, javaScript   
2.动态资源 :每个用户访问相同的资源后,得到的结果可能不一样  
servlet/jsp, php, asp
### 网络通信三要素
1.IP：电子设备在网络中的唯一标识
   
2.端口：应用程序在计算机中的唯一标识 0～65536
将来自己写的应用程序不要使用1024以内的端口, 因为这些端口很可能被操作系统占用了
  
3.传输协议：规定了数据传输的规则  
* 基础协议：  
1.tcp：是一种安全的协议, 传输之前会经过三次握手确认双方都在线的情况下才会发送数据，但是速度慢  
2.udp：是一种不安全的广播协议,可能会丢失数据，但是速度快

## 2.web服务器软件:Tomcat
* 服务器：就是安装了服务器软件的计算机  
* 服务器软件：接受用户的请求，处理请求，做出响应  
* web服务器软件：接受用户的请求，处理请求，做出响应  
  * 在web服务器软件中，可以部署web项目，让用户通过浏览器来访问这些项目
  * web容器
* 常见的java相关的web服务器软件：   
  * webLogic：Oracle公司，大型的JavaEE服务器，支持所有的Java规范，是收费的  
  * webSphere：IBM公司，大型的JavaEE服务器，支持所有的Java规范，是收费的  
  * JBOSS：JBOSS公司，大型的JavaEE服务器，支持所有的Java规范，是收费的
  * Tomcat: Apache基金组织，中小型的JavaEE服务器，仅仅支持少量的JavaEE规范，开源，免费  
* JavaEE： 是java语言在企业级开发中使用的技术规范的总和，一共规定了13项大的规范
  
*Tomcat：是web服务器软件  
1.下载: [Tomcat官网:<https://tomcat.apache.org/>](https://tomcat.apache.org/>)
  
2.安装: 解压压缩包即可  
   * 注意：安装目录不要有中文和空格
   
3.卸载：删除目录即可
  
4.启动
* Linux: bin/startup.sh
* Windows: bin/startup.bat, 双击运行该文件
  
访问：浏览器地址栏输入：
* 访问自己的tomcat：  
http://127.0.0.1:8080  
或者http://localhost:8080
或者http://自己的ip地址
  
* 访问别人的tomcat：   
http://别人的ip：8080 

可能遇到的问题：  
* 1.黑窗口一闪而过  
原因：没有正确配置Java_HOME环境变量    
解决方案：正确配置JAVA_HOME环境变量  
* 2.启动报错  
原因：端口号被占用    
解决方案：  
1.找到占用的端口号，并且找到对应的进程，杀死该进程
Windows： cmd下输入： netstat -ano 查看端口号 然后任务管理器关闭对应进程  
2.修改自身的端口号  
在tomcat文件下找到conf/server.xml 改变所有被占用的端口号
一般会将tomcat的默认端口号修改为80， 因为80端口号是http协议的默认端口号，在访问时就不用输入端口号


5.关闭  
1.正常关闭：
* Linux: bin/shutdown.sh  
* Windows: bin/shutdown.bat, 双击运行该文件 或者Ctrl+C   

2.强制关闭：点击窗口的叉叉
  
6.配置  
* 部署项目的方式： 
  
1.直接将项目放到tomcat/webapps 目录下即可，然后通过浏览器访问：自己或者别人的地址：/项目名称/项目下具体文件
比如： webapps中有一个名为hello的项目，项目中有一个叫做hello.html的文件，则可以： localhost/hello/hello.html
/hello:项目的访问路径，也叫虚拟路径    
* 简化部署：将项目中的文件压缩成.zip文件，然后将.zip后缀名改为.war, 这样就可以直接将war包放到webapps目录下即可，它就会自动解压缩，卸载时直接删除war包即可  
  
2.在tomcat/conf/server.xml 中找到<Host>标签， 在<Host>标签体中部署项目  
添加: < Context docBase="项目存放的路径" path="虚拟目录"/ > 
  
如：< Context docBase="D:\hello" path="/test" / >  
则可在浏览器地址栏中输入： http://地址/test/具体文件  来访问
缺点：因为server.xml是整个Tomcat的核心配置文件，它是配置Tomcat整体的，如果在这里边部署项目的话，有可能把整个Tomcat的配置文件给弄坏了，这样其他的项目也可能运行不起来了  

3.conf/Catalina/localhost创建一个任意名称的.xml文件，在文件中编写 < Context docBase="项目存放的路径" >，先在它的虚拟目录就是xml该文件的名称
* 好处：如果想要卸载某个项目：可以直接更改.xml文件后缀名，一般将.xml改成.xml_bak，这样服务器级就读取不到这个文件了，这样就避免了前两种方式需要重启服务器

#### 项目有两种形式：  
* 静态项目和动态项目：  
  * 静态项目里边只能放静态项目  
  * 动态项目里边不仅仅可以放静态项目，也可以放一些动态资源，比如servlet/jsp
* 目录结构：
  * java动态项目的目录结构：   
     --  项目的根目录

   
## 3.Servlet的入门学习

