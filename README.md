# Graduation-Project
基于二维码的视屏点播服务（服务器端）

1.增加了properties文件的读取功能用于设置数据库的参数以及Red5服务器的ip地址

2.增加了数据库操作功能

3.增加了用户的登录（本毕业设计应当是开放的二维码服务，所以此功能可有可无）

4.增加了从数据库读取视频资源的功能，并且用隐藏表单的方式显示在SourceList页面，用户可通过点击
想要的资源来获得相应的二维码

5.目前没有解决的：properties文件的目录读取，java环境和JAVAEE环境的读取不一样，
getProperty("user.dir")在web容器中取得的地址和test.Java不一致

6.未登录用户可以直接访问SourceList页面而没有加限制（因为登录是没有必要的），如需增加限
制需要利用Session储存用户状态

7.数据库存配置位于DataBase文件夹内
