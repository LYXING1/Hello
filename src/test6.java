import java.util.Scanner;
import java.util.regex.Pattern;

public class test6 {
    public static void main(String[] args) {
        System.out.println("=============== Person Information ===============".toUpperCase());
//        Name
        System.out.print("=> Enter name :");
        Scanner scannerName = new Scanner(System.in);
        String name = scannerName.nextLine();
        String resultName = Pattern.matches(".*\\D.*\\D", name)
                ? ""
                : "Username is Wrong. Allow input only text.";
        System.out.println(resultName);
//        Age
        System.out.print("=> Enter age :");
        Scanner scannerAge = new Scanner(System.in);
        String age = scannerAge.nextLine();
        String resultAge = Pattern.matches("\\d{2}", age)
                ? "" : "Age allow input only number.";
        System.out.println(resultAge);
//      Phone Number
        System.out.print("=> Enter phone number :");
        Scanner scannerPhone = new Scanner(System.in);
        String phoneNum = scannerPhone.nextLine();
        String resultPhone = Pattern.matches("^0\\d{8,10}",phoneNum)
                ? "" : "phone number allow input only number and just start with 0.";
        System.out.println(resultPhone);
//        Email
        System.out.print("=> Enter Email :");
        Scanner scannerEmail = new Scanner(System.in);
        String  email = scannerEmail.nextLine();
        String resultEmail = Pattern.matches(".\\w+@\\w+.\\w+",email)
                ?"" : "wrong format.Example:koko@gmail.com";
        System.out.println(resultEmail);


        System.out.println("=============== Person Information ===============".toUpperCase());
        String nameOutput = resultName.isEmpty()?  name : "-";
        String phoneOutput = resultPhone.isEmpty()?  phoneNum : "-";
        String emailOutput = resultEmail.isEmpty()?  email : "-";
        String ageOutput = resultAge.isEmpty() ? age : "-";

        System.out.println("Name : " + nameOutput);
        System.out.println("Age : " + ageOutput);
        System.out.println("Phone Number : " + phoneOutput);
        System.out.println("Email : " + emailOutput);
    }
}
