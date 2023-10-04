package homework.a1004;

import java.util.Scanner;

public class A31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("점수를 입력하세요.");
        char grade =0;
        int score = scanner.nextInt();
        if((0>score) | (score>100)){
            System.out.println("잘못된 점수를 입력했습니다.");
            score = scanner.nextInt();
        }else {
            if(score>=90){
                grade = 'A';
            }else if(70<=score && score<90){
                grade = 'B';
            }else if(40<=score && score<70){
                grade = 'C';
            }else if(0<=score && score<40){
                grade = 'D';
            }
        }
        System.out.println("점수는:" + score + "이고 등급은:" + grade);
        scanner.close();
    }
}
