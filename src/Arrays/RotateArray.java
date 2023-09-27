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
        int size = arr.length;
        for(int i=0,j=d-1; i<j; i++,j--){
            int temp = arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
        System.out.println(Arrays.toString(arr));
        for(int i=d, j=size-1;i<j;i++,j--){
            int temp = arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
        System.out.println(Arrays.toString(arr));
        for(int i=0,j=size-1; i<j ;i++,j--){
            int temp = arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }

        System.out.println(Arrays.toString(arr));
    }
}
