<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>登录页面</title>
</head>
<body>
<div align="center">
    <h2>登录</h2>

    <!-- 如果有错误信息，则显示红色错误消息 -->
    <c:if test="${not empty error}">
        <p style="color: red">${error}</p>
    </c:if>

    <!-- 如果会话中存在用户信息，则显示欢迎信息 -->
    <c:if test="${sessionScope.user ne null}">
        <p>注册成功，欢迎, ${sessionScope.user.username}!</p>
    </c:if>
    <p>${message}</p>
    <!-- 登录表单 -->
    <form action="${pageContext.request.contextPath}/user/login" method="post">
        <label for="username">用户名:</label>
        <input type="text" id="username" name="username" required><br>

        <label for="password">密码:</label>
        <input type="password" id="password" name="password" required><br>

        <label>选择身份：</label>
        <label><input type="radio" name="isAdmin" value="0" required> 学生</label>
        <label><input type="radio" name="isAdmin" value="1" required> 老师</label><br>
        <button type="submit">登录</button>
        <p>没有账号？<a href="${pageContext.request.contextPath}/user/register">立即注册</a></p>

    </form>
</div>

</body>
</html>
