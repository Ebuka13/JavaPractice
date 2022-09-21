import java.util.Scanner;

public class Addition {
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Enter first number: ");
    int digit1 = input.nextInt();

    System.out.println("Enter second number: ");
    int digit2 = input.nextInt();

    System.out.println("Enter third number: ");
    int digit3 = input.nextInt();

    int answer = digit1 + digit2 - digit3;
    System.out.printf("The answer is: %d%n", answer);
    }
}
