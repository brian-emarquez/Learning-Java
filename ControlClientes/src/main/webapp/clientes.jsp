<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Control de Clientes</title>
    </head>
    <body>
        <h1>Control de Clientes</h1>
        <ul>
            <c:forEach var="cliente" items="${clientes}">
                <li>${cliente.idCliente} ${cliente.nombre} ${cliente.apellido} ${cliente.saldo}</li>
                </c:forEach>
        </ul>
    </body>
</html>
