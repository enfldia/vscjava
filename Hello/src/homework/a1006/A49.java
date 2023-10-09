package homework.a1006;

import java.util.Scanner;

public class A49 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("원하는 시간을 입력하세요.");
        int h = sc.nextInt();
        for (;;) {
            if (h < 24) {
                break;
            } else {
                System.out.println("0~23시 사이의 시간을 입력하세요.");
                h = sc.nextInt();
            }
        }
        System.out.println("원하는 분을 입력하세요.");
        int m = sc.nextInt();
        for (;;) {
            if (m < 60) {
                break;
            } else {
                System.out.println("0~59분 사이의 분을 입력하세요.");
                m = sc.nextInt();
            }
        }
        System.out.println("입력한 시간은" + h + "시 " + m + "분 입니다.");
        int m2 = m - 30;
        if (m2 < 0) {
            m2 = m2 + 60;
            h = h - 1;
        }
        System.out.println("입력한 시간의 30분 전 시간은 " + h + "시 " + m2 + "분 입니다.");
    }
}
