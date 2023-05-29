import java.util.*;
import java.util.ArrayList;

public class CartService {
  private List<OrderItem> cartItems = new ArrayList<>();

  public List<OrderItem> getCartItems() {
    return cartItems;
  }

  public void addToCart(OrderItem item) {
    cartItems.add(item);
  }

  public void removeFromCart(OrderItem item) {
    cartItems.remove(item);
  }
}
