package enums;

import java.util.Arrays;

public enum Month {
    JANUARY("January"), FEBRUARY("February"), MARCH("March"), APRIL("April"),
    MAY("May"), JUNE("June"), JULY("July"), AUGUST("August"), SEPTEMBER("September"),
    OCTOBER("October"), NOVEMBER("November"), DECEMBER("December");

    Month(String name){}
}

class EnumTest{

    public static void main(String[] args) {

        Arrays.stream(Month.values()).forEach(value -> {
            if (value.toString().endsWith("Y"))
                System.out.printf("%s ends with Y\n", value);
            else System.out.printf("%s doesn't end with Y\n", value);
        });

    }
}

