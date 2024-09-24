public class Student {
    private String studentId;
    private String lastName;
    private String firstName;
    private String email;
    private String phoneNumber;
    private int semester;
    
    // Constructor
    public Student(String studentId, String lastName, String firstName, String email, String phoneNumber, int semester) {
        this.studentId = studentId;
        this.lastName = lastName;
        this.firstName = firstName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.semester = semester;
    }

    // Getters and Setters
    /**
     * Gets the student ID.
     * 
     * @return The student's ID.
     */
    public String getStudentId() {
        return studentId;
    }

    /**
     * Sets the student ID.
     * 
     * @param studentId The new student ID.
     */
    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }
}
