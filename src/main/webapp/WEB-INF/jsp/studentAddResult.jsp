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
                <td>${student.name}</td>
            </tr>

            <tr>
                <td>年龄:</td>
                <td>${student.age}</td>
            </tr>

            <tr>
                <td>密码:</td>
                <td>${student.password}</td>
            </tr>
            <tr>
                <td>地址:</td>
                <td>${student.address}</td>
            </tr>

            <tr>
                <td>是否男生:</td>
                <td>${student.male}</td>
            </tr>

            <tr>
                <td>喜欢的框架:</td>
                <td>
                    <c:forEach items="${student.faveriteFrameworks}" var="framework">
                        <c:out value="${framework}" />
                    </c:forEach>
                </td>
            </tr>

            <tr>
                <td>性别:</td>
                <td>${(student.gender == "M" ? "男" : "女" )}</td>
            </tr>

            <tr>
                <td>喜欢的数字:</td>
                <td>${student.favoriteNumber}</td>
            </tr>

            <tr>
                <td>国家:</td>
                <td>
                    <c:forEach items="${student.countries}" var="country">
                        <span><c:out value="${country.key}" /></span>
                        <span><c:out value="${country.value}" /></span>
                    </c:forEach>
                <%--<td>${countries[0].briefName}</td>--%>
                </td>
            </tr>

            <tr>
                <td>技能:</td>
                <td>
                    <c:forEach items="${student.skills}" var="skill">
                        <c:out value="${skill}" />
                    </c:forEach>
                </td>
            </tr>

            <tr>
                <td>编码:</td>
                <td>${student.id}</td>
            </tr>
            <tr>
                <td>上传文件:</td>
                <td>${fileName}</td>
            </tr>
            <%--<tr>--%>
                <%--<td>--%>
                    <%--CNTRY:--%>
                <%--</td>--%>
                <%--<td>--%>
                    <%--<c:forEach items="${cntrys}" var="cntry">--%>
                        <%--<c:out value="${cntry}"></c:out>--%>
                    <%--</c:forEach>--%>
                <%--</td>--%>
            <%--</tr>--%>


        </table>
</body>
</html>
