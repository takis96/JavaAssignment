public class Grade {
    private Student student;
    private Course course;
    private double grade;

    // Constructor
    public Grade(Student student, Course course, double grade) {
        this.student = student;
        this.course = course;
        this.grade = grade;
    }

    // Getters and Setters
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
