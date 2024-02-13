import  java.util.regex.*;
import  java.util.Scanner;
public class test3 {
    public static void main(String[] args) {
        // Prompt the user for input
        System.out.println("Enter student information:");
        Scanner scanner = new Scanner(System.in);
        // Validate name
        System.out.print("Name: ");
        String nameInput = scanner.nextLine();
        if (!nameInput.matches("[a-zA-Z]+")) {
            System.out.println("Invalid name format. Use only letters.");
            return;
        }

        // Validate age
        System.out.print("Age: ");
        String ageInput = scanner.nextLine();
        if (!ageInput.matches("\\d+")) {
            System.out.println("Invalid age format. Use only digits.");
            return;
        }

        System.out.print("Age: ");
        String phonenumberInput = scanner.nextLine();
        if (!ageInput.matches("\\d+")) {
            System.out.println("Invalid age format. Use only digits.");
            return;
        }

        System.out.print("Email: ");
        String emailInput = scanner.nextLine();
        if (!nameInput.matches("[a-zA-Z]+")) {
            System.out.println("Invalid Email format. Use only letters.");
            return;
        }

        // If all fields are valid, display the student information
        System.out.println("\nStudent Information:");
        System.out.println("Name: " + nameInput);
        System.out.println("Age: " + ageInput);
        System.out.println("Phonenumber: " + phonenumberInput);
        System.out.println("Email: " + emailInput);
    }
}
