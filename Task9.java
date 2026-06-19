import static java.lang.Math.*;
import java.util.Scanner;

public class Task9 {

    public static int add(int a, int b) {
        return Math.addExact(a, b);
    }

    public static int subtract(int a, int b) {
        return Math.subtractExact(a, b);
    }
    
    public static int multiply(int a, int b) {
       return Math.multiplyExact(a, b);
    }
    
    public static float divide(int a, int b) {
        return Math.floorDiv(a, b);
    }

    public static void main(String[] args) {
        System.out.println("Please enter two numbers:");
        Scanner firstNumber = new Scanner(System.in);
        int x = firstNumber.nextInt();
        Scanner secondNumber = new Scanner(System.in);
        int y = secondNumber.nextInt();

        System.out.println("Sum of the two numbers: " + add(x, y));
        System.out.println("Difference of the two numbers: " + subtract(x, y));
        System.out.println("Product of the two numbers: " + multiply(x, y));
        System.out.println("Quotient of the two numbers: " + divide(x, y));
    }
}
