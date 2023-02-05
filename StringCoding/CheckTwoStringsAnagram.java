package StringPrograms;
//Two strings are Anagram if they contain same characters but in different order

import java.util.Arrays;

public class CheckTwoStringsAnagram {
    public static void main(String[] args) {
        String str1 = "java";
        String str2 = "avajt";
        anagram(str1, str2);
    }

        public static void anagram (String input1, String input2)
        {

            char[] ch1 = input1.toCharArray();
            char[] ch2 = input2.toCharArray();
            Arrays.sort(ch1);
            Arrays.sort(ch2);
            if (Arrays.equals(ch1, ch2)) {
                System.out.println("both strings are Anagram");
            } else {
                System.out.println("not Anagram");
            }

        }
    }

