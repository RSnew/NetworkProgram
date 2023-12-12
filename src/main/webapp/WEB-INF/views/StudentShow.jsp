<%--
  Created by IntelliJ IDEA.
  User: lx
  Date: 2023/12/9
  Time: 16:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" %>
<html>
<head>
    <title>查看自己的信息</title>
</head>
<body>
<center>
    <h3>欢迎进入学生端</h3>
    <form>
        <table style="font-size: 15px;" cellspacing="0" border="1px">
            <caption>学生个人信息</caption>
            <tr align="center">
                <th>id</th>
                <th>用户名</th>
                <th>密码</th>
                <th>操作</th>
            </tr>
                <tr>
                    <td>${id}</td>
                    <td>${name}</td>
                    <td>${password}</td>
                    <td><a href="StudentUpdate?studentid=${id}">修改个人信息</a>&nbsp;|&nbsp;
                    <a href="StudentDelete?studentid=${id}">删除个人信息</a></td>
                </tr>
        </table>
    </form>
    <a href="login?studentid=${id}">返回到学生主界面</a>
</center>
</body>
</html>
