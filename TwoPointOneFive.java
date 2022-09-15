package Chapter2;

import java.util.Scanner;

public class TwoPointOneFive {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first integer: ");
        int number = input.nextInt();

        System.out.println("Enter second integer: ");
        int number2 = input.nextInt();

        int square = number * 2 + number2 * 2;
        System.out.printf("The answer is: %d%n ", square);
    }
}
