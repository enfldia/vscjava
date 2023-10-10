package homework.a1006;

import java.util.Scanner;

public class A43_2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("한글로 변환할 수를 입력하세요.:");
        int num = sc.nextInt();

        int nums[] = new int[5];
        //12345 일만 이천 삼백 사십 오

        nums[0] = num / 10000; //만의 자리 수
        nums[1] = (num/ 1000) % 10; //천의 자리 수
        nums[2] = (num/ 100) % 10; //천의 자리 수
        nums[3] = (num/ 10) % 10; //천의 자리 수
        nums[4] = num %10; //천의 자리 수
        String sum_str= "";
        for(int i=0; i<5;i++){
            if(nums[i]==1){
                sum_str += "일";
            }else if(nums[i]==2){
                sum_str += "이";
            }else if(nums[i]==3){
                sum_str += "삼";
            }else if(nums[i]==4){
                sum_str += "사";
            }else if(nums[i]==5){
                sum_str += "오";
            }else if(nums[i]==6){
                sum_str += "육";
            }else if(nums[i]==7){
                sum_str += "칠";
            }else if(nums[i]==8){
                sum_str += "팔";
            }else if(nums[i]==9){
                sum_str += "구";
            }
            if(i==0 && nums[0]>=1){//만의 자리수에 숫자가 있다면.
                sum_str+="만";
            }
            if(i==1 && nums[1]>=1){//천의 자리수에 숫자가 있다면.
                sum_str+="천";
            }
            if(i==2 && nums[2]>=1){//백의 자리수에 숫자가 있다면.
                sum_str+="백";
            }
            if(i==3 && nums[3]>=1){//십의 자리수에 숫자가 있다면.
                sum_str+="십";
            }
        }
        sc.close();
        System.out.println(sum_str);
        
    }
}
