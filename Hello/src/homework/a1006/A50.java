package homework.a1006;

import java.util.Scanner;

public class A50 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("체중을 입력하세요");
        int w = sc.nextInt();
        System.out.println("키를 입력하세요");
        int h = sc.nextInt();
        double h2 = (double)h/100; //int를 int로 나면 int 값이 나오는 특징이 있다. float과 double의 값을 얻으려면 형을 변환시키며 계산해야한다.
        // System.out.println(h2);
        int x = 2;
        double h2Pow = Math.pow(h2, x);
        // System.out.println(h2Pow);
        double bmi = w /h2Pow;
        // System.out.println(bmi);
        bmi = Math.floor(bmi*100)/100; //소숫점 2번째 자리까지 표현하기 위해 10의 2제곱(100)을 곱하고,나누었다.
        //예로 값이 1.23456 이라면 곱하기 100으로 123.456되고,소숫점 값이 버려지고 123.0된다.마지막으로 100으로 나누게되면 값은 1.23이된다.
        // 소숫점 첫째 자리 버림.소숫점 n번째 까지 표현하고 싶으면 10의 n 제곱으로 곱하고/10의 n제곱으로 나누면 된다.
        System.out.println(bmi);
        if(bmi<18.5){
            System.out.println("저체중입니다.");
        }else if(bmi>=18.5 && bmi<=23){
            System.out.println("정상 체중입니다.");
        }else if(bmi>23){
            System.out.println("과체중입니다.");
        }
        sc.close();
    }
}
