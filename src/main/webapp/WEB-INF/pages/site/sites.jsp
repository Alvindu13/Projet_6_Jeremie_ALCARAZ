<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Sites D'escalade</title>

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

            #ok{
                background: #b8daff;
                padding-top: 20px;
                padding-bottom: 15px;
            }

            #try{
                display: block;
                margin: auto;
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

    <div id = "ok" class = "row">
        <div id = "try" class="col-ls-8">
            <a class="btn btn-primary" href="${pageContext.request.contextPath}/addsite" role="button">Ajouter votre Site</a>
        </div>
    </div>

<div class ="container">
    <div class="row">
        <section class="col-sm-12">
            <h3 style = color:red >Pour plus d'informations sur un site, veuillez cliquer sur son nom</h3>
            <table class="table table-bordered table-striped table-condensed">
                <thead>
                <tr>
                    <th>Nom</th>
                    <th>Localisation</th>
                    <th>Description</th>
                    <th>Secteurs</th>
                    <th>Voies</th>
                    <th>Longueurs</th>
                </tr>
                </thead>
                <tbody>
                <c:set var="i" value="1" />
                <c:forEach items="${sites}" var="s">
                    <tr>
                        <td><a class="nav-link" href="${pageContext.request.contextPath}/site?siteId=${s.siteId}">${s.name}</td>
                        <td>${s.location}</td>
                        <td>${s.comment}</td>
                        <td>10</td>
                        <td>34</td>
                        <td>900 mètres</td>

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
