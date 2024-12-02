<%@ page import="java.util.List" %>
<%@ page import="Model.Conductor.SrvConductor_Service" %>
<%@ page import="Model.Conductor.Conductor" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <title>Mantenimiento Conductor</title>
</head>
<body class="bg-light">
<%@include file="Menu.jsp" %>
<div class="container mt-5">
  <div class="my-3 p-3 bg-body rounded shadow-sm">
    <div class="pb-3">
      <form class="d-flex" action="srvMantenimientoConductor" method="get">
        <input class="form-control me-1" type="search" name="txtidLicencia" value="" placeholder="ID Licencia" aria-label="Search">
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
        <th class="col-md-3">ID Licencia</th>
        <th class="col-md-3">Nombre - Apellido</th>
        <th class="col-md-3">Edad</th>
        <th class="col-md-3">ID Vehiculo</th>
        <th class="col-md-3">#</th>
        <th class="col-md-3">#</th>
      </tr>
      </thead>
      <tbody>
      <%
        List<Conductor> c;
        Conductor c1;
        SrvConductor_Service srvConductor = new SrvConductor_Service();
        if (request.getAttribute("idLicencia")!=null) {
          String idLicencia = request.getAttribute("idLicencia").toString();
          c1 = srvConductor.getSrvConductorPort().buscarConductor(idLicencia);
          if (c1 != null) {
      %>
      <tr>
        <th scope="row"><%=c1.getIdLicencia()%></th>
        <th scope="row"><%=c1.getNombre()%></th>
        <th scope="row"><%=c1.getEdad()%></th>
        <th scope="row"><%=c1.getIdVehiculo()%></th>
        <th><a href="ActualizarConductor.jsp?iD=<%=c1.getIdLicencia()%>" class="btn btn-outline-warning">Actualizar</a></th>
        <th><a href="srvEliminarConductor?iD=<%=c1.getIdLicencia()%>" class="btn btn-outline-danger">Eliminar</a></th>

      </tr>
      <%
      } else {
      %>
      <tr>
        <td colspan="5" class="text-danger">No se encontró ningún conductor con el ID proporcionado.</td>
      </tr>
      <%
        }
      } else {
        c = srvConductor.getSrvConductorPort().listarConductores();
        for (int i=0; i<c.size(); i++) {
      %>
      <tr>
        <th scope="row"><%=c.get(i).getIdLicencia()%></th>
        <th scope="row"><%=c.get(i).getNombre()%></th>
        <th scope="row"><%=c.get(i).getEdad()%></th>
        <th scope="row"><%=c.get(i).getIdVehiculo()%></th>
        <th><a href="ActualizarConductor.jsp?iD=<%=c.get(i).getIdLicencia()%>" class="btn btn-outline-warning">Actualizar</a></th>
        <th><a href="srvEliminarConductor?iD=<%=c.get(i).getIdLicencia()%>" class="btn btn-outline-danger">Eliminar</a></th>
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