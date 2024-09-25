public class Grade {
    public Student student;
    public Course course;
    private double grade;

    // Constructor
    public Grade(Student student, Course course, double grade) {
        this.student = student;
        this.course = course;
        this.grade = grade;
    }

     /**
     * Gets the student associated with the grade.
     * 
     * @return The student.
     */
    public Student getStudent() {
        return student;
    }

    /**
     * Sets the student ID associated with the grade.
     * 
     * @param studentId The new student ID.
     */
    public void setStudentId(Student student) {
        this.student = student;
    }

    /**
     * Gets the course code associated with the grade.
     * 
     * @return The course code.
     */
    public Course getCourse() {
        return course;
    }

    /**
     * Sets the course code associated with the grade.
     * 
     * @param courseCode The new course code.
     */
    public void setCourseCode(Course course) {
        this.course = course;
    }

    /**
     * Gets the professor ID.
     * 
     * @return The professor's ID.
     */
    public Double getGrade() {
        return grade;
    }

    /**
     * Sets the professor ID.
     * 
     * @param professorId The new professor ID.
     */
    public void setGraded(Double grade) {
        this.grade = grade;
    }
}
