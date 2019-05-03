<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE HTML>
<html>

<head>
    <meta charset="utf-8">
    <spring:url value="resources/css/bootstrap.min.css" var="bootstrap" />
    <link href="${bootstrap}" rel="stylesheet" />
    <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
    <script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
    <script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
</head>

<nav class="navbar navbar-icon-top navbar-expand-lg navbar-dark bg-dark">
    <a class="navbar-brand" href="#">Navbar</a>
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
    </button>

    <div class="collapse navbar-collapse" id="navbarSupportedContent">
        <ul class="navbar-nav mr-auto">
            <li class="nav-item active">
                <a class="nav-link" href="${pageContext.request.contextPath}/welcome">
                    <i class="fa fa-home"></i>
                    Home
                    <span class="sr-only">(current)</span>
                </a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="${pageContext.request.contextPath}/userInfo">
                    <i class="fa fa-user">
                        <!--<span class="badge badge-danger">11</span>-->
                    </i>
                    User Info
                </a>
            </li>
            <li class="nav-item">
                <a class="nav-link disabled" href="${pageContext.request.contextPath}/admin">
                    <i class="fa fa-envelope-o">
                        <!--<span class="badge badge-warning">11</span>-->
                    </i>
                    Admin
                </a>
            </li>
            <li class="nav-item">
                <c:if test="${pageContext.request.userPrincipal.name != null}">
                    <a class="nav-link disabled" href="${pageContext.request.contextPath}/logout">
                        <i class="fa fa-envelope-o">
                            <!--<span class="badge badge-warning">11</span>-->
                        </i>
                        Logout
                    </a>
                </c:if>
            </li>






            <!--<li class="nav-item dropdown">
                <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                    <i class="fa fa-envelope-o">
                        <span class="badge badge-primary">11</span>
                    </i>
                    Dropdown
                </a>
                <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                    <a class="dropdown-item" href="#">Action</a>
                    <a class="dropdown-item" href="#">Another action</a>
                    <div class="dropdown-divider"></div>
                    <a class="dropdown-item" href="#">Something else here</a>
                </div>

            </li>-->
        </ul>
        <ul class="navbar-nav ">
            <li class="nav-item">
                <a class="nav-link" href="#">
                    <i class="fa fa-envelope-o">
                        <span class="badge badge-info">11</span>
                    </i>
                    Test
                </a>
            </li>
           <!-- <li class="nav-item">
                <a class="nav-link" href="#">
                    <i class="fa fa-globe">
                        <span class="badge badge-success">11</span>
                    </i>
                    Test
                </a>
            </li>-->
        </ul>
        <form class="form-inline my-2 my-lg-0">
            <input class="form-control mr-sm-2" type="text" placeholder="Search" aria-label="Search">
            <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
        </form>
    </div>
</nav>