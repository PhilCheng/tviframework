<%--
  Created by IntelliJ IDEA.
  User: Phil
  Date: 16/4/10
  Time: 下午9:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h2>这是从服务端获取的用户名信息: </h2> <br>
    Login ID: ${userinfo.loginId} <br>
    Name: ${userinfo.name} <br>
    Email: ${userinfo.email} <br>
    <%--Phone: ${userinfo.phone} <br>--%>
    <br>
    <a href="http://192.168.40.43:8081/cas/logout?service=http://192.168.213.98:8000/tfw">退出</a>
    <%--<a href="http://192.168.3.100/cas/logout?service=http://192.168.3.200:8000/tfw">退出</a>--%>
</body>
</html>
