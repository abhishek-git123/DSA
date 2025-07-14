package Mathematics;
// Overflow issue even for smaller input like 20 as value will be greater than integer storage capacity
public class TrailingZerosInFactorial {
    public static void main(String[] args) {
        int input = 10;
        findTrailingZeros(input);
    }

    private static void findTrailingZeros(int num){
        int fact = findFactorial(num);
        int count=0;
        while(fact%10 == 0){
            count++;
            fact = fact/10;
        }
        System.out.println(count);
    }

    private static int findFactorial(int n){
        int fact =1;
        while(n>0) {
          fact =   fact *n;
          n--;
        }
        return fact;
    }

}
