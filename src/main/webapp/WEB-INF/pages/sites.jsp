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
            nav{
                display: inline-block;
                width: 100%;
            }
        </style>
    </head>

    <body>
    <jsp:include page="_menu.jsp" />

    <div class="container">
        <header class="page-header">
            <h1>Tous les sites d'escalade</h1>
            <!--Barre de recherche-->
            <div id = "search"></div>
        </header>



        <section id = "sites">
                <c:set var="i" value="1" />
                <c:forEach items="${sites}" var="t">
                <ul>
                    <li class="resultats-listeStations even first">
                        <div class="localisationStationListe">
                            <h3 class="nomStationListe"><a ref="#" href="site-escalade-ablon">Ablon</a></h3>
                            <div class="massifListe">France</div>      <div class="massifListe">Haute-Savoie</div>
                        </div>
                        <div class="thumbs-stations"> <a ref="#" href="site-escalade-ablon"> <img src="media/guide_falaises/sites/marc_daviet_ablon__crop_315x200.jpg" alt="marc daviet ablon" title="marc daviet ablon" width="315" height="200"/></a>		  </div>
                            <div class="results-right">
                                <div class="infosStations">
                                    <span class="value"><span>80 m</span> de hauteur</span>
                                    <span><span class="value">Orientation <span>Sud-Est</span></span></span>
                                    <span class="value"><span>400 voies</span> de <span>4b</span> à <span>8b</span> </span>
                                </div>
                                <!-- <div class="btn-compListeStations"><a href="#" class="multiPageViewerAddToCartButton" data-mpv-id="falaises">Je compare</a></div>-->
                            </div>
                    </li>
                </ul>
                <c:set var="i" value="${i+1}" />
                </c:forEach>
        </section>
    </div>
    </body>
</html>
