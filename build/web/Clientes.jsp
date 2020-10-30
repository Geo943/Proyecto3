<%-- 
    Document   : Clientes
    Created on : 23/10/2020, 09:33:03 PM
    Author     : geoffrey
--%>

<%@page import="Modelo.Empresa"%>
<%@page import="Modelo.Individual"%>
<%@page import="java.util.List"%>
<%@page import="Modelo.Cliente"%>
<%@page import="Control.Datosdao"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Clientes</title>
        <h1>Clientes</h1>
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">       
         <div class="mov" style="text-align: center">
        <a href="Menu.jsp" style="text-align: center">Volver</a><br><br>
    </head>
    <body>
  <body>
   <table class="table">
  <thead class="thead-dark">
    <tr>
      <th scope="col">#</th>
      <th scope="col">NOMBRE</th>
      <th scope="col">NIT</th>
      <th scope="col">DIRECCION</th>
      <th scope="col">TELEFONO</th>
      <th scope="col">DPI</th>
      <th scope="col">TIPO</th>
      <th scope="col">CONTACTO</th>
      <th scope="col">DESC</th>
      <th scope="col">ESTADO</th>
    </tr>
  </thead>
  <tbody>
      <%
          
      Datosdao dao=new Datosdao();
          List<Individual> cli=dao.getclientes(); 
           List<Empresa> clie=dao.getclientesE();
            for (Individual clientes: cli){
          for (Empresa clientese: clie){
       %>
    <tr>
      <th scope="row"><%=clientes.getId()%></th>
      <td><%=clientes.getNombre()%></td>
      <td><%=clientes.getNit()%></td>
      <td><%=clientes.getDireccion()%></td>
      <td><%=clientes.getTelefono()%></td>
      <td><%=clientes.getDpi()%></td>
      <td><%=clientes.getTipo()%></td>
      <td><%=clientese.getContacto()%></td>
      <td><%=clientese.getDescuento()%></td>
      <td><%=clientese.getEstado()%></td>
      
    </tr>
    <%}}%>
  </tbody>
</table>

<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ho+j7jyWK8fNQe+A12Hb8AhRq26LrZ/JpcUGGOn+Y7RsweNrtN/tE3MoK7ZeZDyx" crossorigin="anonymous"></script>      
    </body>
</html>
