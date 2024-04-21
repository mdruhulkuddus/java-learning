package Abstracts;

public class ZooDemo {
    public static void main(String[] args) {
        Animal[] animals = new Animal[3];
        animals[0] = new Tiger();  // Implicit upcasting from Tiger to Animal
        animals[1] = new Lion();
        animals[2] = new Tiger();
        Zoo zoo = new Zoo(animals);
        zoo.printInfo();
    }
}
