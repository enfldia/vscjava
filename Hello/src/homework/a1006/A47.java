package homework.a1006;

import java.util.Scanner;

public class A47 {
    public static void main(String[] args) {
        System.out.println("연도를 입력하세요.");
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        if(x%4 == 0){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
        // if((x%4==0&&x%100!=0)) {
        //     System.out.println("윤년(1번 조건)");
		// }else if(x%400==0){
        //     System.out.println("윤년(2번 조건)");
		// }else {
        //     System.out.println("윤년 아님");
		// }
        sc.close();
    }
}
