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
<%--    <script src="../../js/project.js"></script>--%>
</head>
<body>
    <h2>提交项目页面</h2>
    <form method="post" action="${pageContext.request.contextPath}/project/uploadProject" enctype="multipart/form-data"><!--需要ajax 提示上传文件成功-->
        <p>项目名称：<input type="text" name="projectName"><br></p>
        <p>负责人姓名：<input type="text" name="projectAuthorName"><br></p>
        <p>指导教师：<input type="text" name="projectTeacherName"><br></p>
        <p>项目文件：<input type="file" name="uploadFile" value="上传文件"><br></p>
        <input type="submit" name="submit" value="提交文件">
    </form>
    <form method="get" action="">
        <input type="submit" value="返回上级">
    </form>
</body>
</html>
