<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Title</title>
</head>
<body>

<%--
    JSTL 标签
    c:if：来完成逻辑判断，替换java  if else
--%>
<%--

    <c:if test="true">
        <h1> true</h1>
    </c:if>

    <c:if test="false">
        <h1> false</h1>
    </c:if>
    c  core标签库的别名
    test测试 status变量 是否==1
    如果==1 ，显示启用
--%>
<c:if test="${status ==1}">
    启用
</c:if>
<%-- 为了 在JSP中不写java代码--%>
<c:if test="${status ==0}">
    禁用
</c:if>

</body>
</html>
