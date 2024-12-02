<%--
  Created by IntelliJ IDEA.
  User: JULIAN BRITO
  Date: 14/10/2024
  Time: 05:33 p. m.
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<head>
    <title>Registro - Agente</title>

</head>
    <body>
        <%@include file="Menu.jsp" %>
            <div class="mask d-flex align-items-center h-100 gradient-custom-3">
                <div class="container h-100">
                    <div class="row d-flex justify-content-center align-items-center h-100">
                        <div class="col-12 col-md-9 col-lg-7 col-xl-6">
                            <div class="card" style="border-radius: 15px;">
                                <div class="card-body p-5">
                                    <h2 class="text-uppercase text-center mb-5">Nuevo Registro - Agente</h2>

                                    <form name="frmAgente" action="srvAgente" method="post">

                                        <div data-mdb-input-init class="form-outline mb-4">
                                            <input type="text" id="idAgente" class="form-control form-control-lg" name="txtidAgente" required/>
                                            <label class="form-label" for="idAgente" >ID Agente</label>
                                        </div>

                                        <div data-mdb-input-init class="form-outline mb-4">
                                            <input type="text" id="nombre" class="form-control form-control-lg" name="txtNombre" required />
                                            <label class="form-label" for="nombre">Nombre - Apellido</label>
                                        </div>

                                        <div data-mdb-input-init class="form-outline mb-4">
                                            <input type="text" id="sector" class="form-control form-control-lg" name="txtSector" required />
                                            <label class="form-label" for="sector">Sector</label>
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
