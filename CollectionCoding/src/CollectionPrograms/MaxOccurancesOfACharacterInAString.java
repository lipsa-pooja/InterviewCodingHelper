package CollectionPrograms;

import java.util.HashMap;
import java.util.Set;

public class MaxOccurancesOfACharacterInAString {

	public static void main(String[] args) {
		int maxValue=0;
		char maxKey = 0;
		char minKey = 0;
		int minValue = 0;
		String str="a";
		char[]  chars=str.toCharArray();
		
		HashMap<Character,Integer> m=new HashMap<Character,Integer>();
		for(Character ch:chars)
		{
			if(m.containsKey(ch))
			{
				m.put(ch, m.get(ch)+1);
			}
			else
			{
				m.put(ch, 1);
			}

	}
		System.out.println(m);
		
		//abcdbaac
		Set<Character> s=m.keySet();
		int i=0;
		for(Character keys:s)
		{
			if(m.get(keys)>maxValue)
			{
				maxValue = m.get(keys);
				maxKey = keys;
			}
			
			
			//this only to find minimum occurance of char
			
			  if(i==0) 
			  { 
				  minValue = m.get(keys); 
				  minKey = keys;
				  i=i+1; 
			 }
			 
			if(m.get(keys)<minValue)
			{
				minValue = m.get(keys);
				minKey = keys;
			}
		}
		System.out.println("Max character "+ maxKey);
		System.out.println("Value "+ m.get(maxKey));
		
		System.out.println("Min character "+ minKey);
		System.out.println("Value "+ m.get(minKey));

		}
}
