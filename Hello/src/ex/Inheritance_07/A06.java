package ex.Inheritance_07;

public class A06 {
    
}
class Parent {
    public String name;

    public Parent(String name){
        this.name = name;
    }
}

class Child extends Parent{
    
    public int studentNo;
    public Child(String name,int studentNo){
        super(name);//부모 생성자를 호출해서 사용
        this.studentNo = studentNo;
    }
}