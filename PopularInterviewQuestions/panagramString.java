package javapractice;

public class panagramString {

    public static void main(String[] args) {
        System.out.println( panagram("the quick brown fox jumps over the lazy dog"));
    }
    public static boolean panagram(String input)
    {
        if(input.length()<26)
        {
            return false;
        }
        else
        {
            for(char ch='a';ch<='z';ch++)
            {
                if(input.indexOf(ch)<0)
                {
                    return false;
                }
            }
        }

        return true;
    }
}
