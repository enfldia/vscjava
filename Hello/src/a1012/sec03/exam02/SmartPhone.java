package a1012.sec03.exam02;

public class SmartPhone extends Phone {
    //자식 생성자 선언
    public SmartPhone(String model,String color){
    super(model,color);//부모 클래스가 매개변수를 갖는 생성자일 경우 super를 반드시 작성해야한다.
                       //이 코드는 매개삽의 타입과 개수가 일치하는 부모 생성자를 호출한다.
    System.out.println("SmartPhone(String model,String color) 생성자 실행됨");
    }
    }

