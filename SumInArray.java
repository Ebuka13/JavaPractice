package Chapter7;

public class SumInArray {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        numbers[0] = 3;
        numbers[2] = 5;
        numbers[4] = 6;
        numbers[1] = 7;
        numbers[3] = 9;
        int sum = 0;

        for (int count = 0; count  < numbers.length; count++) {
            // sum += numbers[count];
            sum = sum + numbers[count];
        }
        System.out.printf("The sum is: %d%n", sum);
    }
}
