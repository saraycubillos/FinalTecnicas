<%-- 
    Document   : modificar
    Created on : oct 13, 2021, 9:24:56 p.m.
    Author     : USER
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h2>Modificar registro</h2>
        
        <form action="PersonaControlador?accion=actualizar" methods="POST" autocomplete="off"></form>
      
            
        <input id="id" name="id" type="hidden" value="<c:out value="${producto.id}"/>" />
            
            <p>
                Nombre:
                <input id="id" name="nombre" type="text" value="<c:out value="${producto.nombre}"/>" />
            </p>
            
            <p>
                Apellido:
                <input id="apellido" name="apellido" type="text" value="<c:out value="${producto.apellido}"/>" />
            </p>
            
            <p>
                Edad:
                <input id="edad" name="edad" type="text" value="<c:out value="${producto.edad}"/>" />
            </p>
            
            <button id="guardar" name="guardar" type="submit">Guardar</button>
            
        </form>
    </body>
</html>
