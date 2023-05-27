

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/cart")
public class Caerservlet extends HttpServlet {

    /**
     *
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
    throws ServletException, IOException
    {
        Cart cart = (Cart) request.getSession().getAttribute("cart");
        if (cart == null) 
        {
            cart = new Cart();
            request.getSession().setAttribute("cart", cart);
        }
        request.getRequestDispatcher("cart.jsp").forward(request, response);
    }
}
