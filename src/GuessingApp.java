import java.sql.SQLOutput;
import java.util.Scanner;

public class GuessingApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Guess the number: ");
        int number = input.nextInt();

        int value = 50;
        if (number > value) {
            System.out.printf("Number %d is too high", number);
        } else if (number < value) {
            System.out.printf("Number %d too low", number);
        } else {
            System.out.printf("Number %d is perfect", value);
        }
    }





}