package Mathematics;

/*
Divisors always apprars in pair.
Example:
30: (1,30),(2,15),(3,10),(5,6)
65: (1,65),(5,13)
25: (1,25),(5,5)

if (x,y) is a pair
    x*y = n
    And if x<= y
    x*x <= n
    x <= sqrt(n)

If a number n is not a prime, it can be factored into two factors a and b:
  n  = a*b

  Now a and b can't be both greater than the square root of n, since the product a*b would be greater than
  sqrt(n) * sqrt(n) = n.
  So, in any factorization of n, atleast one of the factors must be less than or equal to square root of n, and
  if we can't find any factors less than or equal to square root, n must be prime.

  ********
  Let's say m = sqrt(n) then m*m = n.
  Now if n is not a prime number then n can be written as n = a*b,
  so, m*m  = a*b. Notice that m is real number(like 1, 1.2, 2.3 etc) whereas n,a and b are natural(positive non-deciaml number like 1,2,3,4)

  Now there can be 3 cases:
   1. a>m => b<m
   2. a<m => b>m
   3. a=m => b=m

   In all three cases, min(a,b) <=m. Hence if we search till m (which is sqrt(n)), we are bound to find atleast one
   factor of n, which is enough to show that n is not prime.

 */
public class CheckForPrime_EfficientSolution {
    public static void main(String[] args) {
        int num = 7;
        System.out.println(findPrime(num));
    }
    private static boolean findPrime(int num){
        for(int i=3; i<Math.sqrt(num); i= i+2){
            if(num%i ==0){
                return false;
            }
        }
        return true;
    }
}
