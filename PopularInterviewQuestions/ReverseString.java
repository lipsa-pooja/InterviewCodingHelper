package javapractice;

public class ReverseString {
    public static void main(String[] args) {
        reverse("bishnu");
        reverseWord("bishnu prasad panda");
        reverseWordAgn("bishnu prasad panda");

    }
//Type-3
    private static void reverseWordAgn(String input) {
       String rev="";
       String[] words= input.split(" ");
       for(String word:words)
       {
           //System.out.println(word);
           String temp="";
           temp=temp+" "+word;

           for(int i=temp.length()-1;i>=0;i--)
           {
               rev=rev+temp;
           }

       }
        System.out.println(rev);
    }

    //Type-1
    public static void reverse(String input)
    {
        //input:java
        //output:avaj

       String rev="";
       char[] ch=input.toCharArray();
       for(int i=input.length()-1;i>=0;i--)
       {
          // System.out.println(input.length());
           rev=rev+ch[i];

       }
        System.out.println(rev);
    }
    //Type-2
    public  static void reverseWord(String input)
    {
        //input:bishnu Prasad Panda
        //output:unhsib dasarp adnap

      String revword="";
      for (int i=input.length()-1; i >=0;i--)
          {
              revword=revword+input.charAt(i);
          }

              System.out.println(revword);



}}
