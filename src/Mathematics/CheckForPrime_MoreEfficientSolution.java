package Mathematics;

//run till sqrt(n). and skip for multiple of 2 and 3.
public class CheckForPrime_MoreEfficientSolution {
    public static void main(String[] args) {
        //int num = 1031;
        int num = 121;
        System.out.println(isPrime(num));
    }
    private static boolean isPrime(int n){
        if(n==1){
            return false;
        }
        if(n == 2 || n==3){
            return true;
        }
        if(n%2 ==0  || n%3 == 0){
            return false;
        }

        for(int i =5; i*i <= n ; i = i+6){
            if(n%i == 0 || n%(i+2)==0){
                return  false;
            }
        }
        return true;
    }
}
