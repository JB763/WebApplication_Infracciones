<%@ page import="java.util.List" %>
<%@ page import="Model.Vehiculo.Vehiculo" %>
<%@ page import="Model.Vehiculo.SrvVehiculo_Service" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <title>Mantenimiento Vehiculo</title>
</head>
<body class="bg-light">
<%@include file="Menu.jsp" %>
<div class="container mt-5">
  <div class="my-3 p-3 bg-body rounded shadow-sm">
    <div class="pb-3">
      <form class="d-flex" action="srvMantenimientoVehiculo" method="get">
        <input class="form-control me-1" type="search" name="txtidVehiculo" value="" placeholder="ID Vehiculo" aria-label="Search">
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
        <th class="col-md-3">ID Vehiculo</th>
        <th class="col-md-3">Placa</th>
        <th class="col-md-3">Marca</th>
        <th class="col-md-3">Modelo</th>
        <th class="col-md-3">#</th>
        <th class="col-md-3">#</th>
      </tr>
      </thead>
      <tbody>
      <%
        List<Vehiculo> v;
        Vehiculo v1;
        SrvVehiculo_Service srvVehiculo = new SrvVehiculo_Service();
        if (request.getAttribute("idVehiculo")!=null) {
          String idVehiculo = request.getAttribute("idVehiculo").toString();
          v1 = srvVehiculo.getSrvVehiculoPort().buscarVehiculo(idVehiculo);
          if (v1 != null) {
      %>
      <tr>
        <th scope="row"><%=v1.getIdVehiculo()%></th>
        <th scope="row"><%=v1.getPlaca()%></th>
        <th scope="row"><%=v1.getMarca()%></th>
        <th scope="row"><%=v1.getModelo()%></th>
        <th><a href="ActualizarVehiculo.jsp?iD=<%=v1.getIdVehiculo()%>" class="btn btn-outline-warning">Actualizar</a></th>
        <th><a href="srvEliminarVehiculo?iD=<%=v1.getIdVehiculo()%>" class="btn btn-outline-danger">Eliminar</a></th>
      </tr>
      <%
      } else {
      %>
      <tr>
        <td colspan="5" class="text-danger">No se encontró ningún Vehiculo con el ID proporcionado.</td>
      </tr>
      <%
        }
      } else {
        v = srvVehiculo.getSrvVehiculoPort().listarVehiculos();
        for (int i=0; i<v.size(); i++) {
      %>
      <tr>
        <th scope="row"><%=v.get(i).getIdVehiculo()%></th>
        <th scope="row"><%=v.get(i).getPlaca()%></th>
        <th scope="row"><%=v.get(i).getMarca()%></th>
        <th scope="row"><%=v.get(i).getModelo()%></th>
        <th><a href="ActualizarVehiculo.jsp?iD=<%=v.get(i).getIdVehiculo()%>" class="btn btn-outline-warning">Actualizar</a></th>
        <th><a href="srvEliminarVehiculo?iD=<%=v.get(i).getIdVehiculo()%>" class="btn btn-outline-danger">Eliminar</a></th>
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
