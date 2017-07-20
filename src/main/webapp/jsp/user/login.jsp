<%--
  Created by IntelliJ IDEA.
  User: white
  Date: 17/7/20
  Time: 22:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/user/login" method="post" >

    用户名:<input type="text" name="name" />
    密码:<input type="text" name="password" />
    <input type="submit" value="登陆">


</form>
<a href="${pageContext.request.contextPath}/user/register" >注册</a>
</body>
</html>
