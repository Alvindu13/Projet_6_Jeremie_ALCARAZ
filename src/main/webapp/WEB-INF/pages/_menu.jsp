<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>


<!DOCTYPE HTML>


<head>
    <meta charset="utf-8">
    <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" rel="stylesheet" />
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
</head>

<div>

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


                <!-- Dropdown -->
                <li class="nav-item active dropdown">
                    <a class="nav-link dropdown-toggle" href="#" id="navbardrop" data-toggle="dropdown">
                        Topos
                    </a>
                    <div class="dropdown-menu">
                        <a class="dropdown-item" href="${pageContext.request.contextPath}/topo?user=${pageContext.request.userPrincipal.name}"> Liste de tous les topos </a>
                        <a class="dropdown-item" href="${pageContext.request.contextPath}/displaytopoavailable?user=${pageContext.request.userPrincipal.name}">Réserver un topo</a>
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

                <li class="nav-item active">
                    <c:if test="${pageContext.request.userPrincipal.name == null}">
                        <a class="nav-link" href="${pageContext.request.contextPath}/login">
                            Se connecter
                        </a>
                    </c:if>

                </li>

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
            </ul>


            <form action = "search" method = "get" class="form-inline my-2 my-lg-0">
                <label Mot clé : ></label>
                <input class="form-control mr-sm-2" type="text" placeholder="Search" name="motCle" aria-label="Search">
                <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
            </form>


        </div>
    </nav>

</div>
