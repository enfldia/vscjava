package ex.Class_06;

public class A13 {
    public static void main(String[] args) {
        
        Member user1 = new Member("홍길동","hong");
        System.out.println(user1.name);
        System.out.println(user1.id);
        System.out.println(user1.password);
        System.out.println(user1.age);

        
    }
}

class Member {
    String name;
    String id;
    String password;
    int age;

    Member(String x, String y) {
        this.name = x;
        this.id = y;
    }

}

// class MemberService extends Member{
    
//     boolean login(String id, String password) {
//         this.id = id;
//         this.password = password;
//         return true;
//     }
// }