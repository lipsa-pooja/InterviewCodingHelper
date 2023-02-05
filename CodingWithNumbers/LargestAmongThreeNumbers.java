
public class LargestAmongThreeNumbers {

	public static void main(String[] args) {

		// 1st way:Using if condition
		int a = 1005;
		int b = 5655;
		int c = 849;
		/*
		 * if(a>b && a>c)
		 * 
		 * { System.out.println("a is largest"); } else if(b>c) {
		 * System.out.println("b is greatest"); } else {
		 * System.out.println("c is greatest"); }
		 */

		// 2nd Way:Nested-If Condition
		if (a >= b) {
			if (a >= c) {
				System.out.println("a is greatest");
			} else {
				System.out.println("c is greatest");
			}

		} else {
			if (b >= c) {
				System.out.println("b is greatest");
			} else {
				System.out.println("c is greatest");
			}
		}

	}

}
