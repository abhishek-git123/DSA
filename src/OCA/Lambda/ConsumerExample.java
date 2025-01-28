package OCA.Lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Apple","Banana","Cherry");
        Consumer<String> printConsumer = str -> System.out.println(str);

        list.forEach(printConsumer);
    }
}
