import java.util.*;

public class Statistics {

    public static double calculateAverageGradePerStudent(Student student, List<Grade> grades) {
        double total = 0;
        int count = 0;
        for (Grade grade : grades) {
            if (grade.getStudent().equals(student)) {
                total += grade.getGrade();
                count++;
            }
        }
        return count == 0 ? 0 : total / count;
    }

    public static double calculateAverageGradePerCourse(Course course, List<Grade> grades) {
        double total = 0;
        int count = 0;
        for (Grade grade : grades) {
            if (grade.getCourse().equals(course)) {
                total += grade.getGrade();
                count++;
            }
        }
        return count == 0 ? 0 : total / count;
    }
}
