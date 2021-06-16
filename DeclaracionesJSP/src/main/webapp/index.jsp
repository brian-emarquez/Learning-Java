<%-- Agregamos un addeclaracion de JSP --%>
<%!
//Declaramo sun variable con du metodo geet
private String usuario = "Alberto";

private String getUsuario(){
    return this.usuario;
}

//declaramos un contador de visitas
private int contadoVisitas = 1;
%>  


<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Uso de Declaraciones con JSPS</title>
    </head>
    <body>
        <h1>Uso de Declaraciones con JSPS</h1>
        Valor de usuario pro medio de atributo: <%= this.usuario%>
        <br><!-- comment -->
        Valor Uusuario por medio del metodo: <%= this.getUsuario()%>
         <br><!-- comment -->
        Contador visitas: <%= this.contadoVisitas++%>
    </body>
</html>
