package string_programs;

public class CheckReverseStringIsPallindromeOrNot_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="madam";
		//pallindrome in string example: "madam","dad","mom","radar","malayalam"
		String revstr="";
		for(int i=str.length()-1;i>=0;i--)
		{
			//System.out.print(str.charAt(i));
			revstr=revstr+str.charAt(i);
		}
		if(str.equalsIgnoreCase(revstr))
		{
			System.out.println("string is pallindrome");
		}
		else
		{
			System.out.println("string is not pallindrome");
		}

	}

}
