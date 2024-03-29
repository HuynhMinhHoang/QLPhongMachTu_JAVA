<%-- 
    Document   : dangkylich
    Created on : Aug 19, 2023, 12:32:49 PM
    Author     : Asus
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<c:url value="/bacsi/dangkylichBS" var="actions"/>

<%--<c:if test="${err != null}">--%>
<!--<div class="alert1">-->
<!--{err}-->
<!--</div>-->
<%--</c:if>--%>

<main class="table table324234 table324234yt">

    <div>
        <section class="table__header table__header1515">
            <h3>LỊCH ĐĂNG KÝ</h3>
            <div id="current-time"></div>
        </section>


        <section class="table__body">
            <table>
                <thead>
                    <tr>
                        <th>ID</th>
                        <th>Họ tên</th>
                        <th>Chức vụ</th>
                        <th>Ca trực</th>
                        <th>Ngày đăng ký</th>
                        <th></th>
                        <!--                        <th>Trạng thái</th>-->
                        <!--<th></th>-->
                        <!--<th></th>-->
                    </tr>
                </thead>

                <tbody>
                    <c:forEach items="${listCTLT}" var="p" varStatus="status">
                        <%--<form:hidden path="idChiTietTgTruc" id="idChiTietTgTruc_${p.idChiTietTgTruc}"/>--%>
                        <%--<form:hidden path="ngayDkyTruc"/>--%>
                        <%--<form:hidden path="idTk"/>--%>
                        <%--<form:hidden path="idTgTruc"/>--%>
                        <tr>
                            <td>${p.idTk.idTk}</td>
                            <td>${p.idTk.hoTen}</td>
                            <td>${p.idTk.idRole.chucVu}</td>                     
                            <td>[${p.idChiTietTgTruc}] ${p.idTgTruc.buoiTruc} (${p.idTgTruc.batDau} - ${p.idTgTruc.ketThuc})</td>
                            <td> <fmt:formatDate value="${p.ngayDkyTruc}" pattern="EEEE, dd-MM-yyyy" /></td>


                            <c:choose>
                                <c:when test="${p.trangThaiTruc eq 1}">
                                    <td>
                                        <p id="xacnhan1"> Đã điểm danh</p>
                                    </td>
                                </c:when>
                                <c:otherwise>
                                    <td>
                                        <c:choose>
                                            <c:when test="${gioHienTai ge p.idTgTruc.batDau and gioHienTai le p.idTgTruc.ketThuc and ngayHienTai eq p.ngayDkyTruc  }">
                                                <input type="hidden" name="idChiTietTgTruc" id="idChiTietTgTruc" value="${p.idChiTietTgTruc}">                                     
                                                <button class="admin_submit111">
                                                    <a href="<c:url value="/bacsi/dangkylichBS/${p.idChiTietTgTruc}"/>">
                                                        Điểm danh
                                                    </a>
                                                </button>

                                            </c:when>
                                            <c:otherwise>
                                                <p id="xacnhan">Ngoài giờ điểm danh</p>
                                            </c:otherwise>
                                        </c:choose>
                                    </td>
                                </c:otherwise>
                            </c:choose>

                        </tr>
                    </c:forEach>
                </tbody>
            </table>
        </section>

    </div>

</main> 

<script>
    function displayCurrentTime() {
        var currentTime = new Date();

        var daysOfWeek = ["Chủ Nhật", "Thứ Hai", "Thứ Ba", "Thứ Tư", "Thứ Năm", "Thứ Sáu", "Thứ Bảy"];
        var dayOfWeek = daysOfWeek[currentTime.getDay()];

        var day = currentTime.getDate();
        var month = currentTime.getMonth() + 1; // Lưu ý: Tháng bắt đầu từ 0
        var year = currentTime.getFullYear();

        var hours = currentTime.getHours();
        var minutes = currentTime.getMinutes();
        var seconds = currentTime.getSeconds();

        var formattedTime = dayOfWeek + ", " + day + "-" + month + "-" + year + " " + hours + ":" + minutes + ":" + seconds;

        document.getElementById("current-time").textContent = formattedTime;
    }

    // Gọi hàm displayCurrentTime một lần khi trang được tải và sau đó mỗi giây
    displayCurrentTime();
    setInterval(displayCurrentTime, 1000);
</script>