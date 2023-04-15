/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SessionBean;

import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ifzs
 */
public class CalculadoraServlet extends HttpServlet {

    @EJB
    private calcbeanLocal calcbean;

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet CalculadoraServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            
            int a = Integer.parseInt(request.getParameter("a"));
            int b = Integer.parseInt(request.getParameter("b"));
            String action = request.getParameter("action");
        
            if("Suma".equalsIgnoreCase(action)){
                out.println("<div style='position: absolute; top: 115px; left: 110px;'>"); 
                out.println("<img src=\"https://www.supercoloring.com/sites/default/files/styles/coloring_full/public/cif/2022/01/calculator-coloring-page.png\" alt=\"Imagen de ejemplo\">");
                out.println("<div style='position: absolute; top: 115px; left: 150px; font-size: 100px;'>");
                out.println(a + " + " + b + " = " + calcbean.suma(a, b));
                out.println("</div>");
                out.println("</div>");
            }else if("Resta".equalsIgnoreCase(action)){
                out.println("<div style='position: absolute; top: 115px; left: 110px;'>"); 
                out.println("<img src=\"https://www.supercoloring.com/sites/default/files/styles/coloring_full/public/cif/2022/01/calculator-coloring-page.png\" alt=\"Imagen de ejemplo\">");
                out.println("<div style='position: absolute; top: 115px; left: 150px; font-size: 100px;'>");
                out.println(a + " - " + b + " = " + calcbean.resta(a, b));
                out.println("</div>");
                out.println("</div>");
            }else if("Exponente".equalsIgnoreCase(action)){
                out.println("<div style='position: absolute; top: 115px; left: 110px;'>"); 
                out.println("<img src=\"https://www.supercoloring.com/sites/default/files/styles/coloring_full/public/cif/2022/01/calculator-coloring-page.png\" alt=\"Imagen de ejemplo\">");
                out.println("<div style='position: absolute; top: 115px; left: 150px; font-size: 100px;'>");
                out.println(a + " ^ " + b + " = " + calcbean.exponente(a, b));
                out.println("</div>");
                out.println("</div>");
            }else if("Multiplicar".equalsIgnoreCase(action)){
                out.println("<div style='position: absolute; top: 115px; left: 110px;'>"); 
                out.println("<img src=\"https://www.supercoloring.com/sites/default/files/styles/coloring_full/public/cif/2022/01/calculator-coloring-page.png\" alt=\"Imagen de ejemplo\">");
                out.println("<div style='position: absolute; top: 115px; left: 150px; font-size: 100px;'>");
                out.println(a + " * " + b + " = " + calcbean.multiplicar(a, b));
                out.println("</div>");
                out.println("</div>");
            }else if("Dividir".equalsIgnoreCase(action)){
                out.println("<div style='position: absolute; top: 115px; left: 110px;'>"); 
                out.println("<img src=\"https://www.supercoloring.com/sites/default/files/styles/coloring_full/public/cif/2022/01/calculator-coloring-page.png\" alt=\"Imagen de ejemplo\">");
                out.println("<div style='position: absolute; top: 115px; left: 150px; font-size: 100px;'>");
                out.println(a + " / " + b + " = " + calcbean.dividir(a, b));
                out.println("</div>");
                out.println("</div>");
            }else if("Modulo".equalsIgnoreCase(action)){
                out.println("<div style='position: absolute; top: 115px; left: 110px;'>"); 
                out.println("<img src=\"https://www.supercoloring.com/sites/default/files/styles/coloring_full/public/cif/2022/01/calculator-coloring-page.png\" alt=\"Imagen de ejemplo\">");
                out.println("<div style='position: absolute; top: 115px; left: 150px; font-size: 100px;'>");
                out.println(a + " % " + b + " = " + calcbean.modulo(a, b));
                out.println("</div>");
                out.println("</div>");
            }
            
            //out.println("<h1>Servlet CalculadoraServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
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
