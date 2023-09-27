package Arrays;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] input = {1,2,3,10,4};
        reverseArray(input);
    }
    public static void reverseArray(int[] inputArr){
        int len = inputArr.length;
        int low =0, high=len-1;

        while(low<high){
            int temp = inputArr[low];
            inputArr[low] = inputArr[high];
            inputArr[high] = temp;
            low++;
            high--;
        }
        System.out.println(Arrays.toString(inputArr));
    }
}
