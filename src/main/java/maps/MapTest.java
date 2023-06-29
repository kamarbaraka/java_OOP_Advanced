package maps;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MapTest {

    public static void main(String[] args) {

        var map = new HashMap<>(Map.of(1, "one", 2, "two", 3, "three", 4, "four",
                5, "five"));

        var oddItalianNumbers = new HashMap<>(Map.of(
                1, "uno", 2, "due", 3, "tre", 5, "cinque", 6, "sei",
                7, "sette", 9, "nove"
        ));

        map.putAll(oddItalianNumbers);

        System.out.println(map);
        map.forEach((k, v) -> {
            if (k > 4)
                if (k == null)
                    System.out.println("no associated value");
                else
                    System.out.println(k);
        });
    }
}
