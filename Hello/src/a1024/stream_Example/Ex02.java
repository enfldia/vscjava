package a1024.stream_Example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//문자열 리스트에서 길이가 5이상인 문자열만 선택하는 Java 스트림 토드를 작성하십시오
public class Ex02 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple","banana","cherry","date","elderberry");
        List<String> longWords = words.stream()
        .filter(word -> word.length()>=5)
        .collect(Collectors.toList());
        System.out.println(longWords);
    }
}
