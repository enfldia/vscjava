package homework.a1011;

import java.util.Scanner;

public class A60 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] TH = new int[3];
        String[] TN = {"a", "b", "c"}; 
        for(int i=0;i<TN.length;i++){
            System.out.println(TN[i] + "터널 높이를 입력하세요.");
            TH[i] = sc.nextInt();
            if(TH[i]<170){
                System.out.println(TN[i] + "터널에서 CRASH");
                break;
            }
            System.out.println(TN[i] + "터널 PASS");
            System.out.println();
        }
    }
}
