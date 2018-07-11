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
<style>
    .error {
        color: #ff0000;
    }

    .errorStyle {
        color: #000;
        background-color: #ffEEEE;
        border: 3px solid #ff0000;
        padding: 8px;
        margin: 16px;
    }
</style>
<body>
     <h2>Student Information</h2>
     <c:url var="post_url"  value="/formHandle/addStudent" />
    <form:form method="post" action="${post_url}" enctype="multipart/form-data">
        <table>
            <tr>
                <td>错误:</td>

                <td><form:errors path="*" cssClass="errorStyle" element="div" /></td>
            </tr>

            <tr>
                <td><form:label path="name" >名字:</form:label></td>

                <td><form:input path="name" /></td>
            </tr>

            <tr>
                <td><form:label path="age" >年龄:</form:label></td>
                <td><form:input path="age" /></td>
            </tr>

            <tr>
                <td><form:label path="password" >密码:</form:label></td>
                <td><form:password path="password" /></td>
            </tr>

            <tr>
                <td><form:label path="address" >地址:</form:label></td>
                <td><form:textarea path="address" /></td>
            </tr>

            <tr>
                <td><form:label path="male" >是否男生:</form:label></td>
                <td><form:checkbox path="male" /></td>
            </tr>

            <tr>
                <td><form:label path="faveriteFrameworks" >喜欢的框架:</form:label></td>
                <td>
                    <form:checkboxes path="faveriteFrameworks" items="${webFrameworkList}"/>
                </td>
            </tr>

            <tr>
                <td><form:label path="gender" >性别:</form:label></td>
                <td>
                    <form:radiobutton path="gender" value="M" label="男"/>
                    <form:radiobutton path="gender" value="F" label="女"/>
                </td>
            </tr>

            <tr>
                <td><form:label path="favoriteNumber" >喜欢的数字:</form:label></td>
                <td><form:radiobuttons path="favoriteNumber" items="${numbersList}"/></td>
            </tr>

            <tr>
                <td><form:label path="countries[CH]" >国家:</form:label></td>
                <%--<td><form:select path="country" items="${countriesList}"/></td>--%>
                <%--<td>--%>
                    <%--<form:select path="country.briefName">--%>
                        <%--<form:options items="${countriesMap}"/>--%>
                    <%--</form:select>--%>
                <%--</td>--%>

                <td>
                    <%--<form:select path="country.briefName" id="country"  items="${countryEntitiesList}" itemLabel="name" itemValue="briefName"/>--%>
                <form:select path="countries[CH]" multiple="true">
                    <form:options items="${countryEntitiesList}"  itemLabel="name" itemValue="briefName"/>
                </form:select>
                </td>

            </tr>

            <tr>
                <td><form:label path="id" >编码:</form:label></td>
                <td><form:input path="id" /></td>
            </tr>

            <tr>
                <td>文件上传:</td>
                <td><input type="file" name="file" id="file"></td>
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
