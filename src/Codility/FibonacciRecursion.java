package Codility;

public class FibonacciRecursion {
    public static void main(String[] args) {
        int n=6;
        for(int i=0; i<n;i++) {
            System.out.print(findFibonacci(i) + " ");
        }
    }

    static int findFibonacci(int n){
          if(n == 0 || n == 1) {
              return n;
          }

          return findFibonacci(n-1)+ findFibonacci(n-2);

      }
    }
