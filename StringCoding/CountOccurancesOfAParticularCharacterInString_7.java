package string_programs;

import java.util.HashMap;

public class CountOccurancesOfAParticularCharacterInString_7 {
	
	//Get the number of 'a' used in the String

	public static void main(String[] args) {
		String str="PoojaandPari";
		
		HashMap<Character, Integer> m = new HashMap<Character, Integer>();
		
		char[] ch = str.toCharArray();
		
		
		for(int i=0;i <= ch.length-1;i++) {
			if(m.containsKey(ch[i]))
			{
				m.put(ch[i], m.get(ch[i]) + 1);
			}else {
				m.put(ch[i], 1);
			}
		}
		System.out.println("HashMap is :" + m);
		
		System.out.println("Required character 'a' occurance in the String is: " + m.get('a'));
		//m.put()----add value in hashmap
		//m.get()----fetch  the value from hashmap
	}

}
