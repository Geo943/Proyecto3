package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import Modelo.Producto;
import Control.Datosdao;

public final class Productos_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <div class=\"mov\" style=\"text-align: right\">\n");
      out.write("        <strong >Cerrar sesion</strong><br>\n");
      out.write("        <a href=\"index.jsp\">(-X-)</a><br><br>\n");
      out.write("        <a href=\"Menu.jsp\">Volver a Menu</a>\n");
      out.write("    </div>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Productos</title> \n");
      out.write("       <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css\" integrity=\"sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2\" crossorigin=\"anonymous\">        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Productos</title>\n");
      out.write("    <h1>Productos</h1>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <table class=\"table\">\n");
      out.write("  <thead class=\"thead-dark\">\n");
      out.write("    <tr>\n");
      out.write("      <th scope=\"col\">#</th>\n");
      out.write("      <th scope=\"col\">NOMBRE</th>\n");
      out.write("      <th scope=\"col\">MARCA</th>\n");
      out.write("      <th scope=\"col\">MODELO</th>\n");
      out.write("      <th scope=\"col\">CANTIDAD</th>\n");
      out.write("      <th scope=\"col\">PRECIO</th>\n");
      out.write("      <th scope=\"col\">ESTADO</th>\n");
      out.write("      <th scope=\"col\">Cambiar ESTADO</th>\n");
      out.write("    </tr>\n");
      out.write("  </thead>\n");
      out.write("  <tbody>\n");
      out.write("      ");

          Datosdao dao=new Datosdao();
          List<Producto> pro=dao.getproductos(); 
          for (Producto producto: pro){
          
      
      out.write("\n");
      out.write("    <tr>\n");
      out.write("      <th scope=\"row\">");
      out.print(producto.getId());
      out.write("</th>\n");
      out.write("      <td>");
      out.print(producto.getNombre());
      out.write("</td>\n");
      out.write("      <td>");
      out.print(producto.getMarcav());
      out.write("</td>\n");
      out.write("      <td>");
      out.print(producto.getModelov());
      out.write("</td>\n");
      out.write("      <td>");
      out.print(producto.getCantidad());
      out.write("</td>\n");
      out.write("      <td>");
      out.print(producto.getPrecio());
      out.write("</td>\n");
      out.write("      <td>");
      out.print(producto.getEstado());
      out.write("</td>\n");
      out.write("      <td><a href=\"editarp.jsp?nombre1=");
      out.print(producto.getNombre());
      out.write("\">X</a></td>>\n");
      out.write("      \n");
      out.write("    </tr>\n");
      out.write("    ");
}
      out.write("\n");
      out.write("  </tbody>\n");
      out.write("</table>\n");
      out.write("<strong >Agregar Productos</strong><br><br>\n");
      out.write("          <a href=\"nuevoproducto.jsp\">Nuevo</a><br><br>\n");
      out.write("  <script src=\"https://code.jquery.com/jquery-3.5.1.slim.min.js\" integrity=\"sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj\" crossorigin=\"anonymous\"></script>\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-ho+j7jyWK8fNQe+A12Hb8AhRq26LrZ/JpcUGGOn+Y7RsweNrtN/tE3MoK7ZeZDyx\" crossorigin=\"anonymous\"></script>   \n");
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
