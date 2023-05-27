
import java.util.*;


    public class Cart 
    {
    private List<Product> items;

       public Cart()
       {
        items = new ArrayList<>();
       }

       public void addItem(Product product)
       {
        items.add(product);
       }
         public void removeItem(Product product)
         {
        items.remove(product);
        }



    public List<Product> getItems() {
        return items;
    }

    public double getTotalPrice() 
    {
        double total = 0.0;
        for (Product product : items) 
        {
            total += product.getPrice();
        }
        return total;
    }
}

    

