package ProblemSolving;

import java.util.Scanner;

public class StringToCharCount {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
       str =  str.toLowerCase();
       char[] letters = str.toCharArray();
       int[] counts = new int[26];
       for (int i = 0; i < letters.length; i++)
       {
           if(Character.isLetter(letters[i])){
               int indx = letters[i] - 'a';
               counts[indx]++;
           }
       }
       for(int i = 0; i < counts.length; i++)
       {
           if(counts[i] > 0)
           {
               char ch = (char) (i + 'a');
               System.out.println(ch + " = " + counts[i]);
           }

       }
    }
}
