package tdd;

public class Calculator {
    public int  addTwoNumbers(int num1, int num2) {
        return num1 + num2;
    }

    public int subtract(int num1, int num2) {
        return num1 - num2;
    }

    public double squareRoot(double num1) {
        return Math.sqrt(num1);
    }

    public int collectUserInput(int input1, int input2, int input3) {
        if (input1 <= 0 || input2 <= 0 || input3 <= 0) {
            System.out.println("number not allowed");
        }
        return input1 + input2 + input3;
    }
}
