package Genericss;

public class GenericClassDemo {
    public static void main(String[] args) {
        Generic<Integer> iObj;
        iObj = new Generic<>(88);
        iObj.showType();

        int value = iObj.getObj();
        System.out.println("Value = " + value);

        Generic<String> strObj = new Generic<>("This is a test");
        strObj.showType();
        String strValue = strObj.getObj();
        System.out.println("strValue = " + strValue);

        Generic<Double> floatValue= new Generic<Double>(5.50);
        floatValue.showType();
        System.out.println("float vlue is = "+ floatValue.getObj());

    }
}
