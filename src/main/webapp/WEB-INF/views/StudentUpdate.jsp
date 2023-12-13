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
    <form action="${pageContext.request.contextPath}/students/modifyStudent"><!--localhost:9000-->
        <input type="hidden" name="studentid" value="${studentid}"/>
        <tr>
            <td>用户名:</td>
            <td><input type="text" name="studentName"></td>
        </tr>
        <tr>
            <td>密&nbsp;&nbsp;码:</td>
            <td><input type="password" name="password"></td>
        </tr>
        <input type="submit" value="修改"/>
        <a href="${pageContext.request.contextPath}/students/findByStudentId?studentid=${studentid}">查看个人信息</a>
        <a href="${pageContext.request.contextPath}/students/login?studentid=${studentid}">回到主界面</a>
    </form>
</body>
</html>
