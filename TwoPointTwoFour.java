package Chapter2;


import java.util.Scanner;

public class TwoPointTwoFour {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first integer: ");
        int num1 = input.nextInt();
        System.out.println("Enter second integer: ");
        int num2 = input.nextInt();
        System.out.println("Enter third number: ");
        int num3 = input.nextInt();
        System.out.println("Enter fourth number: ");
        int num4 = input.nextInt();
        System.out.println("Enter fifth number: ");
        int num5 = input.nextInt();

        int lowest;
        int largest;

        lowest = num1;
        if (num2 < lowest)
            lowest = num2;
        if (num3 < lowest)
            lowest = num3;
        if (num4 < lowest)
            lowest = num4;
        if (num5 < lowest)
            lowest = num5;

        largest = num5;
        if (num4 > largest)
            num4 = largest;
        if (num3 > largest)
            largest = num3;
        if (num2 > largest)
            largest = num2;
        if (num1 > largest)
            num1 = largest;

        System.out.printf("The lowest is: %d", lowest);
        System.out.printf("The largest is: %d", largest);

    }
}
