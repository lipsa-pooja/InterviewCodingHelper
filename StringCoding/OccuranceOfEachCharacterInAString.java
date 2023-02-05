package StringPrograms;

import java.util.HashMap;

public class OccuranceOfEachCharacterInAString {
    public static void main(String[] args) {


        String input = "lipsa priyadarshini panda";
        char[] chararr = input.toCharArray();
        //for (int i = 0; i<= chararr.length-1;i++)
        HashMap<Character,Integer> hm=new HashMap<Character, Integer>();
        for(char ch:chararr)
        {
            if(hm.containsKey(ch))
            {
                //previous value if key is already present=hm.get(ch)
                //value=hm.get(key)
                //previous value+1= hm.get(key)+1

                hm.put(ch,hm.get(ch)+1);
            }
            else
            {
              hm.put(ch,1);
            }
        }

        System.out.println(hm );
    }
}

