package a0926;

public class a0926_12 {
    public static void main(String[] args) {
        int apple = 1;
        int totalPieceUnit = apple * 10;
        int number = 7;

        double result = totalPieceUnit - number;
        System.out.println("10조각에서 남은 조각:" + result);
        System.out.println("사과 1개에서 남은 양:" + result/10.0);
    } // 부동 소수점 연산으로 정확한 값이 나오지 않는다.
}
