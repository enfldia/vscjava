package ex;

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        //키보드를 입력한 문자 그대로 출력하는 프로그램을 작성해보자.

        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        System.out.println(str);
        scan.close();
    }
}
