package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class nuevocliente1_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("         <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css\" integrity=\"sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2\" crossorigin=\"anonymous\">  <div class=\"mov\" style=\"text-align: right\">\n");
      out.write("        <strong >Cerrar sesion</strong><br>\n");
      out.write("        <a href=\"index.jsp\">(-X-)</a><br><br>\n");
      out.write("        <a href=\"Menu.jsp\">Volver a Menu</a>\n");
      out.write("    </div>\n");
      out.write("    <h1>llene los campos</h1>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>agregar Cliente</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("         <form action=\"Nclienteind\" method=\"POST\">\n");
      out.write("      <div class=\"row\">\n");
      out.write("        <div class=\"col\">\n");
      out.write("            <input type=\"text\" class=\"form-control\" placeholder=\"Nombre\" name=\"txtnombre\">\n");
      out.write("        </div>\n");
      out.write("        <div class=\"col\">\n");
      out.write("            <input type=\"text\" class=\"form-control\" placeholder=\"Nit\" name=\"txtnit\">\n");
      out.write("        </div>\n");
      out.write("          <div class=\"col\">\n");
      out.write("              <input type=\"text\" class=\"form-control\" placeholder=\"Direccion\" name=\"txtdireccion\">\n");
      out.write("        </div>\n");
      out.write("      </div><br><br>\n");
      out.write("        <div class=\"row\">\n");
      out.write("        <div class=\"col\">\n");
      out.write("            <input type=\"text\" class=\"form-control\" placeholder=\"Telefono\" name=\"txttelefono\">\n");
      out.write("        </div>\n");
      out.write("        <div class=\"col\">\n");
      out.write("            <input type=\"text\" class=\"form-control\" placeholder=\"Estado\" name=\"txtestado\">\n");
      out.write("        </div>\n");
      out.write("          <div class=\"col\">\n");
      out.write("          <input type=\"text\" class=\"form-control\" placeholder=\"DPI\" name=\"txtdpi\">\n");
      out.write("        </div>\n");
      out.write("            <div class=\"col\">\n");
      out.write("          <input type=\"text\" class=\"form-control\" placeholder=\"Tipo\" name=\"txtTipo\">\n");
      out.write("        </div>\n");
      out.write("      </div><br><br>\n");
      out.write("      \n");
      out.write("      <input type=\"submit\" value=\"grabar\">\n");
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
