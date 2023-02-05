
public class SwapTwoNumbers {

	public static void main(String[] args) {
		// Using third variable
		int a = 10;
		int b = 20;
		System.out.println("Before swapping:");
		System.out.println("a is: " + a);
		System.out.println("b is: " + b);
		int temp = a;
		a = b;
		b = temp;

		System.out.println("After swapping:");
		System.out.println("a is: " + a);
		System.out.println("b is: " + b);

//without using third variable
		int a1 = 10;
		int b1 = 20;
		System.out.println("================================");
		System.out.println("Before swapping:");
		System.out.println("a1 is: " + a1);
		System.out.println("b1 is: " + b1);
		a1 = a1 - b1;// -10
		b1 = a1 + b1;// 10
		a1 = b1 - a1;// 20

		System.out.println("After swapping:");
		System.out.println("a1 is: " + a1);
		System.out.println("b1 is: " + b1);
	}

}
