package ArrayCoding;

import java.util.Arrays;

public class FindCommonElementInTwoArray {
    public static void main(String[] args) {

        common(new int[] {20, 40, 80,5,6,2},new int[]{20, 80, 100,6,7,9});

    }
    public static void common(int[] input1,int[] input2)
    {
        System.out.println(input1);
        System.out.println("Array1 : "+Arrays.toString(input1));
        System.out.println("Array2 : "+ Arrays.toString(input2));
        System.out.println(input1.length);//i<6
        for(int i=0;i < input1.length;i++)
        {
            for(int j=0;j < input2.length;j++)
            {
                if(input1[i] == input2[j])
                {

                    // System.out.printin("common elements in two arrays are : "+"  "+input1[i]);
                    System.out.println(input1[i]);
                }
            }
        }
    }
}
