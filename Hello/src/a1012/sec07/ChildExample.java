package a1012.sec07;

public class ChildExample {
    public static void main(String[] args) {
        //객체 생성 및 자동 타입 변환
        Parent parent = new Child(); //Child를 Parent로 형변환(부모화)

        //Parent 타입으로 필드와 메소드 사용
        parent.field1 =  "data1";
        parent.method1();
        parent.method2();
        /* 
        parent.field2 = "data2";//불가능 //부모로 형변환 했기 때문에 자식의 필드와 메소드를 쓸 수 없다.
        parent.method3();//불가능   //부모로 형변환 했기 때문에 자식의 필드와 메소드를 쓸 수 없다.
         */

         //강제 타입 변환 
        Child child = (Child)parent;//부모를 자식으로 형변환(자식화=다운스케일링)

        //Child 타입으로 필드와 메소드 사용
        child.field2 = "data";
        child.method3();
    }
}//이것이 자바다. 312p
