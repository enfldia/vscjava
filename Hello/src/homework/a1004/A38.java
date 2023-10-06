package homework.a1004;

import java.util.Scanner;

public class A38 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("삼각형의 넓이를 구하는 프로그램입니다.");
        System.out.println("밑변을 입력하세요.");

        int a = scanner.nextInt();

        System.out.println("높이를 입력하세요.");

        int b = scanner.nextInt();

        // float x = ((float)a * b)/2;

        // System.out.println("삼각형의 넓이는 " + x + "입니다.");
        System.out.printf("삼각형의 넓이는 %.1f",(float)(a+b)/2);
        scanner.close();
    }
}
