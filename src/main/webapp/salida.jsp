<%-- 
    Document   : salida
    Created on : 18-09-2022, 22:40:39
    Author     : Damián Sasia Ybar
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Calculo Edad</h1>
        <%
        String nombre = (String) request.getAttribute("nombre"); 
        long edad = (long) request.getAttribute("edad");
        
        %>
        
        
        <p>Hola <%=nombre%>, tu edad es: <%=edad%></p>
    </body>
</html>
