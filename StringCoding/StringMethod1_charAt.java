package string_method;

public class StringMethod1_charAt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//The java string charAt() method returns a char value at the given index number.

		//The index number starts from 0 and goes to n-1, where n is length of the string.
		//It returns StringIndexOutOfBoundsException if given index number 
		//is greater than or equal to this string length or a negative number.
		
		
		String str="java tpoint";
		
			char ch=str.charAt(5);
			System.out.println(ch);
			
			
		 char ch1=str.charAt(15);
		 System.out.println(ch1);
		}
		

	}



