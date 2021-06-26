<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ejemplo Inclision Dinamica</title>
    </head>
    <body>
        <h1>Ejemplo Inclision Dinamica</h1>
        <br>
        <jsp:include page="paginas/recursoPublico.jsp" />
        <br>
        <jsp:include page="WEB-INF/recursoPrivado.jsp">
            <jsp:param name="colorFondo" value="yellow" />
        </jsp:include>
    </body>
</html>
