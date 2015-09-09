/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ControllerLabThree;

import Model.CircleCalculator;
import Model.RectangleCalculator;
import Model.TriangleCalculator;
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
@WebServlet(name = "MainControllerLabThree", urlPatterns = {"/MainControllerLabThree"})
public class MainControllerLabThree extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
//    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//        response.setContentType("text/html;charset=UTF-8");
//        try (PrintWriter out = response.getWriter()) {
//            /* TODO output your page here. You may use following sample code. */
//            out.println("<!DOCTYPE html>");
//            out.println("<html>");
//            out.println("<head>");
//            out.println("<title>Servlet MainControllerLabThree</title>");            
//            out.println("</head>");
//            out.println("<body>");
//            out.println("<h1>Servlet MainControllerLabThree at " + request.getContextPath() + "</h1>");
//            out.println("</body>");
//            out.println("</html>");
//        }
//    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
//    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
//        processRequest(request, response);
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
//        processRequest(request, response);
        
         String buttonValueOne = null;
         String buttonValueTwo = null;
         String buttonValueThree = null;
         
         buttonValueOne = request.getParameter("RectangleSubmit");
         buttonValueTwo = request.getParameter("CircleSubmit");
         buttonValueThree = request.getParameter("TriangleSubmit");
         
         
         
         if(buttonValueOne != null)
         {
          String lengthDimension = request.getParameter("RectangleLength");
          String widthDimension = request.getParameter("RectangleWidth");
          String rectangleArea;
        
          RectangleCalculator rectangleCalculator = new RectangleCalculator();
          rectangleArea = rectangleCalculator.getArea(lengthDimension, widthDimension);
        
          request.setAttribute("RectangleArea", rectangleArea);
         }
         
         
         
         if(buttonValueTwo != null)
         {
          
          String radiusDimension = request.getParameter("CircleRadius");
          
          String circleArea;
        
          CircleCalculator circleCalculator = new CircleCalculator();
          circleArea = circleCalculator.getArea(radiusDimension);
        
          request.setAttribute("CircleArea", circleArea);
         }         
         
         
         if(buttonValueThree != null)
         {
          
          String triangleHeight = request.getParameter("TriangleHeight");
          String triangleBase = request.getParameter("TriangleBase");
          
          String triangleArea;
        
          TriangleCalculator triangleCalculator = new TriangleCalculator();
          triangleArea = triangleCalculator.getArea(triangleBase, triangleHeight);
        
          request.setAttribute("TriangleArea", triangleArea);
         }  
         
        
         
         RequestDispatcher view = request.getRequestDispatcher("/CalculatorLabThreeIndex.jsp");
         view.forward(request,response);
         
         
       
        
        
        
//        String lengthDimension = request.getParameter("RectangleLength");
//        String widthDimension = request.getParameter("RectangleWidth");
//        String rectangleArea;
//        
//        RectangleCalculator rectangleCalculator = new RectangleCalculator();
//        rectangleArea = rectangleCalculator.getArea(lengthDimension, widthDimension);
//        
//        request.setAttribute("RectangleArea", rectangleArea);
//        
//        
//        RequestDispatcher view = request.getRequestDispatcher("/CalculatorLabThreeIndex.jsp");
//        view.forward(request,response);
        
        
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
