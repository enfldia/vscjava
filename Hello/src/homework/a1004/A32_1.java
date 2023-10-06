package homework.a1004;

import java.util.Scanner;

public class A32_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("문자(A~D)를 입력하세요");
        char ch = scanner.next().charAt(0);

        switch (ch) {
            case 'A':
                System.out.println("best!!!");
                break;
            case 'B':
                System.out.println("good!!");
                break;
            case 'C':
                System.out.println("run!");
                break;
            case 'D':
                System.out.println("slowly");
                break;
            default:
            System.out.println("what?");
        }
        scanner.close();
    }
}
