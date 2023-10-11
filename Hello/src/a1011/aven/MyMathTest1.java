package a1011.aven;

public class MyMathTest1 {
    public static void main(String[] args) {
        MyMath1 myMath = new MyMath1();////클래스 메소드 = static 필드 = 정적메소드 = 공용메소드 를 사용하지 않을 경우 생성자로 객체를 생성해야한다.

        System.out.println(myMath.max(1.23, 3.45));
        System.out.println(myMath.min(5.43, 3.21));
    }
}

class MyMath1 {
    double max(double a,double b){
        return (a>b) ? a : b;
    }
    double min(double a,double b){
        return (a<b) ? a : b;
    }
}