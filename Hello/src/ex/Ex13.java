package ex;

import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        //입력한 실수를 소수점 이하 3째 자리에서 반올림 하여 2째 자리까지 출력한다.
        //입력 예시 
        //1.59254
        //출력 예시
        //1.59
        Scanner scan = new Scanner(System.in);
        float num = scan.nextFloat();
        num =(num + 0.005f)*100;
        // System.out.printf("%.2f", num);//소숫점 2째 자리까지 출력
        System.out.println(num);
        int i = (int)num;
        System.out.println(i);
        num = (float) i /100;
        System.out.println(num);
        scan.close();
    }
}
