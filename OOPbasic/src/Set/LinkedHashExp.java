package Set;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashExp {
    public static void main(String[] args) {
        Set<String> cities = new LinkedHashSet<>();
        cities.add("Feni");
        cities.add("CUmmilla");
        cities.add("Feni");
        cities.add("Lalmatia");
        cities.add("abd");
        cities.add("abc");

        System.out.println(cities);
    }
}
