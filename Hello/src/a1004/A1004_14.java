package a1004;

import java.util.Scanner;

public class A1004_14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("값을 입력하세요.");
        int x = scanner.nextInt();
        if(x%2 == 0){
            System.out.println("입력 받은 값은 짝수입니다.");
        }else {
            System.out.println("입력 받은 값은 홀수입니다.");
        }
        scanner.close();
        
    }
}
