package javapractice;

public class FindTheLargestElementInArray {
    public static void main(String[] args) {
        largestElement(new int[]{23, 45, 67, 98, 87, 12, 32, 1});
    }
    public static void largestElement(int[] input)
    {
     int largest_ele=input[0];
     for(int i=0;i<=input.length-1;i++)
     {
         if(input[i]>largest_ele)
         {
             largest_ele=input[i];
         }

     }
        System.out.println(largest_ele);

    }
}
