package Lab;

public class Runner
{
    String[] firstName = {"bob","smith","1","2","3","4"};
    String[] familyName = {"Folwell","wu","1","2","3","4"};

    public static void main(String[] args)
    {
        Teacher teacher = new Teacher("All of them", "Mr", "Bob", "boB");
        Student[] students = new Student[6];

        for(Student student : students){
            students = randomStudent();
        }
        Classroom classA = new Classroom(teacher, students);
    }

    public static Student randomStudent(){
        int randomStudent = (int) (Math.random() * this.firstName.length);
        int age = (int) (Math.random()*4)+14;
        int GPA = (int) (Math.random()*100+1);
        return new Student(familyName(randomStudent),firstName(randomStudent),age,"Brooklyn Technical High School",GPA);

    }

}