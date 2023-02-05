package CollectionPrograms;
import java.util.HashMap;
import java.util.Set;

public class DuplicateWordsINSentence {

	public static void main(String[] args) {
		String str="Hello world i love my india india my love i";
		String[] splitsentence= str.split(" ");
		HashMap<String,Integer> m=new HashMap<String,Integer>();
	for(String word:splitsentence)
	{
		//System.out.println(word);
		if(m.containsKey(word))
		{
			m.put(word, m.get(word)+1);
		}
		else
		{
			m.put(word,1);
		}
	}
	
	
	Set<String> keyset=m.keySet();
	for(String eachkey: keyset)
	{
	if(m.get(eachkey)>1)
	{
		System.out.println("words " + eachkey + "=" + m.get(eachkey));
	}
	}
	

	}

}
