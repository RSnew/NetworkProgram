<%--
  Created by IntelliJ IDEA.
  User: m1874
  Date: 2023/12/12
  Time: 14:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>FailedUploadProject</title>
</head>
<body>
<script type="text/javascript">
    alert("提交失败！请检查是否上传文件、并检查指导教师或学生是否存在");
    window.document.location.href="${pageContext.request.contextPath}/project/uploadIndex";
</script>
</body>
</html>
