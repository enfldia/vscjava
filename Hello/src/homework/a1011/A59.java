package homework.a1011;

import java.util.Arrays;
import java.util.Scanner;

public class A59 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] lotto = new int[6];
        int bonusNum = 7;
        int[] num = new int[6];
        int counter = 0;
        int bonus = 0;
        int[] xNum = new int[6];
        int BN = 0;

        System.out.println("당첨된 번호를 입력하세요.");
        for (int i = 0; i < 6; i++) {
            int x = sc.nextInt();
            if (0 < x && x < 46) {
                lotto[i] = x;
                for (int j = 0; j <= i - 1; j++) {
                    while (x == lotto[j]) {
                        System.out.println("중복된 번호를 입력했습니다.");
                        System.out.println("번호를 다시 입력해주세요.");
                        lotto[i] = sc.nextInt();
                        
                    }
                }
            } else {
                System.out.println("1~45 사의 숫자를 입력하세요.");
                x = sc.nextInt();
            }
        }

        System.out.println("구매한 번호를 입력하세요.");
        for (int i = 0; i < 6; i++) {
            int x = sc.nextInt();
            if (0 < x && x < 46) {
                num[i] = x;
                // num[i]= sc.nextLine().replaceAll("[^0-9]", "");// 설정한 범위내의 값만 받고 다른 건 공백으로.
                for (int j = 0; j <= i - 1; j++) {
                    while (x == num[j]) {
                        System.out.println("중복된 번호를 입력했습니다.");
                        System.out.println("번호를 다시 입력해주세요.");
                        num[i] = sc.nextInt();
                    }
                }
                for (int k = 0; k < lotto.length; k++) {
                    if (num[i] == lotto[k]) {
                        xNum[counter] = num[i];
                        counter++;
                    }
                }
                if (num[i] == bonusNum) {
                    BN = num[i];
                    bonus++;
                }
            } else {
                System.out.println("1~45 사의 숫자를 입력하세요.");
                x = sc.nextInt();
            }
        }

        System.out.print("당첨된 번호:");
        Arrays.sort(xNum);
        for (int i = 0; i < xNum.length; i++) {
            if (xNum[i] == 0) {
                continue;
            }
            System.out.print(" " + xNum[i]);
        }
        if (bonus == 1) {
            System.out.print(" 보너스 번호: " + BN);
        }

        System.out.println();
        while (true) {
            if (counter == 3) {
                System.out.println("5등입니다.");
                break;
            } else if (counter == 4) {
                System.out.println("4등입니다.");
                break;
            } else if (counter == 5) {
                if (bonus == 1) {
                    System.out.println("2등입니다.");
                    break;
                }
                System.out.println("3등입니다.");
                break;
            } else if (counter == 6) {
                System.out.println("1등입니다.");
                break;
            } else {
                System.out.println("낙첨되셨습니다.");
                break;
            }
        }
        sc.close();
    }
}
