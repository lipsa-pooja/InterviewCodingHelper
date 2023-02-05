package StringPrograms;

public class ReverseEachWordInAString {
    public static void main(String[] args) {


        System.out.println(reverseword("bishnu prasad panda"));




    }
    public static String reverseword(String input)
    {
        String rev = "";
        String[] words = input.split(" ");
        for (String word : words) {
            //System.out.println(word);

            char[] chars = word.toCharArray();
            String temp = "";
            for (int i = chars.length - 1; i >= 0; i--) {
                temp = temp + chars[i];
            }
            rev = rev + " " + temp;
        }
        return rev.trim();
    }
}
