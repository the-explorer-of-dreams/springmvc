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
     <h2>Student Information</h2>
     <c:url var="post_url"  value="/formHandle/addStudent" />
    <form:form method="post" action="${post_url}" >
        <table>
            <tr>
                <td><form:label path="name" >名字:</form:label></td>
                <td><form:input path="name" /></td>
            </tr>

            <tr>
                <td><form:label path="age" >年龄:</form:label></td>
                <td><form:input path="age" /></td>
            </tr>

            <tr>
                <td><form:label path="id" >编码:</form:label></td>
                <td><form:input path="id" /></td>
            </tr>

            <tr>
                <td colspan="2">
                    <input type="submit" value="提交表单" />
                </td>
            </tr>
        </table>
    </form:form>
</body>
</html>
