package ex.a_exa;


import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        //정수 두개를 차례로 입력 받아 그래로 출력한다.
        //입력
        //두개의 정수가 차례대로 입력된다.
        //출력
        //입력 받은 두 정수를 공백으로 구분하여 그대로 출력
        //입력 예시
        //1
        //2
        //출력 예시
        //1 2
        Scanner scan = new Scanner(System.in);
        System.out.print("첫 번째 숫자를 입력 >");
        int num = scan.nextInt();
        System.out.print("두 번째 숫자를 입력 >");
        int num2 = scan.nextInt();

        System.out.println(num+" "+num2);
        scan.close();
    }
}
