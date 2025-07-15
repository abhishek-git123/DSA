package Mathematics;

public class GreatestCommonDivisor_EuclideanAlgorithm {
    public static void main(String[] args) {
        int a =6, b=4;

        System.out.println(findGCD(a,b));
    }
    private static int findGCD(int a, int b){
        while(a!=0) {
            int rem = b%a;
            if (rem == 0) {
                return a;
            } else {
                b = a;
                a = rem;
            }
        }
        return  a;

    }
}
