package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class forgotPassword_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!doctype html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset='utf-8'>\r\n");
      out.write("        <meta name='viewport' content='width=device-width, initial-scale=1'>\r\n");
      out.write("        <title>Forgot Password</title>\r\n");
      out.write("        <link\r\n");
      out.write("            href='https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css'\r\n");
      out.write("            rel='stylesheet'>\r\n");
      out.write("        <link href='' rel='stylesheet'>\r\n");
      out.write("        <script type='text/javascript'\r\n");
      out.write("        src='https://cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js'></script>\r\n");
      out.write("        <style>\r\n");
      out.write("            body {\r\n");
      out.write("                background-position: center;\r\n");
      out.write("                background-color: #eee;\r\n");
      out.write("                background-repeat: no-repeat;\r\n");
      out.write("                background-size: cover;\r\n");
      out.write("                color: #505050;\r\n");
      out.write("                font-family: \"Rubik\", Helvetica, Arial, sans-serif;\r\n");
      out.write("                font-size: 14px;\r\n");
      out.write("                font-weight: normal;\r\n");
      out.write("                line-height: 1.5;\r\n");
      out.write("                text-transform: none\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            .forgot {\r\n");
      out.write("                background-color: #fff;\r\n");
      out.write("                padding: 12px;\r\n");
      out.write("                border: 1px solid #dfdfdf\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            .padding-bottom-3x {\r\n");
      out.write("                padding-bottom: 72px !important\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            .card-footer {\r\n");
      out.write("                background-color: #fff\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            .btn {\r\n");
      out.write("                font-size: 13px\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            .form-control:focus {\r\n");
      out.write("                color: #495057;\r\n");
      out.write("                background-color: #fff;\r\n");
      out.write("                border-color: #76b7e9;\r\n");
      out.write("                outline: 0;\r\n");
      out.write("                box-shadow: 0 0 0 0px #28a745\r\n");
      out.write("            }\r\n");
      out.write("        </style>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body oncontextmenu='return false' class='snippet-body'>\r\n");
      out.write("        <div class=\"container padding-bottom-3x mb-2 mt-5\">\r\n");
      out.write("            <div class=\"row justify-content-center\">\r\n");
      out.write("                <div class=\"col-lg-8 col-md-10\">\r\n");
      out.write("                    <div class=\"forgot\">\r\n");
      out.write("                        <h2>Forgot your password?</h2>\r\n");
      out.write("                        <p>Change your password in three easy steps. This will help you\r\n");
      out.write("                            to secure your password!</p>\r\n");
      out.write("                        <ol class=\"list-unstyled\">\r\n");
      out.write("                            <li><span class=\"text-primary text-medium\">1. </span>Enter\r\n");
      out.write("                                your email address below.</li>\r\n");
      out.write("                            <li><span class=\"text-primary text-medium\">2. </span>Our\r\n");
      out.write("                                system will send you an OTP to your email</li>\r\n");
      out.write("                            <li><span class=\"text-primary text-medium\">3. </span>Enter the OTP on the \r\n");
      out.write("                                next page</li>\r\n");
      out.write("                        </ol>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <form class=\"card mt-4\" action=\"forgotPassword\" method=\"POST\">\r\n");
      out.write("                        <div class=\"card-body\">\r\n");
      out.write("                            <div class=\"form-group\">\r\n");
      out.write("                                <label for=\"email-for-pass\">Enter your email address</label> <input\r\n");
      out.write("                                    class=\"form-control\" type=\"text\" name=\"email\" id=\"email-for-pass\" required=\"\"><small\r\n");
      out.write("                                    class=\"form-text text-muted\">Enter the registered email address . Then we'll\r\n");
      out.write("                                    email a OTP to this address.</small>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"card-footer\">\r\n");
      out.write("                            <button class=\"btn btn-success\" type=\"submit\">Get New\r\n");
      out.write("                                Password</button>\r\n");
      out.write("                            <a class=\"btn btn-danger\" href=\"login.jsp\">Back to Login</a>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </form>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <script type='text/javascript'\r\n");
      out.write("        src='https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.bundle.min.js'></script>\r\n");
      out.write("        <script type='text/javascript' src=''></script>\r\n");
      out.write("        <script type='text/javascript' src=''></script>\r\n");
      out.write("        <script type='text/Javascript'></script>\r\n");
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
