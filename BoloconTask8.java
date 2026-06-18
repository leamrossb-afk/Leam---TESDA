import java.util.*;

public class BoloconTask8 {
    public static void main(String[] args) {
        BoloconTask8 sum = new BoloconTask8();
        System.out.println("Please enter three numbers:");
        Scanner firstNumber = new Scanner(System.in);
        int x = firstNumber.nextInt();
        Scanner secondNumber = new Scanner(System.in);
        int y = secondNumber.nextInt();
        Scanner thirdNumber = new Scanner(System.in);
        int z = thirdNumber.nextInt();

        System.out.print("Sum of the parameters: " + sum.sumOfAllNumbers(x, y, z));
        }

        int sumOfAllNumbers(int... s){
	        int nums = 0;
	        for (int number : s){
                int cumulativeSum = ((number + 1) * number) / 2;
                System.out.println("Parameter: " + number);
                System.out.println("Cumulative Sum: " + cumulativeSum);
                nums += number;
            }
        return nums;
        }
}