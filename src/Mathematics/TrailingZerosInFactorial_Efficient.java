package Mathematics;
/*
A trailing zero is formed by multiplication of 5 and 2. So if we consider all prime factors of all numbers from 1 to n, there would be more 2s than 5s.
So the number of 0s is limited by number of 5s. If we count numner of 5s in prime factors, we get the result.
A simple way to calculate number of 5 is by floor[n/5]. For example, 7! has one 5, 10! has 2 5s.
But numbers like 25, 125 etc have more 5s than just floor[n/5]. For example 28! has one extra 5 and the number of 0 becomes 6.
Handling this is simple, first, divide by 5 and remove all single 5s, then divide by 25 to remove extra 5s ad so on..
 */

public class TrailingZerosInFactorial_Efficient {
    public static void main(String[] args) {
        int input =125;
        int result =0;
        for(int i=5; i<=input; i=i*5 ){
            result = result + input/i;
        }
        System.out.println(result);
    }
}
