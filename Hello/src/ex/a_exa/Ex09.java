package ex.a_exa;


import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        //키보드로 입력한 실수 출력하는 프로그램을 작성해보자.
        Scanner scan = new Scanner(System.in);
        float num = scan.nextFloat();
        System.out.print(num);
        double num2 = scan.nextDouble();
        System.out.print(num2);
        scan.close();
    }
}
