<%-- 
    Document   : add
    Created on : Mar 26, 2024, 10:37:59 AM
    Author     : Hoang Quan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add New Employee</title>
    </head>
    <body>
        <h1>Thêm mới một nhân viên</h1>
        <form>
            Mời nhập tên:<input type="text" name="name"/><br/>
            Mời nhập SĐT:<input type="number" name="phone" /><br/>
            Mời nhập Mật khẩu:<input type="text" name="pass"/><br/>
            Mời nhập role:<input type="text" name="role"/><br/>
<!--            Nhập ảnh            -->
            <input type="submit" value="Lưu"/>
        </form>
    </body>
</html>
