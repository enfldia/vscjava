package a1024.stream_Example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//주어진 숫자 리스트의 제곱값을 계산하는 ㅓㅁㅍㅁ 스트림 코드를 작성하십시오
public class Ex03 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> xnum = numbers.stream()
            .map(a -> a*a)
            .collect(Collectors.toList());
        System.out.println(xnum);
    }
}