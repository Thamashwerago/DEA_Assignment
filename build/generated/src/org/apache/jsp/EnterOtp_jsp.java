package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class EnterOtp_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <title>OTP Verification</title>\r\n");
      out.write("        <link\r\n");
      out.write("            href=\"//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css\"\r\n");
      out.write("            rel=\"stylesheet\" id=\"bootstrap-css\">\r\n");
      out.write("        <script\r\n");
      out.write("        src=\"//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js\"></script>\r\n");
      out.write("        <script src=\"//code.jquery.com/jquery-1.11.1.min.js\"></script>\r\n");
      out.write("        <!------ Include the above in your HEAD tag ---------->\r\n");
      out.write("\r\n");
      out.write("        <link rel=\"stylesheet\"\r\n");
      out.write("              href=\"https://maxcdn.bootstrapcdn.com/font-awesome/4.5.0/css/font-awesome.min.css\">\r\n");
      out.write("\r\n");
      out.write("        <style type=\"text/css\">\r\n");
      out.write("            .form-gap {\r\n");
      out.write("                padding-top: 70px;\r\n");
      out.write("            }\r\n");
      out.write("        </style>\r\n");
      out.write("    </head>\r\n");
      out.write("\r\n");
      out.write("    <body>\r\n");
      out.write("        <div class=\"form-gap\"></div>\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"col-md-4 col-md-offset-4\">\r\n");
      out.write("                    <div class=\"panel panel-default\">\r\n");
      out.write("                        <div class=\"panel-body\">\r\n");
      out.write("                            <div class=\"text-center\">\r\n");
      out.write("                                <h3>\r\n");
      out.write("                                    <i class=\"fa fa-lock fa-4x\"></i>\r\n");
      out.write("                                </h3>\r\n");
      out.write("                                <h2 class=\"text-center\">Enter OTP</h2>\r\n");
      out.write("                                ");

                                    if (request.getAttribute("message") != null) {
                                        out.print("<p class='text-danger ml-1'>" + request.getAttribute("message") + "</p>");
                                    }

                                
      out.write("\r\n");
      out.write("\r\n");
      out.write("                                <div class=\"panel-body\">\r\n");
      out.write("\r\n");
      out.write("                                    <form id=\"register-form\" action=\"ValidateOtp\" role=\"form\" autocomplete=\"off\"\r\n");
      out.write("                                          class=\"form\" method=\"post\">\r\n");
      out.write("\r\n");
      out.write("                                        <div class=\"form-group\">\r\n");
      out.write("                                            <div class=\"input-group\">\r\n");
      out.write("                                                <span class=\"input-group-addon\"><i\r\n");
      out.write("                                                        class=\"glyphicon glyphicon-envelope color-blue\"></i></span> <input\r\n");
      out.write("                                                    id=\"opt\" name=\"otp\" placeholder=\"Enter OTP\"\r\n");
      out.write("                                                    class=\"form-control\" type=\"text\" required=\"required\">\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div class=\"form-group\">\r\n");
      out.write("                                            <input name=\"recover-submit\"\r\n");
      out.write("                                                   class=\"btn btn-lg btn-primary btn-block\"\r\n");
      out.write("                                                   value=\"Reset Password\" type=\"submit\">\r\n");
      out.write("                                        </div>\r\n");
      out.write("\r\n");
      out.write("                                        <input type=\"hidden\" class=\"hide\" name=\"token\" id=\"token\"\r\n");
      out.write("                                               value=\"\">\r\n");
      out.write("                                    </form>\r\n");
      out.write("\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
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
