package homework.a1017;

import java.util.Scanner;

public class A67 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        
        // while(num != 0){
        //     System.out.println(num);
        //     --num;
        // }

        for(int i=0;;i++){
            System.out.println(num);
            --num;
            if(num==0)break;
        }
    }
}
