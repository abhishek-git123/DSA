package Mathematics;

import java.net.StandardSocketOptions;

public class PrintAllDivisors_SortedOrder {
    public static void main(String[] args) {
        int n = 50;
        printAllDivisorsInSortedOrder(n);
    }
    private static void printAllDivisorsInSortedOrder(int n){
        int i;
        for(i=1; i*i <= n ;i++){
            if(n%i ==0){
                System.out.println(i);
            }
        }
        System.out.println("current i ="+ i);
        for(;i>=1;i--){
            if(n%i ==0){
                System.out.println(n/i);
            }
        }




    }
}
