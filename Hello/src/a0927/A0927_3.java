package a0927;

public class A0927_3 {
    public static void main(String[] args) {
        int num1 = 1;
        int result1 = num1 << 3;//2진수 우측으로 3칸 이동
        int result2 = num1 * (int) Math.pow(2, 3); //2의 3승
        System.out.println("result1:" +result1);
        System.out.println("result2:" +result2);

    }
}
