package Lab;

public class Classroom {
    /**
     * the next two lines initialize the fields
     */
    private Student[] students;
    private Teacher teacher;
    /**
     * Constructor
     * @param teacher sets the teacher
     * @param students sets the students
     */
    public Classroom(Teacher teacher, Student[] students) {
        this.teacher = teacher;
        this.students = students;
    }
    /**
     * The next two methods are getters
     */
    public Teacher getTeacher() {
        return teacher;
    }
    public Student[] getStudents() {
        return students;
    }
    /**
     * The next two methods are setters
     */
    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
    public void setStudents(Student[] students) {
        this.students = students;
    }
    /**
     * This method will use the teacher file and call the getSubject();
     * @return the subject of the teacher
     */
    public String getSubject() {
        return this.teacher.getSubject();
    }
    /**
     * The method goes through the array of students and adds their GPA to the total GPA, and then divides it by the length of the array
     * @return the average of the class
     */
    public double classAverage(){
        double classAverage = 0;
        for (Person student : students){
            double totalGPA = 0;
            totalGPA += student.getGPA();
            double classAverage = totalGPA/this.students.length;
        }
        return classAverage;
    }

//    public String printClass(){

  //  }
}
