package string_programs;

import java.util.Arrays;

public class CheckIfTwoStringsAreAnagramsOfEachother_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//two strings are called as anagram if they  contains the same set of characters but in different order.
		//Eg: arc=car,  elbow=below,   state=taste;    debit card=bad credit,
		
		//1.take two strings as input
		//2.convert two strings to character array
		//3.sort two character arrays using array.sort() method
		//4.compare two character arrays, if they are equal they are anagrams otherwise they are not
		
		String str1="abc";
		String str2="cba";
		System.out.println("Both the strings are anagram: "+ anagramcheck(str1, str2));
		

	}



public static boolean anagramcheck(String str1,String str2)
{
	char[] chararrayfromstring1=str1.toCharArray();
	char[] chararrayfromstring2=str2.toCharArray();
	Arrays.sort(chararrayfromstring1);
	System.out.println(Arrays.sort(chararrayfromstring1));
	Arrays.sort(chararrayfromstring2);
	return Arrays.equals(chararrayfromstring1, chararrayfromstring2);
}

}

