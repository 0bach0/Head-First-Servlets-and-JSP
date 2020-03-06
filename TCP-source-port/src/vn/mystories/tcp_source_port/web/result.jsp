<%@ page import="java.util.*" %>

<html>
<body>
<h1 align="center">Got the request information</h1>
<p>
    <%
        out.print("<br>At host: " + request.getAttribute("request_host"));
        out.print("<br>At address: " + request.getAttribute("requestAddr"));
        out.print("<br>At port: " + request.getAttribute("request_port"));
    %>
</p>
</body>
</html>