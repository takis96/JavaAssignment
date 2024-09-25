public class Course {
    private String courseCode;
    private String title;
    private int semester;
    private Professor assignedProfessor;
    private Student assignedStudent;

    // Constructor
    public Course(String courseCode, String title, int semester) {
        this.courseCode = courseCode;
        this.title = title;
        this.semester = semester;
    }

    //Assign student to course
    public void assignStudent(Student student) {
        this.assignedStudent = student;
    }

    // Assign professor to course
    public void assignProfessor(Professor professor) {
        this.assignedProfessor = professor;
    }

    // Getters and Setters
    /**
     * Gets the course Code.
     * 
     * @return The course's Code.
     */
    public String getCourseCode() {
        return courseCode;
    }

    /**
     * Sets the professor Code.
     * 
     * @param professorId The new professor Code.
     */
    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    /**
     * Gets the title of the course.
     * 
     * @return The title.
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the title of the course.
     * 
     * @param title The new title.
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Gets the semester of the course.
     * 
     * @return The semester.
     */
    public int getSemester() {
        return semester;
    }

    /**
     * Sets the semester of the course.
     * 
     * @param semester The new semester.
     */
    public void setSemester(int semester) {
        this.semester = semester;
    }
}
