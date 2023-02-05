package string_programs;

public class ReverseAString_1 {

	public static void main(String[] args) {
		//string toCharArray() method converts this string into character array. 
		// input="hello"
		//output="olleh"

		String str="hello";
		System.out.println(str.length());
		
		
		//Approach-1:
		char[] ch=str.toCharArray();//{'h','e','l','l','o'}
		for(int i=ch.length-1;i>=0;i--)
			
		{
			
			System.out.print(ch[i]);
		}
		
		
		//Approach-2:
		//string charAt() method returns a char value at the given index number.
		System.out.println("");
		for(int i=str.length()-1;i>=0;i--)
		{
			System.out.print(str.charAt(i));
		}
		
		//Approach-3:
		System.out.println("");
		StringBuffer sb=new StringBuffer(str);
		System.out.print(sb.reverse());
		
		//Approach-4:
		System.out.println("");
		StringBuilder sbuilder=new StringBuilder(str);
		System.out.println(sbuilder.reverse());
				

	}

}


