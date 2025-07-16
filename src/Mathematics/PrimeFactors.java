package Mathematics;

// O(n log n)
public class PrimeFactors {
    public static void main(String[] args) {
        int num = 24;
        findPrimeFactors(num);
    }
    private static void findPrimeFactors(int num){
        for(int i = 2; i< num ;i++){
            if(isPrime(i)){
                int x = i;
                while( num % x  ==0){
                    System.out.println(i+ " ");
                    x = x*i;
                }
            }
        }
    }

    private static boolean isPrime(int n){
        if(n==1){
            return false;
        }
        if(n == 2){
            return true;
        }
        if(n%2 ==0){
            return false;
        }
        for(int i = 3; i*i < n ;i = i+2){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
}
