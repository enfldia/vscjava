package ex.Class_06;

public class A13 {
    Member user1 = new Member("홍길동","hong");
}
class Member {
    String name;
    String id;
    String password;
    int agd;

    Member(String x,String y){
        this.name = x;
        this.id = y;
    }
}
class MemberService{
    
}