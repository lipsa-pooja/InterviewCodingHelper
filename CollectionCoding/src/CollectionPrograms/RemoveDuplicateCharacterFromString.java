package CollectionPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicateCharacterFromString {

	public static void main(String[] args) {
		//Lipsapriyadarshinipanda ->LipsaPrydhn
		//{'a','b','c'}------>char array
		//{1,5,7,1,4,7,4}----->integer array
		//convert charArray to set to get unique char
		String str="Lipsapriyadarshinipanda";
		char[] chars=str.toCharArray();
		Set<Character> setChar = new LinkedHashSet<>();
		for(Character ch:chars)
		{
			//System.out.println(ch);
			setChar.add(ch);
		}
		System.out.println(setChar);
		
		//convert set to string
		String uniqueString = "";
		for(Character c: setChar) {
			uniqueString=uniqueString+c;
		}
		
		System.out.println(uniqueString);

	}

}
