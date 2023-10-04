package homework.a1004;

import java.util.Scanner;

public class A35 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("숫자를 입력하세요.");
        int sum = 0;
        int num = scanner.nextInt();
        for(int i=1;i<=num;i++){
            if(i%2 ==0){
                sum += i;
            }
        }
        System.out.println("1~"+ num +"까지의 짝수의 합:"+ sum);
    scanner.close();
    }

}
