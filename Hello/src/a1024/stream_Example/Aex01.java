package a1024.stream_Example;
//문제 1: 문자열 목록에서 길이가 3 이하인 문자열 제외하기

//List<String> strings = Arrays.asList("apple", "banana", "cherry", "date", "fig");

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Aex01 {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple", "banana", "cherry", "date", "fig");
        List<String> ss = strings.stream()
                .filter(s -> s.length() <= 3)
                .collect(Collectors.toList());
        System.out.println(ss);

        /*
         * List<String> strings = Arrays.asList("apple", "banana", "cherry", "date",
         * "fig");
         * List<String> filteredStrings = strings.stream()
         * .filter(s -> s.length() > 3)
         * .collect(Collectors.toList());
         */

    }
}
