<%-- 
    Document   : nuevocliente2
    Created on : 27/10/2020, 07:54:56 PM
    Author     : geoffrey
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
     <head>
         <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">  <div class="mov" style="text-align: right">
        <strong >Cerrar sesion</strong><br>
        <a href="index.jsp">(-X-)</a><br><br>
        <a href="Menu.jsp">Volver a Menu</a><br><br>
        <a href="clientes2.jsp">Volver a clientes</a><br><br>
    </div>
    <h1>llene los campos Cliente EMpresarial</h1>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>agregar Cliente</title>
    </head>
    <body>
        
         <form action="Nclienteemp" method="POST">
      <div class="row">
        <div class="col">
            <input type="text" class="form-control" placeholder="Nombre" name="txtnombre">
        </div>
        <div class="col">
            <input type="text" class="form-control" placeholder="Nit" name="txtnit">
        </div>
          <div class="col">
              <input type="text" class="form-control" placeholder="Direccion" name="txtdireccion">
        </div>
      </div><br><br>
        <div class="row">
        <div class="col">
            <input type="text" class="form-control" placeholder="Telefono" name="txttelefono">
        </div>
            
          <div class="col">
          <input type="text" class="form-control" placeholder="Contacto" name="txtcontacto">
        </div>
      <div class="col">
          <input type="text" class="form-control" placeholder="Desc" name="txtdes">
        </div>
        <div class="col">
            <input type="text" class="form-control" placeholder="Estado" name="txtestado">
        </div>
            <div class="col">
          <input type="text" class="form-control" placeholder="Tipo" name="txtTipo">
        </div>
      </div><br><br>
      
      <input type="submit" value="grabar">
    </body>
</html>
