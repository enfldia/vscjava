package a1004;

import java.util.Scanner;

public class A1004_q7_1 {
    public static void main(String[] args) {
        boolean run = true;
        int money = 0;
        Scanner scanner = new Scanner(System.in);
        
        
        while (run) {
            System.out.println("----------------------------------");
            System.out.println("1.예금 | 2.출금 | 3.잔고 | 4. 종료");
            System.out.println("----------------------------------");
            System.out.println("선택");

            int menuNum = Integer.parseInt(scanner.nextLine());

            switch(menuNum){
                case 1:
                System.out.println("예금액>");
                money += Integer.parseInt(scanner.nextLine());
                break;
                case 2:
                System.out.println("출금액>");
                money -= Integer.parseInt(scanner.nextLine());
                break;
                case 3:
                System.out.println("잔고>");
                System.out.println(money);
                break;
                case 4:
                run = false;
                break;
            }
            System.out.println();
        }
        System.out.println("프로그램 종료."); 
        scanner.close();
    }
}
