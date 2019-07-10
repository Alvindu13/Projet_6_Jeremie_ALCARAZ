<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Secteurs</title>

    <meta charset="utf-8">
    <spring:url value="resources/css/bootstrap.min.css" var="bootstrap" />
    <link href="${bootstrap}" rel="stylesheet" />
    <style type="text/css">
        body { background-color: #1c7430  ; }
        [class*="col"] { margin-bottom: 20px; }
        img { width: 100%; }
        .well {
            background-color:#CCC;
            padding: 20px;
        }

        .btn-primary, .btn-primary:hover, .btn-primary:active, .btn-primary:visited {
            background-color: #8064A2 !important;
        }

        .container{
            margin-top: 50px;
        }
    </style>
</head>

<body>
<jsp:include page="../_menu.jsp" />

<section>
    <div>
        <img class="img-responsive" src="resources/img/topo/aside.jpg" alt="AsideEscalade">
    </div>
</section>

<div class="container rounded border border-dark">
    <div class="text-center">
        <div class ="row justify-content-center align-content-center">
            <div class = "col-sm-8">
                <form class = "well">
                    <h4>Souhaitez-vous ajouter votre propre secteur ?</h4>
                    <fieldset>
                        <a href="${pageContext.request.contextPath}/addsector?siteId=${siteId}" class="btn btn-primary js-scroll-trigger">Ajouter votre secteur</a>
                    </fieldset>
                </form>
            </div>
        </div>
        <h2>Voici tous les secteurs disponibles pour le site sélectionné</h2>
        <div class="row">
            <section class="col-sm-12">
                <table class="table table-bordered table-striped table-condensed">
                    <thead>
                        <tr>
                            <th>name</th>
                        </tr>
                    </thead>
                    <tbody>
                        <c:set var="i" value="1" />
                        <c:forEach items="${sectors}" var="sect">
                            <tr>
                                <td> <a class="nav-link" href="${pageContext.request.contextPath}/way?sectorId=${sect.sectorId}"> ${sect.name} </td>
                            </tr>
                            <c:set var="i" value="${i+1}" />
                        </c:forEach>
                    </tbody>
                </table>
            </section>
        </div>
    </div>
</div>

</body>
</html>
