<%@ page import="java.util.List" %>
<%@ page import="Model.Usuario.Usuario" %>
<%@ page import="Model.Usuario.SrvUsuario_Service" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Mantenimiento Usuario</title>
</head>
<body class="bg-light">
<%@include file="Menu.jsp" %>
<div class="container mt-5">
    <div class="my-3 p-3 bg-body rounded shadow-sm">
        <div class="pb-3">
            <form class="d-flex" action="srvMantenimientoUsuario" method="get">
                <input class="form-control me-1" type="search" name="txtidUsuario" value="" placeholder="ID Usuario" aria-label="Search">
                <button class="btn btn-secondary" type="submit">Buscar</button>
            </form>
        </div>
        <% if (request.getAttribute("mensaje") != null) { %>
        <div class="alert alert-info"><%= request.getAttribute("mensaje") %></div>
        <% request.removeAttribute("mensaje"); %> <!-- Eliminar mensaje después de mostrarlo -->
        <% } %>
        <div class="table-responsive">
        <table class="table table-striped-columns">
            <thead>
            <tr>
                <th class="col-md-2">ID Usuario</th>
                <th class="col-md-2">Usuario</th>
                <th class="col-md-2">Contraseña</th>
                <th class="col-md-3">Correo</th>
                <th class="col-md-2">ID Agente</th>
                <th class="col-md-1">#</th>
                <th class="col-md-1">#</th>
            </tr>
            </thead>
            <tbody>
            <%
                List<Usuario> u;
                Usuario u1;
                SrvUsuario_Service srvUsuario = new SrvUsuario_Service();
                if (request.getAttribute("idUsuario")!=null) {
                    String idUsuario = request.getAttribute("idUsuario").toString();
                    u1 = srvUsuario.getSrvUsuarioPort().buscarUsuario(idUsuario);
                    if (u1 != null) {
            %>
            <tr>
                <th scope="row"><%=u1.getIdUsuario()%></th>
                <th scope="row"><%=u1.getUsuario()%></th>
                <th scope="row"><%=u1.getPassword()%></th>
                <th scope="row"><%=u1.getCorreo()%></th>
                <th scope="row"><%=u1.getIdAgente()%></th>
                <th><a href="ActualizarUsuario.jsp?iD=<%=u1.getIdUsuario()%>" class="btn btn-outline-warning">Actualizar</a></th>
                <th><a href="srvEliminarUsuario?iD=<%=u1.getIdUsuario()%>" class="btn btn-outline-danger">Eliminar</a></th>

            </tr>
            <%
            } else {
            %>
            <tr>
                <td colspan="5" class="text-danger">No se encontró ningún Usuario con el ID proporcionado.</td>
            </tr>
            <%
                }
            } else {
                u = srvUsuario.getSrvUsuarioPort().listarUsuarios();
                for (int i=0; i<u.size(); i++) {
            %>
            <tr>
                <th scope="row"><%=u.get(i).getIdUsuario()%></th>
                <th scope="row"><%=u.get(i).getUsuario()%></th>
                <th scope="row"><%=u.get(i).getPassword()%></th>
                <th scope="row"><%=u.get(i).getCorreo()%></th>
                <th scope="row"><%=u.get(i).getIdAgente()%></th>
                <th><a href="ActualizarUsuario.jsp?iD=<%=u.get(i).getIdUsuario()%>" class="btn btn-outline-warning">Actualizar</a></th>
                <th><a href="srvEliminarUsuario?iD=<%=u.get(i).getIdUsuario()%>" class="btn btn-outline-danger">Eliminar</a></th>
            </tr>
            <%
                    }
                }
            %>
            </tbody>
        </table>
        </div>
    </div>
</div>
</body>
</html>