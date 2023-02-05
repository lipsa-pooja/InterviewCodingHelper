package ArrayCoding;

public class FindSecondLargestElementInArray {
    public static void main(String[] args) {
        FindSecondLargestElement(new int[] {45, 51, 28, 75, 49, 42});
        FindSecondLargestElement(new int[] {985, 521, 975, 831, 479, 861});
        FindSecondLargestElement(new int[] {9459, 9575, 5692, 1305, 1942, 9012});
        FindSecondLargestElement(new int[] {47498, 14526, 74562, 42681, 75283, 45796});

    }

    public static int FindSecondLargestElement(int[] input)
    {
        int firstLargest, secondLargest;
        //Checking first two elements of input array
        if(input[0] > input[1])
        {
            //If first element is greater than second element
            firstLargest = input[0];
            secondLargest = input[1];
        }
        else
        {
            //If second element is greater than first element
            firstLargest = input[1];
            secondLargest = input[0];
        }
        //actual length of an array,not index length,so length=6 here
        //System.out.println(input.length);

        //Checking remaining elements of input array
        for (int i = 2; i < input.length; i++)
        {
            if(input[i] > firstLargest)
            {
                //If element at 'i' is greater than 'firstLargest'
                secondLargest = firstLargest;
                firstLargest = input[i];//check new element will be 1st largest???????
            }
            else if (input[i] < firstLargest && input[i] > secondLargest)
            {
                //If element at 'i' is smaller than 'firstLargest' and greater than 'secondLargest'
                secondLargest = input[i];//if not 1st largest,check if the new element will be 2nd largest????
            }
        }
        System.out.println("second largest element in the array is: " +secondLargest);
        return secondLargest;

    }

}
