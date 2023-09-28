package SortingAndSearching;

import java.util.Arrays;

/*
This algo has been optimized by stopping the algorithm if inner loop didn't cause any swap

Time Complexity:
Worst Case: O(n)^2
Best Case: O(n)
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {11, 12, 22, 25, 34, 64, 90};
        int len = arr.length;
        bubbleSort(arr, len);
    }

    public static void bubbleSort(int[] arr, int size){
        boolean swapped;
        for(int i=0; i<size-1 ; i++){
            swapped = false;
            for(int j=0; j<size-1-i ; j++){
               if(arr[j] > arr[j+1]){
                   int temp = arr[j];
                   arr[j] = arr[j+1];
                   arr[j+1] = temp;
                   swapped =true;
               }
           }
           if(!swapped){
               break;
           }
        }

        System.out.println("Sorted Array: "+ Arrays.toString(arr));
    }
}
