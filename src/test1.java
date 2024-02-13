import java.util.regex.*;
public class test1 {
    public static void main(String[] args) {
        // Student data in the format "Name: John, Age: 20, Grade: A"
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

        // Use regular expressions to check conditions
        boolean hasName = !name.equals("Unknown");
        boolean validAge = age >= 0 && age <= 120; // Assume a reasonable age range
        boolean validGrade = grade.matches("[A-F]");

        // Display student information based on conditions
        if (hasName && validAge && validGrade) {
            System.out.println("Student Information:");
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Grade: " + grade);
        } else {
            System.out.println("Invalid student data format or conditions not met.");
        }
    }
}

