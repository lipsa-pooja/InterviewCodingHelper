package StringPrograms;

import java.util.HashMap;

public class FindFirstRepetedAndNonRepetedCharacterInString {
    public static void main(String[] args) {
        find( "javaworldprogramminglanguage");

    }
    public  static  void find(String input)
    {
        char[] ch=input.toCharArray();
        // System.out.println(ch);
        HashMap<Character,Integer> hm=new HashMap<>();
        for(char eachchar:ch)
        {
            if(hm.get(eachchar)==null)
            {
                hm.put(eachchar,1);
            }
            else
            {
                hm.put(eachchar,hm.get(eachchar)+1);
            }
            System.out.println("key: "+eachchar+ " :value: "+hm.get(eachchar));
        }


        //first non-repeted character in string
        for(char eachchar:ch)
        {
         if(hm.get(eachchar)==1)
         {
             System.out.println("non-repeated character is:"+eachchar);
             break;
         }
        }

        //first repeted character in string
        for(char eachchar:ch)
        {
            if(hm.get(eachchar)>1)
            {
                System.out.println("repeated character is:"+eachchar);
                break;
            }
        }
    }
}
