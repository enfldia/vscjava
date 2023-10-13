package ex.Class_06;

public class A13_1 {
    public static void main(String[] args) {

        MemberService memberService = new MemberService();
        boolean result = memberService.login("hong", "12345");
        if (result) {
            System.out.println("로그인 되었습니다.");
            memberService.logout("hong");
        } else {
            System.out.println("id 또는 password가 올바르지 않습니다.");
        }
    }
}

class MemberService {
    String id;
    String password;

    public boolean login(String id, String password) {
        this.id = id;
        this.password = password;
        if (id.equals("hong") && password.equals("12345")) {
            return true;
        } else {
            return false;
        }
    }

    public void logout(String id) {
        this.id = id;
        System.out.println(id + "님이 로그아웃 되었습니다.");
    }

}
