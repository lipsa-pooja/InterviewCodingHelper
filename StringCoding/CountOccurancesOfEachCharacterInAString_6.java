package string_programs;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class CountOccurancesOfEachCharacterInAString_6 {

	public static void main(String[] args) {
		String str="java j2ee";
		//o/p: j=2,a=2,v=1,2=1,e=2
		
		//HashMap stores value in Key-Value pair
		//In below case our key is character and value is integer
		HashMap<Character, Integer> m = new HashMap<Character, Integer>();
		
		//['j','a','v','a',' ','j','2','e','e']
		char[] ch = str.toCharArray();
		
		/*
		 * for(char c: ch) 
		 * { System.out.println(c); }
		 */
		

		//Traverse all the character present in the array
		for(int i=0;i <= ch.length-1;i++) {
			System.out.println(ch[i]);
			//if the hashmap contains the key, then increase the value by 1 
			if(m.containsKey(ch[i])) //containskey() returns boolean
			{
				System.out.println("Before Value:" + m.get(ch[i]));
				m.put(ch[i], m.get(ch[i]) + 1);
				//put("lipsa",28)
				//get("lipsa")---return value 28
				System.out.println("After Value:" + m.get(ch[i]));
			}else {
				//If the Hashmap doesn't contains the key then insert the key with value as 1.
				m.put(ch[i], 1);
			}
		}
		System.out.println(m);//{ =1, a=2, 2=1, e=2, v=1, j=2}
		//entrySet() method will return a Set of Keys present in the HashMap.
		//In HashMap Keys are always Unique, but value can be duplicate
		//m.entrySet() - will return Set of keys present in the hashMap
		
		//To Traverse a Hashmap we can use Entry class. The Entry class should be of same key value pair as ur HashMap
		//Entry = pair of key and Value
		
		
		
		/*
		 * for(Map.Entry ent: m.entrySet()) 
		 * {
		 * System.out.println("Character:"+ent.getKey() + " " + "Occurances: "+ent.getValue());
		 * 
		 * }
		 */
		
		for (Entry<Character, Integer> entry : m.entrySet()) 
		{
            System.out.println("Character:"+entry.getKey() + " " + "Occurances: "+entry.getValue());
        }
		
	}

}
