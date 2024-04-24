package interface2samePostAbstract;

public class HourlyPayCalculator implements PayCalculator {
    private final double hourlyRate;
    public HourlyPayCalculator(double hourlyRate)
    {
        this.hourlyRate = hourlyRate;
    }
    @Override
    public double getPay(Client client){
        return hourlyRate * client.getHoursWorked();
    }
}
