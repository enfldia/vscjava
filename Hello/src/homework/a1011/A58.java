package homework.a1011;

import java.util.Scanner;

public class A58 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("삼각형이 될 수 있는지 확인합니다.");
        System.out.println("세 변의 길이를 차례대로 입력하세요.(단 세번째로 입력되는 길이가 가장 긴 길이입니다.)");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c;
        
        while(true){
        c = sc.nextInt();
        if(c>=a | c>=b){
            break;
        }
        System.out.println("c는 a와 b보다 짧을 수 없습니다..");
        System.out.println("c의 길이를 다시 입력하세요.");
        }

        if(c<(a+b)){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
        
    }
}
