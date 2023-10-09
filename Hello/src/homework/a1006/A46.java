package homework.a1006;

import java.util.Scanner;

public class A46 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("세 터널의 높이를 차례대로 입력하세요.");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        int[] high;
        high = new int[]{x,y,z};
        
        for(int i=0;i<high.length;i++){
            if(high[i]>170){
                System.out.println("CRASH");
            }else{
                System.out.println("PASS");
            }
        }
        sc.close();
    }
}
