
import java.util.Scanner;

public class MultiplyFloatingPointNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter floating point number f1: ");
		float f1 = sc.nextFloat();

		System.out.println("enter floating point number f2: ");
		float f2 = sc.nextFloat();

		float multiply = f1 * f2;
		System.out.println("multiply of Two Floating-Point Number is: " + multiply);

	}

}
