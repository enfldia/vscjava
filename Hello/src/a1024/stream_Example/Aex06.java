package a1024.stream_Example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Aex06 {
    public static void main(String[] args) {
        List<Integer> numbers1 = Arrays.asList(1, -2, 3, -4, 5, -6);
        List<Integer> num = numbers1.stream()
                .filter(integer -> integer>0)
                .collect(Collectors.toList());
        System.out.println(num);
        
    }
}
