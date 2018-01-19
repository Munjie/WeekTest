<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@page pageEncoding="UTF-8" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/1/19
  Time: 16:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<form>
    <table>

        <tr>
         <td>学生ID</td>
            <td>学生姓名</td>
            <td>性别</td>
            <td>入学时间</td>
            <td>操作</td>
        </tr>
        <c:forEach items="${student}" var="stu">
        <tr>
            <td>${stu.stuId}</td>
            <td>${stu.stuName}</td>
            <td>${stu.stuSex}</td>
            <td><fmt:formatDate value="${stu.stuHiredate}" pattern="yyyy-MM-dd"></fmt:formatDate></td>
            <td><a href="update.jsp">修改</a></td>
        </tr>
        </c:forEach>
    </table>


</form>






</body>
</html>
