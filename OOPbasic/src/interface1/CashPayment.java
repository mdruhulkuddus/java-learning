package interface1;

public class CashPayment implements Payment {
    private final double amount;

    public CashPayment(double amount) {

        this.amount = amount;
    }

    @Override
    public double getAmount() {
        System.out.println("Taking Cash Amount");
        return amount;
    }
}
