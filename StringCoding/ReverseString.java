package StringPrograms;

public class ReverseString {
    public static void main(String[] args) {
       // System.out.println("hiiii");
       /* String str="java";
        reverse(str);
        String str1="java world programming";
        reverseWord(str1);*/
        String str2="java world programming";
        reverseEachWord(str2);
    }
    //reverse a string
    public static void reverse(String input)
    {
        String rev="";
        char[] ch=input.toCharArray();
        for(int i=input.length()-1;i>=0;i--)
        {
          rev=rev+ch[i];

        }
        System.out.println(rev);
    }
    //java world programming
    //output=programming world java
    //reverse the word in a sentense
    public static void reverseWord(String inputword)
    {
        String rev1="";
        String[] splitword=inputword.split(" ");
        //System.out.println(splitword);
        for(int i=splitword.length-1;i>=0;i--)
        {
            rev1=rev1+" "+splitword[i];

        }
        System.out.println(rev1);

    }

    public static void reverseEachWord(String inputword)
    {
        String rev1="";
        String[] splitword=inputword.split(" ");

        for(int i=splitword.length-1;i>=0;i--) {
            char[] ch= splitword[i].toCharArray();
            String rev2="";
            for(int j=ch.length-1;j>=0;j--)
            {
                rev2=rev2+ch[j];
            }
            rev1 = rev1 + " " + rev2;
        }
        System.out.println(rev1.trim());

    }
}
