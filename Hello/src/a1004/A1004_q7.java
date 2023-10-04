package a1004;

import java.util.Scanner;

public class A1004_q7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean in = true;
        int money = 0;
        int total = 0;
        
        while (in) {
            System.out.println("----------------------------------");
            System.out.println("1.예금 | 2.출금 | 3.잔고 | 4. 종료");
            System.out.println("----------------------------------");
            System.out.println("선택");

            String strNum = scanner.nextLine();
            if (strNum.equals("1")) {
                System.out.println("금액을 입력하세요.");
                money = Integer.parseInt(scanner.nextLine());
                // money = scanner.nextInt(); 로 작성했더니 맨위의 메뉴 출력이 두번 나오는 현상이 생김.
                //강사님의 말로는 nextInt와 nextLien과 두개가 충돌이 일어나서 일어난다함.
                
                total += money;
                System.out.println("입금:" + money);
                System.out.println("예금액:" + total);
            } else if (strNum.equals("2")) {
                System.out.println("금액을 입력하세요.");
                money = Integer.parseInt(scanner.nextLine());
                
                total -= money;
                System.out.println("출금액:" + money);
                System.out.println("예금액:" + total);
            } else if (strNum.equals("3")) {
                System.out.println("금액을 입력하세요.");
                System.out.println("예금액:" + total);
            } else if (strNum.equals("4")) {
                in = false;
            }
        }
        System.out.println("프로그램 종료."); 
        scanner.close();
    }
}
