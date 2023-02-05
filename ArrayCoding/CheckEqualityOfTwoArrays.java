package ArrayCoding;

import java.util.Arrays;

public class CheckEqualityOfTwoArrays {
    public static void main( String args[] )
    {
        //solution type-1
        //defining array to compare
        int[] arr1 = new int[] {'a', 'b', 'c', 'd', 'e'};
        int[] arr2 = new int[] {'a', 'b', 'c', 'd', 'e'};
      //comparing two arrays using equals() method
        if (Arrays.equals(arr1, arr2))
            System.out.println("Arrays are equal.");
        else
            System.out.println("Arrays are not equal.");
    }
    }







