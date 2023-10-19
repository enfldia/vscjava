package exam2;

public class Member {
    public String name;
    public int age;

    public Member(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // hashCode 재정의
    @Override
    public int hashCode() {
        return name.hashCode() + age;
    }

    @Override
    public boolean equals(Object obj) {
        // if(obj instanceof Member target){ //자바 17에서 사용 가능
        if (obj instanceof Member) {
            Member target = (Member) obj;
            return target.name.equals(name) && (target.age == age);
        } else {
            return false;
        }
    }
}