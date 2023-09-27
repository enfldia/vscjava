package a0927;

import java.util.InputMismatchException;
import java.util.Scanner;

public class A0927_7{
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        try{
        //사용자에게 메세지를 출력해서 점수 입력 받기.
        System.out.print("점수를 입력하세요.");
        String score = scanner.nextLine();
        int score1 = Integer.parseInt(score);

        if(score1 >= 90 ){
            System.out.println("점수가 90보다 큽니다.");
            System.out.println("등급은 A 입니다.");
        }else if(score1 >= 80 ){
            System.out.println("점수가 80보다 큽니다.");
            System.out.println("등급은 B 입니다.");
        }else if(score1 >= 70 ){
            System.out.println("점수가 70보다 큽니다.");
            System.out.println("등급은 C 입니다.");
        }else {
            System.out.println("점수가 70미만 입니다.");
            System.out.println("등급은 D 입니다.");
        }
        
        // 입력 받은 점수에 따라 학점계산
        char grade;
        if(score1 >=90){
            grade = 'A';
        }else if (score1>=80){
            grade = 'B';
        }else if (score1>=70){
            grade = 'C';
        }else if (score1>=60){
            grade = 'D';
        }else {
            grade = 'F';
        }
        
        //학점 출력 
        System.out.println("학점:" + grade);
        
        //스케너 닫기
        // scanner.close();
    }catch(InputMismatchException e){
        System.out.println("올바른 숫자를 입력하세요.");
    }finally{
        scanner.close();
    }
    }
}
