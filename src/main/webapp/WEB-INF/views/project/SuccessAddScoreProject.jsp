<%--
  Created by IntelliJ IDEA.
  User: m1874
  Date: 2023/12/12
  Time: 18:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>SuccessAddScoreProject</title>
</head>
<body>
<script type="text/javascript">
    alert("成绩修改成功！");
    window.document.location.href="${pageContext.request.contextPath}/project/judgeIndex";
</script>
</body>
</html>
