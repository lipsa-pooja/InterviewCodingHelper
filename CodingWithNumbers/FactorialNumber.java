
public class FactorialNumber {

	public static void main(String[] args) {
		// Factorial Number 5!=5*4*3*2*1=120
		// 4!=24
        //0!=1 always
		int num = 5;
		getFact(num);

	}

	public static void getFact(int num) {

		int fact = 1;
		// for(int i=1;i<=n;i++)
		for (int i = num; i >= 1; i--) {
			fact = fact * i;// 1*5
		}
		System.out.println("factorial number is:" + fact);

	}

}
