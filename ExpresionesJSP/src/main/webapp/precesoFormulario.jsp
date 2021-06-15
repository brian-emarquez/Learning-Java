<%--<%@page contentType="text/html" pageEncoding="UTF-8"%>--%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Proceso Formulario</title>
    </head>
    <body>
        <!-- recuperando valores -->
        <h1>Resultado de procesar el Formulario </h1>
        Usuario: <%= request.getParameter("usuario") %>
        <br>
        Password <%= request.getParameter("password")%>
        <br>
        <br>
        <a href="index.html">Regreso al Inicio</a>          
    </body>
</html>
