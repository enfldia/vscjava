package a1024.stream_Example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//사람 목록에서 특정 조건을 만족하는 사람 수 구하기(여성)
public class Aex05 {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Alice", 25,"여성"),
                new Person("Bob", 30,"남성"),
                new Person("Charlie", 22,"여성"));
                
        long famaleCount = people.stream()
        .filter(Person -> "여성".equals(Person.getGender()))
        .count();

        //문제 나이가 25 이상인 사람을 필터링하여 새로운 리스트에 저장 후 출력
        List<Person> filterPeople = people.stream()
            .filter(Person -> Person.getAge()>=25)
            .collect(Collectors.toList());

        for(Person person : filterPeople){
            System.out.println("name: "+ person.getName() + ", age: " +person.getAge());
        }
        
        filterPeople.forEach(person->{
            System.out.println("name: "+ person.getName() + ", age: " +person.getAge());
        });
    }
}
