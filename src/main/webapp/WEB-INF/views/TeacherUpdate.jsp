<%--
  Created by IntelliJ IDEA.
  User: lx
  Date: 2023/12/6
  Time: 11:29
  To change this template use File | Settings | File Templates.
--%>
<%@page import ="com.project.model.pojo.Student"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<% String path= request.getContextPath();
    String basePath= request.getScheme()+"://"+request.getServerName()+"://"+request.getServerPort()+path+"/";
%>
<html>
<head>
    <title>修改个人信息</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/teachers/modifyTeacher"><!--localhost:9000-->
    <input type="hidden" name="teacherid" value="${teacherid}"/>
    <tr>
        <td>用户名:</td>
        <td><input type="text" name="teacherName"></td>
    </tr>
    <tr>
        <td>密&nbsp;&nbsp;码:</td>
        <td><input type="password" name="password"></td>
    </tr>
    <input type="submit" value="修改"/>
    <a href="findByTeacherId?teacherid=${teacherid}">查看个人信息</a>
    <a href="login?teacherid=${teacherid}">回到主界面</a>
</form>
</body>
</html>
