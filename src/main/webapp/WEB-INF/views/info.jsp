<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<style>
    body{
        margin:0 auto;
    }
    h1{
        text-align:center;
    }
    table{
        margin: 20px auto;
        width: auto;
        min-height: auto;
        text-align: center;
        border-collapse: collapse;
    }
</style>
<head>
    <title>公告管理界面</title>
</head>
<body>
<h1>公告</h1>
<div>
    <table border="1">
        <tr>
            <th>序号</th>
            <th>发布者</th>
            <th>内容</th>
            <th>编辑</th>
            <th>删除</th>
        </tr>
        <c:forEach items="${list}" var="info">
            <tr>
                <td>${info.infoID}</td>
                <td>${info.infoTeacherID}</td>
                <td>${info.infoBody}</td>
                <td>
                    <a href="infoUpdate?infoID=${info.infoID}">修改</a>
                </td>
                <td>
                    <a href="infoDelete?id=${info.infoID}">删除</a>
                </td>
            </tr>
        </c:forEach>
    </table>
</div>
<h1> <a href="add" target="rightFrame">增加公告</a></h1>
<form>
    <h2><a href="${pageContext.request.contextPath}/teachers/login">返回</a></h2>
</form>
</body>
</html>