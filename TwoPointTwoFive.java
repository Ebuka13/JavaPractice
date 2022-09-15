package Chapter2;

import java.util.Scanner;

public class TwoPointTwoFive {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter integer: ");
        int num = input.nextInt();
        int division = num / 3;
        int remainder = division % num;


        if (num == division) {
            System.out.printf("%d is divisible by 3", division);
        }
        if (remainder == (double) division) {
            System.out.printf("%d is not divisible by 3%n", remainder);
        }
        System.out.printf("The answer is: %d%n", division);
    }
}
