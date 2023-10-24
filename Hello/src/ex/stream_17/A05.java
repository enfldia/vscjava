package ex.stream_17;

import java.util.Arrays;
import java.util.List;

public class A05 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList(
            "This is a java book",
            "Lambda Expressions",
            "java8 supports lambda expressions"
        );
        list.stream()
            .filter(a->a.contains("java"))
            .forEach(a-> System.out.println(a));;
            System.out.println();
        }
}
