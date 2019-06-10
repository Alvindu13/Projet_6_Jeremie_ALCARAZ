<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>



<!DOCTYPE HTML>
<html>

<head>
    <title>Nos Topos</title>

    <meta charset="utf-8">

    <script src="//ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>
    <script src="//netdna.bootstrapcdn.com/bootstrap/3.1.1/js/bootstrap.min.js"></script>
    <link rel="stylesheet" type="text/css" href="//netdna.bootstrapcdn.com/bootstrap/3.1.1/css/bootstrap.min.css">

    <script type="text/javascript">
        $(document).ready(function() {
            $('dropdown-toggle').dropdown()
        });
    </script>




    <style type="text/css">
        body { background-color: #1c7430  ; }

        [class*="col"]

        { margin-bottom: 20px; }
        img { width: 100%; }


        /* Taille normale des titres sur un ordinateur */
        h1 {
            font-size: 5em;
        }
        /* Si on utilise un petit écran (que ce soit avec un ordinateur dans une petite fenêtre ou avec un smartphone), les titres sont réduits */
        @media only screen and (max-width: 320px) {
            h1 {
                font-size: 3em;
            }
        }


    </style>

</head>

<body>
<jsp:include page="../_menu.jsp" />
<section id = "test" class="row">
    <div class="col-xs-12 col-sm-12 col-md-12"><img src="resources/img/topo/aside.jpg" alt="AsideEscalade"></div>
</section>

<div class ="container">


    <div class="card">
        <div class="card-header">
            <div class="card">
                <div class="card-header">
                    Recherche ton site de grimpe
                </div>
                <div class="card-body">
                    <form class="login-form" name ="f" action="multisearch" method='POST' modelAttribute="searcher">

                        <div class = row >

                            <div class="form-group col-md-3">
                                <label for="inputState">Lieu</label>
                                <select id="inputState" class="form-control" name = 'location'>
                                    <option selected>Choose...</option>
                                    <option>Marseille</option>
                                    <option>Paris</option>
                                    <option>Grenoble</option>
                                </select>
                            </div>


                            <div class="form-group col-md-2">
                                <label for="inputState">Cotation Minimum</label>
                                <select id="inputState2" class="form-control" name = 'cotationMinimum'>
                                    <option selected>Choose...</option>
                                    <option>4A</option>
                                    <option>4B</option>
                                    <option>4C</option>
                                    <option>4D</option>
                                    <option>4E</option>
                                    <option>5A</option>
                                    <option>5B</option>
                                    <option>5C</option>
                                </select>
                            </div>

                            <div class="form-group col-md-2">
                                <label for="inputState">Cotation Maximum</label>
                                <select id="inputState5" class="form-control" name = 'cotationMaximum'>
                                    <option selected>Choose...</option>
                                    <option>4A</option>
                                    <option>4B</option>
                                    <option>4C</option>
                                    <option>4D</option>
                                    <option>4E</option>
                                    <option>5A</option>
                                    <option>5B</option>
                                    <option>5C</option>
                                    <option>6A</option>
                                    <option>6N</option>
                                    <option>6C</option>
                                    <option>7A</option>
                                    <option>7B</option>
                                    <option>7C</option>
                                    <option>7D</option>
                                </select>
                            </div>

                            <div class="form-group col-md-3">
                                <label for="inputState">Quantité secteur</label>
                                <select id="inputState3" class="form-control" name = 'nbSecteur'>
                                    <option selected>Choose...</option>
                                    <option>1</option>
                                    <option>2</option>
                                    <option>3</option>
                                    <option>4</option>
                                    <option>5</option>
                                    <option>6</option>
                                    <option>7</option>
                                    <option>8</option>
                                    <option>9</option>
                                    <option>10</option>

                                </select>
                            </div>

                            <button type="submit" class="btn btn-primary">Submit</button>

                        </div>


                        <table class="table table-bordered table-striped table-condensed">

                            <thead>
                            <tr>
                                <th>Location</th>
                                <th>Cotation Minimum</th>
                                <th>Cotation Maximum</th>
                                <th>nbSecteur</th>
                                <!--<th>Nombre de Site</th>
                               <th>Nombre de Secteurs</th>

                               <th>Disponibilité</th>-->

                            </tr>
                            </thead>
                            <tbody>
                            <c:set var="i" value="1" />
                            <c:forEach items="${test}" var="s">
                                <tr>
                                    <td>${s.location}</td>
                                    <td>${s.cotationMinimum}</td>
                                    <td>${s.cotationMaximum}</td>
                                    <td>${s.nbSector}</td>

                                    <!--<td>{t.available}</td>-->

                                </tr>
                                <c:set var="i" value="${i+1}" />
                            </c:forEach>
                            </tbody>

                        </table>


                    </form>
                </div>
    </div>
</div>
</body>
</html>

