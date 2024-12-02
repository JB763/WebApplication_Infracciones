package Controller.Sancion;

import Model.Sancion.SrvSancion_Service;

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
@WebServlet(name = "srvActualizarSancion", urlPatterns = {"/srvActualizarSancion"})
public class srvActualizarSancion extends HttpServlet {

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
        String idSancion = request.getParameter("txtidSancion");
        String fecha = request.getParameter("txtFecha");
        String idInfraccion = request.getParameter("txtidInfraccion");
        String idLicencia = request.getParameter("txtidLicencia");
        String idAgente = request.getParameter("txtidAgente");

        SrvSancion_Service srvSancion = new SrvSancion_Service();
        int respuesta = srvSancion.getSrvSancionPort().actualizarSancion(idSancion, fecha, idInfraccion, idLicencia, idAgente);

        if(respuesta == 1){
            request.setAttribute("mensaje", "Sanción actualizada correctamente");
            RequestDispatcher rd = request.getRequestDispatcher("MantenimientoSancion.jsp");
        }else{
            request.setAttribute("mensaje", "Error al actualizar la sanción");
            RequestDispatcher rd = request.getRequestDispatcher("MantenimientoSancion.jsp");
        }
        RequestDispatcher rd = request.getRequestDispatcher("MantenimientoSancion.jsp?iD=" + idSancion);
        rd.forward(request, response);
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
