<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2024-05-03
  Time: 오후 3:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<link href="<c:url value='/resources/css/include/header.css' />" rel="stylesheet" type="text/css">
<script src="https://code.jquery.com/jquery-3.6.3.js" integrity="sha256-nQLuAZGRRcILA+6dMBOvcRh5Pe310sBpanc6+QBmyVM=" crossorigin="anonymous"></script>
<script type="text/javascript"></script>

<header>
    <div id="header_wrap">
        <div class="menu">
            <ul>
                <li><a class="user" href="<c:url value='/' />">User Home </a></li>
                <li><a class="admin" href="<c:url value='/admin' />">ADMIN HOME</a></li>
            </ul>
        </div>
    </div>
</header>
