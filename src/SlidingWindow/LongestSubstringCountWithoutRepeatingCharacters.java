package SlidingWindow;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringCountWithoutRepeatingCharacters {
    public static void main(String[] args) {
        String input = "abcabcbb";
        System.out.println(findLongestSubString(input));
    }
    private static int findLongestSubString(String input){
        char[] charArray = input.toCharArray();
        int l =0;
        int maxCount = 1;
        Set set = new HashSet();
        for(int r=0; r< charArray.length ;r++){
            while (set.contains(charArray[r])){
                set.remove(charArray[l]);
                l++;
            }
            set.add(charArray[r]);
            maxCount = Math.max(maxCount, r-l+1);
        }

        return maxCount;
    }
}
