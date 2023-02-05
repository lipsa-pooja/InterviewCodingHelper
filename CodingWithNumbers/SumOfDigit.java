package JavaBasicPrograms;

import java.util.Scanner;

public class SumOfDigit {
	static int sum;
	public static int findsum(int number) {
		if(number >0) {
			sum = sum + number%10;
			return findsum(number/10);
		}
		return sum;
	}
	
	
	public static void main(String args[]) {
		int number;
		int digit;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first number: ");
		number = sc.nextInt();

		findsum(number);
		
		System.out.println("Sum of Digits: " + sum);
	}
}
