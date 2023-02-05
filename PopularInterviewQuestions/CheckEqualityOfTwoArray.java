package javapractice;

public class CheckEqualityOfTwoArray {
    public static void main(String[] args) {
        System.out.println(equalityCheck(new int[] {1,2,3,4,5}, new int[] {5,4,3,2,1}));

    }
    public static boolean equalityCheck(int[] input1, int[] input2)
    {
        if(input1.length==input2.length)
        {
            for(int i=0;i<=input1.length-1;i++)
            {
                if(input1[i] !=input2[i])
                {
                    return false;
                }
            }
        }

        return true;
    }

}
