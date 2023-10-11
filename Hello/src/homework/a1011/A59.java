package homework.a1011;

import java.util.Collections;
import java.util.Scanner;

public class A59 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] lotto = {13,23,24,36,40,45};
        int bonusNum = 7;
        int[] num = new int[6];
        int counter = 0;
        int bonus = 0;
        
        for(int i=0;i<6;i++){
            num[i]= sc.nextInt();
            for(int j=0;j<lotto.length;j++){
                if(num[i]==lotto[j]){
                    counter ++;
                }
            }
            if(num[i]==bonusNum){
                bonus++;
            }
        }
        while(true){
            
        }

    }
}
