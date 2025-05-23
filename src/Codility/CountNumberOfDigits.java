package Codility;

public class CountNumberOfDigits {
    public static void main(String[] args) {
        int num = 10132147;
        int count=0;

        while(num > 0) {
            count++;
            num = num / 10;
        }

        System.out.print(count);

    }
}
