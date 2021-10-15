<%-- 
    Document   : TotalTaquilla
    Created on : oct 14, 2021, 10:18:03 p.m.
    Author     : USER
--%>

<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        
    </head>
    <body>
        <h1>DATOS DE VENTA</h1>
        <% 
            String publico = request.getParameter("selectPub");
            int sala = Integer.parseInt(request.getParameter("txtSala"));
            String nom = request.getParameter("txtPelicula");
            int horario = Integer.parseInt(request.getParameter("txtHorario"));
            int precio = Integer.parseInt(request.getParameter("txtPrecio"));
                
            int recaudoTotal = 0;
            ArrayList<Integer> a = new ArrayList(); 
            a.add(precio);
            for(int i =0; i<a.size();i++){
                recaudoTotal += a.get(i);
            }
            %>
            
            Tipo de público:<%=publico%><br>
            Sala:<%=sala%><br>
            Nombre película:<%=nom%><br>
            Horario:<%=horario%><br>
            Precio:<%=precio%><br>
            
            Total:<%=recaudoTotal%><br>
            
            <a href="CrearVenta.jsp">
                Volver a principal
            </a>
    </body>
</html>
