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

    <h2>Mes topos</h2>

    <div class = "row">
        <div class = col-lg-10>
            <table class="table">
                <thead class="thead-dark">
                <tr>
                    <th> Nom du topo</th>
                    <th> Propriétaire </th>
                </tr>
                </thead>
                <tbody>
                <tr>
                    <c:forEach items="${topos}" var="t" varStatus="status">
                    <tr>
                        <td>${t.name}</td>
                        <td>${pageContext.request.userPrincipal.name}</td>

                </tr>
                    </c:forEach>


                </tr>
                </tbody>
            </table>

            <h2>Les topos que j'aies réservés</h2>





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
