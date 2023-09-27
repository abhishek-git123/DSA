package Arrays;

import java.util.HashSet;
import java.util.Set;

//Using HashSet
/*
Time Complexity: O(N), As the whole array is needed to be traversed only once.
Auxiliary Space: O(N), A hash map has been used to store array elements.
 */
public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {0,-1,2,-3,1};
        int x = -2;

        findTwoSum(arr, x);
    }
    public static void findTwoSum(int[] arr, int sum){
        Set<Integer> set = new HashSet<>();
        for(int i=0 ; i<arr.length ;i++){
            if(set.contains(sum-arr[i])){
                System.out.println("Yes : "+ arr[i] + ", "+ (sum-arr[i]));
                return;
            }
            set.add(arr[i]);
        }
        System.out.println("No");
    }
}
