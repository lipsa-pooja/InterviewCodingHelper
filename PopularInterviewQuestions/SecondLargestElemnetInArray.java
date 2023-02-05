package javapractice;

public class SecondLargestElemnetInArray {
    public static void main(String[] args) {
        secondlargest(new int[]{23, 45, 67, 98, 87, 12, 32, 1});
    }
    public static void secondlargest(int[] input)
    {
        int firstlargest_element = input[0];
        int secondlargest_element=input[1];
        for (int i=2;i<=input.length-1;i++)
        {
            if(input[i]>firstlargest_element)
            {
                firstlargest_element=input[i];
            }
           else if(input[i]<firstlargest_element && input[i] > secondlargest_element)
            {
                secondlargest_element=input[i];
                firstlargest_element=secondlargest_element;
            }

        }
        System.out.println(secondlargest_element);

    }
}
