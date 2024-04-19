package JavaBasics;

import java.util.Scanner;

public class TwoDimentionalArr {
    public static void main(String [] args) {
        int[][] array1 = {
                {1, 2, 3, 5},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println(array1.length + "  \t " + array1[0].length);
        for (int i = 0; i < array1.length; i++)
        {
            for (int j = 0; j < array1[i].length; j++)
            {
                System.out.print(array1[i][j] + " ");
            }
            System.out.print("\n");
        }
    System.out.println("Now input your Matrix \n");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter row and colum size : ");
        int row = input.nextInt();
        int col = input.nextInt();
        int[][] matrix = new int[row][col];

        System.out.println("Enter " + row + " * " + col + " Matrix: ");
        for(int i = 0; i  < row; i++)
        {
            for(int j = 0; j < col; j++)
            {
                matrix[i][j] = input.nextInt();
            }
        }

        for(int i = 0; i  < row; i++)
        {
            for(int j = 0; j < col; j++)
            {
               System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
