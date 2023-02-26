package week05;

import java.util.HashMap;
import java.util.Map;

public class StreamGetValuesFromMap {

    public static void main(String[] args) {

        Map<Integer, Integer> map = new HashMap<>();
        map.put(1, 2);
        map.put(2, 12);
        map.put(3, 2);
        map.put(4, 22);
        map.put(6, 3);

        int result = map.entrySet().stream().filter(p -> p.getKey() % 2 == 0).mapToInt(p -> p.getValue()).reduce(Integer::sum).getAsInt();
        System.out.println(result);

    }
}
/*
sum all values in my map which key%2==0
 */
