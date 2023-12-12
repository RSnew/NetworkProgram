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
    <meta name="viewport" content="width=device-width,initial-scale=1.0"/>
    <link rel="stylesheet" href="../../js/ssm.css">
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
        <div class="containt1">
            <a href="JudgeProject?teacherid=${1}">查看项目</a>
            <a href="Query?teacherid=${1}">回答疑问</a>
<%--            <a href="Info?teacherid=${1}">发布公告</a>--%>
            <a href="${pageContext.request.contextPath}/controller/add?teacherId=${1}">发布公告</a>
        </div>
    </form>
    <div class="containt2">
        <form action="${pageContext.request.contextPath}/teachers/findByTeacherId" method="post">
            查看个人信息:<input type="search" name="teacherid" class="search">
            <input type="submit" value="提交" >
        </form>
    </div>
</center>
</body>
</html>
