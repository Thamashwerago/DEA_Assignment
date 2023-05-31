package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import java.sql.*;
import com.connection.*;

public final class admin_002dlogin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <title>Online Shopping System</title>\r\n");
      out.write("        <!-- Importing all ui libs -->\r\n");
      out.write("        <link href=\"assets/css/font-awesome.css\" rel=\"stylesheet\" />\r\n");
      out.write("        <link href=\"assets/css/style.css\" rel=\"stylesheet\" />\r\n");
      out.write("        <link href=\"css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\r\n");
      out.write("        <link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\r\n");
      out.write("        <script type=\"text/javascript\" src=\"js/jquery-2.1.4.min.js\"></script>\r\n");
      out.write("        <script src=\"js/simpleCart.min.js\"></script>\r\n");
      out.write("        <script type=\"text/javascript\" src=\"js/bootstrap-3.1.1.min.js\"></script>\r\n");
      out.write("        <link href='http://fonts.googleapis.com/css?family=Montserrat:400,700' rel='stylesheet' type='text/css'>\r\n");
      out.write("        <link href='http://fonts.googleapis.com/css?family=Lato:400,100,100italic,300,300italic,400italic,700,900,900italic,700italic' rel='stylesheet' type='text/css'>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.7.0/css/all.css\" integrity=\"sha384-lZN37f5QGtY3VHgisS14W3ExzMWZxybE1SJSEsQp9S+oqd12jhcu+A56Ebc1zFSJ\" crossorigin=\"anonymous\">\r\n");
      out.write("        <script src=\"js/jquery.easing.min.js\"></script>\r\n");
      out.write("        <link href='http://fonts.googleapis.com/css?family=Open+Sans' rel='stylesheet' type='text/css' />\r\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js\"></script>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <section class=\"menu-section\">\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                    <div class=\"col-md-12\">\r\n");
      out.write("                        <div class=\"navbar-collapse collapse \">\r\n");
      out.write("                            <ul id=\"menu-top\" class=\"nav navbar-nav navbar-right\">\r\n");
      out.write("                                <li><a href=\"index.jsp\">Home</a></li>\r\n");
      out.write("                                <li><a href=\"admin-login.jsp\">Admin Login</a></li>\r\n");
      out.write("                            </ul>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </section>\r\n");
      out.write("        <div class=\"content-wrapper\">\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                    <div class=\"col-md-6 col-sm-6 col-xs-12\">\r\n");
      out.write("                        <div class=\"panel panel-danger\">\r\n");
      out.write("                            <div class=\"panel-heading\">Admin Login</div>\r\n");
      out.write("                            <div class=\"panel-body\">\r\n");
      out.write("                                ");

                                    //Connecting to the database
                                    Connection connection = DatabaseConnection.getConnection();
                                    Statement statement = connection.createStatement();
                                    String credential = (String) session.getAttribute("credential");
                                    //Checking creditionals whether there are null or not
                                    if (credential != null) {
                                        session.removeAttribute("credential");
                                
      out.write("\r\n");
      out.write("                                <div class=\"alert alert-danger\" id=\"danger\">You have enter wrong credentials.</div>\r\n");
      out.write("                                ");

                                    }
                                
      out.write("\r\n");
      out.write("                                <form action=\"AdminLogin\" method=\"post\">\r\n");
      out.write("                                    <div class=\"form-group\">\r\n");
      out.write("                                        <label>Email Id.:</label> <input type=\"text\" name=\"email\" class=\"form-control\">\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"form-group\">\r\n");
      out.write("                                        <label>Password.:</label> <input type=\"password\" name=\"upass\" class=\"form-control\">\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <input type=\"submit\" value=\"Admin Login\" class=\"btn btn-primary\">\r\n");
      out.write("                                    <input type=\"reset\" value=\"Clear\" class=\"btn btn-danger\">\r\n");
      out.write("                                </form>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\r\n");
      out.write("        <script src=\"assets/js/jquery-1.10.2.js\"></script>\r\n");
      out.write("        <script src=\"assets/js/bootstrap.js\"></script>\r\n");
      out.write("        <script src=\"assets/js/custom.js\"></script>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>");
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
