#Servlets Demystified (write, deploy, run)

Compile with this command
```
$ javac -classpath <somewher-in-your-computer>/apache-tomcat-9.0.30/lib/servlet-api.jar -d classes src/Ch1Servlet.java 
```

It will generate `Ch1Servlet.class` in `/classes` folder.

Open `apache-tomcat-9.0.30/webapps` folder. Create folder with configuration like this

```
ch1
-- WEB-INF
---- web.xml
---- classes
------ Ch1Servlet.class
```

Run tomcat and check `http://localhost:8080/ch1/Serv1`