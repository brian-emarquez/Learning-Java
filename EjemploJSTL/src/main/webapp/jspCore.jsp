<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSTL Core</title>
    </head>
    <body>
        <h1>JSTL( Jsp Stantand Tag Library) Core</h1>
        <!<!-- Manipulacion de variables -->
        <!<!-- Se define la variable -->

        <c:set var="nombre" value="Brian" />
        <!<!-- Desplegamosel valor de la variable -->
        variable nombre: <c:out value="${nombre}"/>
        <br />
        <br />
        Variable con codigo HTML: 
        <c:out value="<h4>Hola</h4>" escapeXml="false"/>
        <br />
        <br />
        <!-- Codigo condicional , usando if -->
        <c:set var="bandera" value="true" />
        <c:if test="${bandera}">
            La bandera es verdadera 
        </c:if>
        <br />
        <br />
        
        <!-- Codigo condiconal , uso de Switch -->
        <c:if test="${param.opcion !=null}">
            <c:choose>
                <c:when test="${param.opcion == 1}">
                <br />
                Opcion 1 seleccionada
                </c:when>
            </c:choose>
        </c:if>
    </body>
</html>