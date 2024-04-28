package Collectionframework;

import java.util.List;
import java.util.Vector;

public class ListWihVector {
        public static void main(String[] args) {
            List<String> topCities = new Vector<>();
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


