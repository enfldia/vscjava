package a1004;

public class A1004_5 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 0;
        for(i=1; i<=100; i++){
            sum += i;
        }
        // System.out.println("1~100합 :" + sum);
        // System.out.println("1~"+ i + "합:" + sum); //i가 101 이면 for문을 빠져나옴
        System.out.printf("1~%d 합: %d/n", (i-1), sum);
    }
}
