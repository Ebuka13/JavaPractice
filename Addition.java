package Chapter2;

import java.util.Scanner;
public class Addition{
	public static void main(String[] args) {
		Scanner ebuka = new Scanner(System.in);

		System.out.print("Enter First Numnber: ");
		int num1 = ebuka.nextInt();
		System.out.print("Enter Second Numnber: ");
		int num2 = ebuka.nextInt();	
		int sum = num1 + num2;
		
		System.out.printf("The sum is: %d", sum);
		

	}
}