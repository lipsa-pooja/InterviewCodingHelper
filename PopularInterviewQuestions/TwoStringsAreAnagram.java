package javapractice;


import java.util.Arrays;

//Anagram:two string contains same character but in different order
//input:java
//output:aavj
public class TwoStringsAreAnagram {
    public static void main(String[] args) {
        System.out.println("Both string are Anagram: "+anagaram("java","aavj"));


    }
    public static boolean anagaram(String input1,String input2)
    {
        char[] firststring=input1.toCharArray();
        char[] secondstring=input2.toCharArray();
        Arrays.sort(firststring);
        Arrays.sort(secondstring);
        return Arrays.equals(firststring,secondstring);



    }
}
