<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>

<!DOCTYPE HTML>
<html>

<head>
    <title>Nos Topos</title>

    <meta charset="utf-8">

    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">



    <style type="text/css">
        body { background-color: #1c7430  ; }
        [class*="col"] { margin-bottom: 20px; }
        img { width: 100%; }
        .well {
            background-color:#CCC;
            padding: 20px;
        }
        .tableaux{
            display:inline-block;
            vertical-align:top;
        }
    </style>

</head>

<body>
<jsp:include page="../_menu.jsp" />


<section id = "test" class="row">
    <div class="col-xs-12 col-sm-12 col-md-12"><img src="resources/img/topo/aside.jpg" alt="AsideEscalade"></div>
</section>
<div id ="containeur">
    <header class="page-header">
        <h1>Voici les résultats de votre recherche</h1>
    </header>

    <div class = "row">
        <div class = col-lg-5>
            <table class="table">
                <thead class="thead-dark">
                <tr>
                    <th> Nom du Site </th>
                    <th> Localisation </th>
                </tr>
                </thead>
                <tbody>
                <tr>
                    <c:forEach items="${sites}" var="s" varStatus="status">
                <tr>
                    <td>${s.name}</td>
                    <td>${s.location}</td>
                </tr>
                </c:forEach>
                </tr>
                </tbody>
            </table>
        </div>

        <div class = col-lg-2>

            <table class="table">
                <thead class="thead-dark">
                <tr>
                    <th scope="col">#</th>
                    <th>Cotation</th>
                </tr>
                </thead>
                <tbody>
                <c:forEach items="${voies}" var="v" varStatus="loop">
                    <tr>
                        <td>${v.cotation}</td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </div>

    </div>


</div>
</body>
</html>
