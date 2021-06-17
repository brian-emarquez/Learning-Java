<%@page import="utilerias.Conversiones, java.util.Date" %>
<%@page contentType="aplication/vnd.ms-excel" %>
<%
    String nombreArchivo = "reporte.xls";
    response.setHeader("Content-Disposition", "attachment;filename" + nombreArchivo);
    
%>

<!DOCTYPE html>
<html>
    <head>
        <title>Reporte de Excel</title>
    </head>
    <body>
        <h1>Reporte de Excel</h1>
        <table border="1">
            <tr>
                <th>CURSO</th>
                <th>DESCRIPCION</th>
                <th>FECHA</th>
            </tr>
            <tr>
                <th>1. Fundamento de Java </th>
                <th>Aprenderemos la sitaxis basica de Java</th>
                <th><%= Conversiones.format(new Date()) %></th>
            </tr>
            
            <tr>
                <th>2. Fundamento con Java </th>
                <th>Pondemos en pranctica conceptos de la programacion POO</th>
                <th><%= Conversiones.format(new Date()) %></th>
            </tr>
            
            
           
        </table>
    </body>
</html>
