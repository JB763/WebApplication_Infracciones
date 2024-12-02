package Controller.Pago;

import Model.Pago.SrvPago_Service;

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
@WebServlet(name = "srvActualizarPago", urlPatterns = {"/srvActualizarPago"})
public class srvActualizarPago extends HttpServlet {

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
        String idPago = request.getParameter("txtidPago");
        String Fecha_Pago = request.getParameter("txtFecha");
        int monto = Integer.parseInt(request.getParameter("txtMonto"));
        String idSancion = request.getParameter("txtidSancion");

        SrvPago_Service srvPago = new SrvPago_Service();
        int respuesta = srvPago.getSrvPagoPort().actualizarPago(idPago, Fecha_Pago, monto, idSancion);

        if (respuesta == 1) {
            request.setAttribute("respuesta", "Pago actualizado correctamente");
            RequestDispatcher rd = request.getRequestDispatcher("MantenimientoPago.jsp");
        } else {
            request.setAttribute("respuesta", "No se pudo actualizar el pago");
            RequestDispatcher rd = request.getRequestDispatcher("MantenimientoPago.jsp");
        }
        request.getRequestDispatcher("MantenimientoPago.jsp?=iD" + idPago).forward(request, response);
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
