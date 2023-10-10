package homework.a1010;

import java.util.Scanner;

public class A54 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b =sc.nextInt();

        if(b%a==0){
            System.out.println("a*x=b");
        }else if(a%b==0){
            System.out.println("b*x=a");
        }else {
            System.out.println("none");
        }
        sc.close();
    }
}
