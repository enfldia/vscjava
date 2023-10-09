package homework.a1006;

import java.util.Scanner;

public class A41 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("점수를 입력하세요.");
        int score = scan.nextInt();
        if(30<=score&&score<=40){
            System.out.println("win");
        }else if(60<=score&&score<=70){
            System.out.println("win");
        }else{
            System.out.println("lose");
        }
        scan.close();
    }
}
