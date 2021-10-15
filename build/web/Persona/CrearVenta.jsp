<%-- 
    Document   : CrearVenta
    Created on : oct 14, 2021, 10:16:57 p.m.
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
        <div class="container"><h1>DATOS DE VENTA</h1></div>
        <div class="container">
            <form action="TotalTaquilla.jsp" method="post">
                <div class="mb-3">
                    Tipo de público: <select name="selectPub">
                        <option value="infantil">Infantil</option>
                        <option value="Todo publico">Para todo público</option>
                        <option value="juvenil">Juvenil</option>
                    </select><br>
                </div>
                <div class="mb-3">
                    Sala: <select name="selectSala">
                        <option value="una">una</option>
                        <option value="dos">dos</option>
                        <option value="tres">tres</option>
                    </select><br>
                </div>
                <div class="mb-3">
                    Nombre de película: <input type="text" name="txtPelicula"><br>
                </div>
                <div class="mb-3">
                    Horario: <input type="text" name="txtHorario"><br>
                </div>
                <div class="mb-3">
                    Precio: <select name="selectPrecio">
                        <option value="Diez">10</option>
                        <option value="Quince">15</option>
                        <option value="Ocho">8</option>
                    </select><br>
                </div>
                <div class="mb-3">
                    <input type="submit" name="btn1" value="Enviar Datos">
                </div>
            </form>
        </div>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
    </body>
</html>
