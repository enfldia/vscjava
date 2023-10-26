package homework.a1026;

import java.util.ArrayList;
import java.util.Scanner;

public class DAO {
    Scanner sc = new Scanner(System.in);

    private ArrayList<StudentDTO> slist;

    // file 직접 d: 저장하려면 클래스인 fileClass 만들 예정
    private FileClass file = new FileClass("sun","studerntInfo");

    // 생성자 constructro
    public DAO(){
        slist = new ArrayList<StudentDTO>();

        //테스트용 데이터
        StudentDTO s1 = new StudentDTO(0,"테스트1",11,100,90,80);
        StudentDTO s2 = new StudentDTO(1,"테스트1",22,90,89,91);
        StudentDTO s3 = new StudentDTO(2,"테스트1",33,85,77,55);
        StudentDTO s4 = new StudentDTO(3,"테스트1",44,77,68,85);

        slist.add(s1);
        slist.add(s2);
        slist.add(s3);
        slist.add(s4);
    }

    // CRUD

    // create
    private void insert(StudentDTO s) {
        // 데이터 추가
        slist.add(s);
        // listSize++
    }

    // select
    private StudentDTO select(int index) {
        return slist.get(index);
    }

    // updata
    private void updata(int index, StudentDTO s) {
        slist.set(index, s);
    }

    // delete
    private void delete(int index) {
        slist.remove(index);
    }

    // user mathod: 사용자의 입력 값이 있음.

    // user Insert
    public void userInsert() {
        StudentDTO s = new StudentDTO();
        System.out.println("< 회원 정보 입력>");
        System.out.println("회원번호: ");
        int id = sc.nextInt();
        System.out.println("이름: ");
        String name = sc.next();
        System.out.println("나이 : ");
        int age = sc.nextInt();
        System.out.println("국어 : ");
        int kor = sc.nextInt();
        System.out.println("영어 : ");
        int eng = sc.nextInt();
        System.out.println("수학 : ");
        int math = sc.nextInt();
        

        s.setId(id);
        s.setName(name);
        s.setAge(age);
        s.setKor(kor);
        s.setEng(eng);
        s.setMath(math);
        insert(s);
    }

    // user find : 키 - 이름
    private int findIndex() {
        System.out.println("회원 이름을 입력하시오.");
        String name = sc.next();
        for (int i = 0; i < slist.size(); i++) {
            if (slist.get(i).getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }

    // user Delete
    public void userDlelete() {
        int index = findIndex();
        if (index != -1) {
            delete(index);
            System.out.println("회원을 삭제했습니다.");
        } else {
            // 이름이 없는 경우
            System.out.println("해당 회원이 없습니다.");
        }
    }

    // userSelect 맴버 값 리턴하기
    public void userSelect() {
        int index = findIndex();
        if (index != -1) { // 인덱스 있는 경우
            StudentDTO s = select(index);
            int id = s.getId();
            int age = s.getAge();
            String name = s.getName();
            int kor = s.getKor();
            int eng = s.getEng();
            int math = s.getMath();
            System.out.println("< " + name + " 의 회원정보 >");
            System.out.println("- 회원번호 : " + id);
            System.out.println("- 이름 : " + name);
            System.out.println("- 나이 : " + age);
            System.out.println("- 국어 : " + kor);
            System.out.println("- 영어 : " + eng);
            System.out.println("- 수학 : " + math);

        } else {
            System.out.println("회원이 없습니다.");
        }
    }

    // user updata
    public void userUpdate() {
        int index = findIndex();
        if (index != -1) {
            // 이름이 있는 경우
            StudentDTO s = new StudentDTO();
            s.setId(slist.get(index).getId());
            s.setName(slist.get(index).getName());
            System.out.println("< " + s.getName() + "회원 정보 수정 >");
            System.out.println("회원번호 : " + s.getId());
            System.out.println("나이 : ");
            s.setAge(sc.nextInt());
            System.out.println("국어 점수");
            s.setKor(sc.nextInt());
            System.out.println("영어 점수");
            s.setEng(sc.nextInt());
            System.out.println("수학 점수");
            s.setMath(sc.nextInt());

            updata(index, s);
            System.out.println("수정되었습니다.");
        } else {
            // 이름이 없을 경우
            System.out.println("해당 회원이 없습니다.");
        }
    }

    // printAll
    public void printAll() {
        System.out.println("전체회원목록");
        int index = 1; // 지역변수 index
        for (int i = 0; i < slist.size(); i++) {
            System.out.println("<" + index + "." + slist.get(i).getName() + "회원 >");
            System.out.println("회원번호 : " + slist.get(i).getId());
            System.out.println("나이" + slist.get(i).getAge());
            System.out.println("국어 점수" + slist.get(i).getKor());
            System.out.println("영어 점수" + slist.get(i).getEng());
            System.out.println("수학 점수" + slist.get(i).getMath());
            index++;
        }
    }

    // File method
    public void dataSave() throws Exception {
        file.create();
        String str = " 번호\t 이름\t 나이\t 국어\n 영어\n 수학\n"
                + "-----------------------------\n";
        for (int i = 0; i < slist.size(); i++) {
            str += slist.get(i).toString() + "\n";
        }
        System.out.println("데이터를 저장했습니다.");
        file.write(str);
    }

    // dataLoad
    public void dataLoad() {
        try {
            file.read();
        } catch (Exception e) {
            System.out.println("읽을 파일이 없습니다.");
        }
    }
}
