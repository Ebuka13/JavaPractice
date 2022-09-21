import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner digit = new Scanner(System.in);
        System.out.println("Enter number: ");

        long number = digit.nextLong();
        long product = 1;
        long count = 1;

        while (count <= number) {
            product *= number;
            ++count;
        }

        System.out.printf("%n%d%s%s%d", number, "!", "=", product);
    }

}