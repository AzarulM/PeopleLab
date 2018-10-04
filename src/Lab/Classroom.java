package Lab;

public class Classroom {
    private Student[] students;
    private Teacher teacher;

    public Classroom(Teacher teacher, Student[] students) {
        this.teacher = teacher;
        this.students = students;
    }

    public String getSubject(){
        return this.teacher.getSubject();
    }

    public double classAverage(){
        double classAverage = 0;
        for (Person student : students){
            double totalGPA = 0;
            int totalStudents = 0;
            totalGPA += student.getGPA();
            totalStudents++;
            double classAverage = totalGPA/totalStudents;
        }
        return classAverage;
    }
}
