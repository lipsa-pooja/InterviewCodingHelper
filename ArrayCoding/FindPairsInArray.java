package ArrayCoding;

import java.util.Arrays;

public class FindPairsInArray {
    public static void main(String[] args) {
        findpairs(new int[ ]{1,2,3,4,6,5,5,9,8,7},10);
    }
    public static void findpairs(int[] input,int sum)
    {
        Arrays.sort(input);//{1,2,3,4,5,5,7,8,9};
        int lowindex=0;
        int highindex=input.length-1;
        while(lowindex<highindex)
        {
            if(input[lowindex]+input[highindex]==sum)
            {
                System.out.println("Two pairs in Array is: "+input[lowindex]+" + "+input[highindex]);
                lowindex++;
                highindex--;

            }else if(input[lowindex]+input[highindex]<sum)//1+6<10
            {
                lowindex++;
            }
            else if(input[lowindex]+input[highindex]>sum)
            {
                highindex--;
            }
        }





    }
}
