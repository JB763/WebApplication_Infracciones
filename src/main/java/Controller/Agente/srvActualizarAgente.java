package Controller.Agente;

import Model.Agente.SrvAgente_Service;

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
@WebServlet(name = "srvActualizarAgente", urlPatterns = {"/srvActualizarAgente"})
public class srvActualizarAgente extends HttpServlet {

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
            // Aquí puedes agregar tu código de procesamiento de la solicitud
            RequestDispatcher rd=null;
            String idAgente, nombre, Sector;
            Integer Respuesta = 0;

            idAgente = (request.getParameter("txtidAgente"));
            nombre = request.getParameter("txtNombre");
            Sector = request.getParameter("txtSector");

            SrvAgente_Service Agente = new SrvAgente_Service();
            Respuesta = Agente.getSrvAgentePort().actualizarAgente(idAgente, nombre, Sector);

            request.setAttribute("Respuesta", Respuesta);
            if (Respuesta == 1) {
                // Actualización sin problema
                request.setAttribute("mensaje", "Agente actualizado con éxito.");
                rd = request.getRequestDispatcher("MantenimientoAgente.jsp");
            } else {
                // Error al actualizar
                request.setAttribute("mensaje", "Error al actualizar el agente.");
                rd = request.getRequestDispatcher("MantenimientoAgente.jsp");
            }
            rd = request.getRequestDispatcher("MantenimientoAgente.jsp?id=" + idAgente);
            rd.forward(request,response);
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
        processRequest(request, response);
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
