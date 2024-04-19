package JavaBasics;

public class DecimalToHexBiOctal {
    public static void main(String[] args)
    {
        int d_number = 1_000_000; // 1 million
        String binary = Integer.toBinaryString(d_number);
        String hex = Integer.toHexString(d_number);
        String octal = Integer.toOctalString(d_number);

        System.out.println("Binary: " + binary);
        System.out.println("Hex: " + hex);
        System.out.println("Octal: " + octal);
    }
}
