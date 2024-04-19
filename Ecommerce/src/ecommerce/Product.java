package ecommerce;

public class Product {
    private final String name;
    private int price;

    public  Product(String name, int price)
    {
        this.name = name;
        this.price = price;
    }

    public  int getPrice(){
        return this.price;
    }

    @java.lang.Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
