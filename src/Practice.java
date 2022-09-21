import java.util.Scanner;
public class Practice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number: ");
        //int number1 = input.nextInt();
        int number1;
        number1 = (input.nextInt());

        System.out.println("Enter second number: ");
        int number2 = (input.nextInt());

        int answer = (number1 + number2);
        System.out.printf("The sum is: %d%n", answer);
    }
}