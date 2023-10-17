package a_practice.a15;

public class memberService {
    String loginId = null;
    
    public boolean login(String id,String passward){
        if(id.equals("hong")&&passward.equals("12345")){
        System.out.println("로그인 되었습니다.");
        loginId = id;
        logout(id);
        return true;
        }else{
            return false;
        }
    }

    public void logout(String id){
        if(id.equals(loginId)){
            System.out.println("로그아웃 되었습니다.");
            loginId = null;
        }else{
            System.out.println("로그인한 사용자와 로그아웃 용청한 사용자가 일치하지 않습니다.");
        }
    }

}
