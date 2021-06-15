<!DOCTYPE html>
<%
      String fondo = request.getParameter("colorFondo");
      if (fondo == null || fondo.trim().equals("")){
          fondo = "white";     
      }
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Cmbio de color</title>
    </head>
    <body bgcolor="<%= fondo %>">
        <h1>JSP Cmbio de color</h1>
        <br>
        Color de fondo aplicado: <%= fondo %>
        <br>
        <a href="index.html">Regresar a la pagina Inicio</a>
        
        
    </body>
</html>
