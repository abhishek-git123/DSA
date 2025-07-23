package Mathematics;

//It prints all the divisors of a number, but not in sorted order
public class PrintAllDivisors {
    public static void main(String[] args) {
        int n= 25;
        printAllDivisors(n);
    }

    private static void printAllDivisors(int n){
        System.out.print(1+" "+n+ " ");

        for(int i=2; i*i <=n ;i++){
            if(n%i == 0){
                System.out.print(i+ " ");
                //in case of perfect squares like 25, when i becomes 5, it will print 5, two times.
                //So to avoid duplicate printing of i, this condition is applied
                if(i != n/i){
                    System.out.print(n/i + " ");
                }

            }
        }
    }
}
