package a1011.aven;

public class StudentTest {
    public static void main(String[] args) {
        Student park = new Student(2019122104, "park");
        Student kim = new Student(2019122105, "kim");
        Student lee = new Student(2019122106, "lee");
        System.out.printf("Student 객체의 수 :%d",Student.count);
        
        System.out.printf("회원 아이드는 %d\t 회원이름은 %s\n",park.id,park.name);
        System.out.printf("회원 아이드는 %d\t 회원이름은 %s\n",kim.id,kim.name);
        System.out.printf("회원 아이드는 %d\t 회원이름은 %s\n",lee.id,lee.name);
    }
}

class Student{
    
    static int count = 0; //클래스 변수 = static 필드 = 정적변수 = 공용변수

    int id; //인스턴스 변수
    String name;

    Student(int _id,String _name){
        Student.count++; // 클래스 변수는 생성자를 만들지 않아도 바로 쓸 수 있다.
        id = _id;
        name = _name;
    }
}