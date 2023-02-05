package StringPrograms;

public class CountNumberOfWordsInString {
    public static void main(String[] args) {
        totcharcount("java world programming language");
        CountNumberOfWords( "java world programming language")  ;
    }

   public static void totcharcount(String input)
   {
       //Total character count in a string
       int totcharcount=input.length();
       System.out.println(totcharcount);
   }
    public static void CountNumberOfWords(String input)
    {
        //Total word count in a string
       String[] splitword=input.split(" ");
       int wordcount=splitword.length;
        System.out.println(wordcount);
    }
}
