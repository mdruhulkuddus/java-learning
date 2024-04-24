package PostAbstract;

public class FixedPayCalculator extends PayCalculator{
    private double fixedPay;

    public FixedPayCalculator(double fixedPay){
        this.fixedPay = fixedPay;
    }

    @Override
    public double getPay(Client client){
        return fixedPay;
    }
}
