package Abstracts;

public class Lion extends Animal{
    public Lion(){
        super(4, "Lion");
    }
@Override
    public String getDiets(){
        return "Meats";
    }
}
