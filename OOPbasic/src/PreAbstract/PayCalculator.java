package PreAbstract;

public class PayCalculator {
    private static final double HOURLY_RATE = 70;
    private static final double FIXED_PAY = 550;

    public double getPay(Client client, String method){
        return switch (method){
            case "HOURLY" -> client.getHoursWorked() * HOURLY_RATE;
            case "FIXED" -> FIXED_PAY;
            default -> throw new IllegalArgumentException(
                    "Unknown method: " + method
            );
        };
    }
}
