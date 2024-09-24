import java.util.Scanner;

public class StudentRecordApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RecordManager recordManager = new RecordManager();
        
        // Example interaction loop
        while (true) {
            System.out.println("1. Add Student");
            System.out.println("2. Update Student");
            System.out.println("3. Delete Student");
            System.out.println("4. Add Professor");
            System.out.println("5. Add Course");
            System.out.println("6. Assign Course to Student");
            System.out.println("7. Assign Course to Professor");
            System.out.println("8. Enter Grade");
            System.out.println("9. Display Statistics");
            System.out.println("0. Exit");
            
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    // Code to add student
                    break;
                case 2:
                    // Code to update student
                    break;
                // Other cases for additional operations
                case 0:
                    System.out.println("Exiting...");
                    return;
            }
        }
    }
}
