package a0926;

public class A0926_14 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 10;
        boolean result1 = (num1 == num2);
        boolean result2 = (num1 != num2);
        boolean result3 = (num1 <= num2);
        System.out.println("result1:" + result1);
        System.out.println("result2:" + result2);
        System.out.println("result3:" + result3);

        char char1 = 'A';
        char char2 = 'B';
        boolean result4 = (char1 < char2); //65 < 66
        System.out.println("result4" + result4);

        int num3 = 1;
        double num4 = 1.0;
        boolean result5 = (num3 == num4);
        System.out.println("result5:" + result5);

        float num5 = 0.1f;
        double num6 = 0.1; //부동 소수점
        boolean result6 = (num5 == num6);
        boolean result7 = (num5 == (float)num6); //double을 float으로 다운스케일 하면 해결
        System.out.println("result6:" + result6);
        System.out.println("result7:" + result7);

        String str1 = "자바";
        String str2 = "Java";
        String str3 = "Java";
        String str4 = new String("Java");
        String str5 = new String("Java");
        String str6 = str5;

        boolean result8 = (str1.equals(str2));
        //equals는 문자열을 비교하는 메서드이다.
        boolean result9 = (! str1.equals(str2));
        System.out.println("result8:" + result8);
        System.out.println("result9:" + result9);
        boolean result10 = (str2.equals(str3));
        System.out.println("result10:" + result10);
        boolean result11 = (str2 ==str3);
        System.out.println("result11:" + result11);
        boolean result12 = (str3 ==str4);
        System.out.println("result12:" + result12);
        //new String으로 변수를 생성할 경우 값 자체가 담기는게 아닌 값이 저장된 위치값을 나타내기 때문에  == 으로 비교하면 안된다.
        boolean result13 = (str3.equals(str4));
        System.out.println("result13:" + result13);
        //equals는 new로 새로 지정한 값이 담긴 위치값을 읽어 해당 위치에 담긴 값으로 비교한다.
        boolean result14 = (str4 ==str5);
        System.out.println("result14:" + result14);
        boolean result15 = (str4.equals(str5));
        System.out.println("result15:" + result15);
        boolean result16 = (str5 == str6);
        System.out.println("result16:" + result16);
    }
}
