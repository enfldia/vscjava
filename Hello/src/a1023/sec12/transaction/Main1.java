package a1023.sec12.transaction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Main1 {
    public static void main(String[] args) {
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader Mario = new Trader("Mario", "Milan");
        Trader alan = new Trader("Alan", "Cambridge");
        Trader brian = new Trader("Brian", "Cambridge");

        List<Transaction> transactions = Arrays.asList(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2012, 1000),
                new Transaction(raoul, 2011, 400),
                new Transaction(Mario, 2012, 710),
                new Transaction(Mario, 2012, 700),
                new Transaction(alan, 2012, 950));

        // 2011년에 일어난 모든 트렌잭션을 찾아 값을 오름차순으로 정리하시오.
        List<Transaction> transactionsIn2011 = transactions.stream()
                .filter(transaction -> transaction.getYear() == 2011)
                .sorted(Comparator.comparing(Transaction::getValue))
                .collect(Collectors.toList());
        System.out.println(transactionsIn2011);

        // 거래자가 근무하는 모든 도시를 중복없이 나열하시오
        List<String> transactions2 = transactions.stream()
                .map(Transaction::getTrader) // :: 은 특정요소를 추출하는 기호 여기서는 getTrader를 추출
                .map(Trader::getCity) // getTrader 에서 getCity를 추출
                .distinct() // 중복 제거
                .collect(Collectors.toList());// toList()로
        System.out.println(transactions2);

        List<String> cities = transactions.stream()
                .map(transaction -> transaction.getTrader().getCity())
                .distinct()
                .collect(Collectors.toList());
        System.out.println(cities);

        // 케임브릿지에서의 근무하는 모든 거래자를 찾아서 이름순으로 정렬하시오
        List<String> Cambridge_traders = transactions.stream() // 스트링의 데이터 형식의 리스트 클래스에 캠브릿지_트레더라는 객체는 트렌젝션스의 스트림 메소드를
                                                               // 갖는다.
                .map(Transaction::getTrader) /// Transaction 객체에서 ::를 사용함으로써 Trader추출로 Trader 객체로 변환(3.객체 전환)
                .filter(s -> s.getCity().equals("Cambridge")) // 필터를 이용해서 s라는 변수에 람다식으로 s.getCity()의 값을 불러오는데
                                                              // .equals("Cambidge")메소드를 이용해서 캠브릿지를 포함한 객체를 추려낸다.
                .map(s -> s.getName()) // 추려낸 객체에서 각 거래자의 이름을 추출(정보를 추출할때 map을 사용함)
                .distinct() // 중복된 값을 제거
                .sorted() // 순차 정렬
                .collect(Collectors.toList()); // toList()로 Collectors를 리스트에 저장한걸 collect로 컬렉션에 담고 그룹핑하고 값을 리턴하는 최종처리를
                                               // 한다.
        System.out.println("Cambridge_traders : " + Cambridge_traders);

        List<String> quiz3 = transactions.stream()
                .filter(transaction -> "Cambridge".equals(transaction.getTrader().getCity()))
                .map(transaction -> transaction.getTrader().getName())
                .distinct()
                .sorted().collect(Collectors.toList());
        quiz3.forEach(n -> System.out.println(n.toString()));

        String quiz4 = transactions.stream()
                .map(transaction -> transaction.getTrader().getName())
                .sorted()
                .distinct()
                .reduce("", (s, s2) -> s + s2 + " ");
        System.out.println(quiz4);

        // 밀라노에 거래자가 있는가?
        boolean quiz5 = transactions.stream()
                .anyMatch(transaction -> "Milan".equals(transaction.getTrader().getCity()));
        System.out.println(quiz5);

        boolean milanTrederExists = transactions.stream()
                .anyMatch(transaction -> transaction.getTrader().getCity().equals("Milan"));
        System.out.println("Milan trader exists: " + milanTrederExists);

        // 케임브리지에 거주하는 거래자의 모든 트랜잭션값을 출력하시오
        List<Integer> quiz6 = transactions.stream()
                .filter(transaction -> ("Cambridge").equals(transaction.getTrader().getCity()))
                .map(Transaction::getValue)
                .collect(Collectors.toList());
        System.out.println(quiz6);
        // quiz6.forEach(System.out::println);

        transactions.stream()
                .filter(transaction -> "Cambridge".equals(transaction.getTrader().getCity()))
                .forEach(transaction -> System.out.println(transaction.getValue()));

        List<Integer> CambridgeValue = transactions.stream()
                .filter(transaction -> transaction.getTrader().getCity().equals("Cambridge"))
                .map(transaction -> transaction.getValue())
                .collect(Collectors.toList());
        // System.out.println("CambridgeValue : " + CambridgeValue);
        CambridgeValue.forEach(System.out::println);

        // 전체 트랜잭션 중 최댓값은 얼마인가?
        int max1 = transactions.stream()
                .map(Transaction::getValue)
                .max(Integer::compareTo)
                .orElse(0);// 집계값이 없을 경우를 대비해서 디폴트 값을 0으로 설정
        System.out.println("Max Transaction Value: " + max1);

        // Optional
        Optional<Integer> quiz7 = Optional.ofNullable(transactions.stream()
                .map(transaction -> transaction.getValue())
                .reduce(0, (integer, integer2) -> Integer.max(integer, integer2)));
        System.out.println(quiz7);

        List<Transaction> transactions1 = new ArrayList<>();
        Optional<Integer> quiz7_1 = Optional.ofNullable(transactions.stream()
                .map(transaction -> transaction.getValue())
                .reduce(0, (integer, integer2) -> Integer.max(integer, integer2)));
        System.out.println(quiz7_1);
        
        // Optional
        /* List<Transaction> transactions1 = new ArrayList<>();
        Optional<Integer> quiz7 = Optional.ofNullable(
                transactions1.stream().map(transaction -> transaction.getValue())
                        .reduce(0, ((integer, integer2) -> Integer.max(integer, integer2))));
        System.out.println("Optional최대값 : " + quiz7.toString().replaceAll("[^0-9]", "")); */

    }
}
/*
 * map은 Java 스트림에서 요소를 변환하거나 매핑하는 데 사용되는 중요한 연산자 중 하나입니다. map 연산자는 스트림 내의 각 요소를
 * 새로운 값으로 변환하거나 특정 함수 또는 매핑 작업을 적용하는 데 사용됩니다. 다음은 map을 사용하는 일반적인 상황과 용도입니다:
 * 
 * 요소 변환: 스트림 내의 요소를 다른 형태로 변환할 때 map을 사용합니다. 예를 들어, 숫자 리스트에서 각 숫자를 제곱하는 경우:
 * 
 * java
 * Copy code
 * List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
 * List<Integer> squaredNumbers = numbers.stream()
 * 
 * .map(n -> n * n)
 * .collect(Collectors.toList());
 * 
 * 특정 속성 추출: 객체 목록에서 특정 속성을 추출하여 새로운 목록을 생성할 때 map을 사용합니다. 이는 객체에서 원하는 정보를 추출할 때
 * 유용합니다.
 * 
 * java
 * Copy code
 * List<Person> people = ... // 어떤 객체 목록
 * List<String> names = people.stream()
 * .map(Person::getName) // Person 객체에서 이름 추출
 * .collect(Collectors.toList());
 * 객체 변환: 객체를 다른 형식으로 변환하거나 특정 필드를 업데이트할 때 map을 사용합니다. 예를 들어, 날짜를 포맷팅하거나 필드를
 * 수정하는 경우:
 * 
 * java
 * Copy code
 * List<Event> events = ... // 어떤 이벤트 목록
 * List<String> eventNames = events.stream()
 * .map(event -> {
 * event.setDescription(event.getDescription().toUpperCase()); // 설명을 대문자로 변경
 * return event;
 * })
 * .map(Event::getName) // Event 객체를 이름 문자열로 변환
 * .collect(Collectors.toList());
 * Optional 값을 추출: map은 Optional 객체 내에서 값을 추출할 때도 사용됩니다. 이것은 Optional을 통해 안전하게
 * 값에 접근하는 데 도움이 됩니다.
 * 
 * java
 * Copy code
 * Optional<String> optionalValue = ... // 어떤 Optional
 * Optional<Integer> mappedValue = optionalValue.map(Integer::parseInt);
 * 스트림 평면화: map은 스트림의 요소를 다른 스트림으로 매핑하는 데 사용되며, 이를 통해 스트림을 평면화할 수 있습니다. 이것은 스트림의
 * 중첩 구조를 해제하거나 평탄화할 때 유용합니다.
 * 
 * java
 * Copy code
 * List<List<Integer>> nestedLists = ... // 중첩 리스트
 * List<Integer> flatList = nestedLists.stream()
 * .flatMap(List::stream) // 중첩 리스트를 평탄화
 * .collect(Collectors.toList());
 * map은 스트림 파이프라인에서 유용한 연산자 중 하나이며, 데이터 변환 및 가공을 위해 많은 상황에서 활용됩니다.
 */