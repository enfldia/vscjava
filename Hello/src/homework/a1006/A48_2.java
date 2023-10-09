package homework.a1006;

import java.util.Calendar;
import java.util.Scanner;

public class A48_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // calendar 유틸 임폴트
        Calendar cal = Calendar.getInstance();
        // 현재 연도 얻기
        int currantYear = cal.get(Calendar.YEAR);
        int currantMonth = cal.get(Calendar.MONTH) + 1;
        int currantDay = cal.get(Calendar.DATE);
        System.out.println(currantYear);
        System.out.println(currantMonth);
        System.out.println(currantDay);
        System.out.println("주민번호 앞 6자리+ 뒷 1자리를 입력하세요.");
        int birthNum = sc.nextInt();

        // System.out.println(str.charAt(0));
        // System.out.println(str.charAt(1));

        while (true) {
            
            int year = birthNum/100000;
            int month = birthNum/1000%100;
            int day = birthNum/10%100;
            int gNum = birthNum%10;

            int age;
            int birth = 0;
            System.out.println(year);
            System.out.println(month);
            System.out.println(day);
            System.out.println(gNum);

            if(month>=currantMonth && day>currantDay){
                birth = 1;
            }

            if (gNum == 1) {
                age = currantYear - (year + 1900);
                System.out.println("현재 나이는 " + (age-birth) + "살 입니다.");
                System.out.println("남성입니다.");
                break;
            } else if (gNum == 2) {
                age = currantYear - (year + 1900);
                System.out.println("현재 나이는 " +(age-birth)+ "살 입니다.");
                System.out.println("여성입니다.");
                break;
            } else if (gNum == 3) {
                age = currantYear - (year + 2000);
                System.out.println("현재 나이는 " + (age-birth) + "살 입니다.");
                System.out.println("남성입니다.");
                break;
            } else if (gNum == 4) {
                age = currantYear - (year + 2000);
                System.out.println("현재 나이는 " + (age-birth) + "살 입니다.");
                System.out.println("여성입니다.");
                break;
            } else {
                System.out.println("주민번호 뒷자리 번호를 잘못 입력하셨습니다.");
                birthNum = sc.nextInt();
            }
        }
        sc.close();
    }
}
