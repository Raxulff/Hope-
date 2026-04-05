import java.util.*;
class UserDetail{
    String username;
    String password;
    UserDetail(String username, String password){
        this.username = username;
        this.password = password;
    }
}
class EnrollmentManager{
    ArrayList<UserDetail> userList = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    public static void startEnrollment(int totalStudents){
        for (int i = 1; i <= totalStudents; i++) {
            registerSingleStudent(i);
        }
        displaySummary();
    }
    public static void registerSingleStudent(int studentIndex){
        boolean success = false;
        while(!success){
            System.out.println("\n--- Registering Student " + studentIndex + " ---");
            System.out.print("Enter username: ");
            String name = sc.next();
            if(isUsernameTaken(name)){
                System.out.println("ERROR: Username '" + name + "' already exists! Try a different one.");
            }else{
                System.out.print("Enter password: ");
                String pass = sc.next();
                userList.add(new UserDetail(name, pass));
                System.out.println("Registration successful.");
                success = true;
            }
        }
    }
    public static boolean isUsernameTaken(String name){
        for (UserDetail user : userList){
            if (user.username.equalsIgnoreCase(name)){
                return true;
            }
        }
        return false;
    }
    public static void displaySummary(){
        System.out.println("\n--- Enrollment Summary ---");
        System.out.println("Total Students Enrolled: " + userList.size());
    }
}
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        EnrollmentManager manager = new EnrollmentManager();
        System.out.print("ENTER THE NUMBER OF STUDENTS TO ENROLL: ");
        int count = sc.nextInt();
        manager.startEnrollment(count);
    }
}
