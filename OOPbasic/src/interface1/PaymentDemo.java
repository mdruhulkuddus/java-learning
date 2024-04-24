package interface1;

public class PaymentDemo {
    public static void main(String[] args) {
        PaymentEngine paymentEngine = new PaymentEngine();

        BkashPayment bkashPayment = new BkashPayment(100);
        paymentEngine.accept(bkashPayment);

        CashPayment cashPayment = new CashPayment(50);
        paymentEngine.accept(cashPayment);

    }
}
