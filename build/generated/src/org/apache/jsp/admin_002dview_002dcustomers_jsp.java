package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.connection.*;
import java.sql.*;

public final class admin_002dview_002dcustomers_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <title>Online Shopping System</title>\r\n");
      out.write("        <!-- Importing all ui libs -->\r\n");
      out.write("        <link href=\"assets/css/bootstrap.css\" rel=\"stylesheet\" />\r\n");
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
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        ");

            //Checking whether admin in session or not
            if (session.getAttribute("uname") != null && session.getAttribute("uname") != "") {
        
      out.write("\r\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "adminHeader.jsp", out, false);
      out.write("\r\n");
      out.write("            <div class=\"content-wrapper\">\r\n");
      out.write("                <div class=\"container-fluid\">\r\n");
      out.write("                    <div class=\"row pad-botm\">\r\n");
      out.write("                        <div class=\"col-md-12\">\r\n");
      out.write("                            <h4 class=\"header-line\">View Customers</h4>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"row\">\r\n");
      out.write("                        <div class=\"col-md-12 col-sm-12 col-xs-12\">\r\n");
      out.write("                            <div class=\"panel panel-success\">\r\n");
      out.write("                                <div class=\"panel-heading\">View Customers</div>\r\n");
      out.write("                                <div class=\"panel-body\">\r\n");
      out.write("                                    <div class=\"table-responsive\">\r\n");
      out.write("                                        <table class=\"table table-striped table-bordered table-hover\">\r\n");
      out.write("                                            <thead>\r\n");
      out.write("                                                <tr>\r\n");
      out.write("                                                    <th>#</th>\r\n");
      out.write("                                                    <th>Name</th>\r\n");
      out.write("                                                    <th>Email-Id</th>\r\n");
      out.write("                                                    <th>Gender</th>\r\n");
      out.write("                                                    <th>Mobile</th>\r\n");
      out.write("                                                    <th>Address</th>\r\n");
      out.write("                                                    <th>Date</th>\r\n");
      out.write("                                                </tr>\r\n");
      out.write("                                            </thead>\r\n");
      out.write("                                        ");

                                            Connection connection = DatabaseConnection.getConnection();
                                            Statement statement = connection.createStatement();
                                            ResultSet resultSet = statement.executeQuery("select * from tblcustomer");
                                            while (resultSet.next()) {
                                        
      out.write("\r\n");
      out.write("                                        <tbody>\r\n");
      out.write("                                            <tr>\r\n");
      out.write("                                                <td>");
      out.print(resultSet.getInt(1));
      out.write("</td>\r\n");
      out.write("                                                <td>");
      out.print(resultSet.getString("name"));
      out.write("</td>\r\n");
      out.write("                                                <td>");
      out.print(resultSet.getString("email"));
      out.write("</td>\r\n");
      out.write("                                                <td>");
      out.print(resultSet.getString("gender"));
      out.write("</td>\r\n");
      out.write("                                                <td>");
      out.print(resultSet.getString("phone"));
      out.write("</td>\r\n");
      out.write("                                                <td>");
      out.print(resultSet.getString("address"));
      out.write("</td>\r\n");
      out.write("                                                <td>");
      out.print(resultSet.getString("added_date"));
      out.write("</td>\r\n");
      out.write("                                            </tr>\r\n");
      out.write("                                        </tbody>\r\n");
      out.write("                                        ");

                                            }
                                        
      out.write("\r\n");
      out.write("                                    </table>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\r\n");
      out.write("            <script src=\"assets/js/jquery-1.10.2.js\"></script>\r\n");
      out.write("            <script src=\"assets/js/bootstrap.js\"></script>\r\n");
      out.write("            <script src=\"assets/js/custom.js\"></script>\r\n");
      out.write("        ");

            } else {
                response.sendRedirect("admin-login.jsp");
            }
        
      out.write("\r\n");
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
