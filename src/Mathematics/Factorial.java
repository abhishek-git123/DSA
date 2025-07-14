package Mathematics;

public class Factorial {
    public static void main(String[] args) {
        int input = 3;
        System.out.println(findFactorial(input));
    }
    public static int findFactorial(int num){
        int factorial = 1;
        while(num > 0){
            factorial = factorial* num;
            num--;
        }
        return factorial;
    }
}
