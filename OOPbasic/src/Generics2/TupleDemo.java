package Generics2;

public class TupleDemo {
    public static void main(String[] args) {
        Tuple<String, String> tuple = new Tuple<>("Ruhul", "Kuddus");
        tuple.showTypes();
        Tuple<String, Integer> person = new Tuple<>("Nafis", 45);
        person.showTypes();
    }
}
