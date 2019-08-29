<h1><b>Maven私服</b></h1>

<h2>掌握点</h2>
1.什么是Maven私服;<br>
2.如何搭建Maven私服;
3.如何使用Maven私服;

<h4>Maven仓库:是Maven 同意存储所有的Maven 项目依赖,插件,以及所上传项目的地方

<h1>Maven仓库分类:<br>
<li><h3>本地仓库:我们本地电脑安装Maven,在配置文件setting.xml中指定的LocalRepository指定的目录文件夹
<li><h3>远程仓库:通过网络的形式指定URL专门存放java库,Maven 插件等的服务器<br></h3>
例如：中央仓库就是一个典型的远程仓库,它包含了世界上绝大部分开源的java库

<h2>Maven私服就是个人服务器搭建的一个Maven 代理外部的远程仓库,当使用到的类库没有会从远程仓库中去查找下载
优先会从本地的仓库中去查找下载,目前远程仓库使用的阿里云的Maven</h2>

<h1>Maven 结构</h1>

![Image text](https://user-gold-cdn.xitu.io/2019/8/28/16cd84967500c498?imageView2/0/w/1280/h/960/format/webp/ignore-error/1)

<h1>Maven 调用流程</h1>

![Image text](https://user-gold-cdn.xitu.io/2019/8/28/16cd8496a0e29539?imageView2/0/w/1280/h/960/format/webp/ignore-error/1)


<h3>待续...........</h3>
 

