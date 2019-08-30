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


<h1>Maven 私服的作用</h1>
<li>内网访问,节省外网带宽</li>
<li>一次内网下载,内网所有用户就可以只下载私服缓存,加速Maven 项目构建</li>
<li>允许上传喝下载私有库,提供项目构建的稳定性</li>
<li>减少外部网络因素,提供项目构建的稳定性</li>
<li>方便内部项目服务的依赖引用,而不需要其它项目的完整源代码</li>
<li>当我们有独立的两个Maven 项目,比如订单服务项目,和会员服务项目其中订单服务项目需要使用 会员服务的API包
,通过私服可以将编译后的会员服务的API包上传,然后订单服务程序直接下载引用私服上的会员服务API包即可</li>
<p>如下图:</p>

![Image text](https://user-gold-cdn.xitu.io/2019/8/28/16cd8496c9558660?imageView2/0/w/1280/h/960/format/webp/ignore-error/1)


<h1>搭建Maven 私服</h1>
<li>使用开员Maven 仓库管理软件--Nexus</li>
<i>使用docker 容器下载Nexus 镜像后启动Nexus 容器</li>
<li>登录 Nexus 配置Maven 私服</li>
<li>中央仓库代理路径设置使用阿里云仓库提供的地址</li>
<li>新建自定义的仓库</li>

![Image text](https://user-gold-cdn.xitu.io/2019/8/28/16cd849958ed51b7?imageView2/0/w/1280/h/960/format/webp/ignore-error/1)

![Image text](https://user-gold-cdn.xitu.io/2019/8/28/16cd8499d84ab8b8?imageView2/0/w/1280/h/960/format/webp/ignore-error/1)

![Image text](https://user-gold-cdn.xitu.io/2019/8/28/16cd849a91362fdf?imageView2/0/w/1280/h/960/format/webp/ignore-error/1)

<li>添加角色</li>

![Image text](https://user-gold-cdn.xitu.io/2019/8/28/16cd849b1f807989?imageView2/0/w/1280/h/960/format/webp/ignore-error/1)

<li>权限分配</li>

![Image text](https://user-gold-cdn.xitu.io/2019/8/28/16cd849b6cb775fa?imageView2/0/w/1280/h/960/format/webp/ignore-error/1)

<li>添加用户</li>

![Image text](https://user-gold-cdn.xitu.io/2019/8/28/16cd849c08efe324?imageView2/0/w/1280/h/960/format/webp/ignore-error/1)

<h1>使用Maven 私服</h1>

<li>设置 server 账户信息</li>

![Image text](https://user-gold-cdn.xitu.io/2019/8/28/16cd849cabe3ce08?imageView2/0/w/1280/h/960/format/webp/ignore-error/1)

<li>设置私服仓库地址：（这里的地址，可以通过 Nexus 后台上仓库页面的 cpoy 按钮自动复制得到）</li>

![Image text](https://user-gold-cdn.xitu.io/2019/8/28/16cd849d14737eec?imageView2/0/w/1280/h/960/format/webp/ignore-error/1)

<h1>Maven 项目部署到私服</h1>
<p>创建一个maven 工程,尝试下打包到Maven 私服,利用Idea 快速的生成Maven 项目,在POM 文件添加distributionManageMent节点
并指定对应私服仓库id 和地址</p>

![Image text](https://user-gold-cdn.xitu.io/2019/8/28/16cd849d8b606623?imageView2/0/w/1280/h/960/format/webp/ignore-error/1)

<p>执行部署命令 mvn clean deploy</p>

![Image text](https://user-gold-cdn.xitu.io/2019/8/28/16cd849f53eb38f9?imageView2/0/w/1280/h/960/format/webp/ignore-error/1)



 

