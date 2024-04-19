package Polymorphism;

import java.util.ArrayList;
public class Cup {
    public ArrayList<Liquid> liquids = new ArrayList<>();
    public void addLiquid(Liquid liquid){
        liquids.add(liquid);
    }
    public void mix(){
        for (Liquid liquid: liquids){
            liquid.swirl(true);
        }
    }

    public void juice(){

    }
}
