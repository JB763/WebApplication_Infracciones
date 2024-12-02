<%@ page import="Model.Agente.Agente" %>
<%@ page import="java.util.List" %>
<%@ page import="Model.Agente.SrvAgente_Service" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Mantenimiento Agente</title>
</head>
    <body class="bg-light">
        <%@include file="Menu.jsp" %>
        <div class="container mt-5">
            <div class="my-3 p-3 bg-body rounded shadow-sm">
                <div class="pb-3">
                    <form class="d-flex" action="srvMantenimientoAgente" method="get">
                        <input class="form-control me-1" type="search" name="txtidAgente" value="" placeholder="ID Agente" aria-label="Search">
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
                        <th class="col-md-3">ID Agente</th>
                        <th class="col-md-3">Nombre - Apellido</th>
                        <th class="col-md-3">Sector</th>
                        <th class="col-md-3">#</th>
                        <th class="col-md-3">#</th>
                    </tr>
                    </thead>
                    <tbody>
                    <%
                        List<Agente> a;
                        Agente a1;
                        SrvAgente_Service Agente = new SrvAgente_Service();
                        if (request.getAttribute("idAgente")!=null) {
                            String idAgente = request.getAttribute("idAgente").toString();
                            a1 = Agente.getSrvAgentePort().buscarAgente(idAgente);
                            if (a1 != null) {
                    %>
                    <tr>
                        <th scope="row"><%=a1.getIdAgente()%></th>
                        <th scope="row"><%=a1.getNombre()%></th>
                        <th scope="row"><%=a1.getSector()%></th>
                        <th><a href="ActualizarAgente.jsp?iD=<%=a1.getIdAgente()%>" class="btn btn-outline-warning">Actualizar</a></th>
                        <th><a href="srvEliminarAgente?iD=<%=a1.getIdAgente()%>" class="btn btn-outline-danger">Eliminar</a></th>

                    </tr>
                    <%
                    } else {
                    %>
                    <tr>
                        <td colspan="5" class="text-danger">No se encontró ningún agente con el ID proporcionado.</td>
                    </tr>
                    <%
                        }
                    } else {
                        a = Agente.getSrvAgentePort().listarAgentes();
                        for (int i=0; i<a.size(); i++) {
                    %>
                    <tr>
                        <th scope="row"><%=a.get(i).getIdAgente()%></th>
                        <th scope="row"><%=a.get(i).getNombre()%></th>
                        <th scope="row"><%=a.get(i).getSector()%></th>
                        <th><a href="ActualizarAgente.jsp?iD=<%=a.get(i).getIdAgente()%>" class="btn btn-outline-warning">Actualizar</a></th>
                        <th><a href="srvEliminarAgente?iD=<%=a.get(i).getIdAgente()%>" class="btn btn-outline-danger">Eliminar</a></th>
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