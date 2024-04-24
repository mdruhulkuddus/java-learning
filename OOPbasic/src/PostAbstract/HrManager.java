package PostAbstract;

import java.util.ArrayList;

public class HrManager {
    private final ArrayList<Client> clients = new ArrayList<>();
    private PayCalculator payCalculator;

    public HrManager(PayCalculator payCalculator){
        this.payCalculator = payCalculator;
    }
    public void addClient(Client client){

        clients.add(client);
    }
    public double getTotalPay(){
        double total = 0.0;
        for (Client client: clients){
            total += payCalculator.getPay(client);
        }
        return total;
    }
}
