<%@ page import="java.util.List" %>
<%@ page import="Model.Sancion.SrvSancion_Service" %>
<%@ page import="Model.Sancion.Sancion" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Mantenimiento Sancion</title>
</head>
<body class="bg-light">
<%@include file="Menu.jsp" %>
<div class="container mt-5">
    <div class="my-3 p-3 bg-body rounded shadow-sm">
        <div class="pb-3">
            <form class="d-flex" action="srvMantenimientoSancion" method="get">
                <input class="form-control me-1" type="search" name="txtidSancion" value="" placeholder="ID Sancion" aria-label="Search">
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
                <th class="col-md-2">ID Sancion</th>
                <th class="col-md-2">Fecha-Impuesta</th>
                <th class="col-md-2">ID Infraccion</th>
                <th class="col-md-2">ID Licencia</th>
                <th class="col-md-2">ID Agente</th>
                <th class="col-md-1">#</th>
                <th class="col-md-1">#</th>
            </tr>
            </thead>
            <tbody>
            <%
                List<Sancion> s;
                Sancion s1;
                SrvSancion_Service srvSancion = new SrvSancion_Service();
                if (request.getAttribute("idSancion")!=null) {
                    String idSancion = request.getAttribute("idSancion").toString();
                    s1 = srvSancion.getSrvSancionPort().buscarSancion(idSancion);
                    if (s1 != null) {
            %>
            <tr>
                <th scope="row"><%=s1.getIdSancion()%></th>
                <th scope="row"><%=s1.getFechaImpuesta()%></th>
                <th scope="row"><%=s1.getIdInfraccion()%></th>
                <th scope="row"><%=s1.getIdLicencia()%></th>
                <th scope="row"><%=s1.getIdAgente()%></th>
                <th><a href="ActualizarSancion.jsp?iD=<%=s1.getIdSancion()%>" class="btn btn-outline-warning">Actualizar</a></th>
                <th><a href="srvEliminarSancion?iD=<%=s1.getIdSancion()%>" class="btn btn-outline-danger">Eliminar</a></th>

            </tr>
            <%
            } else {
            %>
            <tr>
                <td colspan="5" class="text-danger">No se encontró ninguna Sancion con el ID proporcionado.</td>
            </tr>
            <%
                }
            } else {
                s = srvSancion.getSrvSancionPort().listarSanciones();
                for (int i=0; i<s.size(); i++) {
            %>
            <tr>
                <th scope="row"><%=s.get(i).getIdSancion()%></th>
                <th scope="row"><%=s.get(i).getFechaImpuesta()%></th>
                <th scope="row"><%=s.get(i).getIdInfraccion()%></th>
                <th scope="row"><%=s.get(i).getIdLicencia()%></th>
                <th scope="row"><%=s.get(i).getIdAgente()%></th>
                <th><a href="ActualizarSancion.jsp?iD=<%=s.get(i).getIdSancion()%>" class="btn btn-outline-warning">Actualizar</a></th>
                <th><a href="srvEliminarSancion?iD=<%=s.get(i).getIdSancion()%>" class="btn btn-outline-danger">Eliminar</a></th>
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