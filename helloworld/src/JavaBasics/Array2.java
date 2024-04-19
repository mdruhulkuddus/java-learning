package JavaBasics;

import java.util.Scanner;

public class Array2 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Size of Array : ");
        int sizeofArray = input.nextInt();
        System.out.println("Input : " + sizeofArray + " values ");
        int[] numbers = new int[sizeofArray];
        for (int i = 0; i < sizeofArray; i++)
        {
            numbers[i] = input.nextInt();
        }
        System.out.println("Output Array : ");
        for (int i = 0; i < sizeofArray; i++)
        {
            System.out.println(numbers[i]);
        }
    }
}
