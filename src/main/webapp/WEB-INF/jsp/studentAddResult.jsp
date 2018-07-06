<%--
  Created by IntelliJ IDEA.
  User: william
  Date: 2018/7/6
  Time: 16:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>SpringMVC 表单处理</title>
</head>
<body>
     <h2>Student Information commited</h2>
        <table>
            <tr>
                <td>名字:</td>
                <td>${name}</td>
            </tr>

            <tr>
                <td>年龄:</td>
                <td>${age}</td>
            </tr>

            <tr>
                <td>编码:</td>
                <td>${id}</td>
            </tr>

        </table>
</body>
</html>
