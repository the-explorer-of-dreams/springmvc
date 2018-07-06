<%--
  Created by IntelliJ IDEA.
  User: william
  Date: 2018/7/6
  Time: 13:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Spring4 MVC -HelloWorld</title>
</head>
<body>
    <p>*********hello**********</p>
    <h1>greeting:${greeting}</h1>
    <p>requestAttr:${requestAttr}</p>

    <c:if test="${redirecMessage != null}">
        <p>*********redirect*********</p>
        <p>redirecMessage:${redirecMessage}</p>
    </c:if>

    <c:if test="${forwardMessageModel != null}">
        <p>*********forward*********</p>
        <p>forwardMessageModel:${forwardMessageModel}</p>
    </c:if>

    <c:if test="${name != null}">
        <p>*********RequestParam*********</p>
        <p>name:${name}</p>
        <p>email:${email}</p>
    </c:if>
</body>
</html>
