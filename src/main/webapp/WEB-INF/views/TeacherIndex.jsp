<%--
  Created by IntelliJ IDEA.
  User: m1874
  Date: 2023/11/6
  Time: 20:04
  To change this template use File | Settings | File Templates.
--%>

<%@page language="java" contentType="text/html; charset=utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>StudentIndex.jsp</title>
</head>
<body>
<center>
    <h3>欢迎进入老师端</h3>
    <div>
        <table class="table">
            <tr>
                <th>项目公告内容</th>
            </tr>
            <c:forEach items="${infoList}" var="user">
                <tr>
                    <td>${user.infoBody}</td>
                </tr>
            </c:forEach>
        </table>
    </div>
    <form>
        <div>
            <a href="${pageContext.request.contextPath}/teachers/JudgeProject">查看项目</a>
            <a href="${pageContext.request.contextPath}/teachers/Query?teacherid=${teacherid}">回答疑问</a>
<%--            <a href="Info?teacherid=${1}">发布公告</a>--%>
            <a href="${pageContext.request.contextPath}/controller/add">发布公告</a>
        </div>
    </form>
    <div>
        <form action="${pageContext.request.contextPath}/teachers/findByTeacherId" method="post">
            查看个人信息:<input type="search" name="teacherid" class="search">
            <input type="submit" value="提交" >
        </form>
        <a href="/user/login">注销</a>
    </div>
</center>
</body>
</html>
