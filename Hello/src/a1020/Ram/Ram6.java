package a1020.Ram;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ram6 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob","Charlie");
        List<String> filteredName = names.stream()
            .filter(name -> name.length() > 4)
            .collect(Collectors.toList());//실행한 결과 값을 리스트로 생성해서 리턴할 수 있게 해준다.
        
        System.out.println("원래 이름 리스트: "+ names);
        System.out.println("길이가 4보다 큰 이름 리스트: " +filteredName);

    }
}