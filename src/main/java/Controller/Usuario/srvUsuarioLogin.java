package Controller.Usuario;

import Model.Usuario.Login;
import Model.Usuario.SrvUsuario_Service;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "srvUsuarioLogin", urlPatterns = {"/srvUsuarioLogin"})
public class srvUsuarioLogin extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String usuario = request.getParameter("txtUsuario");
        String password = request.getParameter("txtPassword");
        String respuesta;
        String nombre = "";

        try {
            SrvUsuario_Service service = new SrvUsuario_Service();
            Login login = service.getSrvUsuarioPort().autenticarUsuario(usuario, password);

            if (login != null && login.getUsuario() != null) {
                respuesta = "True";
                nombre = login.getNombre();
                HttpSession session = request.getSession();
                session.setAttribute("usuario", usuario);
                session.setAttribute("nombre", nombre);
            } else {
                respuesta = "False";
            }
        } catch (Exception ex) {
            respuesta = "False";
        }

        if ("True".equals(respuesta)) {
            RequestDispatcher rd = request.getRequestDispatcher("Menu.jsp");
            rd.forward(request, response);
        } else {
            request.setAttribute("error", "Credenciales incorrectas, inténtalo de nuevo.");
            RequestDispatcher rd = request.getRequestDispatcher("Login.jsp");
            rd.forward(request, response);
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Servlet para autenticar usuario usando servicio SOAP.";
    }
}
