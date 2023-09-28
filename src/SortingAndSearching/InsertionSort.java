package SortingAndSearching;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arrSize =  sc.nextInt();
        int[] inputArr = new int[arrSize];

        for(int i=0; i<arrSize;i++){
            inputArr[i] = sc.nextInt();
        }
        System.out.println("Before sorting : "+ Arrays.toString(inputArr));
        insertionSortMethod(inputArr);
    }
    public static void insertionSortMethod(int[] arr){

        for(int i= 1; i<arr.length;i++){
            int key = arr[i];
            int j= i-1;

            while(j>=0 && arr[j] > key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
        System.out.println("After sorting: "+ Arrays.toString(arr));
    }
}
