package homework.a1004;

import java.util.Scanner;

public class A37 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("사각형의 변의 길이를 입력하세요.");
        int n = scanner.nextInt();

        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print("*");
                if(j==n){
                    System.out.println();
                }
            }
        }
        scanner.close();
    }
}
