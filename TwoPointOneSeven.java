package Chapter2;

import java.util.Scanner;

public class TwoPointOneSeven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int digit1 = input.nextInt();

        System.out.println("Enter second number: ");
        int digit2 = input.nextInt();

        System.out.println("Enter third number: ");
        int digit3 = input.nextInt();

        int largest;
        int smallest;

        int sum = digit1 + digit2 + digit3;
        System.out.printf("Sum is: %d%n", sum);

        int average = sum / 3;
        System.out.printf("Average is: %d%n", average);

        int product = digit1 * digit2 * digit3;
        System.out.printf("product is: %d%n", product);

        smallest = sum;
        if (average < smallest)
            smallest = average;

        if (product < smallest)
            smallest = product;

        largest = product;
         if (average > largest)
             largest = average;

         if (sum > largest)
             largest = sum;

        System.out.printf("Smallest is: %d%n", smallest);
        System.out.printf("Largest is: %d%n", largest);

    }
}
