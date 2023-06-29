package sets;

import java.awt.*;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class SetTest {

    public static void main(String[] args) {
        var daysOfWeek = new HashSet<>(Set.of("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"));
        daysOfWeek.forEach(System.out::println);

        System.out.println("...............................................");
        var set = new LinkedHashSet<String>();
        set.add("Monday");
        set.add("Tuesday");
        set.add("Wednesday");
        set.add("Thursday");
        set.add("Friday");
        set.add("Saturday");
        set .add("Sunday");
        set.forEach(System.out::println);

        System.out.println("...............................................");

        System.out.println("no");
    }
}
