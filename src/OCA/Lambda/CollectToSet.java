package OCA.Lambda;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class CollectToSet {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("Apple","Banana","Orange","Apple","Grapes","Banana","Pineappple");

        Set<String> fruitsSet =  fruits.stream().collect(Collectors.toSet());
        System.out.println(fruitsSet);

        fruitsSet.forEach(s -> System.out.println(s));
    }
}
