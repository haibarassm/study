# Spring boot
安装.gradle 配合git，拉取项目文件  

使用lombok 解决get set 问题  

使用gitprompt 增加git代码提示
# Git
## 拉取项目
git clone git上的项目地址
输入用户名和密码（若输错了，就到控制面板\用户帐户\凭据管理器\windows凭据删除原有凭据, 
再次输入,或者在.git/config中url修改
url = http://账号:密码@121.43.39.210/common/relay.git）  

Checkout 从主干上切除分支或者转到对应的分支  

Git pull 从远程服务器上拉去相应分支的源代码到当前分支  

Git push 将当前分支的内容上传到远程服务器对应的分支上 

Git add 将这个修改后的文件添加到暂存区  

Git commit 将暂存区上的文件提交到本地数据库

# Spring boot 的环境配置
1、配置本机环境变量的jdk  

2、配置gradle的安装目录
## Spring boot 的项目启动运行  

1、Idea直接点debug 或者run  

2、在netty-push\relay\src\main\java\com\oucloud\relay\RelayApplication.java里面的run哪里点击或者右键点击你需要的启动模式  

## PHP与java的对接步骤
1、根据PHP文档中的url找到java对应的controller，按照PHP中规定好的格式确定是那种数据接收模式（get、post、delete、put）以及相应的参数接收方式  

2、通过对应的client类调用相应方法  

3、执行方法得到返回结果  

4、用泛型BaseResponse将结果包住，在设置对应的返回参数、错误信息和返回的data信息  

### JsonAlias与jsonproperty的区别
JsonAlias：字符串转json对象  

Jsonproperty：json对象转字符串  

在接收参数的时候，外界的字符串通过请求传入，用某一个类接收，类中的属性名上加上@JsonAlias的注释，就可以获取到和属性名名称不同的字符串作为这个属性的属性值  
  
传递返回值时，一个list中的对象或者一个对象他们的属性值是从数据库或其他地方获取的字符串，转成相应的属性值输出到前端  
### RequestParam与PathVariabled的区别

RequestParam和PathVariabled都是与get相关的获取参数方式  

RequestParam是url中获取用&连接的参数  
PathVariabled是url中获取{}中的参数

### require=false在不同位置的不同
在@api中就是写写的  

在@RequestParam中是真的可以不填的  

搞错就400了


