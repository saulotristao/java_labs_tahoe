package part_12;

import java.util.function.Predicate;

public class predicateTest {
    public static void main(String[] args) {
        Predicate <String> greaterThan = (String t) -> t.length()>10;

        boolean test = greaterThan.test("wertyutyuio");
        System.out.println(test);

        boolean test2 = greaterThan.test("rt");
        System.out.println(test2);


    }
}