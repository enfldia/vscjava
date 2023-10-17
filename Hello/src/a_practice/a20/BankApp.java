package a_practice.a20;

import java.util.Scanner;

public class BankApp {
    public static Account[] accArr = new Account[100];
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        boolean run = true;

        while (run) {

            // 최초 실행시 목록 출력
            System.out.println("------------------");
            System.out.println("1.계좌생성  2.계좌목록   3.예금   4.출금    5.종료");
            System.out.println("------------------");
            System.out.println("선택");

            // 메뉴 선택
            String select = sc.nextLine();

            if (Integer.parseInt(select) == 1) {
                newAcc();
            } else if (Integer.parseInt(select) == 2) {
                accList();
            } else if (Integer.parseInt(select) == 3) {
                deposit();
            } else if (Integer.parseInt(select) == 4) {
                withdraw();
            } else if (Integer.parseInt(select) == 5) {
                run = false;
            }
        }
        System.out.println("프로그램 종료");
    }

    // 계좌 생성 메소드

    private static void newAcc() {
        System.out.println("--------");
        System.out.println("계좌 생성");
        System.out.println("--------");

        System.out.print("계좌번호(000-000형식) : ");
        String accNum = sc.nextLine();
        System.out.print("계좌주 : ");
        String name = sc.nextLine();
        System.out.println("최초 입금액 : ");
        String bal = sc.nextLine();

        Account newAccount = new Account(accNum, name, Integer.parseInt(bal));

        for (int i = 0; i < accArr.length; i++) {
            if (accArr[i] == null) {
                accArr[i] = newAccount;
                System.out.println("결과 : 계좌가 생성되었습니다.");
                break;
            }
        }
    }

    // 계좌 목록 보기
    private static void accList() {
        System.out.println("-------");
        System.out.println("계좌 목록");
        System.out.println("-------");

        for (int i = 0; i < accArr.length; i++) {
            Account ac = accArr[i];
            if (accArr[i] != null) {
                System.out.println(ac.toString());
            }
        }
    }

    // 입금하기

    private static void deposit() {
        System.out.println("-------");
        System.out.println("입금하기");
        System.out.println("-------");

        System.out.print("계좌 번호 :");
        String accNum = sc.nextLine();
        System.out.println();

        Account findAccNum = findAcc(accNum);

        if (findAccNum == null) {
            System.out.println("계좌가 존재하지 않습니다.");
            return;
        }
        
        System.out.print("금액 : ");
        String Bal = sc.nextLine();
        System.out.println();


        findAccNum.setBalance(findAccNum.getBalance() + Integer.parseInt(Bal));
        System.out.println("거래 후 잔액 : " + findAccNum.getBalance());
    }

    private static Account findAcc(String accNum) {
        Account findAccNum = null;

        for (int i = 0; i < accArr.length; i++) {
            String accNumber = accArr[i].getNumber();
            if (accNumber.equals(accNum)) {
                findAccNum = accArr[i];
                break;
            }
        }
        return findAccNum;
    }

    // 입금하기

    private static void withdraw() {
        System.out.println("-------");
        System.out.println("출금하기");
        System.out.println("-------");

        System.out.print("계좌 번호 :");
        String accNum = sc.nextLine();
        System.out.println();

        Account findAccNum = findAcc(accNum);
        
        if (findAccNum == null) {
            System.out.println("계좌가 존재하지 않습니다.");
            return;
        }

        System.out.print("금액 : ");
        String Bal = sc.nextLine();
        System.out.println();
        
        findAccNum.setBalance(findAccNum.getBalance() - Integer.parseInt(Bal));
        
        System.out.println("거래 후 잔액 : " + findAccNum.getBalance());
    }
}
