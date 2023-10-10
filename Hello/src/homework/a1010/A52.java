package homework.a1010;

import java.util.Scanner;

public class A52 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x;
        while(true){
        x = sc.nextInt();
        if(1<=x && x<100){
            break;
        }
        System.out.println("1~99 사이의 숫자를 입력하세요.");
        }
        while (x > 0) {
            if (10 < x && x < 20) {
                System.out.println(x + "th");
                break;
            }
            if (x >= 10) {
                int y = x % 10;
                if (y == 1) {
                    System.out.println(x + "st");
                    break;
                } else if (y == 2) {
                    System.out.println(x + "nd");
                    break;
                } else if (y == 3) {
                    System.out.println(x + "rd");
                    break;
                } else {
                    System.out.println(x + "th");
                    break;
                }
            } else {
                if (x == 1) {
                    System.out.println(x + "st");
                    break;
                } else if (x == 2) {
                    System.out.println(x + "nd");
                    break;
                } else if (x == 3) {
                    System.out.println(x + "rd");
                    break;
                } else {
                    System.out.println(x + "th");
                    break;
                }
            }
        }
        sc.close();
    }
}
