package OOPs;

public class Main {
    public static void main(String[] args)
    {
//        Bicycle bike1 = new Bicycle();
//        bike1.changeCandence(50);
//        bike1.speedUp(10);
//        bike1.changeGear(2);
//        bike1.printStates();



     //  int result = obj.addition(4, 5);
//        double resultf = obj.addition(5.5f, 5.9f); // Use 'f' suffix for float literals
//        System.out.println(resultf);

        StudentMarks ruhul = new StudentMarks("ruhul", new  double[]{98.5, 65.22, 55.5});
        double totalMarks = ruhul.totalMarks();
        double average = ruhul.avereage();
        System.out.println("total mark " + totalMarks + " and average " + average);

    }
}
