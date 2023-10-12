package a1012.sec03.exam02;

public class SmartPhoneExample {
    public static void main(String[] args) {
       //SmartPhone 객체 생성
        SmartPhone myPhone = new SmartPhone("갤럭시", "은색");

        //Phone으로 부터 상속 받은 필드 읽
        System.out.println("모델"+myPhone.model);
        System.out.println("color"+myPhone.color);
}//이것이 자바다.291p
}
//부모 클래스가 매개변수를 갖는 생성자일 경우 super를 반드시 작성해야한다.
//이 코드는 매개삽의 타입과 개수가 일치하는 부모 생성자를 호출한다.