package Codility;

public class BinaryGap {
    public static void main(String[] args) {
        int n = 32;
        int gap  = solution(n);
        System.out.println(gap);
    }
    public static int solution(int N) {
        // Implement your solution here
        String binaryString =  Integer.toBinaryString(N);
        int count = 0;
        int maxCount = 0;
        char[] charArray = binaryString.toCharArray();
        System.out.println(charArray);
        for(int i =0; i< charArray.length-1 ;){
            if(charArray[i] == '1'){
                while(i<charArray.length-1 && charArray[++i] != '1'){
                    count++;
                }
                if(i<=charArray.length && charArray[i] == '1' && maxCount < count){
                    maxCount = count;
                }
                count =0;
            }
        }

        return maxCount;
    }
}


