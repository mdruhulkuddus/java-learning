package JavaBasics;

import java.util.Scanner;

public class Mathmatian {
public static void main(String [] args)
{
    Scanner input = new Scanner(System.in);
    String firstString = input.nextLine();
    String secondString = input.nextLine();
    String result = "";
    for(int i = 0; i < firstString.length(); i++)
    {
        if(firstString.charAt(i) != secondString.charAt(i))
        {
            result += "1";
        }else {
            result += "0";
        }
    }
    System.out.println(result);
}


}
