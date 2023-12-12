<%--
  Created by IntelliJ IDEA.
  User: dell
  Date: 2023/12/10
  Time: 20:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Insert title here</title>
</head>
<body>
<form action="infoAdd" method="POST">
<%--    序号：<input type="number" name="infoID" disabled="disabled"><br>--%>
    老师id：<input type="number" name="infoTeacherID" value="${infoTeacherID}"><br>
    公告内容：<input type="text" name="infoBody"><br>
    <input type="submit" value="增加"><br>
</form>
</body>
</html>