package Codility;

import java.util.HashSet;
import java.util.Set;

public class PermMissingElement {
    public static void main(String[] args) {
        int[] inputArray = {2,3,1,5,6};

        System.out.println(missingNumber(inputArray));
    }

    public static int missingNumber(int[] inputArr){
        int len = inputArr.length;
        int missingNumber = 0;
        Set<Integer> set = new HashSet<Integer>();
        if(len == 0){
            missingNumber = 1;
            return missingNumber;
        }
        for(int i=0; i<len ;i++){
            set.add(inputArr[i]);
        }
        //System.out.println(set);

        for(int i=1; i<=len+1; i++){
            if(!set.contains(i)){
                missingNumber = i;
            }
        }
        return missingNumber;
    }

}
