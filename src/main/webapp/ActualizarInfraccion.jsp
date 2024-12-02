<%@ page import="Model.Infraccion.Infraccion" %>
<%@ page import="Model.Infraccion.SrvInfraccion_Service" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<head>
  <title>Actualizar - Infraccion</title>

</head>
<body>
<%@include file="Menu.jsp" %>
<div class="mask d-flex align-items-center h-100 gradient-custom-3">
  <div class="container h-100">
    <div class="row d-flex justify-content-center align-items-center h-100">
      <div class="col-12 col-md-9 col-lg-7 col-xl-6">
        <div class="card" style="border-radius: 15px;">
          <div class="card-body p-5">
            <h2 class="text-uppercase text-center mb-5">Actualizar Registro - Infraccion</h2>

            <form name="frmInfraccion" action="srvActualizarInfraccion" method="post">
              <%
                Infraccion i1;
                String idInfraccion = "";
                idInfraccion = (request.getParameter("iD"));

                SrvInfraccion_Service Agente = new SrvInfraccion_Service();
                i1 = Agente.getSrvInfraccionPort().buscarInfraccion(idInfraccion);
              %>

              <div data-mdb-input-init class="form-outline mb-4">
                <input type="text" id="idInfraccion" class="form-control form-control-lg" name="txtidInfraccion" value="<%=i1.getIdInfraccion()%>" readonly required/>
                <label class="form-label" for="idInfraccion" >ID Infraccion</label>
              </div>

              <div data-mdb-input-init class="form-outline mb-4">
                <input type="text" id="descripcion" class="form-control form-control-lg" name="txtDescripcion" value="<%=i1.getDescripcion()%>" required />
                <label class="form-label" for="descripcion">Descripcion</label>
              </div>

              <div data-mdb-input-init class="form-outline mb-4">
                <input type="number" id="multa" class="form-control form-control-lg" name="txtMulta" value="<%=i1.getMulta()%>" required />
                <label class="form-label" for="multa">Multa</label>
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
