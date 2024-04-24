package interface1;

public class PaymentEngine {
    public void accept(Payment payment){

        System.out.println("Accepting Payment: "+ payment.getAmount());
    }
}
