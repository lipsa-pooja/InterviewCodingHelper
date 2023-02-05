package JavaBasicPrograms;

public class FibonnaciSeriesWithRecursion {

	
	
	public static void printFiboNumber(int count, int num1, int num2) {
		if(count > 0) {
			int num3 = num1 + num2;
			System.out.print(" " + num3);
			num1 = num2;
			num2 = num3;
			count = count-1;
			printFiboNumber(count, num1, num2);
		}
	}
	
	
	public static void main(String[] args) {
		int a = 0;
		int b = 1;
		int count = 10;
		System.out.print(a + " " + b);
		printFiboNumber(count-2, a, b);
		
	}

}

//recursive method means call the same method until condition statisfied

//by using loop (for, while)

