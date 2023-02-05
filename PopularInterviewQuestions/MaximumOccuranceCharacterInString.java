package javapractice;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MaximumOccuranceCharacterInString {
    public static void main(String[] args) {
        MaximumOccuranceCharacterInString("javajaj");
    }
    public  static  void MaximumOccuranceCharacterInString(String input)
    {

        HashMap<Character,Integer> hm=new HashMap<>();
        char[] chars=input.toCharArray();
        for(Character ch:chars)
        {
           if(hm.get(ch)==null)
           {
               hm.put(ch,1);
           }
           else
           {
               hm.put(ch,hm.get(ch)+1);
           }
            //System.out.println("key="+ch+ "  value="+hm.get(ch));
        }
        Set<Map.Entry<Character,Integer>> entryset=hm.entrySet();
        int maxCount = 0;
        char maxChar = 0;
        for(Map.Entry<Character,Integer> entry:entryset)
        {
            if(entry.getValue()>1)
            {
                System.out.println("Print all the duplicate values with their occurances:"+entryset);
            }
            int value=entry.getValue();
            if(value>maxCount)
            {
                maxCount=value;
                //maxCount=entry.getValue();
                maxChar= entry.getKey();

            }
        }
        System.out.println("maximum occurance chracter is: "+maxChar+" and its value is: "+maxCount);



    }



}

