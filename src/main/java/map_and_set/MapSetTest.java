package map_and_set;

import java.time.Instant;
import java.time.LocalDate;
import java.util.*;

public class MapSetTest {
    public static void main(String[] args) {
        var months = new LinkedHashMap<String, Integer>();
        months.put("January", 1);
        months.put("February", 2);
        months.put("March", 3);
        months.put("April", 4);
        months.put("May", 5);
        months.put("June", 6);
        months.put("July", 7);
        months.put("August", 8);
        months.put("September", 9);
        months.put("October", 10);
        months.put("November", 11);
        months.put("Decemebr", 12);
        var monthsKeyView = months.keySet();
        months.forEach((k, v) -> System.out.printf("%s %s\n", k, v));
        System.out.println("..................................");

        monthsKeyView.forEach(System.out::println);

        var cardinalMonth = new ArrayList<Integer>();
        months.forEach((k, v) -> cardinalMonth.add(v));
        System.out.println(cardinalMonth);

        var cardinalMonthArray = cardinalMonth.toArray(Integer[]::new);
        System.out.println(Arrays.toString(cardinalMonthArray));
    }
}
