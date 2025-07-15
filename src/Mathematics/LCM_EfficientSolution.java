package Mathematics;

import java.net.StandardSocketOptions;

/*
a*b = gcd(a,b) * lcm(a,b)
so, lcm(a,b) = (a*b)/gcd(a,b)
 */
public class LCM_EfficientSolution {
    public static void main(String[] args) {
        int a=6, b=4;
        int gcd = findGCD(a,b);
        int lcm = (a*b)/gcd;
        System.out.println(lcm);
    }
    //Euclidean algo to find gcd
    private static int findGCD(int a,int b){
        while(a !=0) {
            int rem = b%a;
            if (rem == 0) {
                return a;
            } else {
                b = a;
                a = rem;
            }
            }
       return a;
    }

}
