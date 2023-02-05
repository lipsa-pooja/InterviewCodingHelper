
public class ReverseANummber {

	public static void main(String[] args) {
		int num=12345678;
		
		int rev=0;
		
		for(int i=1;i<=num;i++)
		{
		int mod=num%10;//8
		rev=rev*10+mod;
		num=num/10;//1234567
		}
		System.out.println("reverse number is:  "+rev);
		
		
	//2nd ways:Using while loop	
		int num1=123456789;
		int rev1=0;
		while(num1 !=0)
		{
			int rem=num1%10;
			rev1=rev1*10+rem;
			num1=num1/10;
		}
		System.out.println("reverse number is:  "+rev1);
	}

}
