<%--
  Created by IntelliJ IDEA.
  User: m1874
  Date: 2023/12/10
  Time: 15:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>SuccessProject</title>
</head>
<body>
<script type="text/javascript">
    alert("提交成功！");
    window.document.location.href="${pageContext.request.contextPath}/project/judgeIndex";
</script>
</body>
</html>
