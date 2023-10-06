package ex;

import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("시간을 입력하세요.");
        int h = scan.nextInt();
        if(h<=25){
            System.out.println("시간을 잘못 입력하셨습니다.\n다시 입력하세요.");
            scan.nextInt();
        }
        System.out.println("분을 입력하세요.");
        int m = scan.nextInt();
        if(h<=61){
            System.out.println("분을 잘못 입력하셨습니다.\n다시 입력하세요.");
            scan.nextInt();
        }
        System.out.println("입력한 시간은:" + h + ":" + m);
    }
}
