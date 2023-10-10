package homework.a1010;

import java.util.Scanner;

public class A53 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("두 실수를 입력하세요.");
        double x = sc.nextDouble();
        double y = sc.nextDouble();

        double[] num = new double[10];

        num[0] = x + y;
        num[1] = x - y;
        num[2] = x * y;
        num[3] = x / y;
        num[4] = Math.pow(x, y);
        num[5] = y + x;
        num[6] = y - x;
        num[7] = y * x;
        num[8] = y / x;
        num[9] = Math.pow(y, x);
        
        double maxnum;
        maxnum = num[0];
        for(int i=0;i<num.length;i++){
            if(maxnum<num[i]){
                maxnum = num[i];
            }
        }
        System.out.println(maxnum);
        sc.close();
    }
}
