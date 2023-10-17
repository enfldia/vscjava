package homework.a1017;

import java.util.Scanner;

public class A66 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("기준이 되는 정수를 입력하세요.");
        int limite = sc.nextInt();
        int sum = 0;
        // for(int i=1;;i++){
        //     sum +=i;
        //     if(sum>=limite)break;
        // }

        int i= 1;
        while(true){
            sum +=i;
            System.out.print(i+" + ");
            i++;
            if(sum>=limite)break;
        }
        System.out.println();
        System.out.println(sum);
    }
}
