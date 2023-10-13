package ex.Class_06.a16;

class Printer {
    public void println(int value){
        System.out.println(value);
    }
    // boolean 타입의 값을 출력하는 메서드
    public void println(boolean value){
        System.out.println(value);
    }
    //double 타입의 값을 출력하는 메서드
    public void println(double value) {
        System.out.println(value);
    }
    //double 타입의 값을 출력하는 메서드
    public void println(String value) {
        System.out.println(value);
    }
}

public class PrinterExample {
    public static void main(String[] args) {
        Printer printer = new Printer();
        printer.println(10);       // int
        printer.println(true);     // boolean
        printer.println(5.7);      // double
        printer.println("홍길동"); // String
    }
}
