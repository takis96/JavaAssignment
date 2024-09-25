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

    /**
     * Gets the last name of the student.
     * 
     * @return The last name.
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the last name of the student.
     * 
     * @param lastName The new last name.
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Gets the first name of the student.
     * 
     * @return The first name.
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the first name of the student.
     * 
     * @param firstName The new first name.
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Gets the student's email address.
     * 
     * @return The email address.
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the student's email address.
     * 
     * @param email The new email address.
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Gets the student's phone number.
     * 
     * @return The phone number.
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Sets the student's phone number.
     * 
     * @param phoneNumber The new phone number.
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * Gets the current semester of the student.
     * 
     * @return The current semester.
     */
    public int getSemester() {
        return semester;
    }

    /**
     * Sets the current semester of the student.
     * 
     * @param semester The new semester. Must be between 1 and 8.
     */
    public void setSemester(int semester) {
        if (semester >= 1 && semester <= 8) {  // Example validation
            this.semester = semester;
        } else {
            System.out.println("Invalid semester value");
        }
    }
}
