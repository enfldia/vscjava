package homework.a1011;

public class A59_2 {
    public static void main(String[] args) {
        int[] lotto = { 13, 23, 24, 35, 40, 45 };
        int bonus = 7;
        int[] myNumber = { 13, 23, 8, 35, 40, 45 };
        int count = 0;
        // int bonusCount = 0;
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (myNumber[i] == lotto[j]) {
                    count++;
                }
            }
        }
        if (count == 3) {
            System.out.println("5등입니다.");
            
        } else if (count == 4) {
            System.out.println("4등입니다.");
            
        } else if (count == 5) {
            if (bonus == 1) {
                System.out.println("2등입니다.");
            }
            System.out.println("3등입니다.");
        } else if (count == 6) {
            System.out.println("1등입니다.");
        } else {
            System.out.println("꽝입니다.");
        }

    }
}
