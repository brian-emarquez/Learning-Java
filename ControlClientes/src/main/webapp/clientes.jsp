<!DOCTYPE html>
<html>
    <head>
        <!-- Required meta tags -->
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Control de Clientes</title>


        <!-- Bootstrap CSS -->
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

        <!-- Awersome Font  -->
        <script src="https://kit.fontawesome.com/4499a2eb69.js" crossorigin="anonymous"></script>


        <!-- Sider CSS -->
        <link rel="stylesheet" href="assets/css/styles.css">


    </head>
    <body id="body-pd">

        <!-- Cabecero -->
        <jsp:include page="/WEB-INF/paginas/comunes/cabecero.jsp"/>

        <!<!-- Botones del Nevegacion -->
        <jsp:include page="/WEB-INF/paginas/comunes/botonesNavegacion.jsp"/>

        <!<!-- listado clientes -->
        <jsp:include page="/WEB-INF/paginas/cliente/listadoClientes.jsp"/>

        <!-- Sliderbar -->
        <jsp:include page="/WEB-INF/paginas/comunes/slidebar.jsp"/>
        
        <!<!-- Pie de Pagina -->
        <jsp:include page="/WEB-INF/paginas/comunes/piePagina.jsp"/>

        <!<!-- v4.6.x  -->
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>

        <script src="https://unpkg.com/ionicons@5.1.2/dist/ionicons.js"></script>

        <!--  Sider JS-->
        <script src="assets/js/main.js"></script>
    </body>
</html>
