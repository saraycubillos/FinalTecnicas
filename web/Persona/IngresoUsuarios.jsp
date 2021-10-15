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
        <h1>Ingreso de usuario</h1>
        <% 
            String nombre = request.getParameter("txtNom"); //Codigo java
            String apellido = request.getParameter("txtApe");
            int edad = Integer.parseInt(request.getParameter("txtEdad"));
            %>
            <div class="mb-3">
                    Nombre:<%=nombre%><br>
            </div>
            <div class="mb-3">
                    Apellido:<%=apellido%><br>
            </div>
            <div class="mb-3">
                    Edad:<%=edad%><br>
            </div>
            <a href="CrearUsuario.jsp">
                Volver a principal
            </a>
    </body>
</html>
