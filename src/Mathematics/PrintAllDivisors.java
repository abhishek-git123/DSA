package Mathematics;

//It prints all the divisors of a number, but not in sorted order
public class PrintAllDivisors {
    public static void main(String[] args) {
        int n= 30;
        printAllDivisors(n);
    }

    private static void printAllDivisors(int n){
        System.out.print(1+" "+n+ " ");

        for(int i=2; i*i <n ;i++){
            if(n%i == 0){
                System.out.print(i+ " ");
                n = n/i;
                System.out.print(n+ " ");
            }
        }
    }
}
