package Arrays;

import java.util.Arrays;

public class RemoveDuplicateInSortedArray {
    public static void main(String[] args) {
        int[] arr = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicatesInPlace(arr));
        removeDuplicate(arr);
    }
    //Inplace solution
    public static int removeDuplicatesInPlace(int[] arr){
        int temp =0;
        int count =1;
        for(int i=1; i<arr.length ;i++){
            if(arr[i] != arr[temp]){
                temp++;
                arr[temp] = arr[i];
                count ++;
            }
        }
        System.out.println(Arrays.toString(arr));
        return count;
    }

    public static void removeDuplicate(int[] arr){
        int[] temp = new int[arr.length];
        temp[0] = arr[0];
        int rd = 0;
        int count =1;
        for(int i =1; i<arr.length;i++){
            if(arr[i]!= temp[rd]){
                rd++;
                temp[rd] = arr[i];
            }
        }

        System.out.println(Arrays.toString(arr));
    }

}
