// hashSet make a ascending order
package Set;

import java.util.HashSet;
import java.util.Set;

public class HashSetExp {
    public static void main(String[] args) {
        Set<String> cities = new HashSet<>();

        cities.add("Feni");
        cities.add("CUmmilla");
        cities.add("Feni");
        cities.add("Lalmatia");
        cities.add("abd");
        cities.add("abc");

        for (String city:cities){
            System.out.println(city);
        }
    }
}
