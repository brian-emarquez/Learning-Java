<%-- 
    Document   : index
    Created on : 14 jun. 2021, 11:59:08
    Author     : brian
--%>

<%-- Directiva --%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Hola Mundo JSP Page</title>
    </head>
    <body>
        <h1>Hola Mundo JSPS</h1>
        <ul>
            <li> <% out.print("Hola Mundo con Scripplets"); %> </li>
            <li> ${"Hola Mundo con Expresion Languaje(EL)"} </li>
            <li> <%= "Hola Mundo con expresiomnes" %> </li>
        </ul>
    </body>
</html>
