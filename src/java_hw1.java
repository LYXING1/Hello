
import java.util.regex.*;
public class java_hw1 {
    public static void main(String[] args) {
        String studentData = "Name: John, Age: 20, Grade: A";

        // Define regex patterns for extracting information
        String namePattern = "Name: (.*?),";
        String agePattern = "Age: (\\d+),";
        String gradePattern = "Grade: (.*?)$";

        // Compile the patterns
        Pattern nameRegex = Pattern.compile(namePattern);
        Pattern ageRegex = Pattern.compile(agePattern);
        Pattern gradeRegex = Pattern.compile(gradePattern);

        // Match the patterns against the student data
        Matcher nameMatcher = nameRegex.matcher(studentData);
        Matcher ageMatcher = ageRegex.matcher(studentData);
        Matcher gradeMatcher = gradeRegex.matcher(studentData);

        // Extract information if matches are found
        String name = nameMatcher.find() ? nameMatcher.group(1) : "Unknown";
        int age = ageMatcher.find() ? Integer.parseInt(ageMatcher.group(1)) : 0;
        String grade = gradeMatcher.find() ? gradeMatcher.group(1) : "Unknown";

        // Use ternary operator to check age condition
        String ageStatus = age >= 18 ? "Adult" : "Minor";

        // Print the extracted information and age status
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
        System.out.println("Age Status: " + ageStatus);
    }
}
