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
</head>
<body>
<center>
    <h3>欢迎进入学生端</h3>
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
        <a href="${pageContext.request.contextPath}/students/Project">提交项目</a>
        <a href="${pageContext.request.contextPath}/students/answer?studentid=${studentid}">提出疑问</a>
        <a href="${pageContext.request.contextPath}/students/download">项目模板</a>
        </div>
    </form>
    <div>
    <form action="${pageContext.request.contextPath}/students/findByStudentId" method="post">
        查看个人信息:<input type="search" name="studentid" class="search">
        <input type="submit" value="提交" >
    </form>
    </div>
    <a href="/user/login">注销</a>
</center>
</body>
</html>
