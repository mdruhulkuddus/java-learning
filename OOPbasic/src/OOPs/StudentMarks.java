package OOPs;

public class StudentMarks {
    private final String name;
    private final double[] marks;

    public StudentMarks(String name, double[] marks) {
        this.name = name;
        this.marks = marks;
    }

    public double avereage(){
        return totalMarks() / marks.length;
    }

    public double totalMarks()
    {
        double totalMarks = 0.0;
        for(double mark: marks)
        {
            totalMarks += mark;
        }
        return totalMarks;
    }
}
