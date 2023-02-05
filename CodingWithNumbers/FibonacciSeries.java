
public class FibonacciSeries {

	public static void main(String[] args) {
		
//Fibonacci series: 0 1 1 2 3 5 8 13 21 34  55 89   144 so on.....
		
		int count=10;
		int t1=0;
		int t2=1;
		for(int i=1;i<=count;i++)
		{
			System.out.println(t1);
			
			int sum=t1+t2;//0+1=1
			t1=t2;//t2 value will be given to t1
			t2=sum;//sum value will be given to t2
			
		}
	}

}
