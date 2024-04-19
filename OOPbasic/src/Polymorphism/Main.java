package Polymorphism;

public class Main {
    public static void main(String[] args) {

        // Liquid myFavouriteBeverage = new Liquid();
        //   myFavouriteBeverage.swirl(true);

        Liquid genericLiquid = new Liquid();
        Liquid milk = new Milk();
        Liquid coffee = new Coffee();

        Cup cup = new Cup();
        cup.addLiquid(genericLiquid);
        cup.addLiquid(milk);
        cup.addLiquid(coffee);
        cup.mix();
    }
}
