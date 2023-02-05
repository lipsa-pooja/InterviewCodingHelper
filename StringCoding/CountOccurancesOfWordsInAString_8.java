package string_programs;

import java.util.HashMap;
import java.util.Map.Entry;

public class CountOccurancesOfWordsInAString_8 {
	
	//Count the the ocuurances of each words in the String.

	public static void main(String[] args) {
			String str="Pooja Panda and Pari Panda are good girl";
			
			HashMap<String, Integer> m = new HashMap<String, Integer>();
			
			String[] words = str.split(" ");
			
			
			for(int i=0;i <= words.length-1;i++) {
				if(m.containsKey(words[i]))
				{
					m.put(words[i], m.get(words[i]) + 1);
				}else {
					m.put(words[i], 1);
				}
			}
			System.out.println("HashMap is :" + m);
			
			for(Entry<String, Integer> ent : m.entrySet()) {
				System.out.println(ent.getKey() + " -- occuring : " + ent.getValue() +" times in the String.");
			}
			
			
		}
}

//Question: [1,5,2,8,1,5,9,2] - o/p [1,5,2,8,9]
