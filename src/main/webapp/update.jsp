<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/1/19
  Time: 16:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page isELIgnored="false" %>
<%@page pageEncoding="UTF-8" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="post" action="update.do">

    <table>

        <tr><td>学生ID</td>
            <td><input type="text" name="stuId" value=""></td>
        </tr>
        <tr><td>姓名</td>
            <td><input type="text" name="stuName" value=""></td>
        </tr>
        <tr><td>性别</td>
            <td><input type="radio" name="stuSex" value="男">男<input type="radio" name="stuSex" value="女">女</td>
        </tr>
        <tr><td>入学时间</td>
            <td><input type="text" name="stuHiredate" value=""></td>
        </tr>
          <tr><td><input type="submit" value="修改"></td></tr>
    </table>
</form>
</body>
</html>
