package homework.a1004;

import java.util.Scanner;

public class A34_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for(;;){ //for문 안에 초기식,조건식,증감식 대신 ;;를 쓰면 무한으로 작동한다.
            System.out.println("숫자를 입력하세요.");
            int x = scanner.nextInt();
            if(x == 0){
                break;
            }
            scanner.close();
        }
        System.out.println("종료합니다.");
    }
}
