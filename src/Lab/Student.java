package Lab;

public class Student extends Person
{
    private double GPA;

    public Student(double GPA)
    {
        Super("Person");
        this.GPA = GPA;
    }
    @Override
    public double getGPA()
    {

    }
    @Override
    public String toString()
    {
        return this.getFamilyName() + " " + this.getFirstName();
    }
}
