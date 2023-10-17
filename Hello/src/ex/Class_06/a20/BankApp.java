package ex.Class_06.a20;

import java.util.Scanner;

public class BankApp {
    private static Account1[] accounts1Arr = new Account1[100];
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        boolean run = true;

        while (true) {
            System.out.println("----------------------------------------------");
            System.out.println("1. 계좌생성 | 2. 계좌목록 | 3. 예금 | 4. 출금 | 5. 종료");
            System.out.println("----------------------------------------------");
            System.out.println("선택 > ");

            String selectNo = sc.nextLine();

            if (selectNo == "1") {
                createAccount();
            } else if (selectNo == "2") {
                accountList();
            } else if (selectNo == "3") {
                deposit();
            } else if (selectNo == "4") {
                withdraw();
            } else if (selectNo == "5") {
                run = false;
            }
        }
        System.out.println("프로그램 종료");
    }

    // 계좌 생성하기
    private static void createAccount() {

        System.out.println("-------------");
        System.out.println("계좌 생성");
        System.out.println("-------------");

        System.out.println("계좌번호(000-000형식) : ");
        String accountNum = sc.nextLine();
        System.out.println("계좌주 : ");
        String accountOwner = sc.nextLine();
        System.out.println("초기 입금액 : ");
        int accountBal = sc.nextInt();

        Account1 newAccount1 = new Account1(accountNum, accountOwner, accountBal);

        for (int i = 0; i < accounts1Arr.length; i++) {
            if (accounts1Arr[i] == null) {
                accounts1Arr[i] = newAccount1;
                System.out.println("결과 : 계좌가 생성되었습니다.");
                break;
            }
        }
    }

    // 계좌 목록 보기
    private static void accountList() {

        System.out.println("-------------");
        System.out.println("계좌 목록");
        System.out.println("-------------");

        for (int i = 0; i < accounts1Arr.length; i++) {
            Account1 ac = accounts1Arr[i];
            if (accounts1Arr[i] != null) {
                System.out.println(ac.toString());
            }
        }
    }

    // 예금하기
    private static void deposit() {

        System.out.println("-------------");
        System.out.println("예금");
        System.out.println("-------------");

        System.out.println("계좌 번호 (000-000형식) :");
        String accountNum = sc.nextLine();
        System.out.println("예금액 : ");
        String accountBal = sc.nextLine();
        Account1 account1 = findAccount1(accountNum);

        if (account1 == null) {
            System.out.println("계좌가 존재하지 않습니다.");
            return;
        }

        account1.setBalance(account1.getBalance() + Integer.parseInt(accountBal));

    }

    // findAccount1() 메소드
    private static Account1 findAccount1(String anum) {
        Account1 account1 = null;

        for (int i = 0; i < accounts1Arr.length; i++) {
            if (accounts1Arr[i] != null) {
                String accountNum = accounts1Arr[i].getAnum();
                if (accountNum.equals(anum)) {
                    account1 = accounts1Arr[i];
                    break;
                }
            }
        }
        return account1;
    }

    // 출금하기

    private static void withdraw() {
        System.out.println("-------------");
        System.out.println("예금");
        System.out.println("-------------");

        System.out.println("계좌 번호 (000-000형식) :");
        String accountNum = sc.nextLine();
        System.out.println("예금액 : ");
        String accountBal = sc.nextLine();

        Account1 account1 = findAccount1(accountNum);

        account1.setBalance(account1.getBalance() - Integer.parseInt(accountBal));

    }
}
