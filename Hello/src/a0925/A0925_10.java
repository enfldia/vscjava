package a0925;

public class A0925_10 {
    public static void main(String[] args) {
        String name = "홍길동";
        String job ="프로그래머";
        System.out.println(name);
        System.out.println(job);
        
        String str = "나는 \"자바를\"를 배웁니다.";
        System.out.println(str);

        str = "번호\t이름\t직업"; // \t 는 teb의 이스케이프 문자이다.(띄어쓰기)
        System.out.println(str);
                //이스케이프 문자: 문자열 내에서 특수한 기능을 수행하는 문자
        System.out.print("나는\n"); // \n 는 new line의 이스케이프 문자이다.(줄바꿈) 
        System.out.print("자바를\n");
        System.out.print("배웁니다.");

    }
}
