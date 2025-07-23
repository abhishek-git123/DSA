package Mathematics;
/*
we usually check from 2 to sqrt(n)
2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27 ... sqrt(n)

if we take out all the numbers divisible by 2, then we get all th eodd numbers till sqrt(n)
3,5,7,9,11,13,15,17,19,21,23,25,27 .. sqrt(n)

if we take out all the numbers divisible by 3
5,7,11,13,17,19,23,25,29,31,33,37 ... sqrt(n)

remaining numbers form a pattern of
5+2 (7), 5+6 (11)
11+2 (13), 11+6 (17)
17+2 (19), 17+6 (23)
23+2 (25), 23+6 (31)
31+2 (33), 31+6 (37) ... sqrt(n)

 */


public class PrimeFactors_MoreEfficientSolution {
    public static void main(String[] args) {
        int n= 450;
        printPrimeFactors(n);
    }

    private static void printPrimeFactors(int n){
        while(n %2 ==0){
            System.out.println(2);
            n /= 2;
        }

        while (n %3 ==0){
            System.out.println(3);
            n/=3;
        }

        for(int i =5; i*i <= n ; i= i+ 6){
            while (n % i ==0){
                System.out.println(i);
                n = n / i;
            }
            while (n% (i+2) ==0){
                System.out.println(i+2);
                n = n /(i+2);
            }
        }

        //for remaining last factor
        if(n > 3){
            System.out.println(n);
        }
    }
}
