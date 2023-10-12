package homework.a1012;

import java.util.Scanner;

public class A62 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int gradeN = 0;
        int classN = 0;
        int sNumber = 0;
        
        System.out.println("학년을 입력하세요.");
        
        while(true){
            gradeN = sc.nextInt();
            if(0<gradeN && gradeN<4){
                break;
            }
            System.out.println("1~3 사이의 숫자를 입력하세요.");
        }
        
        System.out.println("반을 입력하세요.");
        while(true){
            classN = sc.nextInt();
            if(0<classN && classN<21){
                break;
            }
            System.out.println("1~20 사이의 숫자를 입력하세요.");
        }
        System.out.println("번호을 입력하세요.");
        while(true){
            sNumber = sc.nextInt();
            if(0<sNumber && sNumber<1000){
                break;
            }
            System.out.println("1~999 사이의 숫자를 입력하세요.");
        }
        System.out.printf("학번은 %d%02d%03d",gradeN,classN,sNumber);


    }
}
