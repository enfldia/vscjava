package a1011.sing;

public class SingletonPersonTest1 {
    public static void main(String[] args) {
        //싱글톤 객체 얻기
        Person person = Person.getInstance();

        // 정보 설정
        person.setPertonInfo("John Doe", 30);

        //정보 표시
        person.displayPersonInfo();
    }
}

