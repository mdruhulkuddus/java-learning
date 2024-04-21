package Abstracts;

public abstract class  Animal {
    private final int legs;
    private String name;

    public Animal(int legs, String name){
        this.legs = legs;
        this.name = name;
    }

  public abstract String getDiets();

    @Override
    public String toString(){
        return (name + " has " + legs + " legs(s)");
    }
}
