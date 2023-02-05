package CollectionPrograms;

import java.util.HashMap;

public class PrintParticularCharacterOccurance {

	public static void main(String[] args) {

      String str="lipsapriyadarshinipanda";
      
      getOccurance(str,'p');
      
	}
	
	public static void getOccurance(String str, Character reqch) {
		
		char[] charr=str.toCharArray();
	      HashMap<Character,Integer> hm=new HashMap<Character,Integer>();
	      for(Character ch:charr)
	      {
	    	  if(hm.containsKey(ch))
	    	  {
	    		  hm.put(ch, hm.get(ch)+1);
	    		  
	    	  }
	    	  else
	    	  {
	    		  hm.put(ch, 1);
	    	  }
	      }
	      System.out.println(hm);
	     System.out.println("ocurance of character"+ reqch + " is"+ hm.get(reqch));
	     //value=hm.get('p')
		
	}

}
