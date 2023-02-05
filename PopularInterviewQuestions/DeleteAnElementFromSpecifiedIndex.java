package javapractice;

import java.util.Arrays;

public class DeleteAnElementFromSpecifiedIndex {
    public static void main(String[] args) {
        delete_element(new int[] {1,2,5,6,7});
    }
    public static void delete_element(int[] input)
    {
        int remove_index=2;//value=5
        for(int i=remove_index;i<input.length-1;i++)
        {
            input[i]=input[i+1];

        }
        System.out.println(Arrays.toString(input));
    }
}
