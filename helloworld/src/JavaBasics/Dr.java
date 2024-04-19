package JavaBasics;

import java.util.Scanner;

public class Dr {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        StringBuilder result = new StringBuilder("I hate");
        for(int i = 2; i <= number; i++)
        {
            if(i%2 == 0){
                result.append(" that I love");
            }else{
                result.append(" that I hate");
            }
        }
        result.append(" it");
        System.out.println(result);
    }
}
