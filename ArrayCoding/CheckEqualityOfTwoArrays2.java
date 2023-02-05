package ArrayCoding;

public class CheckEqualityOfTwoArrays2 {
    public static void main(String[] args) {
        compareTwoArrays(new int[] {1,2,3,4,5}, new int[] {5,4,3,2,1});
        compareTwoArrays(new int[] {10,40,50}, new int[] {10,40,50});

    }


    public static void compareTwoArrays(int[] input1,int[] input2)
    {
        // store the result
        boolean result = true;
        //Check if length of the two arrays are equal or not
        if(input1.length== input2.length)
        {
            // Loop to check elements of arrays one by one
            for(int i=0;i<input1.length;i++)
            {
                // To check if any element is different
                if(input1[i] !=input2[i])
                {
                  //  If any element is different then it will assign false into boolean variable
                    result=false;

                }

            }
        }
        else {

            // If the length of two arrays is different then it will assign false into boolean variable
            result = false;
        }
        //After completion to check whether result is true of false
        if (result == true) {
            // Print the result
            System.out.println("Arrays are equal");
        }
        else {

            // Print the result
            System.out.println("Arrays are not equal");
        }
        }
    }

