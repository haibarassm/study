# Spring boot
安装.gradle 配合git，拉去项目文件
## 使用lombok 解决get set 问题
Git
## 拉取项目
git clone git上的项目地址
输入用户名和密码（若输错了，就到控制面板\用户帐户\凭据管理器\windows凭据删除原有凭据, 

### 然后再此输入,或者在.git/config中url修改
url = http://账号:密码@121.43.39.210/common/relay.git）
Checkout 从主干上切除分支或者和转到对应的分支
Git pull从远程服务器上拉去相应分支的源代码到当前分支
Git push 将当前分支的内容上传的远程服务器对应的分支上
Git add 将这个修改后的文件添加到暂存区
Git commit 将暂存区上的文件提交到本地数据库

# Spring boot 的环境配置
配置本机环境变量的jdk
配置gradle的安装目录
Spring boot 的项目启动运行
1、Idea直接点debug 或者run
2、在netty-push\relay\src\main\java\com\oucloud\relay\RelayApplication.java里面的run哪里点击或者右键点击你需要的启动模式
PHP与java的对接步骤
根据PHP文档中的url找到java对应的controller，按照PHP中规定好的格式确定是那种数据接收模式（get、post、delete、put）以及相应的参数接收方式
通过对应的client类调用相应方法
执行方法得到返回结果
用泛型BaseResponse将结果包住，在设置对应的返回参数、错误信息和返回的data信息
JsonAlias与jsonproperty的区别
JsonAlias：字符串转json对象
Jsonproperty：json对象转字符串
在接收参数的时候，外界的