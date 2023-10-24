package a1024.stream_Example;

import java.util.Arrays;
import java.util.List;

//주어진 문자열 리스트에서 문자'a'를 포함하는 문자열의 수를 계산하는
//Java 스트림 코드를 작성하십시오
public class Ex05 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple","banana", "cherry", "data");
        long count = words.stream()
        .filter(word -> word.contains("a"))
        .count();
        System.out.println(count);
    }
}
