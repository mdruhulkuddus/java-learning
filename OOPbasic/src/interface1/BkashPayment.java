package interface1;

public class BkashPayment implements Payment{
    private final double amount;

    public BkashPayment(double amount){
        this.amount = amount;
    }

    @Override
    public double getAmount(){
        System.out.println("Taking bkash Payment");
        return  amount;
    }
}
