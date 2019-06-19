<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


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

        .table {
            border-radius: 5px;
            width: 50%;
            margin: 0px auto;
            float: none;
        }

        td{
            border: 1px solid #000;
            width: 100px;
        }
    </style>

</head>

<body>
<jsp:include page="../_menu.jsp" />


<section id = "test" class="row">
    <div class="col-xs-12 col-sm-12 col-md-12"><img src="resources/img/topo/aside.jpg" alt="AsideEscalade"></div>
</section>
<div id ="containeur">

    <header class="page-header text-center">
        <h1>Voici les résultats de votre recherche</h1>
    </header>

    <div class="row justify-content-center">
        <div class = col-lg-8 >
            <table class="table table-bordered table-striped table-sm table-hover thead-dark table-active  ">
                <thead class="thead-dark">
                <div class = "m-auto">
                    <tr>
                        <th> Nom du Topo </th>
                        <th> Nom du propriétaire </th>
                    </tr>
                </div>

                </thead>
                <tbody>
                <c:set var="i" value="1" />
                <c:forEach items="${topos}" var="t">
                    <tr>
                        <td>${t.name}</td>
                        <td>${t.utilisateur.userName}</td>
                    </tr>
                    <c:set var="i" value="${i+1}" />
                </c:forEach>
                </tbody>
            </table>
        </div>
    </div>


</div>

</body>
</html>
