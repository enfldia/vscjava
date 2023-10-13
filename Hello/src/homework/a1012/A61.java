package homework.a1012;

import java.util.Scanner;

public class A61 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("첫번째 정수를 입력하세요");
    int x = sc.nextInt();
    System.out.println("기호를 입력하세요.");
    String z = sc.next();
    System.out.println("두번째 정수를 입력하세요");
    int y = sc.nextInt();
    // double val = 0;
    double result = 0;

    switch(z){
        case "+" :
        result = x+y;
        break;
        
        case "-" :
        result = x-y;
        break;
        
        case "*" :
        result = x*y;
        break;
        
        case "/" :
        result = (double)x/y;
        // val = (double)x/y*100;
        // val = (int)val;
        // result = (double)val/100;
        break;
    }
    // System.out.println(x+z+y+"="+result);
    System.out.printf(x+z+y+"= %.2f",result);
    sc.close();
    }
}
