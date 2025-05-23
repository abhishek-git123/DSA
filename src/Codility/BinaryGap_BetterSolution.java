package Codility;

public class BinaryGap_BetterSolution {
    public static void main(String[] args) {
        int N = 9;
        String binaryString = Integer.toBinaryString(N);
        System.out.println(binaryString);

        System.out.println(findLargestGap(binaryString));
    }

    public static int findLargestGap(String binaryString){
        int len  = binaryString.length();
        int currentMax =0;
        int count =0;
        boolean isCounting = false;

        for(int i=0; i<len ;i++){
            char currentChar = binaryString.charAt(i);
            if(currentChar == '1' && !isCounting){
                count = 0;
                isCounting = true;
            }
            if(currentChar == '0' && isCounting){
                count++;
            }
            if(currentChar == '1' && isCounting){
                if(currentMax < count) {
                    currentMax = count;
                }
                //isCounting = false;
                count =0;
            }

        }

        return currentMax;
    }
}
