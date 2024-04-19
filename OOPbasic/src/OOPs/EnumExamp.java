package OOPs;

public class EnumExamp {
    public enum Day{
        SATUERDAY, SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY
    }

    public static void main(String[] args)
    {
//        Day today = Day.MONDAY;
//        System.out.println(today);
        Day[] days = Day.values();
        for(Day d:days)
        {
            System.out.println(d);
        }
    }
}
