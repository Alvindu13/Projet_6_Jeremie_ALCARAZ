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

<div class ="container">
    <div class="row">
        <section class="col-sm-12">
            <h2>Voici toutes les voies disponibles et leurs informations pour ce secteur</h2>
            <table class="table table-bordered table-striped table-condensed">
                <thead>
                <tr>
                    <th>name</th>
                    <th>size</th>

                    <th>nbPoints</th>
                    <th>cotation</th>
                    <th>nbPart</th>
                </tr>
                </thead>
                <tbody>
                <c:set var="i" value="1" />
                <c:forEach items="${way}" var="w">
                    <tr>
                        <td>${w.name}</td>
                        <td>${w.size}</td>
                        <td>${w.nbPoints}</td>
                        <td>${w.cotation}</td>
                        <td>${w.nbPart}</td>
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
