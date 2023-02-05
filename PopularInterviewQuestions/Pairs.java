package javapractice;

public class Pairs {
    public static void main(String[] args) {
       int[] i1=new int[] {1,2,3,4,5,5,7,8,9,} ;
        pairs_sum(i1,10);
    }
    public static void pairs_sum(int[] input,int sum) {
        int lowindex = 0;
        int highindex = input.length - 1;
        while (lowindex < highindex) {










            
            if (input[lowindex] + input[highindex] == sum) {
                System.out.println(highindex + " + " + lowindex + " == " + sum);
                lowindex++;
                highindex--;
            } else if (input[lowindex] + input[highindex] < sum) {
                lowindex++;

            } else if (input[lowindex] + input[highindex] > sum) {
                highindex--;

            }
        }
    }}
