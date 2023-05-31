package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class footer_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("<!-- Defining Footer -->\r\n");
      out.write("<div class=\"coupons\">\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("        <div class=\"coupons-grids text-center\">\r\n");
      out.write("            <div class=\"col-md-3 coupons-gd\">\r\n");
      out.write("                <h3>Simple Steps to buy online</h3>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"col-md-3 coupons-gd\">\r\n");
      out.write("                <span class=\"glyphicon glyphicon-user\" aria-hidden=\"true\"></span>\r\n");
      out.write("                <h4>LOGIN TO YOUR ACCOUNT</h4>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"col-md-3 coupons-gd\">\r\n");
      out.write("                <span class=\"glyphicon glyphicon-ok\" aria-hidden=\"true\"></span>\r\n");
      out.write("                <h4>SELECT YOUR ITEM</h4>\t\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"col-md-3 coupons-gd\">\r\n");
      out.write("                <span class=\"glyphicon glyphicon-credit-card\" aria-hidden=\"true\"></span>\r\n");
      out.write("                <h4>MAKE PAYMENT</h4>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"clearfix\"></div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("<section class=\"footer-section\">\r\n");
      out.write("    <div class=\"row\">\r\n");
      out.write("        <div class=\"col\">\r\n");
      out.write("            <div class=\"sign-grds\">\r\n");
      out.write("                <div class=\"col-md-3 sign-gd-two\">\r\n");
      out.write("                    <h4 style=\"text-align: left;\">Contact Us:</h4>\r\n");
      out.write("                    <ul style=\"text-align: left;\">\r\n");
      out.write("                        <li><i class=\"glyphicon glyphicon-map-marker\" aria-hidden=\"true\"></i>Address : Indore, <span>India.</span></li>\r\n");
      out.write("                        <li><i class=\"glyphicon glyphicon-envelope\" aria-hidden=\"true\"></i>Email : <a href=\"mailto:info@data-flair.training\">info@data-flair.training</a></li>\r\n");
      out.write("                        <li><i class=\"glyphicon glyphicon-earphone\" aria-hidden=\"true\"></i>Phone : +91-84510-97879</li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"col\">\r\n");
      out.write("            <br/><br/><br/>\r\n");
      out.write("            <center>\r\n");
      out.write("                <div class=\"container\">\r\n");
      out.write("                    <h4>\r\n");
      out.write("                        &copy;  <span id=\"year\"></span> DataFlair - Online Shopping System |<a href=\"https://data-flair.training\" target=\"_blank\"> Designed by : DataFlair</a>\r\n");
      out.write("                    </h4>\r\n");
      out.write("                </div>\r\n");
      out.write("            </center>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</section>\r\n");
      out.write("<script>\r\n");
      out.write("    document.getElementById(\"year\").innerHTML = new Date().getFullYear();\r\n");
      out.write("</script>");
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
