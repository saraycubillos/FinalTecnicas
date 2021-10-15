<%-- 
    Document   : IngresoUsuarios
    Created on : oct 14, 2021, 9:47:58 p.m.
    Author     : USER
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Taquilla recaudada</h1>
        <% 
            String nombre = request.getParameter("txtNom");
            String apellido = request.getParameter("txtApe");
            int edad = Integer.parseInt(request.getParameter("txtEdad"));
            %>
            
            Tipo de público:<%=nombre%><br>
            Sala:<%=apellido%><br>
            Nombre película:<%=edad%><br>
    </body>
</html>
