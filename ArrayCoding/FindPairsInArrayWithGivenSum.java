package ArrayCoding;

import java.util.Arrays;

public class FindPairsInArrayWithGivenSum {
    public static void main(String[] args) {
        findPairs(new int[] {4, 6, 5, -10, 8, 5, 20}, 10);

    }
    public static void findPairs(int[] input,int sum)
    {
       Arrays.sort(input) ;
       for(int i=0;i<input.length;i++) {
           System.out.println(input[i]);
           //System.out.println();

       }
        int low=0;//low-index in array
        int high=input.length-1;//high-index in array
        while(low<high)
        {
            if(input[low]+input[high]==sum)
            {
                System.out.println("Two pairs will be: "+input[low]+"+"+input[high]+" ="+sum);
                low++;
                high--;
            }
            else if(input[low]+input[high]>sum)
            {
             high--;
            }
            else if(input[low]+input[high]<sum)
            {
                low++;
            }


        }
    }
}
