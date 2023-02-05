import java.util.Scanner;

public class AddTwoNumbers {

	public static void main(String[] args) {
		/*
		 * int a=10; int b=20; int sum=a+b; System.out.println(sum);
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("enter number a: ");
		int a = sc.nextInt();
		System.out.println("enter number b: ");
		int b = sc.nextInt();
		int sum = a + b;
		System.out.println("sum of a & b is: " + sum);

	}

}
