import java.util.Scanner;

public class BoloconTask5 {
    public static void main(String[] args) {
        System.out.println("Enter three numbers:");
        Scanner x = new Scanner(System.in);
        int a = x.nextInt();
        Scanner y = new Scanner(System.in);
        int b = y.nextInt();
        Scanner z = new Scanner(System.in);
        int c = z.nextInt();
        int largest = (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);

        if (a == b && b == c) {
            System.out.println("All numbers are equal.");
        } else {
            System.out.println("The largest number is: " + largest);
        }
    }
}

