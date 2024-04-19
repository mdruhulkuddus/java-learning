package JavaBasics;

import java.util.Scanner;

public class twoNumberCompare {
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();

        boolean isEqual = a == b;
        boolean notEqual = a != b;
        boolean isGaterA = a > b;
        boolean isGaterB = a < b;

        System.out.println("Equal = " + isEqual);
        System.out.println("Not equal = " + notEqual);
        System.out.println("A is Grater than B = " + isGaterA);
        System.out.println("B is Grater than A = " + isGaterB);

    }
}
