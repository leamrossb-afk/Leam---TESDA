import java.util.Scanner;

public class BoloconTask4 {
    public static void main(String[] args) {
        System.out.println("Please enter a string (word or any sequence of numbers and characters):");
        Scanner input = new Scanner(System.in);
        String userInput = input.nextLine();
        String reversedInput = new StringBuilder(userInput).reverse().toString();
        if (userInput.equalsIgnoreCase(reversedInput)) {
            System.out.println("The input string is a palindrome.");
        } else {
            System.out.println("The input string is not a palindrome.");
        }
    }
}
