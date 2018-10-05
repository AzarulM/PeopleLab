package Lab;

public class Student extends Person
{
    private double GPA;
    private String school;
    private int age;

    public Student(String familyName,String firstName,int age,String school,double GPA)
    {
        super("Person", "wu");
        this.GPA = GPA;
        this.school = school;
        this.age = age;

    }
    public double getGPA()
    {
        return GPA;
    }
    public void setGPA(double GPA)
    {
        this.GPA=GPA;
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
        this.age=age;
    }
    @Override
    public String toString()
    {
        return this.getFamilyName() + ", " + this.getFirstName() + ": " + this.getAge() + " enrolled in " + getSchool() + " has a " + this.getGPA() ;
    }
}
