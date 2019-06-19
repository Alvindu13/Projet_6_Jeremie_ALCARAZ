<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE HTML>


<head>
    <meta charset="utf-8">
    <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" rel="stylesheet" />
</head>

<nav class="navbar navbar-icon-top navbar-expand-lg navbar-dark bg-dark">
    <a class="navbar-brand" href="#">GRAYSCALADE</a>
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
    </button>

    <div class="collapse navbar-collapse" id="navbarSupportedContent">
        <ul class="navbar-nav mr-auto">
            <li class="nav-item active">
                <a class="nav-link" href="${pageContext.request.contextPath}/welcome">
                    <!--<i class="fa fa-home"></i>-->
                    Home
                    <span class="sr-only">(current)</span>
                </a>
            </li>
            <li class="nav-item active">
                <a class="nav-link" href="${pageContext.request.contextPath}/userInfo">
                    <!--<i class="fa fa-user">
                        <span class="badge badge-danger">11</span
                    </i>-->
                    User Info
                </a>
            </li>
            <li class="nav-item active">
                <a class="nav-link" href="${pageContext.request.contextPath}/admin">
                    <!--<i class="fa fa-envelope-o">
                      <span class="badge badge-warning">11</span>
                    </i>-->
                    Admin
                </a>
            </li>


            <!-- Dropdown -->
            <li class="nav-item active dropdown">
                <a class="nav-link dropdown-toggle" href="#" id="navbardrop" data-toggle="dropdown">
                    Topos
                </a>
                <div class="dropdown-menu">
                    <a class="dropdown-item" href="${pageContext.request.contextPath}/topo?user=${pageContext.request.userPrincipal.name}">
                        <!-- <i class="fa fa-envelope-o">
                             <span class="badge badge-warning">11</span>
                        </i>-->
                        Liste de tous les topos
                    </a>

                    <a class="dropdown-item" href="${pageContext.request.contextPath}/reservetopo?user=${pageContext.request.userPrincipal.name}">
                        <!-- <i class="fa fa-envelope-o">
                             <span class="badge badge-warning">11</span>
                        </i>-->
                        Réserver un topo
                    </a>
                </div>
            </li>




            <li class="nav-item active">
                <a class="nav-link" href="${pageContext.request.contextPath}/multisearch">
                    <!-- <i class="fa fa-envelope-o">
                         <span class="badge badge-warning">11</span>
                    </i>-->
                    Chercher un Site
                </a>
            </li>



            <li class="nav-item">
                <c:if test="${pageContext.request.userPrincipal.name != null}">
                    <a class="nav-link" href="${pageContext.request.contextPath}/mytopo?user=${pageContext.request.userPrincipal.name}">
                        <!--<i class="fa fa-envelope-o">
                            <span class="badge badge-warning">11</span>
                        </i>-->
                        Mes topos
                    </a>
                </c:if>
            </li>

            <li class="nav-item">
                <c:if test="${pageContext.request.userPrincipal.name != null}">
                    <a class="nav-link" href="${pageContext.request.contextPath}/logout">
                        <!--<i class="fa fa-envelope-o">
                            <span class="badge badge-warning">11</span>
                        </i>-->
                        Logout
                    </a>
                </c:if>
            </li>

            <li class="nav-item active">
                <c:if test="${pageContext.request.userPrincipal.name == null}">
                <a class="nav-link" href="${pageContext.request.contextPath}/displayRegisterForm">
                        S'inscrire
                    </a>
                </c:if>

            </li>







            <!--<li class="nav-item dropdown">
                <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" dataOLD-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
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


        <form action = "search" method = "get" class="form-inline my-2 my-lg-0">
            <label Mot clé : ></label>
            <input class="form-control mr-sm-2" type="text" placeholder="Search" name="motCle" aria-label="Search">
            <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
        </form>


    </div>
</nav>