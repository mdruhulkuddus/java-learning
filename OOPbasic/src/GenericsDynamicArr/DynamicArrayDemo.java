package GenericsDynamicArr;

public class DynamicArrayDemo {
    public static void main(String[] args) {
        DynamicArray<Integer> numbers = new DynamicArray<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        System.out.println(numbers);
        System.out.println(numbers.get(0));
        System.out.println(numbers.get(1));
        int totalElements = numbers.size();
        System.out.println("Total elements = "+ totalElements);

        DynamicArray<String> cities = new DynamicArray<>();
        cities.add("Dhaka");
        cities.add("Feni");

        System.out.println(cities);
    }
}
