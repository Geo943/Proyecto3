package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Modelo.Empresa;
import Modelo.Individual;
import java.util.List;
import Modelo.Cliente;
import Control.Datosdao;

public final class Clientes_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Clientes</title>\n");
      out.write("        <h1>Clientes</h1>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css\" integrity=\"sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh\" crossorigin=\"anonymous\">\n");
      out.write("       \n");
      out.write("         <div class=\"mov\" style=\"text-align: center\">\n");
      out.write("        <a href=\"Menu.jsp\" style=\"text-align: center\">Volver</a><br><br>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("  <body>\n");
      out.write("   <table class=\"table\">\n");
      out.write("  <thead class=\"thead-dark\">\n");
      out.write("    <tr>\n");
      out.write("      <th scope=\"col\">#</th>\n");
      out.write("      <th scope=\"col\">NOMBRE</th>\n");
      out.write("      <th scope=\"col\">NIT</th>\n");
      out.write("      <th scope=\"col\">DIRECCION</th>\n");
      out.write("      <th scope=\"col\">TELEFONO</th>\n");
      out.write("      <th scope=\"col\">DPI</th>\n");
      out.write("      <th scope=\"col\">TIPO</th>\n");
      out.write("      <th scope=\"col\">CONTACTO</th>\n");
      out.write("      <th scope=\"col\">DESC</th>\n");
      out.write("      <th scope=\"col\">ESTADO</th>\n");
      out.write("    </tr>\n");
      out.write("  </thead>\n");
      out.write("  <tbody>\n");
      out.write("      ");

          
      Datosdao dao=new Datosdao();
          List<Individual> cli=dao.getclientes(); 
           List<Empresa> clie=dao.getclientesE();
            for (Individual clientes: cli){
          for (Empresa clientese: clie){
       
      out.write("\n");
      out.write("    <tr>\n");
      out.write("      <th scope=\"row\">");
      out.print(clientes.getId());
      out.write("</th>\n");
      out.write("      <td>");
      out.print(clientes.getNombre());
      out.write("</td>\n");
      out.write("      <td>");
      out.print(clientes.getNit());
      out.write("</td>\n");
      out.write("      <td>");
      out.print(clientes.getDireccion());
      out.write("</td>\n");
      out.write("      <td>");
      out.print(clientes.getTelefono());
      out.write("</td>\n");
      out.write("      <td>");
      out.print(clientes.getDpi());
      out.write("</td>\n");
      out.write("      <td>");
      out.print(clientes.getTipo());
      out.write("</td>\n");
      out.write("      <td>");
      out.print(clientese.getContacto());
      out.write("</td>\n");
      out.write("      <td>");
      out.print(clientese.getDescuento());
      out.write("</td>\n");
      out.write("      <td>");
      out.print(clientese.getEstado());
      out.write("</td>\n");
      out.write("      \n");
      out.write("    </tr>\n");
      out.write("    ");
}}
      out.write("\n");
      out.write("  </tbody>\n");
      out.write("</table>\n");
      out.write("\n");
      out.write("      <script src=\"https://code.jquery.com/jquery-3.4.1.slim.min.js\" integrity=\"sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n\" crossorigin=\"anonymous\"></script>\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js\" integrity=\"sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo\" crossorigin=\"anonymous\"></script>\n");
      out.write("<script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js\" integrity=\"sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6\" crossorigin=\"anonymous\"></script>\n");
      out.write("      \n");
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
