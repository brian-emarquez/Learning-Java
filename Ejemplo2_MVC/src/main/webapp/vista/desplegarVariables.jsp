<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Despliegue de variables</title>
    </head>
    <body>
        <h1>Desplique de Variables</h1>
        Variable en alcanse request: ${mensaje}
        <br /><!-- comment -->
        <br />
        Variable en alcance de sesion: 
        <br />
        Rectangulo:
        Base: ${rectangulo.base}
        Altura: ${rectangulo.altura}
        Area: ${rectangulo.area}
        <br />
        <br />
        <a href="${pageContext.request.contextPath}/index.jsp"> Regresar al Incio </a>
    </body>
</html>
