package a1020.Ram.ch09sec02;

import a1014.sec10.B;

public class A {
    //인스턴스 멤버 클래스
    class B{}

    //인스턴스 필드 갑으로 B 객체 대입
    B field = new B();

    //생성자
    A(){
        B b = new B();
    }

    //인스턴스 메소드
    void method(){
        B b = new B();
    }
}
