package JavaBasicPrograms;

public class FactorialNumberWithoutRecursion {
//5!=5*4*3*2*1=120

	public static void main(String[] args) {
		int fact = 1;
		int n = 5;
		for (int i = n; i >= 1; i--) {
			fact = fact * n;// 5 //5*4 //5*4*3
			n = n - 1;// 4 //3
		}

		System.out.println(fact);
	}

}
