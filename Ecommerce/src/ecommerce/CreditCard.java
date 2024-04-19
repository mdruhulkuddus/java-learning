package ecommerce;

public class CreditCard {
    private final long number;
    private final int cvv;
    private final String validThroug;

    public CreditCard(long number, int cvv, String validThroug)
    {
        this.number = number;
        this.cvv = cvv;
        this.validThroug = validThroug;
    }

}
