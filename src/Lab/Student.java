package Lab;

public class Student extends Person
{
    private double GPA;
    private String school;
    private int age;


    public Student(String firstname, String familyname, double GPA, )
    {
        super("Person", "wu");
        this.GPA = GPA;
        this.school = school;
        this.age = age;

    }
    public double getGPA()
    {
        return this.GPA;
    }
    public String getSchool()
    {
        return this.school;
    }
    public int getAge()
    {
        return this.age;
    }

    public String toString()
    {
        return this.getFamilyName() + ", " + this.getFirstName() + ": " + this.getAge() + " enrolled in " + getSchool() + " has a " + this.getGPA() ;
    }
}
