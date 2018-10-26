package Lab;

public class Runner
{
    static String[] firstName = {"bob","george","james","david","michael","kevin"};
    static String[] familyName = {"Folwell","wu","smith","ko","lui","james"};

    public static void main(String[] args)
    {
        Teacher teacher = new Teacher("English", "Mr", "Bob", "Teacher");
        Student[] students = new Student[33];

        for(int i =0; i<students.length;i++){
            students[i] = randomStudent();
        }
        Classroom classA = new Classroom(teacher, students);
        System.out.println(classA);
        System.out.println("The class average is " + classA.classAverage());
    }

    public static Student randomStudent(){
        int randomStudent = (int) (Math.random() * firstName.length);
        int age = (int) (Math.random()*4)+14;
        int GPA = (int) (Math.random()*100+1);
        return new Student(familyName[randomStudent],firstName[randomStudent],age,"Brooklyn Technical High School",GPA);

    }

}
