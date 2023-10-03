package a0926;

public class A0926_6 {
    public static void main(String[] args) {
        int value = 123;
        System.out.printf("상품에 가격:%d원\n", value);
        //정수형 출력
        System.out.printf("상품에 가격:%6d원\n", value);
        //정수형 출력 왼쪽에 ('값'-value자릿수) 빈자리 공백
        System.out.printf("상품에 가격:%-6d원\n", value);
        //정수형 출력 오른쪽 (value자릿수- '값')빈자리
        System.out.printf("상품에 가격:%06d원\n", value);
        //정수형 출력 왼쪽 ('값'-value자릿수)빈자리 0 채움
        double area = 3.14159 * 10 * 10 ;
        System.out.printf("반지름이 %d인 원의 넓이:%10.2f\n",10,area);//값의 배열화.
        //정수부분 7 자리 소수점 1자리 소수점 이하 2자리
        String name = "홍길동";
        String job = "도적";
        System.out.printf("%6d | %-10s | %10s\n",1,name,job);
        //%d = 정수, %f = 실수, %s = 문자열, %c = 문자.
    }
}
