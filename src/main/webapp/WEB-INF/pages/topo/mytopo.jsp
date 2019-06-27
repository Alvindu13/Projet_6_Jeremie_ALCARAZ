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
        .share {
            margin-top: 10em;
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
        <h1>${pageContext.request.userPrincipal.name}</h1>
    </header>


    <div class = "row">
        <div class = col-lg-10>






                <table class="table">
                    <thead class="thead-dark">
                    <tr>
                        <th> Nom du topo</th>
                        <th> Propriétaire </th>
                        <th> Nature </th>
                        <th> Action </th>


                    </tr>
                    </thead>
                    <tbody>
                    <tr>
                        <c:forEach items="${topos}" var="t" varStatus="status">

                            <tr>
                                <td>${t.name}</td>
                                <td>${pageContext.request.userPrincipal.name}</td>
                                <c:if test="${t.reserve eq false}">
                                    <td>Topo publié</td>

                                    <form class="login-form" name ="f" action="mytopo?user=${pageContext.request.userPrincipal.name}" method="POST" modelAttribue="topo" >
                                        <c:if test="${!t.available}">
                                            <td><button  name = "submit" type="submit" class="btn btn-warning">PARTAGER</button></td>
                                        </c:if>
                                        <c:if test="${t.available eq true}">
                                            <td><button type="button" class="btn btn-secondary btn-lg" disabled>PARTAGER</button></td>
                                        </c:if>
                                    </form>

                                </c:if>



                                <c:if test="${t.reserve eq true}">
                                    <td>Topo emprunté</td>
                                    <td><button  name = "submit" type="submit" class="btn btn-warning">LIBERER</button></td>
                                </c:if>

                            </tr>

                        </c:forEach>
                    </tr>
                    </tbody>
                </table>








            <div>
                <section class = share>

                    <h2>Souhaitez-vous partagez un topo avec d'autres utilisateurs ? </h2>

                    <form class="login-form" name ="f" action="mytopo?user=${pageContext.request.userPrincipal.name}" method="POST" modelAttribue="topo" >
                        <input type="text" name='name' placeholder="nom du Topo"/>
                        <input type="submit" value="Partager"  />
                    </form>

                </section>

            </div>

        </div>

    </div>



</div>
</body>
</html>
