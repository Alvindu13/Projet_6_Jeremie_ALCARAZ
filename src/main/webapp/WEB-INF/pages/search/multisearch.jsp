<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>



<!DOCTYPE HTML>
<html>

<head>
    <title>Nos Topos</title>

    <meta charset="utf-8">
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>

    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">


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
                                <select id="inputState" class="form-control" name = 'location' required = 'true'>
                                    <option selected>Choose...</option>
                                    <option>Marseille</option>
                                    <option>Paris</option>
                                    <option>Grenoble</option>
                                </select>
                            </div>


                            <div class="form-group col-md-2">
                                <label for="inputState">Cotation Minimum</label>
                                <select id="inputState2" class="form-control" name = 'cotationMinimum' required = 'true'>
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
                                <select id="inputState5" class="form-control" name = 'cotationMaximum' required = 'true'>
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
                                    <option>6B</option>
                                    <option>6C</option>
                                    <option>7A</option>
                                    <option>7B</option>
                                    <option>7C</option>
                                    <option>7D</option>
                                </select>
                            </div>
                            <!--
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
                            </div>-->

                            <button type="submit" class="btn btn-primary">Submit</button>

                        </div>


                    </form>
                </div>
    </div>
</div>
</body>
</html>

