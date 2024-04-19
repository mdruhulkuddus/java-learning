package JavaBasics;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class horseshoe {
    public static void main(String [] args)
    {
        Scanner scanner = new Scanner(System.in);
        Set<Integer> integerSet = new HashSet<>();

        for(int i = 0; i < 4; i++)
        {
                int number = scanner.nextInt();
                integerSet.add(number);
        }
        int result = 4-integerSet.size();
        System.out.println(result);
    }
}
