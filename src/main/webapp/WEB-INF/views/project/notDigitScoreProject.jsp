<%--
  Created by IntelliJ IDEA.
  User: m1874
  Date: 2023/12/12
  Time: 17:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>notDigitScoreProject</title>
</head>
<body>
<script type="text/javascript">
    alert("成绩应为数字！");
    window.document.location.href="${pageContext.request.contextPath}/project/judgeIndex";
</script>
</body>
</html>
