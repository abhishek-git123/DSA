package Arrays;

import java.util.HashMap;
import java.util.Map;

//Time Complexity: O(n)
//Auxiliary Space: O(n)
public class MostFrequentElementInArray {
    public static void main(String[] args) {
        int[] inputArr= {1,3,2,1,4,3,1,4,3,3};
        mostFrequestElement(inputArr);
    }

    public static void mostFrequestElement(int[] arr){
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<arr.length ;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }else {
                map.put(arr[i], 1);
            }
        }
        //map.forEach((key,value) -> System.out.println(key + " "+ value));
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            System.out.println("Key: "+ entry.getKey() + ", Value: "+entry.getValue());
        }
        int max= 0;
        int mostFrequent = -1;
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue() > max){
                max= entry.getValue();
                mostFrequent = entry.getKey();
            }
        }

        System.out.println("Most frequent element " + mostFrequent );
    }
}
