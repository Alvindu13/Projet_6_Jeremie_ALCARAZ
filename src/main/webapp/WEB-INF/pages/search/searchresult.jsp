<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>

<!DOCTYPE HTML>
<html>

<head>
    <title>Nos Topos</title>

    <meta charset="utf-8">
    <spring:url value="resources/css/bootstrap.min.css" var="bootstrap" />

    <link href="${bootstrap}" rel="stylesheet" />

    <script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>



    <style type="text/css">
        body { background-color: #1c7430  ; }
        [class*="col"] { margin-bottom: 20px; }
        img { width: 100%; }
        .well {
            background-color:#CCC;
            padding: 20px;
        }
    </style>

</head>

<body>
<jsp:include page="../_menu.jsp" />


<section id = "test" class="row">
    <div class="col-xs-12 col-sm-12 col-md-12"><img src="resources/img/topo/aside.jpg" alt="AsideEscalade"></div>
</section>
<div class="container">
    <header class="page-header">
        <h1>Voici les résultats de votre recherche</h1>
    </header>

    <div class="row">
        <section class="col-sm-12">


            <table class="table table-bordered table-striped table-condensed">

                <thead>
                <tr>
                    <th> Nom du Site </th>

                    <th> Localisation </th>

                    <th>nb de Secteur</th>
                    <!--<th>Nombre de Site</th>
                   <th>Nombre de Secteurs</th>

                   <th>Disponibilité</th>-->

                </tr>
                </thead>
                <tbody>
                <c:set var="i" value="1" />
                <c:forEach items="${sites}" var="s">
                    <tr>
                        <td>${s.name}</td>

                        <td>${s.location}</td>

                        <td>${s.nbSector}</td>

                        <!--<td>{t.available}</td>-->

                    </tr>
                    <c:set var="i" value="${i+1}" />
                </c:forEach>
                </tbody>

            </table>



        </section>

        <section class="col-sm-12">
            <table class="table table-bordered table-striped table-condensed">

                <thead>
                <tr>
                    <th> Nom du Site </th>

                    <th> Localisation </th>

                    <th>nb de Secteur</th>
                    <!--<th>Nombre de Site</th>
                   <th>Nombre de Secteurs</th>

                   <th>Disponibilité</th>-->

                </tr>
                </thead>
                <tbody>
                <c:set var="i" value="1" />
                <c:forEach items="${voies}" var="v">
                    <tr>
                        <td>${v.name}</td>

                        <td>${v.cotation}</td>


                        <!--<td>{t.available}</td>-->

                    </tr>
                    <c:set var="i" value="${i+1}" />
                </c:forEach>
                </tbody>

            </table>



        </section>

    </div>

</div>
</body>
</html>
