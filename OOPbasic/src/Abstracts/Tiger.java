package Abstracts;

public class Tiger extends Animal{
    public Tiger(){
        super(4+4, "Tiger");
    }
    @Override
    public String getDiets(){
            return "Deers";
    }
}
