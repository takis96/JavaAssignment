import java.util.*;

public class RecordManager {
    private Map<String, Student> students = new HashMap<>();
    private Map<String, Professor> professors = new HashMap<>();
    private Map<String, Course> courses = new HashMap<>();
    private List<Grade> grades = new ArrayList<>();

    // Insert, update, and delete methods for students
    public void addStudent(Student student) {
        students.put(student.getStudentId(), student);
    }

    public void updateStudent(String studentId, Student updatedStudent) {
        if (students.containsKey(studentId)) {
            students.put(studentId, updatedStudent);
        } else {
            System.out.println("Student not found.");
        }
    }

    public void deleteStudent(String studentId) {
        students.remove(studentId);
    }

    // Methods for professors, courses, assignments
    // Assign courses to students, professors
    public void assignCourseToStudent(String studentId, Course course) {
        Student student = students.get(studentId);
        if (student != null) {
            course.assignStudent(student);// Logic to assign course to student
        }
    }

    public void assignCourseToProfessor(String professorId, Course course) {
        Professor professor = professors.get(professorId);
        if (professor != null) {
            course.assignProfessor(professor);
        }
    }

    // Enter grades
    public void enterGrade(Student student, Course course, double grade) {
        grades.add(new Grade(student, course, grade));
    }

}
