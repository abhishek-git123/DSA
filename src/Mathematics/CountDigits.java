package Mathematics;

public class CountDigits {
    public static void main(String[] args) {
        int input = 12345;
        findCountOfDigits(input);
    }
    private static void findCountOfDigits(int num){
        int count = 0;
        while(num > 0){
            num = num/10;
            count++;
        }
        System.out.println(count);
    }
}
