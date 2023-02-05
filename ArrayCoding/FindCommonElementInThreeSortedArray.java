package ArrayCoding;

import java.util.Arrays;

public class FindCommonElementInThreeSortedArray {
    public static void main(String[] args) {
        int[] i1 =new int[] {1, 5, 10, 20, 40, 80};
        int[] i2=new int[]{6, 7, 20, 80, 100};
        int[] i3=new int[]{3, 4, 15, 20, 30, 70, 80, 120};
        CommonElementInThreeSortedArray(i1,i2,i3);

    }
    public static void CommonElementInThreeSortedArray(int[] input1,int[] input2,int[] input3)
    {


        for(int i = 0; i < input1.length; i++) {

            for(int j = 0; j < input2.length; j++) {

                for(int k = 0; k < input3.length; k++) {

                    if(input1[i] == input2[j] && input2[j] == input3[k]) {
                        System.out.println(input1[i]);
                    }
                }
            }
        }
    }
}

