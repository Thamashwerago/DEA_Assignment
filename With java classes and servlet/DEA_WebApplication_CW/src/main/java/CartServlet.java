import java.io.IOException;
import java.util.List;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class CartServlet extends HttpServlet {

private static final long serialVersionUID = 1L;
private CartService cartService;

@Override
public void init() throws ServletException {
    cartService = new CartService();
  }

protected void doPost(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException {
	    String action = request.getParameter("action");
	    
	    if (action != null && action.equals("removeFromCart")) {
	        // Retrieve the title parameter and remove the item from the cart
	        String title = request.getParameter("title");
	        
	        if (title != null && !title.isEmpty()) {
	            HttpSession session = request.getSession();
	            
	            List<OrderItem> cartItems = (List<OrderItem>) getSession().getAttribute("cartItems");
	            if (cartItems != null) {
	                // Find the item with the matching title and remove it from the cart
	                for (OrderItem item : cartItems) {
	                    if (item.getTitle().equals(title)) {
	                        cartItems.remove(item);
	                        break;
	                    }
	                }
	            }
	        }
  }

protected void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
    // Pass the CartService instance to the JSP file as an attribute
    request.setAttribute("cartService", cartService);
    request.getRequestDispatcher("cart.jsp").forward(request, response);
  }
}
