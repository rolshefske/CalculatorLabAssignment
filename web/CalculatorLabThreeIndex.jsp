<%-- 
    Document   : CalculatorLabThreeIndex
    Created on : Sep 8, 2015, 5:08:34 AM
    Author     : Lucifur
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Rectangle Calculator</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
    </head>
    <body>
        
        <div class = "navbar navbar-inverse navbar-static-top">
            <div class = "container">
                
                <a href ="#" class ="navbar-brand">Bootstrap + EL and JSTL</a>
                
                <button class = "navbar-toggle"  data-toggle = "collapse" data-target = ".navHeaderCollapse">
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>   
                </button>
                
                <div class = "collapse navbar-collapse navHeaderCollapse">
                    
                    <ul class ="nav navbar-nav navbar-right">
                        <li><a href="CalculatorLabOneIndex.html">Lab One</a></li>
                        <li><a href="CalculatorLabTwoIndex.jsp">Lab Two</a></li>
                        <li><a href="CalculatorLabThreeIndex.jsp">Lab Three</a></li>
                    </ul>
                    
                </div>
                
            </div>
        </div>
        
        
        
        
        
        
        <div>
            <h2>Rectangle Calculator</h2>
            <p>Please enter the length of the rectangle:</p>
            <form id="RectangleCalculator" name="RectangleCalculator" action="MainControllerLabThree" method="post">
            <input type="number" name="RectangleLength" min="1" max="9000000" value="1" required>
            <p>Please enter the length of the rectangle:</p>
            <input type="number" name="RectangleWidth" min="1" max="9000000" value="1" required>
            <br><br>
            <input type="submit" id="RectangleSubmit" name="RectangleSubmit" value="Submit Dimensions!">
            </form>
            
            <%
                String rectangleArea;
                
               try
               {
                if(request.getAttribute("RectangleArea").toString() != null)
                   {
                    %>
                            <c:out>The area of the Rectangle is: ${RectangleArea} square units</c:out>
                    <%
                   }
               }
                   catch(NullPointerException e){ out.println("Value is NULL");}
                
                        
            %>
           
            
            
            
            
            
            <h2>Circle Calculator</h2>
            <p>Please enter the length of the rectangle:</p>
            <form id="CircleCalculator" name="CircleCalculator" action="MainControllerLabThree" method="post">
            <p>Please enter the radius of the circle:</p>
            <input type="number" name="CircleRadius" min="1" max="9000000" value="1" required>
            <br><br>
            <input type="submit" id="CircleSubmit" name="CircleSubmit" value="Submit Dimensions!">
            </form>
            <%
                String CircleArea;
                
               try
               {
                   if(request.getAttribute("CircleArea").toString() != null)
                   {%>
                       <c:out>The area of the Circle is: ${CircleArea} square units</c:out>
                    <%   
                   }
               }
                   catch(NullPointerException e){ out.println("Value is NULL");}
                
                        
            %>
            
            
            
            
            <h2>Triangle Calculator</h2>
            <form id="TriangleCalculator" name="TriangleCalculator" action="MainControllerLabThree" method="post">
            <p>Please enter the base of the Triangle:</p>
            <input type="number" name="TriangleBase" min="1" max="9000000" value="1" required>
            <p>Please enter the height of the Triangle:</p>
            <input type="number" name="TriangleHeight" min="1" max="9000000" value="1" required>
            <br><br>
            <input type="submit" id="TriangleSubmit" name="TriangleSubmit" value="Submit Dimensions!">
            </form>
            <%
                String triangleArea;
                
               try
               {
                   if(request.getAttribute("TriangleArea").toString() != null)
                   {%>
                       <c:out>The area of the Triangle is: ${TriangleArea} square units</c:out>
                    <%   
                   }
               }
                   catch(NullPointerException e){ out.println("Value is NULL");}
                
                        
            %>
        </div>
        
        
        
        <script src="http://code.jquery.com/jquery-1.11.2.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
    </body>
</html>
