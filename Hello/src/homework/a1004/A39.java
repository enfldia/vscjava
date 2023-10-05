package homework.a1004;

import java.util.Arrays;
import java.util.Scanner;

public class A39 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("세 정수를 입력하세요.");
        
        System.out.println("첫번째 정수를 입력하세요.");
        int x = scanner.nextInt();
        
        System.out.println("두번째 정수를 입력하세요.");
        int y = scanner.nextInt();
        
        System.out.println("세번째 정수를 입력하세요.");
        int z = scanner.nextInt();
        
        int[] num = {x,y,z};

        Arrays.sort(num);

        System.out.println(num[0]);
        scanner.close();
    }
}
