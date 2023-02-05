package javapractice;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class PrintDuplicateCharacterFromAString {
    public static void main(String[] args) {
        PrintDuplicateCharacter("javajavajava");

    }
    public static <set> void PrintDuplicateCharacter(String input)
    {
        HashMap<Character,Integer> hm=new HashMap<>();
        char[] chars= input.toCharArray();//{'j','a,'v','a'.....}
        for (char ch:chars)
        {
           if(hm.get(ch)==null )
           {
               hm.put(ch,1);
           }
           else
           {
               hm.put(ch,hm.get(ch)+1);
           }
        }

        Set<Map.Entry<Character,Integer>> entryset=hm.entrySet();
      for(Map.Entry<Character,Integer> entry:entryset )
        {
       if(entry.getValue()>1)
        {
            System.out.println("Duplicate  characters are:"+entry.getKey());
        }
        }
    }
}
