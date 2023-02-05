package loop;

public class StringReverse {

	public static void main(String[] args) {
		String s="LIPSA";
		String temp="";
		char[] c=s.toCharArray();
		//System.out.println(c);
		for(int i=c.length-1;i>=0;i--)
		{
		//System.out.println(c[i]);
		temp=temp+c[i];
		
	
		}
		System.out.println(temp);

	}

}
