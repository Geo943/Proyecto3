package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class orden_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css\" integrity=\"sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2\" crossorigin=\"anonymous\">\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("            <form>\n");
      out.write("      <div class=\"form-row\">\n");
      out.write("        <div class=\"form-group col-md-6\">\n");
      out.write("          <label for=\"inputEmail4\">Email</label>\n");
      out.write("          <input type=\"email\" class=\"form-control\" id=\"inputEmail4\">\n");
      out.write("        </div>\n");
      out.write("        <div class=\"form-group col-md-6\">\n");
      out.write("          <label for=\"inputPassword4\">Password</label>\n");
      out.write("          <input type=\"password\" class=\"form-control\" id=\"inputPassword4\">\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"form-group\">\n");
      out.write("        <label for=\"inputAddress\">Address</label>\n");
      out.write("        <input type=\"text\" class=\"form-control\" id=\"inputAddress\" placeholder=\"1234 Main St\">\n");
      out.write("      </div>\n");
      out.write("      <div class=\"form-group\">\n");
      out.write("        <label for=\"inputAddress2\">Address 2</label>\n");
      out.write("        <input type=\"text\" class=\"form-control\" id=\"inputAddress2\" placeholder=\"Apartment, studio, or floor\">\n");
      out.write("      </div>\n");
      out.write("      <div class=\"form-row\">\n");
      out.write("        <div class=\"form-group col-md-6\">\n");
      out.write("          <label for=\"inputCity\">City</label>\n");
      out.write("          <input type=\"text\" class=\"form-control\" id=\"inputCity\">\n");
      out.write("        </div>\n");
      out.write("        <div class=\"form-group col-md-4\">\n");
      out.write("          <label for=\"inputState\">State</label>\n");
      out.write("          <select id=\"inputState\" class=\"form-control\">\n");
      out.write("            <option selected>Choose...</option>\n");
      out.write("            <option>...</option>\n");
      out.write("          </select>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"form-group col-md-2\">\n");
      out.write("          <label for=\"inputZip\">Zip</label>\n");
      out.write("          <input type=\"text\" class=\"form-control\" id=\"inputZip\">\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("     \n");
      out.write("      <button type=\"submit\" class=\"btn btn-primary\">Sign in</button>\n");
      out.write("    </form>\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.5.1.slim.min.js\" integrity=\"sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj\" crossorigin=\"anonymous\"></script>\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-ho+j7jyWK8fNQe+A12Hb8AhRq26LrZ/JpcUGGOn+Y7RsweNrtN/tE3MoK7ZeZDyx\" crossorigin=\"anonymous\"></script>\n");
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
