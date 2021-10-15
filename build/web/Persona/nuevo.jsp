<%-- 
    Document   : nuevo
    Created on : oct 13, 2021, 9:25:05 p.m.
    Author     : USER
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cine</title>
    </head>
    <body>
        <h2>Nuevo registro</h2>
        
        <br /><br />
        
        <form action="PersonaControlador?accion=insertar" method="POST" autocomplete="off">
            
            <p>
                Nombre:
                <input id="nombre" name="nombre" type="text" />
            </p>
            
            <p>
                Apellido:
                <input id="apellido" name="apellido" type="text" />
            </p>
            
            <p>
                Edad:
                <input id="edad" name="edad" type="text" />
            </p>
            
            <button id="guardar" name="guardar" type="submit">Guardar</button>
            
        </form>
    </body>
</html>
