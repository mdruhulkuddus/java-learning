package PreAbstract;

public class Main {
    public static void main(String[] args) {
        HrManager hrManager = new HrManager();

        Client client0 = new Client("rahim", 50);
        hrManager.addClient(client0);

        Client client1 = new Client("Karim", 40);
        hrManager.addClient(client1);

        double totalFixedPay = hrManager.getTotalPay("FIXED");
        System.out.println("Total FIXED pay = "+ totalFixedPay);

        double hourlyTotalPay = hrManager.getTotalPay("HOURLY");
        System.out.println("Total HOURLY pay = "+ hourlyTotalPay);

    }
}
