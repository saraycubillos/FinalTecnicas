<%-- 
    Document   : TotalTaquilla
    Created on : oct 14, 2021, 10:18:03 p.m.
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
        <h1>DATOS DE VENTA</h1>
        <% 
            String publico = request.getParameter("selectPub");
            int sala = Integer.parseInt(request.getParameter("selectSala"));
            String nom = request.getParameter("txtPelicula");
            int horario = Integer.parseInt(request.getParameter("txtHorario"));
            int precio = Integer.parseInt(request.getParameter("selectPrecio"));
                
            int sumaTotal = 0;
            sumaTotal = sumaTotal + precio;     
            %>
            
            Tipo de público:<%=publico%><br>
            Sala:<%=sala%><br>
            Nombre película:<%=nom%><br>
            Horario:<%=horario%><br>
            Precio:<%=precio%><br>
            
            Total:<%=sumaTotal%><br>
            
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
    </body>
</html>
