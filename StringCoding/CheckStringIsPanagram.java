package StringPrograms;

import java.util.Locale;

//The string which contains all the alphabet cahracter(26 letters),is called that string as panagram
public class CheckStringIsPanagram {
    public static void main(String[] args) {
        String str="The quick brown fox jumps over the lazy dog";
        System.out.println(str.toLowerCase());
        panagram(str);

    }
    public static void panagram(String input)
    {

        if(input.length()<26)
        {
            System.out.println("not panagram");
        }else
        {
         for (char ch='a';ch<='z';ch++)
         {
             //The indexOf() method returns the position of the first occurrence of specified character(s) in a string
             if(input.indexOf(ch)<0)
             {
                 System.out.println("not panagram");
             }
         }
        }
        System.out.println("string is Anagram");
    }
}
