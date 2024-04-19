package Polymorphism;
import java.lang.Override;

public class Milk extends Liquid{
    @Override
    public void swirl(boolean clockwise){
        System.out.println("Swirling milk");
    }
}
