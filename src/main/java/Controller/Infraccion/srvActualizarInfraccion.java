package Controller.Infraccion;



import Model.Infraccion.SrvInfraccion_Service;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author JULIAN BRITO
 */
@WebServlet(name = "srvActualizarInfraccion", urlPatterns = {"/srvActualizarInfraccion"})
public class srvActualizarInfraccion extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request  servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException      if an I/O error occurs
     */
    // Método central que maneja las solicitudes GET y POST
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        // Manejo de la salida
        try (PrintWriter out = response.getWriter()) {

        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">

    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request  servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException      if an I/O error occurs
     */
    // Sobrescribir el método doGet para manejar solicitudes GET
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request  servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException      if an I/O error occurs
     */
    // Sobrescribir el método doPost para manejar solicitudes POST
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        RequestDispatcher rd=null;
        String idInfraccion, descripcion;
        int multa;
        Integer Respuesta = 0;
        boolean error = false;

        idInfraccion = (request.getParameter("txtidInfraccion"));
        descripcion = request.getParameter("txtDescripcion");
        multa = Integer.parseInt(request.getParameter("txtMulta"));
        try {
            // Intentamos convertir el valor del input en un número entero
            multa = Integer.parseInt(request.getParameter("txtMulta"));
        } catch (NumberFormatException e) {
            // Si hay un error de formato, capturamos la excepción
            error = true;
            request.setAttribute("mensaje", "Error: El valor de la multa debe ser numérico.");
            rd = request.getRequestDispatcher("MantenimientoInfraccion.jsp");
            rd.forward(request, response);
            return; // Salimos del método para evitar seguir procesando
        }

        if(!error ) {
            SrvInfraccion_Service srvInfraccion = new SrvInfraccion_Service();
            Respuesta = srvInfraccion.getSrvInfraccionPort().actualizarInfraccion(idInfraccion, descripcion, multa);
            request.setAttribute("Respuesta", Respuesta);

            if (Respuesta == 1) {
                // Actualización sin problema
                request.setAttribute("mensaje", "Infraccion actualizada con éxito.");
                rd = request.getRequestDispatcher("MantenimientoInfraccion.jsp");

            } else {
                // Error al actualizar
                request.setAttribute("mensaje", "Error al actualizar la infraccion.");
                rd = request.getRequestDispatcher("MantenimientoInfraccion.jsp");
            }
            rd = request.getRequestDispatcher("MantenimientoInfraccion.jsp?id=" + idInfraccion);
            rd.forward(request, response);
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
