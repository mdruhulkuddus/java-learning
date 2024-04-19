package ecommerce;

import ecommerce.CreditCard;

public class Customer {
    private String name;
    private CreditCard creditCard;

    public Customer(String name, long number, int cvv, String validThrough){
        this.name = name;
        this.creditCard = new CreditCard(number, cvv, validThrough);
    }

    public Customer(String name, CreditCard creditCard)
    {
        this.name = name;
        this.creditCard = creditCard;
    }


}
