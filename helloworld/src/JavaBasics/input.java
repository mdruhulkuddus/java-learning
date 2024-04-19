package JavaBasics;

import java.util.Scanner;

public class input {
    public static void main (String[] args)
    {
       Scanner inpt = new Scanner(System.in);
       System.out.println("Enter a Number: ");
       int number = inpt.nextInt();
       System.out.println("number = " + number);

        System.out.println("Enter a Name: ");
        String text = inpt.next();
        System.out.println("Name: " + text);

        System.out.println("Enter a GPA: ");
        double gpa = inpt.nextDouble();
        System.out.println("Gpa: " + gpa);



    }
}
