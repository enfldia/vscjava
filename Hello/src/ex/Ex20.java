package ex;

import java.util.Scanner;

public class Ex20 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("첫 번째 숫자를 입력하세요.");
        int a = scan.nextInt();
        System.out.println("두 번째 숫자를 입력하세요.");
        int b = scan.nextInt();
        System.out.println("세 번째 숫자를 입력하세요.");
        int c = scan.nextInt();

        int sum = a + b + c;

        float avg = sum / 3;
        
        avg = (avg+0.005f)*100;
        int i = (int)avg;
        avg = (float)i/100;

        System.out.printf("평균 값은:%.2f",avg);
        scan.close();
    }
}
