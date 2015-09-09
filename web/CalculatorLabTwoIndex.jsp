<%-- 
    Document   : CalculatorLabTwoIndex
    Created on : Sep 8, 2015, 2:46:42 AM
    Author     : Lucifur
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Rectangle Calculator</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" type="text/css" href="css.css">
    </head>
    <body>
        <div>
            <h2>Rectangle Calculator</h2>
            <p>Please enter the length of the rectangle:</p>
            <form id="RectangleCalculator" name="RectangleCalculator" action="MainControllerLabTwo" method="post">
            <input type="number" name="RectangleLength" min="1" max="9000000" value="1" required>
            <p>Please enter the length of the rectangle:</p>
            <input type="number" name="RectangleWidth" min="1" max="9000000" value="1" required>
            <br><br>
            <input type="submit" id="RectangleSubmit" name="RectangleSubmit" value="Submit Rectangle Dimensions!">
            </form>
            
            <%
                String rectangleArea;
                
               try
               {
                   if(request.getAttribute("RectangleArea").toString() != null)
                   {%>
                       <c:out>${RectangleArea}</c:out>
                    <%   
                   }
               }
                   catch(NullPointerException e){ out.println("Value is NULL");}
                
                        
            %>
            

            
        </div>
    </body>
</html>
