
<%@ page import="java.util.List" %>
<%@ page import="Model.Infraccion.Infraccion" %>
<%@ page import="Model.Infraccion.SrvInfraccion_Service" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Mantenimiento Infraccion</title>
</head>
<body class="bg-light">
<%@include file="Menu.jsp" %>
<div class="container mt-5">
    <div class="my-3 p-3 bg-body rounded shadow-sm">
        <div class="pb-3">
            <form class="d-flex" action="srvMantenimientoInfraccion" method="get">
                <input class="form-control me-1" type="search" name="txtidInfraccion" value="" placeholder="ID Infraccion" aria-label="Search">
                <button class="btn btn-secondary" type="submit">Buscar</button>
            </form>
        </div>
        <% if (request.getAttribute("mensaje") != null) { %>
        <div class="alert alert-info"><%= request.getAttribute("mensaje") %></div>
        <% request.removeAttribute("mensaje"); %>
        <% } %>
        <div class="table-responsive">
        <table class="table table-striped-columns">
            <thead>
            <tr>
                <th class="col-md-3">ID Infraccion</th>
                <th class="col-md-4">Descripcion</th>
                <th class="col-md-2">Multa</th>
                <th class="col-md-2">#</th>
                <th class="col-md-2">#</th>
            </tr>
            </thead>
            <tbody>
            <%
                List<Infraccion> i;
                Infraccion i1;
                SrvInfraccion_Service infraccionService = new SrvInfraccion_Service();
                if (request.getAttribute("idInfraccion")!=null) {
                    String idInfraccion = request.getAttribute("idInfraccion").toString();
                    i1 = infraccionService.getSrvInfraccionPort().buscarInfraccion(idInfraccion);
                    if (i1 != null) {
            %>
            <tr>
                <th scope="row"><%=i1.getIdInfraccion()%></th>
                <th scope="row"><%=i1.getDescripcion()%></th>
                <th scope="row"><%=i1.getMulta()%></th>
                <th><a href="ActualizarInfraccion.jsp?iD=<%=i1.getIdInfraccion()%>" class="btn btn-outline-warning">Actualizar</a></th>
                <th><a href="srvEliminarInfraccion?iD=<%=i1.getIdInfraccion()%>" class="btn btn-outline-danger">Eliminar</a></th>

            </tr>
            <%
            } else {
            %>
            <tr>
                <td colspan="5" class="text-danger">No se encontró ninguna infraccion con el ID proporcionado.</td>
            </tr>
            <%
                }
            } else {
                i = infraccionService.getSrvInfraccionPort().listarInfracciones();
                for (int l=0; l<i.size(); l++) {
            %>
            <tr>
                <th scope="row"><%=i.get(l).getIdInfraccion()%></th>
                <th scope="row"><%=i.get(l).getDescripcion()%></th>
                <th scope="row"><%=i.get(l).getMulta()%></th>
                <th><a href="ActualizarInfraccion.jsp?iD=<%=i.get(l).getIdInfraccion()%>" class="btn btn-outline-warning">Actualizar</a></th>
                <th><a href="srvEliminarInfraccion?iD=<%=i.get(l).getIdInfraccion()%>" class="btn btn-outline-danger">Eliminar</a></th>
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