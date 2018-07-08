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
     <h2>directBinding Information commited</h2>
        <table>
            <tr>
                <td>名字:</td>
                <td>${name}</td>
            </tr>

            <tr>
                <td>STUDENT名字:</td>
                <td>${student.name}</td>
            </tr>

            <tr>
                <td>年龄:</td>
                <td>${accurateAge}</td>
            </tr>

            <tr>
                <td>密码:</td>
                <td>${password}</td>
            </tr>
            <tr>
                <td>地址:</td>
                <td>${address}</td>
            </tr>

            <tr>
                <td>是否男生:</td>
                <td>${male}</td>
            </tr>

            <tr>
                <td>喜欢的框架:</td>
                <td>
                    <c:forEach items="${faveriteFrameworks}" var="framework">
                        <c:out value="${framework}" />
                    </c:forEach>
                </td>
            </tr>



            <%--<tr>--%>
                <%--<td>性别:</td>--%>
                <%--<td>${(gender == "M" ? "男" : "女" )}</td>--%>
            <%--</tr>--%>

            <%--<tr>--%>
                <%--<td>喜欢的数字:</td>--%>
                <%--<td>${faveriteNumber}</td>--%>
            <%--</tr>--%>

            <%--<tr>--%>
                <%--<td>国家:</td>--%>
                <%--<td>--%>
                    <%--<c:forEach items="${countries}" var="country">--%>
                        <%--<c:out value="${country.briefName}" />--%>
                    <%--</c:forEach>--%>
                <%--&lt;%&ndash;<td>${countries[0].briefName}</td>&ndash;%&gt;--%>
                <%--</td>--%>
            <%--</tr>--%>


            <%--<tr>--%>
                <%--<td>编码:</td>--%>
                <%--<td>${id}</td>--%>
            <%--</tr>--%>


        </table>
</body>
</html>
