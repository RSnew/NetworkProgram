<%--
  Created by IntelliJ IDEA.
  User: dell
  Date: 2023/12/10
  Time: 20:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>修改信息</title>
</head>
<body>
<form action="infoUpdateList" method="POST">
    教师ID：<input type="text" name="infoTeacherID" value="${infoById.infoTeacherID}" disabled="disabled"><br>
    公告内容：<input type="text" name="infoBody" value="${infoById.infoBody}"><br>
    <input type="submit" value="修改"><br>
    <input type="number" name="infoID" value="${infoById.infoID}" hidden="hidden"><br>
</form>
</body>
</html>
