package ex.generic_13;

public class A04 {

}

class Util { // how1
public static <K, V> V getValue(Pair<K, V> p, K k) { //--> 제네릭 타입 K와 V 를 갖고 V의 타입 getValue 메소드는 매개 변수로 Pair<K, V> 데이터 타입인 p와 K 데이터 타입인 k를 갖는다.
    if(p.getKey() == k) {                            //--> 만약 Pair<K, V>의 데이터 타입인 p객체의 getKey()메소드의 값이 K와 같다면 
        return p.getValue();                         //--> p 객체의 getValue()의 메소드의 값을 리턴
    } else {                                         //--> 조건과 맞지 않다면
        return null; }                               //--> null을 리턴
    }
    // how2
    /*
     * public static <P extends Pair<K, V>, K, V> V getValue(P p, K k) {
     * if(p.getKey() = = k) { return p.getValue();
     * } else { return null;
     * } }
     */
}