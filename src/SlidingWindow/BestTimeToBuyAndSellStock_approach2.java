package SlidingWindow;

public class BestTimeToBuyAndSellStock_approach2 {
    public static void main(String[] args) {
       // int[] input = {7,1,5,3,6,4};
        int[] input = {7,2,0,5,1,3,6,8,4};
        findMaxProfit(input);
    }
    private static void findMaxProfit(int[] arr){
        int maxProfit= 0;
        int left = 0;
        int right = 1;
        while(right < arr.length){
            //profitability
            if(arr[left] < arr[right]){
                int profit = arr[right] -arr[left];
                maxProfit = Math.max(profit, maxProfit);
            }else{
                left =right;
            }
            right++;
        }

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
