package a0927;

public class A0927_5 {
    public static void main(String[] args) {
        int score = 85;
        char grade = (score > 90) ? 'A' : ( (score > 80) ? 'B' : 'c');
        System.out.println(score + "점은" + grade + "등급입니다.");
    }
}
