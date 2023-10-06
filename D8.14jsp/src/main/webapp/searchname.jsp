<%--
  Created by IntelliJ IDEA.
  User: ytdag
  Date: 2023/8/17
  Time: 14:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page isELIgnored="false" %>
<html>
<head>
    <title>查询</title>
</head>
<body>
<font color="red">${err}</font>

<form action="${pageContext.request.contextPath}/searchByname" id="form" method="post">
    <h1 id="loginMsg">LOGIN IN</h1>

    <p>输入搜索名字:<input name="searchname" type="text"></p>
    <div id="subDiv">
        <input type="submit" class="button" value="search">

    </div>
</form>
</body>
</html>
