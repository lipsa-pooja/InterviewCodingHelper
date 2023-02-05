package string_programs;

public class ReverseAStringUsingRecursion_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "ABCD";
		System.out.println(recursiveString(str));

	}

	public static String recursiveString(String s) {
		System.out.println("Required String="+ s);//ABCD  //BCD
		if (s == null || s.length() <= 1) {
			System.out.println("*********");
			//This one will return to line 22 which was previously called
			return s;

		}
		System.out.println("Required Substring="+ s.substring(1));//BCD  //CD
		System.out.println("Last Char="+ s.charAt(0));//A //B
		System.out.println("\n");
		//once all calling is completed, final return will go to line  no. 8

		return recursiveString(s.substring(1)) + s.charAt(0);//BCD+A   //CD+B+A
		//after return statement, no statements will execute.
		
		
		//string str="ABCD" here index are from 0 to 3
		//str.substring(0)=ABCD
		//str.substring(1)=BCD - sub-string based on index.
		//str.substring(2)=CD
		//str.substring(3)=D

	}
}
