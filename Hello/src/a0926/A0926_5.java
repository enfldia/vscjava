package a0926;

public class A0926_5 {
    public static void main(String[] args) {
        int value1 = Integer.parseInt("10"); //자바의 참조변수(referrence Type)Integer의 메서드인 pardeInt 로 String 타입의 문자열을 int(정수)로 바꾼다.
        double value2 = Double.parseDouble("3.14");//Double의 메서드인 pardeDouble로 문자열을 double(실수)로 바꾼다.
        boolean value3 = Boolean.parseBoolean("true");//Boolean의 메서드인 parseBoolean로 문자열을 boolean(논리값)으로 바꾼다.

        System.out.println("value1:" + value1);
        System.out.println("value2:" + value2);
        System.out.println("value3:" + value3);

        String str1 = String.valueOf(10); 
        // 값을 String 형으로 변환할 때 사용하는 함수이다.하지만 변경하려는 값이 null값이라면 차이가 발생한다.
        // (null값을 형 변환 시 NullPointException의 발생 유무)
        // toString() : null 값을 형 변환 시 NullPointException이 발생하고,Object값이 String이 아닌 경우에도 출력한다.        
        // String.valueOf() : 파라미터가 null이면 "null"이라는 문자열을 출력한다.

        String str2 = String.valueOf(3.14);
        String str3 = String.valueOf(true);

        System.out.println("str1:" + str1);
        System.out.println("str2:" + str2);
        System.out.println("str3:" + str3);
    }
}
