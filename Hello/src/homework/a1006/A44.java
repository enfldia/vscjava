package homework.a1006;

import java.util.Calendar;

public class A44 {
    public static void main(String[] args) {
        Week today = null;
        //Week 열거 타입 변수 선언 
        
        //calendar 얻기
        Calendar cal = Calendar.getInstance();
        
        //오늘의 요일 얻기 (1~7);
        int week = cal.get(Calendar.DAY_OF_WEEK);

        //숫자를 열거 상수로 변환해서 변수에 대입
        switch(week){
            case 1: today = Week.SUNDAY; break;
            case 2: today = Week.MONDAY; break;
            case 3: today = Week.TUESDAY; break;
            case 4: today = Week.WEDNESDAY; break;
            case 5: today = Week.THURSDAY; break;
            case 6: today = Week.FRIDAY; break;
            case 7: today = Week.SATURDAY; break;
        }
        
        if(today == Week.SUNDAY | today == Week.MONDAY | today == Week.WEDNESDAY | today == Week.FRIDAY){
            System.out.println("oh my god");
        }else{
            System.out.println("enjoy");
        }
    }
    public enum Week {
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY,
        SUNDAY
    }
}
