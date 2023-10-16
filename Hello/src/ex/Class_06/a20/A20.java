/* package ex.Class_06.a20;

import java.util.Scanner;

class Account {

    // 필드 생성
    // 계좌의 최소 값과 최대 값 설정
    private static final int MIN_AM = 0;
    private static final int MAX_AM = 1_000_000_000;

    // 계좌 번호,이름,금액
    public String acN;
    public String name;
    private int aM;

    // 생성자 선언
    public Account(String acN, String name, int aM) {
        this.acN = acN;
        this.name = name;
        this.aM = aM;
    }

    // 메소드 선언

    // 계좌의 잔액에 확인을 위한 getter 메소드를 getAM으로 생성
    public int getAM() {
        return aM;
    }

    // 계좌의 잔액 변경을 위해 int aM을 매개변수로 갖는 setter 메소드를 setAM(int aM) 을 생성
    public void setAM(int aM) {
        if (aM >= MIN_AM && aM <= MAX_AM) {
            this.aM = aM;
        }
    }

}

class BankApplication {

    Account[] Account = new Account[100];

    public void check() {
        for (int i = 0; i < Account.length; i++) {
            // if (Account[i].acN == "null") {
            //     break;
            // }
            System.out.println(Account[i].acN + Account[i].name + Account[i].getAM());
        }
    }
}

public class A20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankApplication ba = new BankApplication();
        while (true) {

            System.out.println("-----------------------------------");
            System.out.println("1.계좌생성|2.계좌목록|3.예금|4.출금|5.종료");
            System.out.println("-----------------------------------");
            System.out.print("선택> ");
            String x = sc.nextLine();

            switch (x) {
                case "1":
                    System.out.println("--------------");
                    System.out.println("계좌 생성");
                    System.out.println("--------------");
                    System.out.print("계좌번호: ");
                    String a = sc.nextLine();
                    System.out.print("계좌주: ");
                    String b = sc.nextLine();
                    System.out.print("초기 입금액: ");
                    String c = sc.nextLine();
                    int d = Integer.parseInt(c);
                    Account ac = new Account(a, b, d);
                    System.out.println("결과:계좌과 생성 되었습니다.");
                    break;

                case "2":
                    System.out.println("--------------");
                    System.out.println("계좌 목록");
                    System.out.println("--------------");
                    ba.check();
                    System.out.println("1");

                case "3":

            }
        }

    }
}
 */