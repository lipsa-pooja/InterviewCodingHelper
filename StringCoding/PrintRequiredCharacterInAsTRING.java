package practice;

import java.util.HashMap;
import java.util.Set;

public class PrintRequiredCharacterInAsTRING {
	public static void main(String[] args) {
		String str="bishnuprasadpanda";
		char[] chars=str.toCharArray();
		
		
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
		System.out.println(m.get('s'));
		
		Set<Character> keys=m.keySet();
		for(Character ch:keys)
		{
			if(m.get(ch)>1)
			{
				System.out.println("duplicate "+ch+ " values"+m.get(ch));
			}
		}
		
	}

}
