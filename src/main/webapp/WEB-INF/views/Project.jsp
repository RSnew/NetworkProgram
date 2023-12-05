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
    <title>Project.jsp</title>
    <script src="../../js/project.js"></script>
</head>
<body>
    <h2>提交项目页面</h2>
    <form action="#"><!--需要ajax 提示上传文件成功-->
        <input type="file" name="uploadProgram" id="uploadFile" value="上传文件"><br>
        <input type="submit" name="submit" value="提交文件">
    </form>
</body>
</html>
