<%-- 
    Document   : editarp
    Created on : 28/10/2020, 10:30:46 AM
    Author     : geoffrey
--%>


<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="Control.Conexion"%>
<%@page import="java.util.List"%>
<%@page import="Modelo.Producto"%>
<%@page import="Modelo.Producto"%>
<!DOCTYPE html>
<html>
     <head>
         <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">  <div class="mov" style="text-align: right">
        <strong >Cerrar sesion</strong><br>
        <a href="index.jsp">(-X-)</a><br><br>
        <a href="Menu.jsp">Volver a Menu</a>
        <a href="Productos.jsp">Volver a productos</a>
    </div>
    <h1>llene los campos</h1>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Editar estado producto</title>
    </head>
    <body>
        
        <%
            
            String nombre=request.getParameter("nombre1");
            Statement statement2 = Conexion.conn.createStatement();
            String consulta2 = "select nombre, marcav, modelo, cantidad, precio, estado from public.\"Producto\" where nombre='"+nombre+"'";
            
            ResultSet rs1 = statement2.executeQuery(consulta2);
            while (rs1.next()) { 
             Producto od= new Producto(rs1.getString("nombre"),rs1.getString("marcav"),rs1.getString("modelo"),
                                           rs1.getInt("cantidad"),rs1.getDouble("precio"),rs1.getString("estado"));
          
          
      %>
       
        <form action="">
      <div class="row">
        <div class="col">
            <input type="text" class="form-control" placeholder="Nombre"  name="txtnombre" readonly="readonly" value="<%=od.getNombre()%>">
        </div>
        <div class="col">
            <input type="text" class="form-control" placeholder="Marca" name="txtmarca" readonly="readonly" value="<%=od.getMarcav()%>">
        </div>
          <div class="col">
              <input type="text" class="form-control" placeholder="Modelo" name="txtmodelo" readonly="readonly" value="<%=od.getModelov()%>">
        </div>
      </div><br><br>
        <div class="row">
        <div class="col">
            <input type="text" class="form-control" placeholder="cantidad" name="txtcantidad" readonly="readonly" value="<%=od.getCantidad()%>">
        </div>
        <div class="col">
            <input type="text" class="form-control" placeholder="precio" name="txtprecio" readonly="readonly" value="<%=od.getPrecio()%>">
        </div>
          <div class="col">
          <input type="text" class="form-control" placeholder="estado" name="txtestado" value="<%=od.getEstado()%>">
        </div>
      </div><br><br>
       <%} %>
       <input type="submit" value="editar" name="btneditar">
    <%
    if (request.getParameter("btneditar")!=null){
    String nestado=request.getParameter("txtestado");
    statement2.executeUpdate("UPDATE public.\"Producto\" SET  estado='"+nestado+"' WHERE nombre='"+nombre+"'");
    
    }
    %>
        
        </form>
         
          <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
            <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ho+j7jyWK8fNQe+A12Hb8AhRq26LrZ/JpcUGGOn+Y7RsweNrtN/tE3MoK7ZeZDyx" crossorigin="anonymous"></script>   
    </body>
</html>
