package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.Statement;
import Control.Conexion;
import java.util.List;
import Modelo.Producto;
import Modelo.Producto;

public final class editarp_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("     <head>\n");
      out.write("         <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css\" integrity=\"sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2\" crossorigin=\"anonymous\">  <div class=\"mov\" style=\"text-align: right\">\n");
      out.write("        <strong >Cerrar sesion</strong><br>\n");
      out.write("        <a href=\"index.jsp\">(-X-)</a><br><br>\n");
      out.write("        <a href=\"Menu.jsp\">Volver a Menu</a>\n");
      out.write("    </div>\n");
      out.write("    <h1>llene los campos</h1>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Editar estado producto</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        ");

            
            String nombre=request.getParameter("txtnombre");
            Statement statement2 = Conexion.conn.createStatement();
            String consulta2 = "select nombre, marcav, modelo, cantidad, precio, estado from public.\"Producto\" where nombre='Filtro de aire'";
            
            ResultSet rs1 = statement2.executeQuery(consulta2);
            while (rs1.next()) { 
             Producto od= new Producto(rs1.getString("nombre"),rs1.getString("marcav"),rs1.getString("modelo"),
                                           rs1.getInt("cantidad"),rs1.getDouble("precio"),rs1.getString("estado"));
          
          
      
      out.write("\n");
      out.write("       \n");
      out.write("        <form action=\"\">\n");
      out.write("      <div class=\"row\">\n");
      out.write("        <div class=\"col\">\n");
      out.write("            <input type=\"text\" class=\"form-control\" placeholder=\"Nombre\"  name=\"txtnombre\" readonly=\"readonly\" value=\"");
      out.print(od.getNombre());
      out.write("\">\n");
      out.write("        </div>\n");
      out.write("        <div class=\"col\">\n");
      out.write("            <input type=\"text\" class=\"form-control\" placeholder=\"Marca\" name=\"txtmarca\" readonly=\"readonly\" value=\"");
      out.print(od.getMarcav());
      out.write("\">\n");
      out.write("        </div>\n");
      out.write("          <div class=\"col\">\n");
      out.write("              <input type=\"text\" class=\"form-control\" placeholder=\"Modelo\" name=\"txtmodelo\" readonly=\"readonly\" value=\"");
      out.print(od.getModelov());
      out.write("\">\n");
      out.write("        </div>\n");
      out.write("      </div><br><br>\n");
      out.write("        <div class=\"row\">\n");
      out.write("        <div class=\"col\">\n");
      out.write("            <input type=\"text\" class=\"form-control\" placeholder=\"cantidad\" name=\"txtcantidad\" readonly=\"readonly\" value=\"");
      out.print(od.getCantidad());
      out.write("\">\n");
      out.write("        </div>\n");
      out.write("        <div class=\"col\">\n");
      out.write("            <input type=\"text\" class=\"form-control\" placeholder=\"precio\" name=\"txtprecio\" readonly=\"readonly\" value=\"");
      out.print(od.getPrecio());
      out.write("\">\n");
      out.write("        </div>\n");
      out.write("          <div class=\"col\">\n");
      out.write("          <input type=\"text\" class=\"form-control\" placeholder=\"estado\" name=\"txtestado\" value=\"");
      out.print(od.getEstado());
      out.write("\">\n");
      out.write("        </div>\n");
      out.write("      </div><br><br>\n");
      out.write("       ");
}
      out.write("\n");
      out.write("      <input type=\"submit\" value=\"editar\">\n");
      out.write("    </form>\n");
      out.write("         \n");
      out.write("          <script src=\"https://code.jquery.com/jquery-3.5.1.slim.min.js\" integrity=\"sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj\" crossorigin=\"anonymous\"></script>\n");
      out.write("            <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-ho+j7jyWK8fNQe+A12Hb8AhRq26LrZ/JpcUGGOn+Y7RsweNrtN/tE3MoK7ZeZDyx\" crossorigin=\"anonymous\"></script>   \n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
