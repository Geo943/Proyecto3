<%-- 
    Document   : index
    Created on : 20/10/2020, 03:28:46 PM
    Author     : geoffrey
--%>
<%@page import="Modelo.Log"%>
<%@page import="java.util.List"%>
<%@page import="Control.Datosdao"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">    </head>
    <body>
        <hr>
        <h1>Ingreso</h1>
        <hr>
        <form action="Logins" method="POST" >
            usuario:<input type="text" name="txtusuario"><br><br>
            contraseña:<input type="text" name="txtcontra"><br><br>
            <input type="submit" value="inicio de sesion">
 
        </form>
      <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ho+j7jyWK8fNQe+A12Hb8AhRq26LrZ/JpcUGGOn+Y7RsweNrtN/tE3MoK7ZeZDyx" crossorigin="anonymous"></script>    
    </body>
</html>
