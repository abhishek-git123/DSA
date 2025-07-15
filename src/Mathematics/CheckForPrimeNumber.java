package Mathematics;

//O(n)
public class CheckForPrimeNumber {
    public static void main(String[] args) {
        int num = 21;
        System.out.println("Prime  number: "+checkPrime(num));
    }
    private static boolean checkPrime(int num){
        if(num%2 ==0){
            return false;
        }
        for(int i=3;i<num;i=i+2){
            if(num%i == 0){
                return false;
            }
        }
        return true;
    }
}
