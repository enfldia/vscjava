package homework.a1004;

import java.util.Scanner;

public class A36 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("첫번째 주사위 눈의 갯수를 입력하세요.");
        int n = scanner.nextInt();
        while (true) {
            if ((n == 1) | (n <= 10)) {
                break;
            } else {
                System.out.println("10이하의 자연수를 입력하세요.");
                n = scanner.nextInt();
            }
        }
        System.out.println("두번째 주사위 눈의 갯수를 입력하세요.");
        int m = scanner.nextInt();
        while (true) {
            if ((m == 1) | (m <= 10)) {
                break;
            } else {
                System.out.println("10이하의 자연수를 입력하세요.");
                m = scanner.nextInt();
            }
        }
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= m; j++) {
                System.out.println("(" + i + "," + j + ")");
            }
        }
        scanner.close();
    }
}
