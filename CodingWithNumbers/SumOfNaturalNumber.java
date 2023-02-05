
public class SumOfNaturalNumber {

	public static void main(String[] args) {
		//1st way:Using for loop
		int n = 5;
		int sum = 0;
		// 1+2+3+4+5=15
		for (int i = 1; i <= n; i++) {
			sum = sum + i;
		}
		System.out.println("sum of 'n' natural number is:" + sum);
		
		
//2nd way: Using while loop
		int k = 1;
		int sum1 = 0;
		while (k <= n) {
			sum1 = sum1 + k;
			k++;
		}
		System.out.println(sum1);
	}

}
