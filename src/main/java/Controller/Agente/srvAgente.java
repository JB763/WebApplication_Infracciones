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
@WebServlet(name = "srvAgente", urlPatterns = {"/srvAgente"})
public class srvAgente extends HttpServlet {

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

        String idAgente = request.getParameter("txtidAgente");
        String nombre = request.getParameter("txtNombre");
        String sector = request.getParameter("txtSector");

        // Llamada al servicio web
        SrvAgente_Service agente = new SrvAgente_Service();
        int resultado = agente.getSrvAgentePort().insertarAgente(idAgente, nombre, sector);
        

        if (resultado == 1) {
            // Operación exitosa
            request.setAttribute("mensaje", "Agente registrado con éxito.");

        } else {
            // Fallo en la operación
            request.setAttribute("mensaje", "Error al registrar el agente.");
        }

        // Redirigir a una página o mostrar mensaje en la misma página
        RequestDispatcher dispatcher = request.getRequestDispatcher("NuevoAgente.jsp");
        dispatcher.forward(request, response);
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
