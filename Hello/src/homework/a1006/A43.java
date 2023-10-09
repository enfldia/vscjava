package homework.a1006;

import java.util.Scanner;

public class A43 {
    public static void main(String[] args) {
        System.out.println("숫자를 한글로 읽기");
        System.out.println("요구사항 : 만이하의 정수 하나를 입력받아");
        System.out.println("만, 천, 백, 십 단위로 읽어내기");
        System.out.println("------------------------");
        System.out.println(" ");

        System.out.println("숫자를 입력해주세요");
        System.out.print(">");

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        // 스캐너로 정수형태 받기
        String output = Integer.toString(num);
        /*
         * toString() 함수 : 숫자 객체의 값을 String 객체로 변환하는 함수
         * 해당 Integer 값(num)을 String 객체로 표기
         * int 형을 그대로 .String() 해주면 에러나기때문에 Integer.toString(num)의 형태로 사용함
         */

        String[] unit = { "", "십 ", "백 ", "천 ", "만 ", "십 ", "백 ", "천 " };

        int out = output.length() - 1;

        for (int i = 0; i < output.length(); i++) {
            //// 문자열의 길이 만큼 반복문 실행
            int n = output.charAt(i) - '0';
            /*
             * 문자열에 있는 문자를 하나씩 가져와서 int형으로 변환
             * char - '0'을 이용하면 아스키코드값을 알 필요없이 int형으로 변환 가능
             * charAt() 설명 보기!
             * 기본적으로 숫자가 0부터 시작하기 때문에
             */

            if (read(n) != null) {
                // 숫자가 0일 경우는 출력하지 않음
                System.out.print(read(n));
                // 숫자를 한글로 읽어서 출력
                System.out.print(unit[out]);
                /* int out = output.length() - 1; 해주었기 때문에 길이만큼 unit의 뒤로 가 뒤에서 부터 단위 출력 */
            }
            out--;
        }
        sc.close();
        System.out.println();
    }

    public static String read(int num) {
        switch (num) {
            case 1:
                return "일";
            case 2:
                return "이";
            case 3:
                return "삼";
            case 4:
                return "사";
            case 5:
                return "오";
            case 6:
                return "육";
            case 7:
                return "칠";
            case 8:
                return "팔";
            case 9:
                return "구";
        }
        return null;
    }
}
