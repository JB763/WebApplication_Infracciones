<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
  <title>Autenticacion usuario</title>
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css">
  <link href="css/styleLogin.css" rel="stylesheet" type="text/css">
  <link href="https://cdnjs.cloudflare.com/ajax/libs/mdb-ui-kit/3.10.2/mdb.min.css" rel="stylesheet">
  <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.1/css/all.min.css" rel="stylesheet">
</head>
<body>
<section class="vh-100">
  <div class="container-fluid h-custom">
    <div class="row d-flex justify-content-center align-items-center h-100">
      <div class="col-md-9 col-lg-6 col-xl-5">
        <img src="images/authenticationimg/5101874.jpg" class="img-fluid" alt="Sample image">
      </div>
      <div class="col-md-8 col-lg-6 col-xl-4 offset-xl-1">
        <form name="frmUser" action="srvUsuarioLogin" method="post">
          <div class="d-flex flex-row align-items-center justify-content-center justify-content-lg-start">
            <p class="lead fw-normal mb-0 me-3">Inicia sesion con</p>
            <button  type="button" data-mdb-button-init data-mdb-ripple-init class="btn btn-primary btn-floating mx-1">
              <i class="fab fa-facebook-f"></i>
            </button>

            <button  type="button" data-mdb-button-init data-mdb-ripple-init class="btn btn-primary btn-floating mx-1">
              <i class="fab fa-twitter"></i>
            </button>

            <button  type="button" data-mdb-button-init data-mdb-ripple-init class="btn btn-primary btn-floating mx-1">
              <i class="fab fa-linkedin-in"></i>
            </button>
          </div>

          <div class="divider d-flex align-items-center my-4">
            <p class="text-center fw-bold mx-3 mb-0">O</p>
          </div>

          <!-- user input -->
          <div data-mdb-input-init class="form-outline mb-4">
            <input type="text" id="Usuario" class="form-control form-control-lg"
                   placeholder="Ingrese un usuario valido" name="txtUsuario"/>
            <label class="form-label" for="Usuario">Usuario</label>
          </div>

          <!-- Password input -->
          <div data-mdb-input-init class="form-outline mb-3">
            <input type="password" id="Contraseña" class="form-control form-control-lg"
                   placeholder="Ingrese su contraseña" name="txtPassword"/>
            <label class="form-label" for="Contraseña" >Contraseña</label>
          </div>

          <div class="d-flex justify-content-between align-items-center">
            <!-- Checkbox -->
            <div class="form-check mb-0">
              <input disabled class="form-check-input me-2" type="checkbox" value="" id="Remember" />
              <label class="form-check-label" for="Remember">
                Recordarme
              </label>
            </div>
            <a href="#!" class="text-body">Olvidaste la contraseña?</a>
          </div>

          <div class="text-center text-lg-start mt-4 pt-2">
            <button  type="submit" data-mdb-button-init data-mdb-ripple-init class="btn btn-primary btn-lg"
                     style="padding-left: 2.5rem; padding-right: 2.5rem;" name="btnIngresar">Iniciar sesion
            </button>
            <p class="small fw-bold mt-2 pt-1 mb-0">No tienes una cuenta? <a href="#!" class="link-danger">Registrarse</a></p>
          </div>
          <%
            if (request.getAttribute("error") != null) {
          %>
          <div class="alert alert-danger mt-3">
            <%= request.getAttribute("error") %>
          </div>
          <%
            }
          %>
        </form>

      </div>
    </div>
  </div>
</section>

<script src="js/bootstrap.bundle.min.js" type="text/javascript"></script>
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.3/dist/umd/popper.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/mdb-ui-kit/3.10.2/mdb.min.js"></script>
</body>
</html>
