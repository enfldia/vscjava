package homework.a1004;

import java.util.Scanner;

public class A32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("문자(A~D)를 입력하세요");
        String value = scanner.nextLine();

        switch (value) {
            case "A":
                System.out.println("best!!!");
                break;
            case "B":
                System.out.println("good!!");
                break;
            case "C":
                System.out.println("run!");
                break;
            case "D":
                System.out.println("slowly");
                break;
            default:
            System.out.println("what?");
        }
        scanner.close();
    }
}
