package Mathematics;

import java.net.StandardSocketOptions;

public class Palindrome {
    public static void main(String[] args) {
        int input = 78987;
        int reverse = reverseOfNumber(input);
        if(input == reverse){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
    private static int reverseOfNumber(int input) {
        int rev =0;
        while(input > 0) {
            int rem = input % 10;
            rev = rev * 10 + rem;
            input = input/10;
        }
        System.out.println("rev : "+ rev);
        return rev;
    }
}
