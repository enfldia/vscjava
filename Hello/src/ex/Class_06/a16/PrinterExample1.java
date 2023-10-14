package ex.Class_06.a16;

class Printer {
    public static void println(int value) {
        System.out.println(value);

    }
    
    // boolean 타입의 값을 출력하는 메서드
    public static void println(boolean value) {
        System.out.println(value);
    }
    //double 타입의 값을 출력하는 메서드
    public static void println(double value) {
        System.out.println(value);
    }
    //double 타입의 값을 출력하는 메서드
    public static void println(String value) {
        System.out.println(value);
    }
}

public class PrinterExample1 {
    public static void main(String[] args) {

        Printer.println(10); // int
        Printer.println(true); // boolean
        Printer.println(5.7); // double
        Printer.println("홍길동"); // String
    }
}
