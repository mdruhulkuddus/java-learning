package JavaBasics;

import java.util.StringJoiner;

public class StringJoinerExp {
    public static void main(String [] args)
    {
        String[] cities = {"Dhaka", "Comilla", "Chittagong", "Rajshahi", "Rangpur"};
        StringJoiner joiner = new StringJoiner(", ");
        for(String city: cities)
        {
            joiner.add(city);
        }
        System.out.println("Cities of Bangladesh: "+ joiner);

    }
}
