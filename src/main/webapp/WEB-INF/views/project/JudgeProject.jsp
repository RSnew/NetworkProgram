<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: m1874
  Date: 2023/11/6
  Time: 20:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>JudgeProject</title>
</head>
<body>
    <h2>欢迎来到评判项目界面！</h2>
    <h2>选择你要评判的项目</h2>
    <form action="${pageContext.request.contextPath}/project/updateScore" method="post">
    <table>
    <tr>
        <th>项目ID</th>
        <th>项目名称</th>
        <th>负责人姓名</th>
        <th>指导教师</th>
        <th>分数</th>
    </tr>

    <c:forEach items="${project_info}" var="info">
        <tr>
            <td><input type="text" name="programID" value="${info.programID}" readonly="readonly"></td>
            <td><input type="text" name="programName" value="${info.programName}" readonly="readonly"></td>
            <td><input type="text" name="programAuthorName" value="${info.programAuthorName}" readonly="readonly"></td>
            <td><input type="text" name="programTeacherName" value="${info.programTeacherName}" readonly="readonly"></td>
            <td><input type="text" name="updateScore" value="${info.programScore}"></td>
            <td><input type="submit" value="修改"></td>
            <td><input type="hidden" name="programFile" value="${info.programPath}"> </td>

        </tr>
    </c:forEach>
       <input type="button" value="下载界面" onclick="
                window.location.href='${pageContext.request.contextPath}/project/downloadIndex';">
<%--<script>--%>
<%--    function myButton(){--%>
<%--        var myInput=document.getElementById("programFile").value;--%>
<%--        var formData = new FormData(myInput);--%>

<%--        &lt;%&ndash;fetch('${pageContext.request.contextPath}/project/downloadProject', {&ndash;%&gt;--%>
<%--        &lt;%&ndash;    method: 'POST',&ndash;%&gt;--%>
<%--        &lt;%&ndash;    body: formData&ndash;%&gt;--%>
<%--        &lt;%&ndash;})&ndash;%&gt;--%>
<%--        &lt;%&ndash;    .then(response => response.json())&ndash;%&gt;--%>
<%--        &lt;%&ndash;    .then(data => console.log(data));&ndash;%&gt;--%>
<%--        window.location.href='${pageContext.request.contextPath}/project/downloadProject';--%>
<%--    }--%>
<%--</script>--%>
    </table>
    </form>
</body>
</html>
