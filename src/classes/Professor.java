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

     /**
     * Gets the last name of the professor.
     * 
     * @return The last name.
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the last name of the professor.
     * 
     * @param lastName The new last name.
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Gets the first name of the professor.
     * 
     * @return The first name.
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the first name of the professor.
     * 
     * @param firstName The new first name.
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Gets the professor's email address.
     * 
     * @return The email address.
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the professor's email address.
     * 
     * @param email The new email address.
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Gets the professor's phone number.
     * 
     * @return The phone number.
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Sets the professor's phone number.
     * 
     * @param phoneNumber The new phone number.
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * Gets the professor's specialization.
     * 
     * @return The specialization.
     */
    public String getSpecialization() {
        return specialization;
    }

    /**
     * Sets the professor's specialization.
     * 
     * @param specialization The new specialization.
     */
    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }
}
