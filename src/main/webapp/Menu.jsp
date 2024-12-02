<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="javax.servlet.http.HttpSession" %>
<%
    HttpSession sesion = request.getSession(false);
    String nombre = (sesion != null) ? (String) sesion.getAttribute("nombre") : null;

    if (nombre == null) {
        response.sendRedirect("Login.jsp");
        return;
    }
%>
<!DOCTYPE html>
<html>
<head>
    <title>Menu Principal</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css">
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-light bg-light">
    <div class="container-fluid">
        <a class="navbar-brand" href="#"><%= nombre %></a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarScroll" aria-controls="navbarScroll" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarScroll">
            <ul class="navbar-nav me-auto my-2 my-lg-0 navbar-nav-scroll" style="--bs-scroll-height: 100px;">
                <!-- Agente -->
                <li class="nav-item dropdown">
                    <a class="nav-link dropdown-toggle" href="#" id="navbarScrollingDropdown1" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                        Agente
                    </a>
                    <ul class="dropdown-menu" aria-labelledby="navbarScrollingDropdown1">
                        <li><a class="dropdown-item" href="NuevoAgente.jsp">Nuevo registro</a></li>
                        <li><a class="dropdown-item" href="MantenimientoAgente.jsp">Mantenimiento Agente</a></li>
                        <li><a class="dropdown-item" href="#">Mantenimiento administrador</a></li>
                    </ul>
                </li>
                <!-- Usuario -->
                <li class="nav-item dropdown">
                    <a class="nav-link dropdown-toggle" href="#" id="navbarScrollingDropdown2" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                        Usuario
                    </a>
                    <ul class="dropdown-menu" aria-labelledby="navbarScrollingDropdown2">
                        <li><a class="dropdown-item" href="NuevoUsuario.jsp">Nuevo registro</a></li>
                        <li><a class="dropdown-item" href="MantenimientoUsuario.jsp">Mantenimiento Usuario</a></li>
                        <li><a class="dropdown-item" href="#">Mantenimiento administrador</a></li>
                    </ul>
                </li>
                <!-- Infraccion -->
                <li class="nav-item dropdown">
                    <a class="nav-link dropdown-toggle" href="#" id="navbarScrollingDropdown3" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                        Infraccion
                    </a>
                    <ul class="dropdown-menu" aria-labelledby="navbarScrollingDropdown3">
                        <li><a class="dropdown-item" href="NuevaInfraccion.jsp">Nuevo registro</a></li>
                        <li><a class="dropdown-item" href="MantenimientoInfraccion.jsp">Mantenimiento Infraccion</a></li>
                        <li><a class="dropdown-item" href="#">Mantenimiento administrador</a></li>
                    </ul>
                </li>
                <!-- Vehiculo -->
                <li class="nav-item dropdown">
                    <a class="nav-link dropdown-toggle" href="#" id="navbarScrollingDropdown4" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                        Vehiculo
                    </a>
                    <ul class="dropdown-menu" aria-labelledby="navbarScrollingDropdown4">
                        <li><a class="dropdown-item" href="NuevoVehiculo.jsp">Nuevo registro</a></li>
                        <li><a class="dropdown-item" href="MantenimientoVehiculo.jsp">Mantenimiento Vehiculo</a></li>
                        <li><a class="dropdown-item" href="#">Mantenimiento administrador</a></li>
                    </ul>
                </li>
                <!-- Conductor -->
                <li class="nav-item dropdown">
                    <a class="nav-link dropdown-toggle" href="#" id="navbarScrollingDropdown5" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                        Conductor
                    </a>
                    <ul class="dropdown-menu" aria-labelledby="navbarScrollingDropdown5">
                        <li><a class="dropdown-item" href="NuevoConductor.jsp">Nuevo registro</a></li>
                        <li><a class="dropdown-item" href="MantenimientoConductor.jsp">Mantenimiento Conductor</a></li>
                        <li><a class="dropdown-item" href="#">Mantenimiento administrador</a></li>
                    </ul>
                </li>
                <!-- Pago -->
                <li class="nav-item dropdown">
                    <a class="nav-link dropdown-toggle" href="#" id="navbarScrollingDropdown6" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                        Pago
                    </a>
                    <ul class="dropdown-menu" aria-labelledby="navbarScrollingDropdown6">
                        <li><a class="dropdown-item" href="NuevoPago.jsp">Nuevo registro</a></li>
                        <li><a class="dropdown-item" href="MantenimientoPago.jsp">Mantenimiento Pago</a></li>
                        <li><a class="dropdown-item" href="#">Mantenimiento administrador</a></li>
                    </ul>
                </li>
                <!-- Sancion -->
                <li class="nav-item dropdown">
                    <a class="nav-link dropdown-toggle" href="#" id="navbarScrollingDropdown7" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                        Sancion
                    </a>
                    <ul class="dropdown-menu" aria-labelledby="navbarScrollingDropdown7">
                        <li><a class="dropdown-item" href="NuevaSancion.jsp">Nuevo registro</a></li>
                        <li><a class="dropdown-item" href="MantenimientoSancion.jsp">Mantenimiento Sancion</a></li>
                        <li><a class="dropdown-item" href="#">Mantenimiento administrador</a></li>
                    </ul>
                </li>
            </ul>
            <div class="d-flex">
                <!-- Input de búsqueda y botón de búsqueda -->
                <form class="d-flex" action="#" method="get">
                    <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search" style="width: 200px;">
                    <button class="btn btn-outline-success" type="button">Search</button>
                </form>
                <!-- Botón de Cerrar Sesión -->
                <form class="d-flex ms-2" action="CerrarSesion" method="post">
                    <button class="btn btn-danger" type="submit">Cerrar Sesión</button>
                </form>
            </div>
        </div>
    </div>
</nav>
<script src="js/bootstrap.min.js" type="text/javascript"></script>
</body>
</html>
