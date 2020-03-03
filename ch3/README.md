#Servlets Demystified (write, deploy, run)

Compile with this command
```
$  javac -classpath somewher-in-your-computer>/apache-tomcat-9.0.30/lib/servlet-api.jar:classes:. -d classes src/com/example/model/BeerExpert.java
$  javac -classpath somewher-in-your-computer>/apache-tomcat-9.0.30/lib/servlet-api.jar:classes:. -d classes src/com/example/model/BeerSelect.java
```

Open `apache-tomcat-9.0.30/webapps` folder. Create folder with configuration like ch1

Run tomcat and check `http://localhost:8080/Beer-v1/form.html`