package Codility;

public class FibonacciNumbers {
    public static void main(String[] args) {
        int n=6;
        int a = 0;
        int b = 1;
        int c;
        System.out.print(a + " " +b);
        while(n > 0){
            c  = a + b;
            a=b;
            b =c;
            System.out.print(" "+c);
            n--;
        }

    }
}
