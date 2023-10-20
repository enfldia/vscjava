package ex.collection_15.a08;

public class Student {
    public int studentNum;
    public String nama;

    public Student(int studentNum, String name) {
        this.studentNum = studentNum;
        this.nama = name;
    }

    @Override
    public int hashCode() {
        return studentNum;
        //해쉬 코드 값을 studentNum으로 리턴하게 되면
        //같은 학번을 갖고 있을 경우 중복이됨;
    }

    @Override
    public boolean equals(Object obj) { // -- 안에 최상의 타입인 Object 의 obj가 들어 있다면.

        // instanceof  참조변수가 참조하고 있는 인스턴스의 실제 타입을 알아보기 위한 연산자

        if (!(obj instanceof Student)) // obj가 Student 타입이 아니라면. 
            return false;   //false 리턴
        Student student = (Student) obj;
        if (studentNum != student.studentNum)
            return false;
        return true;
    }
}
