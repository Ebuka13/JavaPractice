package Chapter2;

import java.util.Scanner;

public class TwoPointOneSix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first integer: ");
        int digit1;
        digit1 = input.nextInt();
        //       OR
        int digit2 = 100;

        if (digit1 > digit2) {
            System.out.printf("%d > %d%n", digit1, digit2);
        }

        if (digit1 == digit2) {
            System.out.printf("%d == %d%n", digit1, digit2);
        }

        if (digit1 != digit2) {
            System.out.printf("%d != %d%n", digit1, digit2);
        }

        if (digit1 < digit2) {
            System.out.printf("%d < %d%n", digit1, digit2);
        }

    }
}