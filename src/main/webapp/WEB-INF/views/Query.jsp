<%--
  Created by IntelliJ IDEA.
  User: lx
  Date: 2023/12/12
  Time: 10:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>学生提问表</title>
</head>
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
<body>
<h1>问题</h1>
<div>
    <table border="1">
        <tr>
            <th>序号</th>
            <th>发布者</th>
            <th>问题内容</th>
        </tr>
        <c:forEach items="${list}" var="query">
            <tr>
                <td>${query.queryID}</td>
                <td>${query.userID}</td>
                <td>${query.question}</td>
            </tr>
        </c:forEach>
    </table>
</div>
<h1> <a href="addquery" target="rightFrame">提问</a></h1>
</body>
</html>
