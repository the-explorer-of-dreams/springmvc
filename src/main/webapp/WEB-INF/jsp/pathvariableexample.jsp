<%--
  Created by IntelliJ IDEA.
  User: william
  Date: 2018/7/6
  Time: 16:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>PathVariableExample</title>
</head>
<body>
<c:if test="${userName != null}">
    <p>*********PathVariableExample*********</p>
    <p>userName:${userName}</p>
    <p>sex:${sex}</p>
    <p>age:${age}</p>
</c:if>
</body>
</html>
