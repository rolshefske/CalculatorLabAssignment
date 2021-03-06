/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ControllerLabTwo;

import Model.RectangleCalculator;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Lucifur
 */
@WebServlet(name = "MainControllerLabTwo", urlPatterns = {"/MainControllerLabTwo"})
public class MainControllerLabTwo extends HttpServlet {

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
            out.println("<title>Servlet MainControllerLabTwo</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet MainControllerLabTwo at " + request.getContextPath() + "</h1>");
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
        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        // The following variables hold string values taken from named form fields in index.html (via the form method="POST")
        String lengthDimension = request.getParameter("RectangleLength");
        String widthDimension = request.getParameter("RectangleWidth");
        String test = request.getParameter("RectangleSubmit");
        String rectangleArea;
        
        RectangleCalculator rectangleCalculator = new RectangleCalculator();
        rectangleArea = rectangleCalculator.getArea(lengthDimension, widthDimension);
        
        
        request.setAttribute("RectangleArea", rectangleArea);
        
        
        
        RequestDispatcher view = request.getRequestDispatcher("/CalculatorLabTwoIndex.jsp");
        view.forward(request,response);
        
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
