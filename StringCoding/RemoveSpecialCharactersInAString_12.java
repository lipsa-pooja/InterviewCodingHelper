package string_programs;

public class RemoveSpecialCharactersInAString_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String str="@$^%&^&*&**&  javafadhdjfkfln  #$%#^&#&***";
		//Remove special characters or remove junk in a string
		//Approach-1 method: replaceall() method
		
		String str1=str.replaceAll("[a-zA-Z0-9]", "");
		System.out.println(str1);
		
		str=str.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(str);
		
		String str2=str.replaceAll("[a-zA-Z0-9]", "");
		System.out.println(str2);//already remove special characters
		
		
		
		
		

	}

}
