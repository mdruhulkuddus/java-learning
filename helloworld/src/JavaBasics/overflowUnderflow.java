package JavaBasics;

public class overflowUnderflow {
    public static void main(String [] args)
    {
        // overflow
        int val = 2147483647;
        System.out.println(val);

        val += 1 ;
        System.out.println(val);

        val += 1 ;
        System.out.println(val);

        // under flow
        val -= 2;
        System.out.println(val);

    }
}
