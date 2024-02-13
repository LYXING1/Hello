import java.util.Scanner;

public class test4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input student name
        System.out.print("Enter student name: ");
        String name = scanner.nextLine();

        // Input student age
        System.out.print("Enter student age: ");
        String ageInput = scanner.nextLine();

        // Validate age using regular expression
        int age = ageInput.matches("\\d+") ? Integer.parseInt(ageInput) : -1;
        if (age < 0) {
            System.out.println("Invalid age input. Please enter a valid numeric age.");
            return;
        }

        // Input student phone number
        System.out.print("Enter student phone number (10 digits): ");
        String phoneNumber = scanner.nextLine();

        // Validate phone number using regular expression
        phoneNumber = phoneNumber.matches("^0[0-9]{8,9}+$") ? phoneNumber : "Invalid phone number";

        // Input student Gmail
        System.out.print("Enter student Gmail: ");
        String gmail = scanner.nextLine();

        // Validate Gmail using regular expression
        gmail = gmail.matches("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}") ? gmail : "Invalid Gmail address";

        // Display student information
        System.out.println("\nStudent Information:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Gmail: " + gmail);

        scanner.close();
    }
}

