package a1004;

import java.util.Scanner;

public class A1004_15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("구구단 계산하기.");
        System.out.println("첫번째 값을 입력하세요.");
        int x = scanner.nextInt();
        if(x>=10){
            System.out.println("9를 넘은 숫자를 입력했습니다.다시 입력해주세요.");
            x = scanner.nextInt();
        }
        System.out.println("두번째 값을 입력하세요.");
        int y = scanner.nextInt();
        if(y>=10){
            System.out.println("9를 넘은 숫자를 입력했습니다.다시 입력해주세요.");
            y = scanner.nextInt();
        }
        System.out.println(x + "-" + y + "는(은) "+ (x*y) + "입니다.");
        

        // Scanner scanner = new Scanner(System.in);
        // System.out.print("구구단을 출력할 숫자를 입력하세요: ");
        // int number = scanner.nextInt();

        // for (int i = 1; i <= 9; i++) {
        //     System.out.println(number + " x " + i + " = " + (number * i));
        // }
    }
}
