package homework.a1011;

import java.util.Scanner;

public class A57 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] menu = { "치즈버거", "야채버거", "우유", "계란말이", "샐러드" };
        int[] cla = { 400, 340, 170, 100, 70 };

        System.out.println("첫 번째 메뉴를 선택하세요.");
        int x = sc.nextInt() - 1;
        System.out.println("두 번째 메뉴를 선택하세요.");
        int y = sc.nextInt() - 1;

        int totalCal = cla[x] + cla[y];

        System.out.println("선택한 메뉴는 " + menu[x] + "와 " + menu[y] + "입니다.");
        System.out.println("총 칼로리는 " + totalCal + "입니다.");
        if (totalCal > 500) {
            System.out.println("angry");
        } else {
            System.out.println("no angry");
        }
        /* Scanner scan = new Scanner(System.in);
        int cal = 0;
        System.out.println("1.치즈버거 | 2. 야채버거 | 3. 우유 | 4. 계란말이 | 5. 셀러드 |");

        for (int i = 0; i < 2; i++) {
            System.out.println("메뉴를 선택하세요>");
            int num = scan.nextInt();
            switch (num) {
                case 1:
                    int cheese = 400;
                    cal += cheese;
                    break;
                case 2:
                    int veget = 400;
                    cal += veget;
                    break;
                case 3:
                    int milk = 170;
                    cal += milk;
                    break;
                case 4:
                    int egg = 100;
                    cal += egg;
                    break;
                case 5:
                    int salad = 70;
                    cal += salad;
                    break;
            }
        }
        System.out.println("총 칼로리: " + cal);

        if (cal > 500) {
            System.out.println("Mom say : angry");
        } else {
            System.out.println("Mom say : no angry");
        }
 */
sc.close();
    }
}
