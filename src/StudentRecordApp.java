import java.util.Scanner;

public class StudentRecordApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RecordManager recordManager = new RecordManager();

        while (true) {
            System.out.println("\n--- Student Records Management ---");
            System.out.println("1. Add Student");
            System.out.println("2. Update Student");
            System.out.println("3. Delete Student");
            System.out.println("4. Add Professor");
            System.out.println("5. Add Course");
            System.out.println("6. Assign Course to Student");
            System.out.println("7. Assign Course to Professor");
            System.out.println("8. Enter Grade");
            System.out.println("9. Display Student Statistics");
            System.out.println("10. Display Course Statistics");
            System.out.println("0. Exit");

            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline character

            switch (choice) {
                case 1:
                    // Example: Adding a student
                    System.out.println("Enter Student Details: ");
                    System.out.print("ID: ");
                    String studentId = scanner.nextLine();
                    System.out.print("Last Name: ");
                    String lastName = scanner.nextLine();
                    System.out.print("First Name: ");
                    String firstName = scanner.nextLine();
                    System.out.print("Email: ");
                    String email = scanner.nextLine();
                    System.out.print("Phone: ");
                    String phone = scanner.nextLine();
                    System.out.print("Semester: ");
                    int semester = scanner.nextInt();
                    
                    Student student = new Student(studentId, lastName, firstName, email, phone, semester);
                    recordManager.addStudent(student);
                    System.out.println("Student added.");
                    break;

                case 2:
                    // Example: Updating a student
                    System.out.print("Enter Student ID to update: ");
                    String updateStudentId = scanner.nextLine();
                    System.out.println("Enter new details for the student.");
                    // Assume same process as adding a student.
                    Student updatedStudent = new Student(updateStudentId, lastName, firstName, email, phone, semester);
                    recordManager.updateStudent(updateStudentId, updatedStudent);
                    System.out.println("Student updated.");
                    break;

                case 3:
                    // Example: Deleting a student
                    System.out.print("Enter Student ID to delete: ");
                    String deleteStudentId = scanner.nextLine();
                    recordManager.deleteStudent(deleteStudentId);
                    System.out.println("Student deleted.");
                    break;

                case 4:
                    // Example: Adding a professor
                    System.out.print("Enter Professor Details (ID, Last Name, First Name, Email, Phone, Specialization): ");
                    String professorId = scanner.nextLine();
                    String professorLastName = scanner.nextLine();
                    String professorFirstName = scanner.nextLine();
                    String professorEmail = scanner.nextLine();
                    String professorPhone = scanner.nextLine();
                    String specialization = scanner.nextLine();
                    
                    Professor professor = new Professor(professorId, professorLastName, professorFirstName, professorEmail, professorPhone, specialization);
                    recordManager.addProffesor(professor);
                    System.out.println("Professor added.");
                    break;

                case 5:
                    // Example: Adding a course
                    System.out.print("Enter Course Details (Code, Title, Semester): ");
                    String courseCode = scanner.nextLine();
                    String courseTitle = scanner.nextLine();
                    int courseSemester = scanner.nextInt();
                    
                    Course course = new Course(courseCode, courseTitle, courseSemester);
                    recordManager.addCourse(course);
                    System.out.println("Course added.");
                    break;

                case 6:
                    // Example: Assign course to student
                    System.out.print("Enter Student ID: ");
                    String assignStudentId = scanner.nextLine();
                    System.out.print("Enter Course Code: ");
                    String assignCourseCode = scanner.nextLine();
                    
                    Course courseToAssign = recordManager.getCourse(assignCourseCode);
                    recordManager.assignCourseToStudent(assignStudentId, courseToAssign);
                    System.out.println("Course assigned to student.");
                    break;

                case 7:
                    // Example: Assign course to professor
                    System.out.print("Enter Professor ID: ");
                    String assignProfessorId = scanner.nextLine();
                    System.out.print("Enter Course Code: ");
                    String courseForProfessor = scanner.nextLine();
                    
                    Course courseForProf = recordManager.getCourse(courseForProfessor);
                    recordManager.assignCourseToProfessor(assignProfessorId, courseForProf);
                    System.out.println("Course assigned to professor.");
                    break;

                case 8:
                    // Example: Enter grades
                    System.out.print("Enter Student ID: ");
                    String gradeStudentId = scanner.nextLine();
                    System.out.print("Enter Course Code: ");
                    String gradeCourseCode = scanner.nextLine();
                    System.out.print("Enter Grade: ");
                    double grade = scanner.nextDouble();
                    
                    Student gradeStudent = recordManager.getStudent(gradeStudentId);
                    Course gradeCourse = recordManager.getCourse(gradeCourseCode);
                    recordManager.enterGrade(gradeStudent, gradeCourse, grade);
                    System.out.println("Grade entered.");
                    break;

                case 9:
                    // Example: Display student statistics (average grade)
                    System.out.print("Enter Student ID: ");
                    String statsStudentId = scanner.nextLine();
                    Student statsStudent = recordManager.getStudent(statsStudentId);
                    double avgGrade = Statistics.calculateAverageGradePerStudent(statsStudent, recordManager.getGrades());
                    System.out.println("Average grade for student: " + avgGrade);
                    break;

                case 10:
                    // Example: Display course statistics (average grade)
                    System.out.print("Enter Course Code: ");
                    String statsCourseCode = scanner.nextLine();
                    Course statsCourse = recordManager.getCourse(statsCourseCode);
                    double avgCourseGrade = Statistics.calculateAverageGradePerCourse(statsCourse, recordManager.getGrades());
                    System.out.println("Average grade for course: " + avgCourseGrade);
                    break;

                case 0:
                    System.out.println("Exiting...");
                    return;

                default:
                    System.out.println("Invalid option, please try again.");
                    break;
            }
        }
    }
}
