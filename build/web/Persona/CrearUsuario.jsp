<%-- 
    Document   : CrearUsuario
    Created on : oct 14, 2021, 8:58:40 p.m.
    Author     : USER
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
    </head>
    <body>
        <div class="container"><h1>FORMULARIO DE DATOS</h1></div>
        <div class="container">
            <form action="IngresoUsuarios.jsp" method="post">
                <div class="mb-3">
                    Nombre: <input type="text" name="txtNom"><br>
                </div>
                <div class="mb-3">
                    Apellido: <input type="text" name="txtApe"><br>
                </div>
                <div class="mb-3">
                    Edad: <input type="text" name="txtEdad"><br>
                </div>
                <div class="mb-3">
                    <input type="submit" name="btn1" value="Enviar Datos">
                </div>
            </form>
        </div>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
    </body>
</html>
