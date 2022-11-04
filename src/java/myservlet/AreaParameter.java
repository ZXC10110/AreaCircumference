//63050096 กั
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myservlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author kanya
 */
public class AreaParameter extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
     protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        //input
        String circleRadiusStr = request.getParameter("circleradius");
        double circleRadius = Double.parseDouble(circleRadiusStr);
        DecimalFormat twoDigits = new DecimalFormat("0.00000");
        double pi = 3.142857142857143;
        //area
        double area = (circleRadius * circleRadius) * pi;
        String areaStr = twoDigits.format(area);
        //parameter
        double circumference = circleRadius * (pi * 2);
        String circumferenceStr = twoDigits.format(circumference);
        circleRadiusStr = twoDigits.format(circleRadius);
        try {
           
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet FtoC</title>");  
            out.println("</head>");
            out.println("<body>");
            out.println("<h1> For The Circle With Radius  = " + circleRadius + "</h1>");
            out.println("<h1> Area          is " + areaStr + "</h1>");
            out.println("<h1> Circumference is " + circumferenceStr + "</h1>");
            out.println("</body>");
            out.println("</html>");
            
        } finally {            
            out.close();
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
