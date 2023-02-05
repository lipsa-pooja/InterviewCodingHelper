
public class CountDigitsINInteger {

	public static void main(String[] args) {
		// 122345-------6
		// 123----------3
		int number = 45656;
		// long num=67674389209828l;
		int count = 0;
		/*
		 * while (number != 0) { number = number / 10;// 4565 456 45 4 0 count++;// 1 2
		 * 3 4 5
		 * 
		 * }
		 */

		for (int i = 0; i <= number; i++) {
			number = number / 10;
			count = count + 1;
		}
		System.out.println("number contains " + count + " digits");

	}

}
