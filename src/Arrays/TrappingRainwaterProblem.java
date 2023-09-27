package Arrays;

import java.util.Arrays;

/*
This is an efficient solution based on the precalculation concept.
For every element we can precalculate and store the highest bar on the left
and on the right (say stored in arrays left[] and right[]).
Then iterate the array and use the precalculated values to find the amount of water stored in this index,
which is the same as ( min(left[i], right[i]) – arr[i] )

Time Complexity: O(n)
Space Complexity: O(n). Two extra arrays are needed each of size n
 */

public class TrappingRainwaterProblem {
    public static void main(String[] args) {
        int[] arr = {3,0,2,0,4};
        //int[] arr = {0,1,0,2,1,0,1,3,2,1,2,1};
        int size = arr.length;
        findWater(arr, size);
    }
    public static void findWater(int[] arr, int len){
        int[] left = new int[len];
        int[] right = new int[len];
        int total =0;

        left[0] = arr[0];
        for(int i=1; i<len; i++){
            left[i]= Math.max(arr[i],left[i-1]);
        }
        System.out.println(Arrays.toString(left)); //[3, 3, 3, 3, 4]

        int maxRight = arr[len-1];
        right[len-1] = maxRight;
        for(int j=len-2; j>=0 ; j--){
            if(arr[j] > maxRight){
                maxRight =arr[j];
                right[j]= maxRight;
            }else{
                right[j] = maxRight;
            }
        }
        System.out.println(Arrays.toString(right)); // [3, 3, 3, 3, 4]

        for(int i =0; i<len; i++){
            total += Math.min(left[i],right[i])- arr[i];
        }
        System.out.println(total); //7
    }
}
