public class Professor {
    private String professorId;
    private String lastName;
    private String firstName;
    private String email;
    private String phoneNumber;
    private String specialization;

    // Constructor
    public Professor(String professorId, String lastName, String firstName, String email, String phoneNumber, String specialization) {
        this.professorId = professorId;
        this.lastName = lastName;
        this.firstName = firstName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.specialization = specialization;
    }

    // Getters and Setters
    /**
     * Gets the professor ID.
     * 
     * @return The professor's ID.
     */
    public String getProfessorId() {
        return professorId;
    }

    /**
     * Sets the professor ID.
     * 
     * @param professorId The new professor ID.
     */
    public void setProfessorId(String professorId) {
        this.professorId = professorId;
    }
}
