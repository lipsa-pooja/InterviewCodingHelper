package practice;

import java.util.HashMap;
import java.util.Set;

public class PrintCharactersInAString {

	public static void main(String[] args) {
		
		//print each character in a string
		
		String str="lipsa priyadarshini panda";
		char[] chars=str.toCharArray();
		System.out.println(chars);
		HashMap<Character,Integer> h=new HashMap<Character,Integer>();
		//store the value to hashmap from chara[]
		for(Character ch:chars)
		{
			if(h.containsKey(ch))
			{
				h.put(ch, h.get(ch)+1);
			}
			else
			{
				h.put(ch, 1);
			}
		}
		System.out.println(h);//{p=3,  =2, a=5, r=2, s=2, d=2, h=1, i=4, y=1, l=1, n=2}

		
		//print the occurances of specified character
		System.out.println(h.get('p'));
		//find duplicate/Repetated character from a string
		//loop through only keys 
		Set<Character> keys=h.keySet();
		for(Character chars1:keys)
		{
			if(h.get(chars1)>1)
			{
				System.out.print(chars1);
				System.out.println("character "+chars1+"repeting "+h.get(chars1)+" times");
			}
			
			
			//find Unique/non-repetated character from a string
			else
			{
				System.out.println("character "+chars1+"repeting "+h.get(chars1)+" times");
			}
		}

	}

}
