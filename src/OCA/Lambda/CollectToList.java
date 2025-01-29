package OCA.Lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectToList {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("Apple","Banana","Orange","Pineapple","Grape");
        //collect only fruits with length greater than 5 into a new List

        List<String> longfruits = fruits.stream()
                .filter(f-> f.length()>5)
                .toList();

        longfruits.forEach(s-> System.out.println(s));
    }
}
