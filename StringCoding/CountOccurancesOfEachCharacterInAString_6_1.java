package string_programs;

import java.util.HashMap;
import java.util.Map.Entry;

public class CountOccurancesOfEachCharacterInAString_6_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="java j2ee";
		
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
		System.out.println(m);
		for (Entry<Character, Integer> entry : m.entrySet()) 
		{
            System.out.println("Character:"+entry.getKey() + " " + "Occurances: "+entry.getValue());
        }
		

	}

}
