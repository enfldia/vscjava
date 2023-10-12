package homework.a1012;

import java.util.Scanner;

public class A63 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("일을 입력하세요.");
        int d = sc.nextInt();
        
        int t = 24*d;

        System.out.println("입력한 "+d+"일은 "+ t + "시간입니다.");

    }
}
