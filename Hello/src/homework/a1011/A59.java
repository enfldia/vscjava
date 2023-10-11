package homework.a1011;

import java.util.Arrays;
import java.util.Scanner;

public class A59 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // int[] lotto = {13,23,24,36,40,45};
        int[] lotto = {1,2,3,4,5,6};
        int bonusNum = 7;
        int[] num = new int[6];
        int counter = 0;
        int bonus = 0;
        int[] xNum = new int[6];
        int BN = 0;
        for(int i=0;i<6;i++){
            num[i]= sc.nextInt();
            for(int j=0;j<lotto.length;j++){
                if(num[i]==lotto[j]){
                    xNum[counter] = num[i];
                    counter ++;
                }
            }
            if(num[i]==bonusNum){
                BN = num[i];
                bonus++;
            }
        }
        
        System.out.print("당첨된 번호:");
        Arrays.sort(xNum);
        for(int i=0;i<xNum.length;i++){
            if(xNum[i] == 0){
                continue;
            }
            System.out.print(" " + xNum[i]);
        }
        if(bonus == 1){
            System.out.print(" 보너스 번호: " + BN);
        }

        System.out.println();
        while(true){
            if(counter==3){
                System.out.println("5등입니다.");
                break;
            }else if(counter==4){
                System.out.println("4등입니다.");
                break;
            }else if(counter==5){
                if(bonus==1){
                    System.out.println("2등입니다.");
                    break;    
                }
                System.out.println("3등입니다.");
                break;
            }else if(counter==6){
                System.out.println("1등입니다.");
                break;
            }else{
                System.out.println("꽝입니다.");
            }
        }
        
    }
}
