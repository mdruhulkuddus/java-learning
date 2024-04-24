package PreAbstract;

import java.util.ArrayList;

public class HrManager {
    private ArrayList<Client> clients = new ArrayList<>();
    private PayCalculator payCalculator = new PayCalculator();

    public void addClient(Client client){
        clients.add(client);
    }
    public double getTotalPay(String method){
        double total = 0.0;
        for (Client client: clients){
            total += payCalculator.getPay(client, method);
        }
        return total;
    }
}
