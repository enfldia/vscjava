package a1017.string;

public class ValueCompareExample {
    public static void main(String[] args) {
        //-127~ 127 초과값일 경우
        Integer obj1 = 300;
        Integer obj2 = 300;
        System.out.println("==."+(obj1 ==obj2));
        System.out.println("equals():" + obj1.equals(obj2));
        System.out.println();

        //-128~127 범위 값일 경우
        Integer obj3 = 10;
        Integer obj4 = 10;
        System.out.println("==:"+(obj3 == obj4));
        System.out.println("quarl:" + obj3.equals(obj4));
        
    }
}