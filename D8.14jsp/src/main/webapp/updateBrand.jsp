<%--
  Created by IntelliJ IDEA.
  User: ytdag
  Date: 2023/8/15
  Time: 14:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page isELIgnored="false" %>
<html>
<head>
    <title>修改</title>
</head>
<body>

<h3>修改品牌</h3>
<font color="red">${error}</font>

<form action="/D8_14jsp/updateBrand" method="post">
    <input type="hidden" name="id" value="${brd.id}"/>
    品牌名称：<input name="brandName" value="${brd.brandName}"><br>
    企业名称：<input name="companyName" value="${brd.companyName}"><br>
    排序：<input name="ordered" value="${brd.ordered}"><br>
    描述信息：<textarea rows="5" cols="20" name="description">${brd.description}</textarea><br>
    状态：
    <input type="radio" name="status" value="0" ${brand.status==0?'checked':""}>禁用
    <input type="radio" name="status" value="1" ${brand.status==1?'checked':""}>启用<br>

    <input type="submit" value="提交">
</form>
</body>
</html>
