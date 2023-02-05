package StringPrograms;

public class PallindromeOfAString {

    public static void main(String[] args) {

        System.out.println(pallindromeofstring("lipsa panda"));
        System.out.println(pallindromeofstring("MADAM"));
    }

    public static boolean pallindromeofstring(String input) {
        String rev = "";
        char[] chars = input.toCharArray();
        System.out.println(chars.length);
        for (int i = chars.length - 1; i >= 0; i--) {
            //System.out.print(chars[i]);
            rev = rev + chars[i];
        }
        System.out.println("Reverse of this String: "+input+" is:  "+rev);
       /* if(input==rev)
        {
            System.out.println("String is pallindrome");
        }
        else
        {
            System.out.println("String is not pallindrome");
        }*/
        if(input.equalsIgnoreCase(rev))
            return true;
        else
            return false;

        }
    }

