<%--
  Created by IntelliJ IDEA.
  User: JULIAN BRITO
  Date: 15/10/2024
  Time: 07:24 p. m.
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Nueva Infraccion</title>
</head>
<body>
  <%@ include file="Menu.jsp" %>
  <div class="mask d-flex align-items-center h-100 gradient-custom-3">
    <div class="container h-100">
      <div class="row d-flex justify-content-center align-items-center h-100">
        <div class="col-12 col-md-9 col-lg-7 col-xl-6">
          <div class="card" style="border-radius: 15px;">
            <div class="card-body p-5">
              <h2 class="text-uppercase text-center mb-5">Nuevo Registro - Infraccion</h2>

              <form name="frmInfraccion" action="srvInsertarInfraccion" method="post">

                <div data-mdb-input-init class="form-outline mb-4">
                  <input type="text" id="idInfraccion" class="form-control form-control-lg" name="txtidInfraccion" required/>
                  <label class="form-label" for="idInfraccion" >ID Infraccion</label>
                </div>

                <div data-mdb-input-init class="form-outline mb-4">
                  <input type="text" id="descripcion" class="form-control form-control-lg" name="txtDescripcion" required />
                  <label class="form-label" for="descripcion">Descripcion</label>
                </div>

                <div data-mdb-input-init class="form-outline mb-4">
                  <input type="text" id="multa" class="form-control form-control-lg" name="txtMulta" required />
                  <label class="form-label" for="multa">Multa</label>
                </div>
                <div class="d-grid gap-2 col-6 mx-auto">
                  <button class="btn btn-primary" type="submit">Guardar</button>
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
