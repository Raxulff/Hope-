import java.util.*;

class UserDetail {
    String username;
    String password;

    UserDetail(String username, String password) {
        this.username = username;
        this.password = password;
    }
}

class EnrollmentManager {
    ArrayList<UserDetail> userList = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public void startEnrollment(int totalStudents) {
        for (int i = 1; i <= totalStudents; i++) {
            registerSingleStudent(i);
        }
        displaySummary();
    }

    public void registerSingleStudent(int studentIndex) {
        boolean success = false;
        while (!success) {
            System.out.println("\n--- Registering Student " + studentIndex + " ---");
            System.out.print("Enter username: ");
            String name = sc.next();

            if (isUsernameTaken(name)) {
                System.out.println("ERROR: Username '" + name + "' already exists!");
            } else {
                System.out.print("Enter password: ");
                String pass = sc.next();
                userList.add(new UserDetail(name, pass));
                System.out.println("Registration successful.");
                success = true;
            }
        }
    }

    public boolean isUsernameTaken(String name) {
        for (UserDetail user : userList) {
            if (user.username.equalsIgnoreCase(name)) {
                return true;
            }
        }
        return false;
    }

    public void login() {
        System.out.println("\n--- Login ---");
        System.out.print("Username: ");
        String name = sc.next();
        System.out.print("Password: ");
        String pass = sc.next();

        for (UserDetail user : userList) {
            if (user.username.equalsIgnoreCase(name) && user.password.equals(pass)) {
                System.out.println("Login successful! Welcome, " + name + ".");
                return;
            }
        }
        System.out.println("ERROR: Invalid username or password.");
    }

    public void displaySummary() {
        System.out.println("\n--- Enrollment Summary ---");
        System.out.println("Total Students Enrolled: " + userList.size());
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        EnrollmentManager manager = new EnrollmentManager();

        System.out.print("ENTER THE NUMBER OF STUDENTS TO ENROLL: ");
        int count = input.nextInt();

        manager.startEnrollment(count);
        
        System.out.println("\nWould you like to try logging in? (yes/no)");
        String choice = input.next();
        if (choice.equalsIgnoreCase("yes")) {
            manager.login();
        }
    }
}
