<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
        <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
        <script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
        <script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
        <link rel="stylesheet" href="css/login.css">
    </head>
    <body>
        <div class="wrapper fadeInDown">
            <div id="formContent">
                <!-- Tabs Titles -->

                <!-- Icon -->
                <div class="fadeIn first">
                    <img src="https://www.b-cube.in/wp-content/uploads/2014/05/aditya-300x177.jpg" id="icon" alt="User Icon" />
                    <h1>Aditya News</h1>
                </div>

                <!-- Login Form -->
                <form action="login", method="post">
                    <input type="text" id="login" class="fadeIn second" name="phone" placeholder="phone number">
                    <input type="password" id="password" class="fadeIn third" name="pass" placeholder="password">
                    <c:if test="${not empty requestScope.mess}">
                        <div class="alert alert-danger">${requestScope.mess}</div>
                    </c:if>
                    <input type="submit" class="fadeIn fourth" value="Log In">
                </form>

                <!-- Remind Passowrd -->
                <div id="formFooter">
                    <a class="underlineHover" href="#">Forgot Password</a>
                </div>

            </div>
        </div>
    </body>
</html>
