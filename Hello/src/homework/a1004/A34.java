package homework.a1004;

import java.util.Scanner;

public class A34 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("숫자를 입력하세요.");
            int x = scanner.nextInt();
            if(x == 0){
                System.out.println(x);
                break;
            }
        }
        System.out.println("종료합니다.");
        scanner.close();
    }
}
