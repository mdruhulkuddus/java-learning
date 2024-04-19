package ecommerce;

import java.util.ArrayList;
public class ShoppingCart {
    private ArrayList<Product> products = new ArrayList<>();

    public void addProduct(Product product){
        products.add(product);
    }

    public int getTotalPrice(){
        int totalPrice = 0;
        for(Product product : products){
            totalPrice += product.getPrice();
        }
        return totalPrice;
    }

    @java.lang.Override
    public String toString() {
        return "ShoppingCart{" +
                "products=" + products +
                '}';
    }
}
