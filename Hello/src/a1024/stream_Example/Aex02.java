package a1024.stream_Example;
//문제 2: 숫자 목록에서 중복값 제거하기
//List<Integer> numbers = Arrays.asList(1, 2, 2, 3, 4, 4, 5);

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Aex02 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 2, 3, 4, 4, 5);
        List<Integer> num = numbers.stream()
            .distinct()
            .collect(Collectors.toList());
            System.out.println(num);
    }
}
