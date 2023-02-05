package StringPrograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MaximumOccuranceCharacterInAString
{
    public static void main(String[] args) {


        int max=0;
        char maxchar = 0;
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
        Set<Character> keys = hm.keySet();
        for(Character key: keys)
        {
            //System.out.print(key);
            int value=hm.get(key);
            //System.out.println(value);
            if(value > max)
            {
             max=value;

             maxchar=key;


            }


        }
        System.out.println("maximum repetated character in the string is: "+ maxchar +" and its maximum count is: "+max);

    }

    }

