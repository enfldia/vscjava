package a_practice;

import java.util.InputMismatchException;
import java.util.Scanner;

public class A1002_1 {
    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);
        
        boolean validInput = false;

        int  score = 0;
        while(!validInput){
            try {
                System.out.println("점수를 입력하세요.");
                score = scanner.nextInt();
                validInput = true;
            } catch (InputMismatchException e){
                System.out.println("올바른 숫자를 입력하세요.");
                scanner.nextLine();
            }
        }
        
        if (score >= 90){
            System.out.println("점수가 90보다 큽니다.");
        }else if (score >=80){
            System.out.println("점수가 80보다 큽니다.");
        }else if (score >=70){
            System.out.println("점수가 70보다 큽니다.");
        }else {
            System.out.println("점수가 70미만 입니다.");
        }

        char grade;
        if(score>=90){
            grade = 'A';
        }else if (score>=80){
            grade = 'B';
        } else if (score >=70){
            grade = 'C';
        }else {
            grade = 'D';
        }
        
        System.out.println("학점 :" + grade);
        
        scanner.close();
    }
}
