package javapractice;

import java.util.Arrays;

public class largestEllementInArray {
    public static void main(String[] args) {
        first_largest(new int[] {34,67,89,98,56,54,21,45});
        second_largest(new int[] {34,67,89,98,56,54,21,45});
        third_largest(new int[] {34,67,89,98,56,54,21,45});

    }
    public static void first_largest(int[] input)
    {
       int firstlargest= input[0];
       for(int i=0;i<input.length;i++)
       {
           if(input[i]>firstlargest)
           {
               firstlargest=input[i];
           }
       }
        System.out.println(firstlargest);
    }


    public static void second_largest(int[ ] input)
    {
        int firstlargest;
        int secondlargest;
        if(input[0]>input[1])
        {
            firstlargest=input[0];
            secondlargest=input[1];
        }
        else
        {
            firstlargest=input[1];
            secondlargest=input[0];
        }
        for(int i=2;i<input.length;i++)
        {
            if(input[i]>firstlargest)
            {
                secondlargest=firstlargest;
                firstlargest=input[i];

            }else if (input[i]< firstlargest && input[i]>secondlargest)
            {
                secondlargest=input[i];
                firstlargest=secondlargest;
            }

        }
        System.out.println(secondlargest);
    }



    public static void third_largest(int[] input)
    {
        //Type-1
        /*int temp;
        for(int i=0;i<input.length;i++)
        {
            for(int j=i+1;j<input.length;j++)
            {
                //sort the array
                if(input[i]>input[j])
                {
                    temp=input[i];
                    input[i]=input[j];
                    input[j]=temp;
                }
            }

        }*/

        //Type-2
        int thirdlargestele = 0;
        System.out.println(Arrays.toString(input));
        Arrays.sort(input);
        System.out.println(Arrays.toString(input));
        for(int i=0;i<input.length;i++)
        {
            thirdlargestele=input[input.length-3];
        }

        System.out.println(thirdlargestele);
    }
}
