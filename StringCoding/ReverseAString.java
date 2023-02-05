package StringPrograms;

public class ReverseAString {

    public static void main(String[] args) {
        String input="Bishnu Prasad";
        String rev="";
        char[] chars=input.toCharArray();
        System.out.println(chars.length);
        for(int i=chars.length-1;i>=0;i--)
        {
            //System.out.print(chars[i]);
             rev=rev+chars[i];

        }
        System.out.println("Reverse of this String: "+input+" is:  "+rev);
    }
}
