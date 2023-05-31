package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class registration_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"UTF-8\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\">\r\n");
      out.write("        <title>Sign Up</title>\r\n");
      out.write("\r\n");
      out.write("        <!-- Font Icon -->\r\n");
      out.write("        <link rel=\"stylesheet\"\r\n");
      out.write("              href=\"fonts/material-icon/css/material-design-iconic-font.min.css\">\r\n");
      out.write("\r\n");
      out.write("        <!-- Main css -->\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/style.css\">\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("\r\n");
      out.write("        <input type=\"hidden\" id=\"status\" value=\"");
      out.print(request.getAttribute("status"));
      out.write("\">\r\n");
      out.write("\r\n");
      out.write("        <div class=\"main\">\r\n");
      out.write("\r\n");
      out.write("            <!-- Sign up form -->\r\n");
      out.write("            <section class=\"signup\">\r\n");
      out.write("                <div class=\"container\">\r\n");
      out.write("                    <div class=\"signup-content\">\r\n");
      out.write("                        <div class=\"signup-form\">\r\n");
      out.write("                            <h2 class=\"form-title\">Sign In</h2>\r\n");
      out.write("\r\n");
      out.write("                            <form action=\"RegisterServlet\" method=\"post\">\r\n");
      out.write("                                <label for=\"name\">Name:</label>\r\n");
      out.write("                                <input type=\"text\" name=\"name\" id=\"name\" required><br><br>\r\n");
      out.write("\r\n");
      out.write("                                <label for=\"email\">Email:</label>\r\n");
      out.write("                                <input type=\"email\" name=\"email\" id=\"email\" required><br><br>\r\n");
      out.write("\r\n");
      out.write("                                <label for=\"pass\">Password:</label>\r\n");
      out.write("                                <input type=\"password\" name=\"pass\" id=\"pass\" required><br><br>\r\n");
      out.write("\r\n");
      out.write("                                <label for=\"re_pass\">Confirm Password:</label>\r\n");
      out.write("                                <input type=\"password\" name=\"re_pass\" id=\"re_pass\" required><br><br>\r\n");
      out.write("\r\n");
      out.write("                                <label for=\"contact\">Contact:</label>\r\n");
      out.write("                                <input type=\"text\" name=\"contact\" id=\"contact\" required><br><br>\r\n");
      out.write("\r\n");
      out.write("                                <input type=\"submit\" value=\"Register\">\r\n");
      out.write("                            </form>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"signup-image\">\r\n");
      out.write("                            <figure>\r\n");
      out.write("                                <img src=\"images/signup-image.jpg\" alt=\"sing up image\">\r\n");
      out.write("                            </figure>\r\n");
      out.write("                            <a href=\"login.jsp\" class=\"signup-image-link\">I am already\r\n");
      out.write("                                member</a>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </section>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- JS -->\r\n");
      out.write("        <script src=\"vendor/jquery/jquery.min.js\"></script>\r\n");
      out.write("        <script src=\"js/main.js\"></script>\r\n");
      out.write("        <script src=\"https://unpkg.com/sweetalert/dist/sweetalert.min.js\"></script>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"alert/dist/sweetalert.css\">\r\n");
      out.write("\r\n");
      out.write("        <script type=\"text/javascript\">\r\n");
      out.write("            var status = document.getElementById(\"status\").value;\r\n");
      out.write("            if (status == \"success\") {\r\n");
      out.write("                swal(\"Congrats\", \"Account Created Successfully\", \"success\");\r\n");
      out.write("            }\r\n");
      out.write("            if (status == \"InvalidUname\") {\r\n");
      out.write("                swal(\"Sorry\", \"Invalid Name\", \"error\");\r\n");
      out.write("            }\r\n");
      out.write("            if (status == \"InvalidUemail\") {\r\n");
      out.write("                swal(\"Sorry\", \"Invalid Email\", \"error\");\r\n");
      out.write("            }\r\n");
      out.write("            if (status == \"InvalidUpwd\") {\r\n");
      out.write("                swal(\"Sorry\", \"Invalid Password\", \"error\");\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            if (status == \"InvalidUrepwd\") {\r\n");
      out.write("                swal(\"Sorry\", \"Password conformation is wrong\", \"error\");\r\n");
      out.write("            }\r\n");
      out.write("            if (status == \"InvalidUmobile\") {\r\n");
      out.write("                swal(\"Sorry\", \"Invalid Mobile Number\", \"error\");\r\n");
      out.write("            }\r\n");
      out.write("            if (status == \"InvalidUmobileLength\") {\r\n");
      out.write("                swal(\"Sorry\", \"Mobile Number length should be of 10 digits\", \"error\");\r\n");
      out.write("            }\r\n");
      out.write("        </script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    </body>\r\n");
      out.write("    <!-- This templates was made by Colorlib (https://colorlib.com) -->\r\n");
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
