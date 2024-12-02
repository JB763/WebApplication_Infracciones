<%@ page import="java.util.List" %>
<%@ page import="Model.Pago.Pago" %>
<%@ page import="Model.Pago.SrvPago_Service" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <title>Mantenimiento Pago</title>
</head>
<body class="bg-light">
<%@include file="Menu.jsp" %>
<div class="container mt-5">
  <div class="my-3 p-3 bg-body rounded shadow-sm">
    <div class="pb-3">
      <form class="d-flex" action="srvMantenimientoPago" method="get">
        <input class="form-control me-1" type="search" name="txtidPago" value="" placeholder="ID Pago" aria-label="Search">
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
        <th class="col-md-3">ID Pago</th>
        <th class="col-md-3">Fecha-Pago</th>
        <th class="col-md-3">Monto</th>
        <th class="col-md-3">ID Sancion</th>
        <th class="col-md-3">#</th>
        <th class="col-md-3">#</th>
      </tr>
      </thead>
      <tbody>
      <%
        List<Pago> p;
        Pago p1;
        SrvPago_Service srvPago = new SrvPago_Service();
        if (request.getAttribute("idPago")!=null) {
          String idPago = request.getAttribute("idPago").toString();
          p1 = srvPago.getSrvPagoPort().buscarPago(idPago);
          if (p1 != null) {
      %>
      <tr>
        <th scope="row"><%=p1.getIdPago()%></th>
        <th scope="row"><%=p1.getFechaPago()%></th>
        <th scope="row"><%=p1.getMonto()%></th>
        <th scope="row"><%=p1.getSancion()%></th>
        <th><a href="ActualizarPago.jsp?iD=<%=p1.getIdPago()%>" class="btn btn-outline-warning">Actualizar</a></th>
        <th><a href="srvEliminarPago?iD=<%=p1.getIdPago()%>" class="btn btn-outline-danger">Eliminar</a></th>

      </tr>
      <%
      } else {
      %>
      <tr>
        <td colspan="5" class="text-danger">No se encontró ningún Pago con el ID proporcionado.</td>
      </tr>
      <%
        }
      } else {
        p = srvPago.getSrvPagoPort().listarPago();
        for (int i=0; i<p.size(); i++) {
      %>
      <tr>
        <th scope="row"><%=p.get(i).getIdPago()%></th>
        <th scope="row"><%=p.get(i).getFechaPago()%></th>
        <th scope="row"><%=p.get(i).getMonto()%></th>
        <th scope="row"><%=p.get(i).getSancion()%></th>
        <th><a href="ActualizarPago.jsp?iD=<%=p.get(i).getIdPago()%>" class="btn btn-outline-warning">Actualizar</a></th>
        <th><a href="srvEliminarPago?iD=<%=p.get(i).getIdPago()%>" class="btn btn-outline-danger">Eliminar</a></th>
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