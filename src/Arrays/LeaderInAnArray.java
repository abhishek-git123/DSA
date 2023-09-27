package Arrays;

//Find Leader by finding suffix maximum

/*
The idea is to scan all the elements from right to left in an array and keep track of the maximum till now.
When the maximum changes its value, print it.
 */
public class LeaderInAnArray {
    public static void main(String[] args) {
        int[] inputArr = {16,17,4,3,5,2};
        printLeaders(inputArr);
    }

    public static void printLeaders(int[] arr){
        int max = arr[arr.length-1];
        System.out.println(max);
        for(int i= arr.length-2 ; i>=0; i--){
            if(arr[i] > max){
                max = arr[i];
                System.out.println(max);
            }
        }
    }
}
