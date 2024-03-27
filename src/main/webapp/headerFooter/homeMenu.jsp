<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home Menu</title>
    </head>
    <body>
        <a href="home.jsp">Trang chủ</a>
        &nbsp;&nbsp;&nbsp;
        ||
        &nbsp;&nbsp;&nbsp;
        <a href="manager">Quản lý nhân viên</a>
        &nbsp;&nbsp;&nbsp;
        ||
        &nbsp;&nbsp;&nbsp;
        <a href="info">Thông tin cá nhân</a>
        &nbsp;&nbsp;&nbsp;
        ||
        &nbsp;&nbsp;&nbsp;
        <c:if test="${sessionScope.account != null}">
            <span> Xin chào ${sessionScope.account.name}</span>
            &nbsp;&nbsp;&nbsp;
            ||
            &nbsp;&nbsp;&nbsp;
            <a href="login.jsp">Logout</a>
            &nbsp;&nbsp;&nbsp;
            ||
        </c:if>
        &nbsp;&nbsp;&nbsp;
        <c:if test="${sessionScope.account == null}">
            <a href="login.jsp">Login</a>
        </c:if>
    </body>
</html>
