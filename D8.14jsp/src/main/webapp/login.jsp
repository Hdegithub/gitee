<%--
  Created by IntelliJ IDEA.
  User: ytdag
  Date: 2023/8/17
  Time: 14:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page isELIgnored="false"%>
<html>
<head>
    <title>登陆</title>
</head>
<body>
<font color="red">${err}</font>

<form action="${pageContext.request.contextPath}/login" id="form" method="post">
    <h1 id="loginMsg">LOGIN IN</h1>
    <p>Username:<input id="username" name="username" type="text"></p>

    <p>Password:<input id="password" name="password" type="password"></p>

    <div id="subDiv">
        <input type="submit" class="button" value="login up">
        <input type="reset" class="button" value="reset">&nbsp;&nbsp;&nbsp;

    </div>
</form>
</body>
</html>
