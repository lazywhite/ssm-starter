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
<form action="${pageContext.request.contextPath}/user/add" method="post" >
    用户名:<input type="text" name="name" />
    密码:<input type="text" name="password" />
    重复密码:
    <input type="submit" value="注册">
</form>
</body>
</html>
