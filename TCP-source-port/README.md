# Find the source port of a request

Compile with this command
```
$   javac -classpath <some-where-in-your-computer>/apache-tomcat-9.0.30/lib/servlet-api.jar:classes:. -d classes src/vn/mystories/tcp_source_port/web/DisplayLocalPort.java
```

Open `apache-tomcat-9.0.30/webapps/display-local-port` folder. Create folder with structure like this

```
$  display-local-port ls -R
WEB-INF    result.jsp

./WEB-INF:
classes web.xml

[not-necessary-contents]

./WEB-INF/classes/vn/mystories/tcp_source_port/web:
DisplayLocalPort.class
```

Run tomcat by `apache-tomcat-9.0.30/bin/startup.sh`

Check the result:

```
$ curl http://localhost:8080/display-local-port/

<html>
<body>
<h1 align="center">Got the request information</h1>
<p>
    <br>At host: 0:0:0:0:0:0:0:1<br>At address: null<br>At port: 54220
</p>
</body>
</html>%
```

The port can be specific by using `--local-port` options 
```
$ curl http://localhost:8080/display-local-port/ --local-port 2333-2444

<html>
<body>
<h1 align="center">Got the request information</h1>
<p>
    <br>At host: 0:0:0:0:0:0:0:1<br>At address: null<br>At port: 2333
</p>
</body>
</html>%
``` 
