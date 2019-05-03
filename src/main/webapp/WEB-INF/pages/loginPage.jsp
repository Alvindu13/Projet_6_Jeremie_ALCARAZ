<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE HTML>
<html>

<head>
    <title>Login</title>
    <meta charset="utf-8">
    <spring:url value="resources/css/bootstrap.min.css" var="bootstrap" />
    <spring:url value="resources/css/loginForm.css" var="loginForm" />

    <script src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
    <script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>

    <link href="${bootstrap}" rel="stylesheet" />
    <link href="${loginForm}" rel="stylesheet" />

</head>

<body>
<jsp:include page="_menu.jsp" />

    <div class="wrapper fadeInDown">

        <div id="formContent">
            <!-- Icon
            <div class="fadeIn first">
                <img src="http://danielzawadzki.com/codepen/01/icon.svg" id="icon" alt="User Icon" />
            </div>-->

            <h3>Enter user name and password:</h3>

            <!-- /login?error=true -->
            <c:if test="${param.error == 'true'}">
                <div style="color:red;margin:10px 0px;">

                    Login Failed!!!<br />
                    Reason :  ${sessionScope["SPRING_SECURITY_LAST_EXCEPTION"].message}

                </div>
            </c:if>

            <div class="row">
                <section class="col-xs-12">
                    <!-- Login Form -->
                    <form name='f' action="${pageContext.request.contextPath}/j_spring_security_check" method='POST'>

                                <input type="text" id="login" class="fadeIn second" name="username" placeholder="username" value =''/>
                                <input type="password" id="password" class="fadeIn third" name="password" placeholder="password"/>
                                <input type="submit" class="fadeIn fourth"  name="submit" value="submit">
                    </form>

                    <!-- Remind Passowrd -->
                    <div id="formFooter">
                        <a class="underlineHover" href="#">Forgot Password?</a>
                    </div>
                </section>
            </div>
        </div>
    </div>

</body>
</html>