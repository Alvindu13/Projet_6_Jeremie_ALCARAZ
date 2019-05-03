<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE HTML>
<html>

<head>
    <meta charset="utf-8">
    <spring:url value="resources/css/bootstrap.min.css" var="bootstrap" />
    <link href="${bootstrap}" rel="stylesheet" />
</head>

<div class = "container">

    <nav class="navbar navbar-inverse">
        <div class="container-fluid">
            <ul class="nav navbar-nav">
                <li class="active"> <a href="#">Accueil</a> </li>
                <li><a href="${pageContext.request.contextPath}/welcome">Home</a> </li>
                <li><a href="${pageContext.request.contextPath}/userInfo">User Info</a> </li>
                <li><a href="${pageContext.request.contextPath}/admin">Admin</a> </li>
                <li> <c:if test="${pageContext.request.userPrincipal.name != null}">
                     <a href="${pageContext.request.contextPath}/logout">Logout</a>
                    </c:if>
                </li>

            </ul>
            <form class="navbar-form navbar-right inline-form">
                <div class="form-group">
                    <input type="search" class="input-sm form-control" placeholder="Recherche">
                    <button type="submit" class="btn btn-primary btn-sm"><span class="glyphicon glyphicon-eye-open"></span> Chercher</button>
                </div>
            </form>
        </div>
    </nav>
</div>