package OnlineAssessments;

/*
A string S made up of uppercase English letters is given. In one move, six letters forming the
word "BANANA"(one 'B', three 'A's' and two 'N's') can be deleted from S.
What is the maximum number of times such a move can be applied to S?

Write a function:
def solution(s)

that given a string S of length N, returns the maximum number of moves that can be applied.

Examples:
1. Given S = "NAABXXAN", the function should return 1. NAABXXAN----->XX

2. Given S = "NAANAAXNABABYNNBZ", the function should return 2. NAANAAXNABABYNNBZ -----> NAAXNABYNBZ
 */

import java.util.HashMap;
import java.util.Map;

public class UppercaseEnglishLetters {
    public static void main(String[] args) {
        String input = "APBNANAANBO";
        //String input = "NAANAAXNABABYNNBZ";
        //String input ="SSSP";

        /*
        Map<Character, Integer> countMap = new HashMap<>();
        for(int i=0; i<input.length(); i++){
            char currrentChar = input.charAt(i);
            if(countMap.containsKey(currrentChar)){
                countMap.put(currrentChar, countMap.get(currrentChar)+1);
            }else{
                countMap.put(currrentChar,1);
            }
        }

        System.out.println(countMap);

        int countOfB = countMap.get('B') != null ? countMap.get('B') : 0;
        int countOfA = countMap.get('A') != null ? countMap.get('A') : 0;
        int countOfN = countMap.get('N') != null ? countMap.get('N') : 0;
        System.out.println(countOfB);
        System.out.println(countOfA);
        System.out.println(countOfN);
       */

        int countOfB =0;
        int countOfN =0;
        int countOfA =0;

        for(char c : input.toCharArray()){
            if(c == 'B')
                countOfB++;
            else if (c == 'N')
                countOfN++;
            else if(c == 'A')
                countOfA++;
        }
        int ratioOfB = countOfB;
        int ratioOfN = countOfN/2;
        int ratioOfA = countOfA/3;

        int maxCount = Math.min(ratioOfA, Math.min(ratioOfB, ratioOfN));
        System.out.println("maxCount : "+maxCount);



    }

}
