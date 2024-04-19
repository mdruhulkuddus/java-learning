package JavaBasics;

public class TextBlock {
    public static void main(String [] args)
    {
        String table = """
                +---------------------+-----------------------------+
                | Name                 | Ruhul Kuddus               |
                +                                                   +
                | Department           | CSE                        |
                +---------------------------------------------------+    
                """;

        System.out.println(table);
    }
}
