package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class adminHeader_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!-- Defining Header for the Admin/Seller-->\r\n");
      out.write("<section class=\"menu-section\">\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("        <div class=\"row\">\r\n");
      out.write("            <div class=\"col-md-12\">\r\n");
      out.write("                <div class=\"navbar-collapse collapse \">\r\n");
      out.write("                    <ul id=\"menu-top\" class=\"nav navbar-nav navbar-right\">\r\n");
      out.write("                        <li><a href=\"dashboard.jsp\">Home</a></li>\r\n");
      out.write("                        <li><a href=\"admin-add-product.jsp\">Add Product</a></li>\r\n");
      out.write("                        <li><a href=\"admin-view-product.jsp\">View Products</a></li>\r\n");
      out.write("                        <li><a href=\"admin-all-orders.jsp\">View All Orders</a></li>\r\n");
      out.write("                        <li><a href=\"admin-pending-orders.jsp\">View Pending Orders</a></li>\r\n");
      out.write("                        <li><a href=\"admin-delivered-orders.jsp\">View Delivered Orders</a></li>\r\n");
      out.write("                        <li><a href=\"admin-view-customers.jsp\">View Customers</a></li>\r\n");
      out.write("                        <li><a href=\"admin-logout.jsp\">LOGOUT</a></li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</section>");
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
