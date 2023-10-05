package homework;

import java.util.Scanner;

public class A40 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("점수를 입력하세요.");
        float score = scanner.nextFloat();
        if(50<=score && score<=60){
            System.out.println("win");
        }else{
            System.out.println("loes");
        }
    }
}
