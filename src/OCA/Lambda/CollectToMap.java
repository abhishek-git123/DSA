package OCA.Lambda;

import java.net.StandardSocketOptions;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectToMap {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("Apple","Banana","Orange","Grapes","Pineappple");

        Map<String, Integer> fruitLengthMap = fruits.stream().collect(Collectors.toMap(
                fruit -> fruit, fruit -> fruit.length()
        ));

        fruitLengthMap.forEach((k,v) -> System.out.println(k + " : "+ v));
    }
}
