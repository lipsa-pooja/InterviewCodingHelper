package ArrayCoding;

//Input: 5 9 8 3 2 6 7
// Output: Element to be deleted: 8
//Array: 5 9 3 2 6 7

import java.util.Arrays;

public class DeleteAnElementAtSpecifiedPosition {
    public static void main(String[] args) {
        int[] my_array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
        delete_element_from_specified_position(my_array);
    }
    public static void delete_element_from_specified_position(int[] input)
    {
        System.out.println("Original Array : "+ Arrays.toString(input));
        int[] copyinput = new int[input.length-1];
        int removeindex=4;//index=4 means value=36
        int j=0;
        for(int i=0;i<input.length;i++)
        {
          if(i !=removeindex)
          {
              copyinput[j++]=input[i];
          }
        }
        System.out.println(Arrays.toString(copyinput));
    }
}
