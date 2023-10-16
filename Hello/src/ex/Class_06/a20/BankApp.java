package ex.Class_06.a20;

import java.util.Scanner;

public class BankApp {
    private static Account1[] accountsArr = new Account1[100];
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        boolean run = true;

        while (true) {
            System.out.println("----------------------------------------------");
            System.out.println("1. 계좌생성 | 2. 계좌목록 | 3. 예금 | 4. 출금 | 5. 종료");
            System.out.println("----------------------------------------------");
            System.out.println("선택 > ");

            int selectNo = sc.nextInt();

            if (selectNo == 1) {
                createAccount();
            } else if (selectNo == 2) {
                accountList();
            } else if (selectNo == 3) {
                deposit();
            } else if (selectNo == 4) {
                withdraw();
            } else if (selectNo == 5) {
                run = false;
            }
        }
        System.out.println("프로그램 종료");
    }

    private static void circlePrintln01() {

        System.out.println("-------------");
        System.out.println("계좌 생성");
        System.out.println("-------------");

    }

    private static void circlePrintln02() {
        System.out.println("-------------");
        System.out.println("계좌 목록");
        System.out.println("-------------");

    }

    private static void circlePrintln03() {
        System.out.println("-------------");
        System.out.println("예금");
        System.out.println("-------------");
    }

    private static void circlePrintln04() {
        System.out.println("-------------");
        System.out.println("출금");
        System.out.println("-------------");
    }

    // 계좌 생성하기
    private static void createAccount() {
        circlePrintln01();

        System.out.println("계좌번호(000-000형식) : ");
        String accountNum = sc.next();
        System.out.println("계좌주 : ");
        String accountOwner = sc.next();
        System.out.println("초기 입금액 : ");
        int accountBal = sc.nextInt();

        Account1 newAccount = new Account1(accountNum, accountOwner, accountBal);

        for (int i = 0; i < accountsArr.length; i++) {
            if (accountsArr[i] == null) {
                accountsArr[i] = newAccount;
                System.out.println("결과 : 계좌가 생성되었습니다.");
                break;
            }
        }
    }


    //계좌 목록 보기
    private static void accountList(){
        circlePrintln02();

        for(int i=0;i<accountsArr.length;i++){
            Account ac = accountsArr[i]; 
            if(accountsArr[i]==null){
                System.out.println(account.toString());
            }
        }
    }
}
