package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class cart_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=UTF-8");
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"UTF-8\">\r\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("        <title>Products</title>\r\n");
      out.write("\r\n");
      out.write("        <!--link to css-->\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/style_1.css\">\r\n");
      out.write("\r\n");
      out.write("        <!--box icons-->\r\n");
      out.write("        <link href='https://unpkg.com/boxicons@2.1.4/css/boxicons.min.css' rel='stylesheet'>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <!--Header-->\r\n");
      out.write("        <header>\r\n");
      out.write("            <!--Nav-->\r\n");
      out.write("            <div class=\"nav container\">\r\n");
      out.write("                <a href=\"index.jsp\" class=\"logo\">Gimasha Service Center</a>\r\n");
      out.write("                <a href=\"index.jsp\"><button type=\"button\" class=\"btn-buy\">Home</button></a>\r\n");
      out.write("                <!--cart-icon-->\r\n");
      out.write("                <i class='bx bx-shopping-bag'id=\"cart-icon\"></i>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <!--cart-->\r\n");
      out.write("            <div class=\"cart\">\r\n");
      out.write("                <h2 class=\"cart-title\">Your cart</h2>\r\n");
      out.write("\r\n");
      out.write("                <!--content-->\r\n");
      out.write("                <div class=\"cart-content\">\r\n");
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <!--total-->\r\n");
      out.write("                <div class=\"total\">\r\n");
      out.write("                    <div class=\"total-title\">Total</div>\r\n");
      out.write("                    <div class=\"total-price\">Rs.0</div>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <!--buy button-->\r\n");
      out.write("                <button type=\"button\" class=\"btn-buy\">Buy Now</button>\r\n");
      out.write("\r\n");
      out.write("                <!--cart close-->\r\n");
      out.write("                <i class='bx bx-x' id=\"close-cart\"></i>\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("        </header>\r\n");
      out.write("        \r\n");
      out.write("\r\n");
      out.write("        <!--shop-->\r\n");
      out.write("        <section class=\"shop container\">\r\n");
      out.write("            <h2 class=\"section-title\">Cleaning Products</h2>\r\n");
      out.write("\r\n");
      out.write("            <!--content-->\r\n");
      out.write("            <div class=\"shop-content\">\r\n");
      out.write("                <!--box 1-->\r\n");
      out.write("                <div class=\"product-box\">\r\n");
      out.write("                    <img src=\"img/Cleaning Products/product1.jpg\" alt=\"\" class=\"product-img\">\r\n");
      out.write("                    <h2 class=\"product-title\">Meguiar's Quik Interior Detailer</h2>\r\n");
      out.write("                    <span class=\"price\">Rs.3861.08</span>\r\n");
      out.write("                    <i class='bx bx-shopping-bag add-cart'></i>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <!--box 2-->\r\n");
      out.write("                <div class=\"product-box\">\r\n");
      out.write("                    <img src=\"img/Cleaning Products/product2.jpg\" alt=\"\" class=\"product-img\">\r\n");
      out.write("                    <h2 class=\"product-title\">Chemical Guys Total Interior Cleaner & Protectant</h2>\r\n");
      out.write("                    <span class=\"price\">Rs.3564.01</span>\r\n");
      out.write("                    <i class='bx bx-shopping-bag add-cart'></i>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <!--box 3-->\r\n");
      out.write("                <div class=\"product-box\">\r\n");
      out.write("                    <img src=\"img/Cleaning Products/product3.jpg\" alt=\"\" class=\"product-img\">\r\n");
      out.write("                    <h2 class=\"product-title\">KevianClean Interior Defense Car Vinyl Protectant DashboardÂ Cleaner</h2>\r\n");
      out.write("                    <span class=\"price\">Rs.7720.07</span>\r\n");
      out.write("                    <i class='bx bx-shopping-bag add-cart'></i>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <!--box 4-->\r\n");
      out.write("                <div class=\"product-box\">\r\n");
      out.write("                    <img src=\"img/Cleaning Products/product4.jpg\" alt=\"\" class=\"product-img\">\r\n");
      out.write("                    <h2 class=\"product-title\">3M Glass Cleaner</h2>\r\n");
      out.write("                    <span class=\"price\">Rs.5345.03</span>\r\n");
      out.write("                    <i class='bx bx-shopping-bag add-cart'></i>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <!--box 5-->\r\n");
      out.write("                <div class=\"product-box\">\r\n");
      out.write("                    <img src=\"img/Cleaning Products/product5.jpg\" alt=\"\" class=\"product-img\">\r\n");
      out.write("                    <h2 class=\"product-title\">Meguiar's Perfect Clarity Glass Cleaner</h2>\r\n");
      out.write("                    <span class=\"price\">Rs.3500.07</Rs></span>\r\n");
      out.write("                    <i class='bx bx-shopping-bag add-cart'></i>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <!--box 6-->\r\n");
      out.write("                <div class=\"product-box\">\r\n");
      out.write("                    <img src=\"img/Cleaning Products/product6.jpg\" alt=\"\" class=\"product-img\">\r\n");
      out.write("                    <h2 class=\"product-title\">Armor All Car Wash Soap, Foaming Car Wash</h2>\r\n");
      out.write("                    <span class=\"price\">Rs.2440.05</span>\r\n");
      out.write("                    <i class='bx bx-shopping-bag add-cart'></i>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <!--box 7-->\r\n");
      out.write("                <div class=\"product-box\">\r\n");
      out.write("                    <img src=\"img/Cleaning Products/product7.jpg\" alt=\"\" class=\"product-img\">\r\n");
      out.write("                    <h2 class=\"product-title\">Qlincare car wash liquid soap</h2>\r\n");
      out.write("                    <span class=\"price\">Rs.2100.08</span>\r\n");
      out.write("                    <i class='bx bx-shopping-bag add-cart'></i>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <!--box 8-->\r\n");
      out.write("                <div class=\"product-box\">\r\n");
      out.write("                    <img src=\"img/Cleaning Products/product8.jpg\" alt=\"\" class=\"product-img\">\r\n");
      out.write("                    <h2 class=\"product-title\">CRelentless Drive Car Detailing KitÂ -18pc</h2>\r\n");
      out.write("                    <span class=\"price\">Rs.24845.99</span>\r\n");
      out.write("                    <i class='bx bx-shopping-bag add-cart'></i>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </section>\r\n");
      out.write("        <section class=\"shop container\">\r\n");
      out.write("            <h2 class=\"section-title\">Filter Products</h2>\r\n");
      out.write("\r\n");
      out.write("            <!--content-->\r\n");
      out.write("            <div class=\"shop-content\">\r\n");
      out.write("\r\n");
      out.write("                <!--box 1-->\r\n");
      out.write("                <div class=\"product-box\">\r\n");
      out.write("                    <img src=\"img/Filter Products/product1.jpg\" alt=\"\" class=\"product-img\">\r\n");
      out.write("                    <h2 class=\"product-title\">Oil Filter Bosch 72161WS</h2>\r\n");
      out.write("                    <span class=\"price\">Rs.2320.64</span>\r\n");
      out.write("                    <i class='bx bx-shopping-bag add-cart'></i>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <!--box 2-->\r\n");
      out.write("                <div class=\"product-box\">\r\n");
      out.write("                    <img src=\"img/Filter Products/product2.jpg\" alt=\"\" class=\"product-img\">\r\n");
      out.write("                    <h2 class=\"product-title\">Mopar 5281090 Oil Filter Engine</h2>\r\n");
      out.write("                    <span class=\"price\">Rs.4141.04</span>\r\n");
      out.write("                    <i class='bx bx-shopping-bag add-cart'></i>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <!--box 3-->\r\n");
      out.write("                <div class=\"product-box\">\r\n");
      out.write("                    <img src=\"img/Filter Products/product3.jpg\" alt=\"\" class=\"product-img\">\r\n");
      out.write("                    <h2 class=\"product-title\">PRORAM Induction Performance Universal Cone Air Filter Intake 120mm - 76mm ID</h2>\r\n");
      out.write("                    <span class=\"price\">Rs.12648.08</span>\r\n");
      out.write("                    <i class='bx bx-shopping-bag add-cart'></i>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <!--box 4-->\r\n");
      out.write("                <div class=\"product-box\">\r\n");
      out.write("                    <img src=\"img/Filter Products/product4.jpg\" alt=\"\" class=\"product-img\">\r\n");
      out.write("                    <h2 class=\"product-title\">Ramair Performance Universal Induction Intake Foam Air Filter Custom- 76mm ID</h2>\r\n");
      out.write("                    <span class=\"price\">Rs.7115.84</span>\r\n");
      out.write("                    <i class='bx bx-shopping-bag add-cart'></i>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <!--box 5-->\r\n");
      out.write("                <div class=\"product-box\">\r\n");
      out.write("                    <img src=\"img/Filter Products/product5.jpg\" alt=\"\" class=\"product-img\">\r\n");
      out.write("                    <h2 class=\"product-title\">Ramair Panel Air Filter for VW Golf mk7 R GTI GTD Cupra 280 ST FR S3 2.0tsi tdi</h2>\r\n");
      out.write("                    <span class=\"price\">Rs.4141.04</span>\r\n");
      out.write("                    <i class='bx bx-shopping-bag add-cart'></i>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <!--box 6-->\r\n");
      out.write("                <div class=\"product-box\">\r\n");
      out.write("                    <img src=\"img/Filter Products/product6.jpg\" alt=\"\" class=\"product-img\">\r\n");
      out.write("                    <h2 class=\"product-title\"> Universal 1/4\" 5/16\" 3/8\" Chrome Glass Reusable Washable Inline Fuel Filter</h2>\r\n");
      out.write("                    <span class=\"price\">Rs.3401.04</span>\r\n");
      out.write("                    <i class='bx bx-shopping-bag add-cart'></i>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <!--box 7-->\r\n");
      out.write("                <div class=\"product-box\">\r\n");
      out.write("                    <img src=\"img/Filter Products/product7.jpg\" alt=\"\" class=\"product-img\">\r\n");
      out.write("                    <h2 class=\"product-title\">FUEL FILTERS INDUSTRIAL HIGH PERFORMANCE INLINE GAS FUEL LINE UNIVERSAL</h2>\r\n");
      out.write("                    <span class=\"price\">Rs.14800.55</span>\r\n");
      out.write("                    <i class='bx bx-shopping-bag add-cart'></i>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <!--box 8-->\r\n");
      out.write("                <div class=\"product-box\">\r\n");
      out.write("                    <img src=\"img/Filter Products/product8.jpg\" alt=\"\" class=\"product-img\">\r\n");
      out.write("                    <h2 class=\"product-title\">Micron Fuel Filter Inline 6AN 8AN Universal High Flow Billet Aluminium Black</h2>\r\n");
      out.write("                    <span class=\"price\">Rs.7992.69</span>\r\n");
      out.write("                    <i class='bx bx-shopping-bag add-cart'></i>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>     \r\n");
      out.write("        </section>\r\n");
      out.write("        <section class=\"shop container\">\r\n");
      out.write("            <h2 class=\"section-title\">Oil Products</h2>\r\n");
      out.write("\r\n");
      out.write("            <!--content-->\r\n");
      out.write("            <div class=\"shop-content\">\r\n");
      out.write("\r\n");
      out.write("                <!--box 1-->\r\n");
      out.write("                <div class=\"product-box\">\r\n");
      out.write("                    <img src=\"img/Oil Products/product1.jpg\" alt=\"\" class=\"product-img\">\r\n");
      out.write("                    <h2 class=\"product-title\">Rislone Engine Oil Stop Leak Repair Concentrate</h2>\r\n");
      out.write("                    <span class=\"price\">Rs.5473.04</span>\r\n");
      out.write("                    <i class='bx bx-shopping-bag add-cart'></i>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <!--box 2-->\r\n");
      out.write("                <div class=\"product-box\">\r\n");
      out.write("                    <img src=\"img/Oil Products/product2.jpg\" alt=\"\" class=\"product-img\">\r\n");
      out.write("                    <h2 class=\"product-title\">Liqui Moly MoS2 Leichtlauf 10W-40 Engine Oil Made in Germany 2184 1 L</h2>\r\n");
      out.write("                    <span class=\"price\">Rs.5106.09</span>\r\n");
      out.write("                    <i class='bx bx-shopping-bag add-cart'></i>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <!--box 3-->\r\n");
      out.write("                <div class=\"product-box\">\r\n");
      out.write("                    <img src=\"img/Oil Products/product3.jpg\" alt=\"\" class=\"product-img\">\r\n");
      out.write("                    <h2 class=\"product-title\">PENRITE RACING 10 PERFORMANCE ENGINE OIL (10W-40) FULL SYNTHETIC 5 LITRE</h2>\r\n");
      out.write("                    <span class=\"price\">Rs.19220.55</span>\r\n");
      out.write("                    <i class='bx bx-shopping-bag add-cart'></i>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <!--box 4-->\r\n");
      out.write("                <div class=\"product-box\">\r\n");
      out.write("                    <img src=\"img/Oil Products/product4.jpg\" alt=\"\" class=\"product-img\">\r\n");
      out.write("                    <h2 class=\"product-title\">CC-1590 COMP Cams 1 Quart of 10W-30 Break-In Engine Oil</h2>\r\n");
      out.write("                    <span class=\"price\">Rs.17123.60</span>\r\n");
      out.write("                    <i class='bx bx-shopping-bag add-cart'></i>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <!--box 5-->\r\n");
      out.write("                <div class=\"product-box\">\r\n");
      out.write("                    <img src=\"img/Oil Products/product5.jpg\" alt=\"\" class=\"product-img\">\r\n");
      out.write("                    <h2 class=\"product-title\">Driven Racing Oil Motor Oil GP-1 Break-In 30W Semi-Synthetic 1</h2>\r\n");
      out.write("                    <span class=\"price\">Rs.10072.88</span>\r\n");
      out.write("                    <i class='bx bx-shopping-bag add-cart'></i>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <!--box 6-->\r\n");
      out.write("                <div class=\"product-box\">\r\n");
      out.write("                    <img src=\"img/Oil Products/product6.jpg\" alt=\"\" class=\"product-img\">\r\n");
      out.write("                    <h2 class=\"product-title\">Red Line Engine Oil Break-in Additive ZDDP Running in Start up Anti-wear 16oz</h2>\r\n");
      out.write("                    <span class=\"price\">Rs.7841.04</span>\r\n");
      out.write("                    <i class='bx bx-shopping-bag add-cart'></i>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <!--box 7-->\r\n");
      out.write("                <div class=\"product-box\">\r\n");
      out.write("                    <img src=\"img/Oil Products/product7.jpg\" alt=\"\" class=\"product-img\">\r\n");
      out.write("                    <h2 class=\"product-title\">Comp Cams Motor Oil Break-In High Zinc 10W30 Conventional 1 Qt</h2>\r\n");
      out.write("                    <span class=\"price\">Rs.4700.48</span>\r\n");
      out.write("                    <i class='bx bx-shopping-bag add-cart'></i>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <!--box 8-->\r\n");
      out.write("                <div class=\"product-box\">\r\n");
      out.write("                    <img src=\"img/Oil Products/product8.jpg\" alt=\"\" class=\"product-img\">\r\n");
      out.write("                    <h2 class=\"product-title\">Valvoline 799222 Power Steering Fluid -Â 1Â Gallon</h2>\r\n");
      out.write("                    <span class=\"price\">Rs.11271.68</span>\r\n");
      out.write("                    <i class='bx bx-shopping-bag add-cart'></i>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </section>\r\n");
      out.write("        <!--link to js-->\r\n");
      out.write("        <script src=\"js/main.js\"></script>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
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
