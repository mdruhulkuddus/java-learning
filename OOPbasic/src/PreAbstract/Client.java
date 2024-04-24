package PreAbstract;

public class Client {
    private final String name;
    private final int hoursWorked;

    public Client(String name, int hoursWorked){
        this.name = name;
        this.hoursWorked = hoursWorked;
    }

    public String getName(){
        return name;
    }

    public  int getHoursWorked(){
        return hoursWorked;
    }
}
