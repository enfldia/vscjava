package a1024.stream_Example;
/* 문제 3: 사람 목록에서 나이가 가장 어린 사람 찾기
List<Person> people = Arrays.asList(
    new Person("Alice", 25),
    new Person("Bob", 30),
    new Person("Charlie", 22)
); */

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


public class Aex03 {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Alice", 25),
                new Person("Bob", 30),
                new Person("Charlie", 22));

        List<Integer> age = people.stream()
                .map(a -> a.getAge())
                .sorted()
                .collect(Collectors.toList());
                System.out.println(age);
        
        Optional<Person> youngestPerson = people.stream()
        .min(Comparator.comparing(Person::getAge));
        
        /* 
        String youngestName = youngestPerson.map(Person::getName).orElse("No youngest person found");
        System.out.println("Youngest person: " + youngestName); 
        */
        
        youngestPerson.ifPresent(Person -> System.out.println("가장 어린 친구는 "+Person.getname()));
        

        /* 
        Person youngestPerson = null;
        for (Person person : people) {
            if (youngestPerson == null || person.getAge() < youngestPerson.getAge()) {
                youngestPerson = person;
            }
        }

        if (youngestPerson != null) {
            System.out.println("Youngest person: " + youngestPerson.getName());
        } else {
            System.out.println("No youngest person found");
        } 
        */

    }
}

class Person{
    String name;
    int age;
    String gender;

    public Person(String name,Integer age,String gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public  String getName(){
        return name;
    }
    public  int getAge(){
        return age;
    }
    public  String getGender(){
        return gender;
    }
}
