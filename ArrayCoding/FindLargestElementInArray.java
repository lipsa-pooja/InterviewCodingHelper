package ArrayCoding;

public class FindLargestElementInArray {
    public static void main(String[] args) {
        FindLargestElement(new int[]{25, 11, 7, 75, 56});
    }

    public static void FindLargestElement(int[] input) {
        //Initialize max with first element of array.
        int max = input[0];
        //Loop through the array
        for (int i = 0; i < input.length; i++) {
            //Compare elements of array with max
            if (input[i] > max) {
                max = input[i];
            }
        }
        System.out.println("Largest element present in given array: " + max);
    }
}
