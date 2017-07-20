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
    <c:forEach items="${users}" var="user" >
        ${user.id} : ${user.name}
        <br />
    </c:forEach>
</body>
</html>
