package JavaBasics;

import java.util.Scanner;

public class loop {
    public static void main (String [] args)
    {
        Scanner input = new Scanner(System.in);
        int multiplication = input.nextInt();

        for(int i = 1; i <= 10; i++)
        {
            System.out.println(multiplication + " * " + i + " = " + multiplication * i);
        }
        int multiplication2 = input.nextInt();
        int j = 0;
        while (j != 11)
        {
            System.out.println(multiplication2 + " * " + j + " = " + multiplication2 * j);
            j++;
        }
    }


}
