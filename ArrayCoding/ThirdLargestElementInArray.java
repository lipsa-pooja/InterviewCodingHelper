package ArrayCoding;
//Sorting an array
//Compare the first two elements of the array
//If the first element is greater than the second swap them.
//Then, compare 2nd and 3rd elements if the second element is greater than the 3rd swap them.
//Repeat this till the end of the array.
//After sorting an array print the third element from the end of the array.

public class ThirdLargestElementInArray {
    public static void main(String[] args) {
        thirdLargest(new int[]{23, 45, 67, 98, 87, 12, 32, 1});
    }
    public static void thirdLargest(int[] input)
    {
     int temp;
     for(int i=0;i<=input.length-1;i++)
     {
         for(int j=i+1;j<=input.length-1;j++)
         {
             if(input[i]>input[j])
             {
                 temp=input[i];
                 input[i]=input[j];
                 input[j]=temp;

             }
         }

     }
        System.out.println(input.length);//8---actual length of an array
        System.out.println(input.length-3);//5
        System.out.println(input[input.length-3]);//67
    }
}
