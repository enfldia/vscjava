package homework.a1018;

import java.util.Scanner;

public class A71 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("몇개의 숫자를 생성할까요?");

        int x = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < x; i++) {
            int y = (int)(Math.random()*9)+2;
            //(int)(Math.random()*최대값-최소값+1)+최소 값;
            System.out.print(y + " ");
            sum += y;
        }
        System.out.println("(2~10)의 랜덤 수"+ x + "개의 합은 "+sum);
    }

}

/*         public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        int sum = 0;
        System.out.println("계산기 n개의 숫자를 입력해 더합니다. 0을 입력하면 종료합니다.");
        System.out.println("==============================================");
        
        while(true){
            System.out.print("더할 숫자를 입력하세요>");
            int num = scan.nextInt();
            
            sum += num;
            
            
            if(num==0) {
                System.out.println("시스템을 종료합니다.");
                break;
            }
        }
        
            System.out.println("====================");
            System.out.println("지금까지 숫자의 합은? "+sum);
    }
 */