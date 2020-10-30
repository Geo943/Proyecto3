<%-- 
    Document   : prueba
    Created on : 27/10/2020, 11:30:33 AM
    Author     : geoffrey
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
<form action="">
      <div class="row">
        <div class="col">
            <input type="text" class="form-control" placeholder="Nombre"  name="txtnombre" readonly="readonly" >
        </div>
        <div class="col">
            <input type="text" class="form-control" placeholder="Marca" name="txtmarca" readonly="readonly" >
        </div>
          <div class="col">
              <input type="text" class="form-control" placeholder="Modelo" name="txtmodelo" readonly="readonly" >
        </div>
      </div><br><br>
        <div class="row">
        <div class="col">
            <input type="text" class="form-control" placeholder="cantidad" name="txtcantidad" readonly="readonly" >
        </div>
        <div class="col">
            <input type="text" class="form-control" placeholder="precio" name="txtprecio" readonly="readonly" >
        </div>
          <div class="col">
          <input type="text" class="form-control" placeholder="estado" name="txtestado" >
        </div>
      </div><br><br>
      <input type="submit" value="editar">
    </form>
        <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ho+j7jyWK8fNQe+A12Hb8AhRq26LrZ/JpcUGGOn+Y7RsweNrtN/tE3MoK7ZeZDyx" crossorigin="anonymous"></script>
    </body>
</html>
