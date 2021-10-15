<%-- 
    Document   : index.jsp
    Created on : oct 13, 2021, 9:24:46 p.m.
    Author     : USER
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cine</title>
    </head>
    <body>
        <h1>Persona</h1>
        
        <a href="PersonaControlador?accion=nuevo">Nuevo Registro</a>
        
        <br /><br />
        
        <table border="1" width="80%">
            <thead>
                <tr>
                    <th>Nombre</th>
                    <th>Apellido</th>
                    <th>Edad</th>
                    <th></th>
                    <th></th>
                </tr>
            </thead>
            
            <tbody>
                
                <c:forEach var="persona" items="$(lista)">
                    <tr>
                        <td><c:out value="${persona.nombre}" /></td>
                        <td><c:out value="${persona.apellido}" /></td>
                        <td><c:out value="${persona.edad}" /></td>
                        <td><a href="PersonaControlador?=modificar&id=<c:out value="${persona.id}"/>"Modificar></a></td>
                        <td><a a href="PersonaControlador?=eliminar&id=<c:out value="${persona.id}"/>"Eliminar></a></td>
                        
                        
                    </tr>
                </c:forEach>
                
            </tbody>
            
        </table>
    </body>
</html>