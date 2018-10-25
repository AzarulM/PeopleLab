package Lab;

public class Classroom {
    /**
     * the next two lines initialize the fields
     */
    private Student[] students;
    private Teacher teacher;
    Student[][] seatingChart = new Student[6][6];
    /**
     * Constructor
     * @param teacher sets the teacher
     * @param students sets the students
     */
    public Classroom(Teacher teacher, Student[] students) {
        this.teacher = teacher;
        this.students = students;
        fillSeats();
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


    public void fillSeats(){
        int pos = 0;
        for(Student[] var : seatingChart){
            if(var ==  null){
                break;
            }
            for(int i = 0; i < var.length; i++){
                if(var[i]==null){
                    break;
                }
                var[i] = students[pos];
                pos++;
            }
        }
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
        for (Student student : this.students){
            classAverage += student.getGPA();
        }
        return classAverage/this.students.length;
    }

    public String toString(){
        return this.teacher.toString() + " teaches " + this.teacher.getSubject(); //more needs to be added here
    }
}
