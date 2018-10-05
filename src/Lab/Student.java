package Lab;

public class Student extends Person
{
    private double GPA;
    private String school;
    private int age;


    public Student(double GPA)
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
        return school;
    }
    public void setSchool(String school)
    {
        this.school=school;
    }
    public int getAge()
    {
        return age;
    }
    public void setAge(int age)
    {
        return this.age;
    }
    @Override
    public String toString()
    {
        return this.getFamilyName() + ", " + this.getFirstName() + ": " + this.getAge() + " enrolled in " + getSchool() + " has a " + this.getGPA() ;
    }
}
