package a1012.sec03.exam01;

public class SmartPhoneExample {
    public static void main(String[] args) {
       //SmartPhone 객체 생성
        SmartPhone myPhone = new SmartPhone("갤럭시", "은색");

        //Phone으로 부터 상속 받은 필드 읽
        System.out.println("모델"+myPhone.model);
        System.out.println("color"+myPhone.color);
}//이것이 자바다.291p
}//슈퍼는 컴파일 과정에서 자동으로 추가되며 부모 클래스가 기본 생성자를 가지고 있을 경우 생략 가능하다.