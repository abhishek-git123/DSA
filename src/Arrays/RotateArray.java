package Arrays;

import java.util.Arrays;

/*
The approach is simple yet optimized. The idea is to reverse the array three times.
For the first time we reverse only the last k elements.
Second time we will reverse first n-k(n=size of array) elements.
Finally, we will get our rotated array by reversing the entire array.

Time Complexity: O(N).
Auxiliary Space: O(1).
 */
public class RotateArray {
    public static void main(String[] args) {
        int[] inputArr = {5,8,10,12,15,9,6};
        int d = 3;
        rotateArr(inputArr, d);
    }

    public static void rotateArr(int[] arr, int d){
        System.out.println(Arrays.toString(arr));
        int size = arr.length;

        reverse(arr,0,d-1);
        reverse(arr,d,size-1);
        reverse(arr,0,size-1);
    }

    public static void reverse(int[] arr, int low, int high){
        while(low<high){
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
        System.out.println(Arrays.toString(arr));
    }
}
