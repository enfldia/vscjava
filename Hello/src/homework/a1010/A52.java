package homework.a1010;

import java.util.Scanner;

public class A52 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x;
        while (true) {
            x = sc.nextInt();
            if (1 <= x && x < 100) {
                break;
            }
            System.out.println("1~99 사이의 숫자를 입력하세요.");
        }

        if (10 < x && x < 20) {
            System.out.println(x + "th");
        } else if (x % 10 == 1) {
            System.out.println(x + "st");
        } else if (x % 10 == 2) {
            System.out.println(x + "nd");
        } else if (x % 10 == 3) {
            System.out.println(x + "rd");
        } else {
            System.out.println(x + "th");
        }

        sc.close();
    }
}
