package SlidingWindow;

public class BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
       // int[] input = {7,1,5,3,6,4};
        int[] input = {7,2,0,5,1,3,6,8,4};
        findMaxProfit(input);
    }

    private static void findMaxProfit(int[] arr){
        int maxProfit= 0;
        int left = arr[0];
        int right = arr[1];
        for(int i=2; i<arr.length ;i++){
            if(right < left){
                left = right;
                right = arr[i];
            }else{
                if(right - left > maxProfit){
                    maxProfit = right-left;
                }
                right = arr[i];
            }
        }
        System.out.println("Max Profit : " + maxProfit);
    }
}
