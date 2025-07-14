package Mathematics;

public class Factorial_Recursive {
    public static void main(String[] args) {
        int input = 4;
        System.out.println(findFactorial(input));
    }
    private static int findFactorial(int num){
        int factorial =1;
        if(num == 1){
            return 1;
        }else {
            factorial = num* findFactorial(num - 1);
        }
        num--;
        return  factorial;
    }
}
