<%--
  Created by IntelliJ IDEA.
  User: white
  Date: 17/7/20
  Time: 09:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <a href="${pageContext.request.contextPath}/user/list" >用户列表</a>
  <form action="${pageContext.request.contextPath}/user/logout" method="post">
   <input type="submit" value="退出登录" />
  </form>
  </body>
</html>
