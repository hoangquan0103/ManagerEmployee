<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
  <title>Bảng quản lý nhân sự</title>
</head>
<body>
    <div>
        <jsp:include page="headerFooter/homeMenu.jsp"/>
    </div>
    <table>
        <caption>Danh sách nhân viên</caption>
        <h2><a href="add.jsp">Add New</a></h2>
        <thead>
            <tr>
                <th>STT</th>
                <th>Mã Nhân viên</th>
                <th>Họ Và Tên</th>
                <th>Phòng Ban</th>
                <th>Chức vụ</th>
                <th>Trình độ học vấn</th>
                <th>Ngày vào</th>
                <th>Ngày nghỉ</th>
                <th>Hệ số lương</th>
                <th>Số điện thoại</th>
                <th>Thẻ căn cước</th>
                <th>Ghi chú</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${list}" varStatus="loop" var="e" >
                <tr>
                    <td>${loop.index}</td>
                    <td>${e.employeeId}</td>
                    <td>${e.name}</td>
                    <td>${e.dpmId.getDepartName()}</td>
                    <td>${e.pstId.getPosiName()}</td>
                    <td>${e.lvId.getLevelName()}</td>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td>${e.phone}</td>
                    <td>${e.idCard}</td>
                    <td>
                        <a class="edit" title="Edit" data-toggle="tooltip"><i class="material-icons">&#xE254;</i></a>
                        <a class="delete" title="Delete" data-toggle="tooltip"><i class="material-icons">&#xE872;</i></a>
                    </td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>
</html>