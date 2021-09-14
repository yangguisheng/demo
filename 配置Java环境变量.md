### 变量设置参数如下：

    变量名：JAVA_HOME
    变量值：C:\Program Files (x86)\Java\jdk1.8.0_91        // 要根据自己的实际路径配置

    变量名：CLASSPATH
    变量值：.;%JAVA_HOME%\lib\dt.jar;%JAVA_HOME%\lib\tools.jar;         //记得前面有个"."

    变量名：Path
    变量值：%JAVA_HOME%\bin;%JAVA_HOME%\jre\bin;

### 注意事项

    1、JDK版本在1.5以上的，不用配置CLASSPATH也可正常编译和运行Java程序
    2、Win10系统环境变量中的项目分条显示，故以上路径以分号隔开的都需分条添加
    3、openJDK无jre目录时，可无需配置