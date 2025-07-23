package Mathematics;

import java.net.StandardSocketOptions;

public class PrimeFactors_EfficientSolution {
    public static void main(String[] args) {

        //int input = 24;
        int input = 315;
        findPrimeFactors(input);


    }
    private static void findPrimeFactors(int n){
        int input = n;
        while(n%2 ==0){
            System.out.println(2);
            n /= 2;
        }

        for(int i =3; i*i<= input; i+=2){ //value of current n might be less then i*i. We have to search till sqrt of original input
            while(n%i ==0){
                System.out.println(i);
                n= n/i;
            }
        }
    }
}
