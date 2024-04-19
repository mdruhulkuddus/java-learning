package ecommerce;

public class Main {

    public static void main(String [] args){
        ShoppingCart shoppingCart = new ShoppingCart();
        Product hp = new Product("Laptop Hp", 2500);
        Product dell = new Product("Laptop Dell", 3500);

        shoppingCart.addProduct(hp); // Call addProduct method on the shoppingCart instance
        shoppingCart.addProduct(dell); // Call addProduct method on the shoppingCart instance

        int totalPrice = shoppingCart.getTotalPrice();
        System.out.println("ShoppingCart = "+ shoppingCart);
        System.out.println("Total Price = "+ totalPrice);
    }



}