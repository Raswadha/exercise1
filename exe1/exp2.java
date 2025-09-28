import java.util.*;

class VirtualClassroomManager {
    static class ClassSession {
        String className;
        String date;
        String time;

        ClassSession(String className, String date, String time) {
            this.className = className;
            this.date = date;
            this.time = time;
        }

        public String toString() {
            return "Class: " + className + " | Date: " + date + " | Time: " + time;
        }
    }

    static class Assignment {
        String studentName;
        String assignmentTitle;
        String submission;

        Assignment(String studentName, String assignmentTitle, String submission) {
            this.studentName = studentName;
            this.assignmentTitle = assignmentTitle;
            this.submission = submission;
        }

        public String toString() {
            return "Student: " + studentName + " | Assignment: " + assignmentTitle + " | Submission: " + submission;
        }
    }

    static List<ClassSession> classSchedule = new ArrayList<>();
    static Map<String, List<String>> attendance = new HashMap<>();
    static List<Assignment> assignments = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n==== Virtual Classroom Manager ====");
            System.out.println("1. Schedule a Class");
            System.out.println("2. View Class Schedule");
            System.out.println("3. Mark Attendance");
            System.out.println("4. View Attendance");
            System.out.println("5. Submit Assignment");
            System.out.println("6. View Assignments");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();  // consume newline

            switch (choice) {
                case 1:
                    scheduleClass(sc);
                    break;
                case 2:
                    viewSchedule();
                    break;
                case 3:
                    markAttendance(sc);
                    break;
                case 4:
                    viewAttendance();
                    break;
                case 5:
                    submitAssignment(sc);
                    break;
                case 6:
                    viewAssignments();
                    break;
                case 0:
                    System.out.println("Exiting Virtual Classroom Manager.");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }

        } while (choice != 0);

        sc.close();
    }

    static void scheduleClass(Scanner sc) {
        System.out.print("Enter class name: ");
        String name = sc.nextLine();
        System.out.print("Enter date (YYYY-MM-DD): ");
        String date = sc.nextLine();
        System.out.print("Enter time (HH:MM): ");
        String time = sc.nextLine();

        classSchedule.add(new ClassSession(name, date, time));
        System.out.println("Class scheduled successfully.");
    }

    static void viewSchedule() {
        if (classSchedule.isEmpty()) {
            System.out.println("No classes scheduled.");
        } else {
            System.out.println("\n-- Class Schedule --");
            for (ClassSession session : classSchedule) {
                System.out.println(session);
            }
        }
    }

    static void markAttendance(Scanner sc) {
        System.out.print("Enter class name: ");
        String className = sc.nextLine();
        System.out.print("Enter student name: ");
        String studentName = sc.nextLine();

        attendance.putIfAbsent(className, new ArrayList<>());
        attendance.get(className).add(studentName);

        System.out.println("Attendance marked for " + studentName + " in " + className);
    }

    static void submitAssignment(Scanner sc) {
        System.out.print("Enter student name: ");
        String studentName = sc.nextLine();
        System.out.print("Enter assignment title: ");
        String title = sc.nextLine();
        System.out.print("Enter submission text: ");
        String submission = sc.nextLine();

        // ❌ Error 1: Using undefined variable "studName" instead of "studentName"
        assignments.add(new Assignment(studName, title, submission));

        System.out.println("Assignment submitted successfully.");
    }

    static void viewAssignments() {
        if (assignments.isEmpty()) {
            System.out.println("No assignments submitted.");
        } else {
            System.out.println("\n-- Submitted Assignments --");
            for (Assignment a : assignments) {
    
                System.out.println(a.toString;
            }
        }
    }
}



interface PaymentStrategy {
    void pay(int amount);
}

class CreditCardPayment implements PaymentStrategy {
    public void pay(int amount) {
        System.out.println("Paid " + amount + " using Credit Card.");
    }
}

class PayPalPayment implements PaymentStrategy {
    public void pay(int amount) {
        System.out.println("Paid " + amount + " using PayPal.");
    }
}

class PaymentContext {
    private PaymentStrategy strategy;

    public void setStrategy(PaymentStrategy strategy) {
        this.strategy = strategy;
    }

    public void executePayment(int amount) {
        strategy.pai(amount);  // 
}

public class StrategyDemo {
    public static void main(String[] args) {
        PaymentContext context = new PaymentContext();
        context.setStrategy(new CreditCardPaymnt());  
        context.executePayment(100);
    }
}

