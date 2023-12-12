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
    <h3>欢迎进入老师端</h3>
    <form>
        <table style="font-size: 15px;" cellspacing="0" border="1px">
            <caption>老师个人信息</caption>
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
                <td><a href="TeacherUpdate?teacherid=${id}">修改个人信息</a>&nbsp;|&nbsp;
                    <a href="TeacherDelete?teacherid=${id}">删除个人信息</a></td>
            </tr>
        </table>
    </form>
    <a href="login?teacherid=${id}">返回到老师主界面</a>
</center>
</body>
</html>
