# ServletContainerInitializer-backdoor
将Releases的jar包放入apache的lib目录下`\usr\local\apache-tomcat-8.5.69\lib`
将tomcat-memshell-scanner.jsp放入apache的web目录下面`\usr\local\apache-tomcat-8.5.69\webapps\ROOT`
重启apache后，在tomcat-memshell-scanner.jsp中会多出恶意的webshell-backdoor
![图片](https://user-images.githubusercontent.com/51915181/134882976-bc2ae791-5e62-4244-beea-5d08270b7cd0.png)