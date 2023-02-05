package CollectionPrograms;
import java.util.HashMap;
import java.util.Set;

public class DuplicateCharactersCountInString {

	public static void main(String[] args) {
		String str="Lipsapriyadarshinipanda";
		
		//convert string into characterArray
		char[] chars=str.toCharArray();// l i p s a  p r i y a d a r s h i n i  p a n d a
		HashMap<Character, Integer> m=new HashMap<Character,Integer>();
		//here characters are inserted as key
		//and respective count/occurances are inserted as value
		//if map contains the character increase its value by 1.
		//get the  value=m.get(ch)
		//(l,1),(i,4),(p,3).............
		
		//for(int i=0;i<chars.length-1;i++)
	
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
		
		System.out.println();
		
		
		
		//Print only the duplicate 
		//use set to get keys unique(keys shouldnot be duplicates)
		/*Set<Character> keys=m.keySet();
		for(Character ch:keys)
		{
			//value=m.get(ch)
			if(m.get(ch)>1)
			{
				System.out.println("character "+ ch + " repeting  "+ m.get(ch) +" times");
			}
			else
			{
				System.out.println("character "+ ch + " repeting  1 times");
			}
		}
		*/
		
		Set<Character> keys=m.keySet();
		for(Character ch:keys)
		{
			
			System.out.print(ch);

		}

	}}
