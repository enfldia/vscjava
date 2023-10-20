package a1020.Ram;

import java.util.Arrays;
import java.util.Comparator;

public class Ram5 {
    public static void main(String[] args) {
        int[] data = {5, 6, 5, 2, 3, 1, 1, 2, 2, 4, 8};
        int[] result = Arrays.stream(data)
            .boxed()
            .filter((a)->a%2 == 0)
            .distinct()
            .sorted(Comparator.reverseOrder())
            .mapToInt(Integer::intValue)
            .toArray()
            ;
    }
}
//1. Arrays.stream(data)로 정수 배열을 IntStream으로 생성
//2. boxed() IntStream을 Integer의 Stream으로 변경 이유는 뒤에서 사용할 Comparator.reverseOrder 원시 타입인 int 대신 Integer로 객체 타입으로 박싱
//3. distinct()로 스트림에서 중복을 제거한다.
//4. sorted(Comparator.reverseOrder()) 역순 정렬
//5. mapToInt(Integer::intValue)로 Integer의 Stream을 IntStream으로 변경 --toArray 로 int 배열로 출력하기 위해서 변경
//6. toArray()를 호출하여 IntStream의 배열인 int[] 배열을 리턴한다.
