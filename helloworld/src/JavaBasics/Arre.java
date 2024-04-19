package JavaBasics;

public class Arre {
    public static void main(String [] args)
    {
        int[] myArray = {-1, 2, 5 , 6, 8};
        System.out.println("index \t value");
        for(int i = 0; i < myArray.length; i++)
        {
            System.out.println(i +"\t"+myArray[i]);
        }
    }
}
