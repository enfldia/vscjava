package ex.generic_13;

public class A02 {
    
}
class Container<T>{             //T라는 데이터 타입을 갖는 제네릭 클래스 선언
    private T a;                //T타입을 갖는 a라는 필드 선언

    public T get() {            //T데이터 타입을 갖는 get() 제네릭 메소드 선언
        return a;               //필드 a 값을 리턴
    }

    public void set(T a) {      //T데이터 값을 갖는 a를 매개변수로 갖는 set메소드 선언
        this.a = a;             //필드의 a 에 매개변수 a 값을 대입
    }
}
