# tomcat-backdoor

# tomcat隐蔽后门-内存马

将Releases的jar包放入apache的lib目录下`\usr\local\apache-tomcat-8.5.69\lib`

将tomcat-memshell-scanner.jsp放入apache的web目录下面`\usr\local\apache-tomcat-8.5.69\webapps\ROOT`

`/usr/local/apache-tomcat-8.5.69/bin# ./shutdown.sh`

`/usr/local/apache-tomcat-8.5.69/bin# ./startup.sh`

重启apache后，可以使用tomcat-memshell-scanner.jsp检测工具查看到出恶意的webshell-backdoor（第一行就是我们可爱的内存马）

![图片](https://user-images.githubusercontent.com/51915181/134882976-bc2ae791-5e62-4244-beea-5d08270b7cd0.png)

访问对应目录，并传入参数，命令执行

![图片](https://user-images.githubusercontent.com/51915181/134883130-5a59028a-be33-42db-b38f-050f98705cd0.png)

可以根据自己的需求更改源码

![visitor badge](https://visitor-badge.glitch.me/badge?page_id=jwenjian.visitor-badge)
