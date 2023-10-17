package a_practice.a15;

import java.util.Scanner;

import ex.Class_06.a15.MemberService;

public class MemberServiceExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MemberService memberService = new MemberService();

        System.out.println("ID를 입력하세요.");
        String id = sc.nextLine();
        System.out.println("PASSWARD를 입력하세요.");
        String passward = sc.nextLine();

        boolean result = memberService.login(id, passward);

        if(result){
            System.out.println("로그인 되었습니다.");
            memberService.logout(id);
        }else{
            System.out.println("ID와 PASSWARD를 확인하세요.");
        }
    }
}
