
public class MultiplicationTable {

	public static void main(String[] args) {
		// 2x1=2
		// 2x2=4
		// 2x3=6
		// 2x4=8
		// 2x5=10 so on............
		int num = 5;
		for (int i = 1; i <= 10; i++) {
			System.out.println(num + "x" + i + " =" + (num * i));
		}
	}

}
