package Collectionframework;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        List<String> topCities = new ArrayList<>();
        topCities.add("RUhUl");
        topCities.add("Kuddus");
        topCities.add("Feni");

        System.out.println(topCities);

        int sizw = topCities.size();
        System.out.println(sizw);

        topCities.remove(2);
        for (String s:topCities){
            System.out.println(s);
        }
    }
}
