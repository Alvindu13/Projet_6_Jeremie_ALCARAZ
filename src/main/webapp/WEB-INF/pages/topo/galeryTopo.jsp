<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE HTML>
<html>

<head>
    <title>Nos Topos</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css"
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
        <h1>Les topos du coin</h1>
    </header>
    <section class="row">
        <div class="col-xs-12">
            <p>
                Je suis passionné par <strong>l'escalade</strong> depuis très longtemps. Ce site a été construit <em>  pour les grimpeurs...</em><br>
                Vous trouverez sur ce site des topos d'escalade pouvant être réservés par les membres enregistrés.<br>
                Vous avez également un espace d'échange sur notre forum.<br>
                Vous pouvez commenter les topos afin que chacun puisse améliorer ses topos et les rendre les plus qualitatifs possibles.
            </p>
        </div>
    </section>

    <div class="row">
        <section class="col-sm-12">


            <table class="table table-bordered table-striped table-condensed">

                <thead>
                <tr>
                    <th>Nom</th>
                    <th>Propriétaire</th>
                    <th>Descriptif PDF du Topo</th>



                </tr>
                </thead>
                <tbody>
                    <c:set var="i" value="1" />
                    <c:forEach items="${topos}" var="t">
                        <tr>
                            <td><a class="nav-link" href="${pageContext.request.contextPath}/sites?topoId=${t.topoId}&user=${pageContext.request.userPrincipal.name}">${t.name}</td>
                            <td>${t.utilisateur.userName}</td>

                            <td>
                                <a class="btn btn-primary" href="${pageContext.request.contextPath}/download" role="button">Télécharger
                                    <i class="fa fa-file" style="font-size:48px;color:red"></i>
                                </a>
                            </td>


                        </tr>
                    <c:set var="i" value="${i+1}" />
                    </c:forEach>
                </tbody>

            </table>



        </section>
    </div>


    <div class ="row">
        <section class = "col-sm-8">
            <form class = "well">
                <h4>Souhaitez-vous ajouter votre propre Topo ?</h4>
                <fieldset>
                    <a href="${pageContext.request.contextPath}/atopo?user=${pageContext.request.userPrincipal.name}" class="btn btn-primary js-scroll-trigger">Afficher le formulaire</a>
                </fieldset>
            </form>
        </section>
    </div>
</div>
</body>
</html>
