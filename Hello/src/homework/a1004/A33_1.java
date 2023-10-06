package homework.a1004;

import java.util.Scanner;

public class A33_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("월을 입력하세요.");
        int month = scanner.nextInt();

        if(month<3|month == 12){
            System.out.println("winter");
        }else if(month>=3&&month<6){
            System.out.println("spring");
        }else if(month>=6&&month<9){
            System.out.println("summer");
        }else if(month>=9&&month<12){
            System.out.println("Fall");
        }
        
        scanner.close();
    }
}
