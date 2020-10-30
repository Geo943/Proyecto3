<%-- 
    Document   : Productos
    Created on : 23/10/2020, 12:25:26 PM
    Author     : geoffrey
--%>

<%@page import="java.util.List"%>
<%@page import="Modelo.Producto"%>
<%@page import="Control.Datosdao"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <div class="mov" style="text-align: right">
        <strong >Cerrar sesion</strong><br>
        <a href="index.jsp">(-X-)</a><br><br>
        <a href="Menu.jsp">Volver a Menu</a>
    </div>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Productos</title> 
       <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Productos</title>
    <h1>Productos</h1>
    </head>
    <body>
        <table class="table">
  <thead class="thead-dark">
    <tr>
      <th scope="col">#</th>
      <th scope="col">NOMBRE</th>
      <th scope="col">MARCA</th>
      <th scope="col">MODELO</th>
      <th scope="col">CANTIDAD</th>
      <th scope="col">PRECIO</th>
      <th scope="col">ESTADO</th>
      <th scope="col">Cambiar ESTADO</th>
    </tr>
  </thead>
  <tbody>
      <%
          Datosdao dao=new Datosdao();
          List<Producto> pro=dao.getproductos(); 
          for (Producto producto: pro){
          
      %>
    <tr>
      <th scope="row"><%=producto.getId()%></th>
      <td><%=producto.getNombre()%></td>
      <td><%=producto.getMarcav()%></td>
      <td><%=producto.getModelov()%></td>
      <td><%=producto.getCantidad()%></td>
      <td><%=producto.getPrecio()%></td>
      <td><%=producto.getEstado()%></td>
      <td><a href="editarp.jsp?nombre1=<%=producto.getNombre()%>">X</a></td>>
      
    </tr>
    <%}%>
  </tbody>
</table>
<strong >Agregar Productos</strong><br><br>
          <a href="nuevoproducto.jsp">Nuevo</a><br><br>
  <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ho+j7jyWK8fNQe+A12Hb8AhRq26LrZ/JpcUGGOn+Y7RsweNrtN/tE3MoK7ZeZDyx" crossorigin="anonymous"></script>   
    </body>
</html>
