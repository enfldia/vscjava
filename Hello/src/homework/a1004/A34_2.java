package homework.a1004;

import java.util.Scanner;

public class A34_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("숫자를 입력하세요.");
        for(int i=0;i<10;i++){
            int x = scanner.nextInt();
            System.out.println(x);
            if(x == 0){
                break;
            }
        }
        System.out.println("종료합니다.");
        scanner.close();
    }
}
