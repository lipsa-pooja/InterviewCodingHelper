
public class LeapYear {

	public static void main(String[] args) {
		// condition1-it should be divisible by 400
		// condition2- it should be divisible by 4 but not divisible by 100

		int year = 1996;
		/*
		 * if (year % 4 == 0) { if (year % 100 == 0) { if (year % 400 == 0) {
		 * System.out.println(year + " leap year"); } else { System.out.println(year +
		 * " not a leap year"); } } else { System.out.println(year + " a leap year"); }
		 * } else { System.out.println(year + " not a leap year"); }
		 */

		// 2nd way:
		if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0))

		{
			System.out.println(year + " is a leap year");
		} else {
			System.out.println(year + "not a leap year");
		}

	}

}
