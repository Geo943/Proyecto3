<%-- 
    Document   : clientes2
    Created on : 26/10/2020, 05:55:54 PM
    Author     : geoffrey
--%>

<%@page import="Modelo.Empresa"%>
<%@page import="java.util.List"%>
<%@page import="Modelo.Individual"%>
<%@page import="Modelo.Individual"%>
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
     <strong >Agregar Cliente Individual</strong><br><br>
          <a href="nuevocliente1.jsp">Nuevo</a><br><br>
          <strong >Agregar Cliente Empresarial</strong><br><br>
          <a href="nuevocliente2.jsp">Nuevo</a><br><br>
          
     <h1>Clientes</h1>
         <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">

        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
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
      <th scope="col">ESTADO</th>
    </tr>
  </thead>
  <tbody>
       <%
          
      Datosdao dao=new Datosdao();
          List<Individual> cli=dao.getclientes(); 
           List<Empresa> clie=dao.getclientesE();
            for (Individual clientes: cli){
       %>
    <tr>
      <th scope="row"><%=clientes.getId()%></th>
      <td><%=clientes.getNombre()%></td>
      <td><%=clientes.getNit()%></td>
      <td><%=clientes.getDireccion()%></td>
      <td><%=clientes.getTelefono()%></td>
      <td><%=clientes.getDpi()%></td>
      <td><%=clientes.getTipo()%></td>
      <td><%=clientes.getEstado()%></td>
    </tr>
    <%}%>
  </tbody>
</table>

<table class="table">
  <thead class="thead-light">
    <tr>
       <th scope="col">#</th>
      <th scope="col">NOMBRE</th>
      <th scope="col">NIT</th>
      <th scope="col">DIRECCION</th>
      <th scope="col">TELEFONO</th>
      <th scope="col">TIPO</th>
      <th scope="col">CONTACTO</th>
      <th scope="col">DESC</th>
      <th scope="col">ESTADO</th>
    </tr>
     
  </thead>
  <tbody>
      <%for (Empresa clientese: clie){%>
    <tr>
      <th scope="row"><%=clientese.getId()%></th>
      <td><%=clientese.getNombre()%></td>
      <td><%=clientese.getNit()%></td>
      <td><%=clientese.getDireccion()%></td>
      <td><%=clientese.getTelefono()%></td>
      <td><%=clientese.getTipo()%></td>
      <td><%=clientese.getContacto()%></td>
      <td><%=clientese.getDescuento()%></td>
      <td><%=clientese.getEstado()%></td>
    </tr>
     <%}%>
  </tbody>
</table>
          
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ho+j7jyWK8fNQe+A12Hb8AhRq26LrZ/JpcUGGOn+Y7RsweNrtN/tE3MoK7ZeZDyx" crossorigin="anonymous"></script>      
    </body>
</html>
