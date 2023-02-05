package string_programs;

public class ReverseAStringUsingRecursion_2_1 {

	public static void main(String[] args) {
		
		String str = "ABCD";
		String revStr = recursiveString(str);
		if(str.equals(revStr)) {
			System.out.println("Palindrom");
		}

	}

	public static String recursiveString(String s) {

		if (s == null || s.length() <= 1) {
			return s;
		}

		return recursiveString(s.substring(1)) + s.charAt(0);

	}

}
//output->DCBA

//1 .s= ABCD (s==null or s.length() <=1)XXXX
		//recursive(BCD) + A ->DCBA
			//2. s=BCD (s==null or s.length() <=1)XXXX
				//return recursive(CD) + B -> DCB
					//3.s=CD (s==null or s.length() <=1)XXXX
						//return recursive(D) + C ->DC
							//4. s=D (s==null or s.length() <=1)
								//return s ->D
