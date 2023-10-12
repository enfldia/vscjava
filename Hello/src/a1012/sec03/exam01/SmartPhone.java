package a1012.sec03.exam01;

public class SmartPhone extends Phone {
    //자식 생성자 선언
    public SmartPhone(String model,String color){
        super();//슈퍼는 컴파일 과정에서 자동으로 추가되며 부모 클래스가 기본 생성자를 가지고 있을 경우 생략 가능하다.
        this.model = model;
        this.color = color;
        System.out.println("SmartPhone(String model,String color) 생성자 실행됨");
    }
    }

