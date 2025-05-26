package Codility;

import java.util.HashSet;
import java.util.Set;

public class PermMissingElement_BetterSol {
    public static void main(String[] args) {
        int[] inputArray = {2,3,1,5,6};
        System.out.println(missingNumber(inputArray));
    }
    public static int missingNumber(int[] inputArr){

        /*
        int expectedSum = (len+1)*(len+2)/2;

        (n)*(n+1)/2 will not work for edge case with large input
        It does work in theory, but problems arise in practice due to integer overflow in programming languages.
        int n = 100_000;
        int result = n * (n + 1) / 2; // might overflow!

        To Fix
        long n = 100_000;
        long sum = n * (n + 1) / 2;
         */

        int len =inputArr.length;
        int expectedSum = 0;
        int sum =0;

        for(int i=0; i<len;i++){
            sum += inputArr[i];
        }

        for(int i=1; i<=len+1;i++){
            expectedSum += i;
        }
        return expectedSum-sum;
    }

}
