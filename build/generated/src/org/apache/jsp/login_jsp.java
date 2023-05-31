package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Sign Up Form by Colorlib</title>\r\n");
      out.write("\r\n");
      out.write("        <!-- Font Icon -->\r\n");
      out.write("        <link rel=\"stylesheet\"\r\n");
      out.write("              href=\"fonts/material-icon/css/material-design-iconic-font.min.css\">\r\n");
      out.write("\r\n");
      out.write("        <!-- Main css -->\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/style.css\">\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <input type=\"hidden\" id=\"status\" value=\"");
      out.print(request.getAttribute("status"));
      out.write("\">\r\n");
      out.write("        <div class=\"main\">\r\n");
      out.write("\r\n");
      out.write("            <!-- Sing in  Form -->\r\n");
      out.write("            <section class=\"sign-in\">\r\n");
      out.write("                <div class=\"container\">\r\n");
      out.write("                    <div class=\"signin-content\">\r\n");
      out.write("                        <div class=\"signin-image\">\r\n");
      out.write("                            <figure>\r\n");
      out.write("                                <img src=\"images/signin-image.jpg\" alt=\"sing up image\">\r\n");
      out.write("                            </figure>\r\n");
      out.write("                            <a href=\"registration.jsp\" class=\"signup-image-link\">Create an\r\n");
      out.write("                                account</a>\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"signin-form\">\r\n");
      out.write("                            <h2 class=\"form-title\">Sign up</h2>\r\n");
      out.write("                            <form method=\"Post\" action=\"login\" class=\"register-form\"\r\n");
      out.write("                                  id=\"login-form\">\r\n");
      out.write("                                <div class=\"form-group\">\r\n");
      out.write("                                    <label for=\"email\"><i\r\n");
      out.write("                                            class=\"zmdi zmdi-account material-icons-name\"></i></label> <input\r\n");
      out.write("                                        type=\"text\" name=\"email\" id=\"email\"\r\n");
      out.write("                                        placeholder=\"Email\" required=\"required\" />\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"form-group\">\r\n");
      out.write("                                    <label for=\"password\"><i class=\"zmdi zmdi-lock\"></i></label> <input\r\n");
      out.write("                                        type=\"password\" name=\"password\" id=\"password\"\r\n");
      out.write("                                        placeholder=\"Password\" required=\"required\" />\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"form-group\">\r\n");
      out.write("                                    <a href=\"forgotPassword.jsp\">Forgot Password?</a>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"form-group form-button\">\r\n");
      out.write("                                    <input type=\"submit\" name=\"signin\" id=\"signin\"\r\n");
      out.write("                                           class=\"form-submit\" value=\"Log in\" />\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </form>\r\n");
      out.write("                            <div class=\"social-login\">\r\n");
      out.write("                                <span class=\"social-label\">Or login with</span>\r\n");
      out.write("                                <ul class=\"socials\">\r\n");
      out.write("                                    <li><a href=\"#\"><i\r\n");
      out.write("                                                class=\"display-flex-center zmdi zmdi-facebook\"></i></a></li>\r\n");
      out.write("                                    <li><a href=\"#\"><i\r\n");
      out.write("                                                class=\"display-flex-center zmdi zmdi-twitter\"></i></a></li>\r\n");
      out.write("                                    <li><a href=\"#\"><i\r\n");
      out.write("                                                class=\"display-flex-center zmdi zmdi-google\"></i></a></li>\r\n");
      out.write("                                </ul>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </section>\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <!-- JS -->\r\n");
      out.write("        <script src=\"vendor/jquery/jquery.min.js\"></script>\r\n");
      out.write("        <script src=\"js/main.js\"></script>\r\n");
      out.write("        <script src=\"https://unpkg.com/sweetalert/dist/sweetalert.min.js\"></script>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"alert/dist/sweetalert.css\">\r\n");
      out.write("\r\n");
      out.write("        <script type=\"text/javascript\">\r\n");
      out.write("            var status = document.getElementById(\"status\").value;\r\n");
      out.write("            if (status == \"failed\") {\r\n");
      out.write("                swal(\"Sorry\", \"Wrong email or password\", \"error\");\r\n");
      out.write("            }\r\n");
      out.write("            if (status == \"InvalidUemail\") {\r\n");
      out.write("                swal(\"Sorry\", \"Invalid Email\", \"error\");\r\n");
      out.write("            }\r\n");
      out.write("            if (status == \"InvalidUpwd\") {\r\n");
      out.write("                swal(\"Sorry\", \"Invalid Password\", \"error\");\r\n");
      out.write("            }\r\n");
      out.write("            if (status == \"resetSuccess\") {\r\n");
      out.write("                swal(\"Congrats\", \"Password Reset Successful\", \"success\");\r\n");
      out.write("            }\r\n");
      out.write("            if (status == \"resetFailed\") {\r\n");
      out.write("                swal(\"Sorry\", \"Password Reset Failed\", \"error\");\r\n");
      out.write("            }\r\n");
      out.write("        </script>\r\n");
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
