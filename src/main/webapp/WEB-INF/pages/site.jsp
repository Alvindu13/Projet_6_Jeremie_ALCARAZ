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

            #conteneur
            {
                display: flex;
                justify-content: center;
            }




        </style>


    </head>

    <body>
    <jsp:include page="_menu.jsp" />

    <div id = "ok" class = "row">
        <div id = "try" class="col-ls-8">
            <a class="btn btn-primary" href="${pageContext.request.contextPath}/addsite" role="button">Ajouter votre Site</a>
        </div>
    </div>

    <div id = "conteneur" class = "container-fluid">

        <div class = "row">
                <c:set var="i" value="1" />
                <c:forEach items="${sites}" var="s">
                    <div class="col-lg-5 col-lg-offset-2 col-md-6 col-sm-6 align-self-center">
                        <ul>
                            <li class="resultats-listeStations even first">
                                <div class="localisationStationListe">
                                    <h3 class="nomStationListe">
                                        <a ref="#" href="site-escalade-ablon">
                                                <c:out value="${s.name}"/>
                                    </h3>
                                    <div class="massifListe">
                                        <c:out value="${s.location}"/>
                                    </div>

                                        <!--<div class="massifListe">Haute-Savoie</div>-->
                                </div>

                                <c:forEach items="${images}" var = "img" begin="${i}" end="${i}">
                                    <div class="thumbs-stations">
                                            <img src="data:image/jpeg;base64,${img.imgDataS}" alt="marc daviet ablon" title="marc daviet ablon" width="315" height="200"/></a>
                                    </div>
                                </c:forEach>

                                <div class="results-right">
                                    <div class="infosStations">
                                        <span class="value"><span>80 m</span> de hauteur</span>
                                        <span><span class="value">Orientation <span>Sud-Est</span></span></span>
                                        <span class="value"><span>400 voies</span> de <span>4b</span> à <span>8b</span> </span>
                                    </div>
                                        <!-- <div class="btn-compListeStations"><a href="#" class="multiPageViewerAddToCartButton" dataOLD-mpv-id="falaises">Je compare</a></div>-->
                                </div>
                                <p>
                                    <strong>Description du site :</strong>  <c:out value="${s.comment}"/>
                                </p>
                            </li>
                        </ul>
                    </div>
                <c:set var="i" value="${i+1}" />
                </c:forEach>
            </section>
        </div>
    </div>

    </body>
</html>
