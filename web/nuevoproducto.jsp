<%-- 
    Document   : nuevoproducto
    Created on : 26/10/2020, 07:11:14 PM
    Author     : geoffrey
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
         <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">  <div class="mov" style="text-align: right">
        <strong >Cerrar sesion</strong><br>
        <a href="index.jsp">(-X-)</a><br><br>
        <a href="Menu.jsp">Volver a Menu</a>
    </div>
    <h1>llene los campos</h1>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Agregar producto</title>
    </head>
    <body>
        <form action="Nproducto" method="POST">
      <div class="row">
        <div class="col">
            <input type="text" class="form-control" placeholder="Nombre" name="txtnombre">
        </div>
        <div class="col">
            <input type="text" class="form-control" placeholder="Marca" name="txtmarca">
        </div>
          <div class="col">
              <input type="text" class="form-control" placeholder="Modelo" name="txtmodelo">
        </div>
      </div><br><br>
        <div class="row">
        <div class="col">
            <input type="text" class="form-control" placeholder="cantidad" name="txtcantidad">
        </div>
        <div class="col">
            <input type="text" class="form-control" placeholder="precio" name="txtprecio">
        </div>
          <div class="col">
          <input type="text" class="form-control" placeholder="estado" name="txtestado">
        </div>
      </div><br><br>
      <input type="submit" value="grabar">
    </form>
           
          <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
            <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ho+j7jyWK8fNQe+A12Hb8AhRq26LrZ/JpcUGGOn+Y7RsweNrtN/tE3MoK7ZeZDyx" crossorigin="anonymous"></script>   
    </body>
</html>
