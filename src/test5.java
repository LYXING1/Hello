import java.util.Scanner;
public class test5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Enter name
        System.out.println("Enter name:");
        String name = scanner.nextLine();

        // Validate name
        if (!name.matches("[a-zA-Z]+")) {
            System.out.println("Username is Wrong. Allow input only text.");
            name = "-";
        }

        // Enter age
        System.out.println("Enter age:");
        int age = 1;
        try {
            age = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Age allow input only number.");
        }

        // Enter phone number
        System.out.println("Enter phone number:");
        String phoneNumber = scanner.nextLine();

        // Validate phone number
        if (!phoneNumber.matches("^0[1-9]\\d{7}$")) {
            System.out.println("phone number allow input only number and just start with 0.");

        }

        // Enter email
        System.out.println("Enter email:");
        String email = scanner.nextLine();

        // Validate email
        if (!email.matches("^\\w+@[a-zA-Z_]+\\.[a-zA-Z]+$")) {
            System.out.println("wrong format. Example: koko@gmail.com");
        }

        // Show person information
        System.out.println("\n== SHOW PERSON INFORMATION ===");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Email: " + email);
    }
}
