package homework.a1017;

import java.util.Scanner;

public class A70 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("최초 값을 입력하세요.");
        int a = sc.nextInt();
        System.out.println("곱할 숫자를 입력하세요.");
        int r = sc.nextInt();
        System.out.println("횟수를 입력하세요.");
        int n = sc.nextInt();

        for(int i = 1; i<=n;i++){
            System.out.println(a);
            if(i == n)break;
            a = a*r;
        }
    }
}
