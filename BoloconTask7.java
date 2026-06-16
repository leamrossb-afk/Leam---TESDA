import java.util.Scanner;

public class BoloconTask7 {
    public static void main(String[] args) {
        System.out.println("Please enter two numbers:");
        Scanner firstNumber = new Scanner(System.in);
        int x = firstNumber.nextInt();
        Scanner secondNumber = new Scanner(System.in);
        int y = secondNumber.nextInt();
        System.out.println("Sum of the two numbers: " + addition(x, y));
        System.out.println("Difference of the two numbers: " + subtraction(x, y));
        System.out.println("Product of the two numbers: " + multiplication(x, y));
        System.out.println("Quotient of the two numbers: " + division(x, y));
    }

    static int addition(int a, int b){
        int sum = a + b;
        return sum;
    }

    static int subtraction(int a, int b){
        int difference = a - b;
        return difference;
    }

    static int multiplication(int a, int b){
        int product = a * b;
        return product;
    }

    static int division(int a, int b){
        int quotient = a / b;
        return quotient;
    }
}