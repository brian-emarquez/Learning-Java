<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP con Scriptlets</title>
    </head>
    <body>
        <h1>JSP con Scriptlets</h1>
        <br>
        <%-- Scrptlet para enviar informacion al navegador--%>
        <%
            out.print("Saludos dese un Scriptlet");     
        %>
        <%-- Scrptlet para manipular los objetos implicitos--%>
        <%
         String nombAplicacion = request.getContextPath();
         out.print("Nombre de la aplicacion: " + nombAplicacion);
        %>
        <br>
        <%-- Scrptlet con codigo condicionado--%>
        <% 
            if(session !=null && session.isNew()){
        %>
        La sesision es nueva
        <% 
            }else if(session !=null){
        %>
        La sesion NO es nueva
        <% } %>   
        <br>
        <a href="index.html">Regresar a la pagina Inicio</a>
        
    </body>
</html>
