<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home</title>
    </head>
    <body>
        <jsp:include page="headerFooter/homeMenu.jsp"/>
        <h1>
            Xin chào <span>${sessionScope.account.name}</span>
        </h1>
        <h1>Chúc bạn một ngày tốt lành!</h1>
    </body>
</html>
