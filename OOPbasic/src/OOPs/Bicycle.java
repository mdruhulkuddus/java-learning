package OOPs;

public class Bicycle {
    private int speed = 0;
    private int gear = 1;
    private int candence = 0;

    public void changeCandence(int newVaue)
    {
        candence = newVaue;
    }

    public void changeGear(int newValue)
    {
        gear = newValue;
    }

    public void speedUp(int increment)
    {
        speed = speed + increment;
    }

    public void applyBrakes(int decrement)
    {
        speed = speed - decrement;
    }

    public void printStates()
    {
        System.out.println("candence: " + candence + " speed: "+ speed + " gear: " + gear);
    }

//    public static class Main {
//
//        public static void main(String[] args) {
//
//            Bicycle bike1 = new Bicycle();
//            bike1.printStates();
//        }
//    }
}



