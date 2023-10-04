package homework.a1004;

import java.util.Scanner;

public class A33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("월을 입력하세요.");
        int month = scanner.nextInt();
        switch(month){
            case 12:
            case 1:
            case 2:
            System.out.println("winter");
            break;

            case 3:
            case 4:
            case 5:
            System.out.println("spring");
            break;

            case 6:
            case 7:
            case 8:
            System.out.println("summer");
            break;

            case 9:
            case 10:
            case 11:
            System.out.println("fall");
        }
        scanner.close();
    }
}
