package ex;

import java.util.Scanner;

public class Ex28 {
    public static void main(String[] args) {
        //세 정수를 입력했을때 짝수만 출력.
        Scanner scan = new Scanner(System.in);
        System.out.println("정수를 입력하세요.");
        int a = scan.nextInt();
        System.out.println("정수를 입력하세요.");
        int b = scan.nextInt();
        System.out.println("정수를 입력하세요.");
        int c = scan.nextInt();
        if(a%2 ==0){
            System.out.println(a);
        }
        if(b%2 ==0){
            System.out.println(b);
        }
        if(c%2 ==0){
            System.out.println(c);
        }
        scan.close();
    }
}
