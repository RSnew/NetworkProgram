<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>注册页面</title>
</head>
<body>

<div align="center">
    <h2>注册</h2>
    <!-- 如果有错误信息，则显示红色错误消息 -->
    <c:if test="${not empty error}">
        <p style="color: red">${error}</p>
    </c:if>

    <c:if test="${registrationSuccess}">
        <p style="color: green">注册成功！</p>
    </c:if>

    <!-- Registration form -->
    <form action="${pageContext.request.contextPath}/user/register" method="post">
        <label for="username">用户名:</label>
        <input type="text" id="username" name="username" required><br>

        <label for="password">密码:</label>
        <input type="password" id="password" name="password" required><br>


        <!-- 身份选择改为单选框 -->
        <label>选择身份：</label>
        <label><input type="radio" name="isAdmin" value="0" required> 学生</label>
        <label><input type="radio" name="isAdmin" value="1" required> 老师</label><br>

        <button type="submit">注册</button>
    </form>

    <p>已有账号？<a href="${pageContext.request.contextPath}/user/login">登录</a></p>
</div>

</body>
</html>
