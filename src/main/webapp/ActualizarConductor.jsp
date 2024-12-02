<%@ page import="Model.Conductor.Conductor" %>
<%@ page import="Model.Conductor.SrvConductor_Service" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: JULIAN BRITO
  Date: 14/10/2024
  Time: 05:33 p. m.
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<head>
  <title>Actualizar - Conductor</title>

</head>
<body>
<%@include file="Menu.jsp" %>
<div class="mask d-flex align-items-center h-100 gradient-custom-3">
  <div class="container h-100">
    <div class="row d-flex justify-content-center align-items-center h-100">
      <div class="col-12 col-md-9 col-lg-7 col-xl-6">
        <div class="card" style="border-radius: 15px;">
          <div class="card-body p-5">
            <h2 class="text-uppercase text-center mb-5">Actualizar Registro - Conductor</h2>

            <form name="frmConductor" action="srvActualizarConductor" method="post">
              <%
                Conductor c1;
                String idLicencia = "";
                idLicencia = (request.getParameter("iD"));

                SrvConductor_Service srvConductor = new SrvConductor_Service();
                c1 = srvConductor.getSrvConductorPort().buscarConductor(idLicencia);
              %>
              <div data-mdb-input-init class="form-outline mb-4">
                <input type="text" id="idLicencia" class="form-control form-control-lg" name="txtidLicencia" value="<%=c1.getIdLicencia()%>" readonly required/>
                <label class="form-label" for="idLicencia" >Licencia</label>
              </div>

              <div data-mdb-input-init class="form-outline mb-4">
                <input type="text" id="nombre" class="form-control form-control-lg" name="txtNombre" value="<%=c1.getNombre()%>" required />
                <label class="form-label" for="nombre">Nombre - Apellido</label>
              </div>

              <div data-mdb-input-init class="form-outline mb-4">
                <input type="text" id="edad" class="form-control form-control-lg" name="txtEdad" value="<%=c1.getEdad()%>" required />
                <label class="form-label" for="edad">Edad</label>
              </div>
              <div data-mdb-input-init class="form-outline mb-4">
                <input type="text" id="idVehiculo" class="form-control form-control-lg" name="txtidVehiculo" value="<%=c1.getIdVehiculo()%>" required />
                <label class="form-label" for="idVehiculo">ID Vehiculo</label>
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
