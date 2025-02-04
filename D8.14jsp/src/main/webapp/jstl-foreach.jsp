<%@ page import="com.learnjsp.pojo.Brand" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page isELIgnored="false" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<h1>${companyName}</h1>
欢迎您: ${uname}
<a href="addBrand.jsp"> 新增</a>
<a href="loginout"> 注销</a>
<hr>
<table border="1" cellspacing="0" width="90%">
    <tr>
        <th>序号</th>
        <th>品牌名称</th>
        <th>企业名称</th>
        <th>排序</th>
        <th>品牌介绍</th>
        <th>状态</th>
        <th>种类</th>
        <th>操作</th>

    </tr>

    <%--    items：指定 要循环的变量   var ：从集合中拿到每个变量名字--%>
    <c:forEach items="${myBrands}" var="brand" varStatus="status">
        <tr align="center">
                <%--<td>${brand.id}</td>--%>
            <td></td>
            <td>${brand.brandName}</td>
            <td>${brand.companyName}</td>
            <td>${brand.ordered}</td>
            <td>${brand.description}</td>
            <c:if test="${brand.status == 1}">
                <td>启用</td>
            </c:if>
            <c:if test="${brand.status != 1}">
                <td>禁用</td>
            </c:if>
            <td>${brand.typeName}</td>
            <td><a href="/D8_14jsp/edit?id=${brand.id}">修改</a> <a href="/D8_14jsp/delete?id=${brand.id}">删除</a></td>
        </tr>

    </c:forEach>


</table>


<hr>

<c:forEach begin="1" end="5" step="1" var="i">
    <a href="#">${i}</a>
</c:forEach>


</body>
</html>