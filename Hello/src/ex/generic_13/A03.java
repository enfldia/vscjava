package ex.generic_13;

public class A03 {

}

/* class Container<K, V> {
    private K key;
    private V value;

    public K getKey() {
        return this.key;
    }

    public V getValue() {
        return this.value;
    }

    public void set(K key, V value) {
        this.key = key;
        this.value = value;
    }
} */

class Container <A, B>{                 //-->A와 B를 제네릭 타입으로 같는 COntainer  클레스 선언
    private A key;                      // 객체 내부의 제한 범위를 갖는 private 접근 제한자로 A데이터 타입의 파라미터는 갖는 제네릭 타입 key라는 필드 선언
    private B value;                    // 객체 내부의 제한 범위를 갖는 private 접근 제한자로 B데이터 타입의 파라미터를 갖는 제네릭 타입 value라는 필드 선언
    
    public A getKey(){                  //제한 범위가 없는 public 접근 제한자로 A데이터 타입의 파라미터를 갖는 제네릭 타입 getKey 메소드 선언
        return this.key;                //this.key는 필드의 key를 가르키며 그 값을 리턴한다.
    }

    public B getValue(){                //제한 범위가 없는 public 접근 제한자로 B데이터 타입의 파라미터를 갖는 제네릭 타입의 getValue 메소드 선언
        return this.value;              //this.value는 필드의 velue를 가르키며 그 값을 리턴한다.
    }
    
    public void set(A key, B value){    //제한 범위가 없는 public 접근 제한제에 값을 리턴하지 않는 void 타입에  A데이터 타입의 Key와 B데이터 타입의 value 매개변수를 갖는 set 메소드 선언
        this.key = key;                 //필드의 this.key값에 매개변수 key값을 대입
        this.value =value;              //필드의 this.value값에 매개변수 value 값을 대입
    }
}