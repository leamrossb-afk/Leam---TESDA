import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        System.out.println("Enter three numbers:");
        Scanner x = new Scanner(System.in);
        int a = x.nextInt();
        Scanner y = new Scanner(System.in);
        int b = y.nextInt();
        Scanner z = new Scanner(System.in);
        int c = z.nextInt();

        if (a > b) {
            if (a > c) {
                System.out.println(a);
            }
            else if (c > b) {
                System.out.println(c);
            }
            else {
            System.out.println(b);
            }
        }
       // if (a > b) ? (a > c ? System.out.println(a) : (c > b) ? System.out.println(c); System.out.println(b);;) 


    }
}