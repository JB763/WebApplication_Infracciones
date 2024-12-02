<%@ page import="Model.Vehiculo.Vehiculo" %>
<%@ page import="Model.Vehiculo.SrvVehiculo_Service" %><%--
  Created by IntelliJ IDEA.
  User: JULIAN BRITO
  Date: 14/10/2024
  Time: 05:33 p. m.
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<head>
  <title>Actualizar - Vehiculo</title>

</head>
<body>
<%@include file="Menu.jsp" %>
<div class="mask d-flex align-items-center h-100 gradient-custom-3">
  <div class="container h-100">
    <div class="row d-flex justify-content-center align-items-center h-100">
      <div class="col-12 col-md-9 col-lg-7 col-xl-6">
        <div class="card" style="border-radius: 15px;">
          <div class="card-body p-5">
            <h2 class="text-uppercase text-center mb-5">Actualizar Registro - Vehiculo</h2>

            <form name="frmVehiculo" action="srvActualizarVehiculo" method="post">
              <%
                Vehiculo v1;
                String idVehiculo = "";
                idVehiculo = (request.getParameter("iD"));

                SrvVehiculo_Service srvVehiculo = new SrvVehiculo_Service();
                v1 = srvVehiculo.getSrvVehiculoPort().buscarVehiculo(idVehiculo);
              %>

              <div data-mdb-input-init class="form-outline mb-4">
                <input type="text" id="idVehiculo" class="form-control form-control-lg" name="txtidVehiculo" value="<%=v1.getIdVehiculo()%>" readonly required/>
                <label class="form-label" for="idVehiculo" >ID Vehiculo</label>
              </div>

              <div data-mdb-input-init class="form-outline mb-4">
                <input type="text" id="placa" class="form-control form-control-lg" name="txtPlaca" value="<%=v1.getPlaca()%>" required />
                <label class="form-label" for="placa">Placa</label>
              </div>

              <div data-mdb-input-init class="form-outline mb-4">
                <input type="text" id="marca" class="form-control form-control-lg" name="txtMarca" value="<%=v1.getMarca()%>" required />
                <label class="form-label" for="marca">Marca</label>
              </div>
              <div data-mdb-input-init class="form-outline mb-4">
                <input type="text" id="modelo" class="form-control form-control-lg" name="txtModelo" value="<%=v1.getModelo()%>" required />
                <label class="form-label" for="modelo">Modelo</label>
              </div>
              <div class="d-grid gap-2 col-6 mx-auto">
                <button class="btn btn-primary" type="submit">Actualizar</button>
              </div>
              <%
                if (request.getAttribute("mensaje") != null) {
              %>
              <div class="alert alert-info mt-3" role="alert">
                <%= request.getAttribute("mensaje") %>
              </div>
              <%
                }
              %>
            </form>
          </div>
        </div>
      </div>
    </div>
  </div>
</div>
</body>
</html>
