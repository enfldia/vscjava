package a1005;

public class A1005_4 {
    public static void main(String[] args) {
        String ssn = "9506241230123";
        char sex = ssn.charAt(6);
        switch (sex) {
            case '1':
            case '3':
            System.out.println("남자입니다.");
            break;
            case '2':
            case '4':
            System.out.println("여자입니다");
            break;
        }
    }
}//이것이 자바다 158p