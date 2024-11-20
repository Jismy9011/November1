package oops;
import java.util.Scanner;

public class StringEnds {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        boolean endsWithLanguage = inputString.endsWith("language");

        if (endsWithLanguage) {
            System.out.println("The string ends with 'language'.");
        } else {
            System.out.println("The string does not end with 'language'.");
        }
    }
}




