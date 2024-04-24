package interface2samePostAbstract;

public class Main {
    public static void main(String[] args) {
        PayCalculator calculator = new FixedPayCalculator(75);
        HrManager hrManager = new HrManager(calculator);

        Client client0 = new Client("karim", 45);
        hrManager.addClient(client0);

        Client client1 = new Client("Latip", 41);
        hrManager.addClient(client1);

        double fixedTotalPay = hrManager.getTotalPay();
        System.out.println("fixedTotalPay  = "+ fixedTotalPay);

//        PayCalculator calculator = new HourlyPayCalculator(75);
//        HrManager hrManager = new HrManager(calculator);
//
//        Client client0 = new Client("karim", 45);
//        hrManager.addClient(client0);
//
//        Client client1 = new Client("Latip", 41);
//        hrManager.addClient(client1);
//
//        double hourlyTotalPay = hrManager.getTotalPay();
//        System.out.println("hourlyTotalPay  = "+ hourlyTotalPay);

    }
}
