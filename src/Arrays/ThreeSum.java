package Arrays;

import java.util.HashSet;
import java.util.Set;

public class ThreeSum {
    public static void main(String[] args) {
        int[] arr = {11, 4, 45, 6, 10, 8};
        int sum = 26;

        findTriplet(arr,sum);
    }

    public static void findTriplet(int[] arr, int sum){
        int len = arr.length;
        Set<Integer> set = new HashSet();
        for(int i =0; i<len-2 ; i++ ){
            int curr_sum = sum-arr[i];
            for(int j=i+1 ; j<len; j++){
                if(set.contains(curr_sum - arr[j])){
                    System.out.println(arr[i] + ", "+arr[j]+ ", "+ (curr_sum-arr[j]));
                    return;
                }
                set.add(arr[j]);
            }
        }
        System.out.println("No triplet found");
    }
}
