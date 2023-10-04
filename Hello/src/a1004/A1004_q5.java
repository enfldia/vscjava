package a1004;

public class A1004_q5 {
    public static void main(String[] args) {
        for (int x = 1; x <= 10; x++) {
            for (int y = 1; y <= 10; y++) {
                int total = x * 4 + y * 5;
                if (total == 60) {
                    System.out.println("(" + x + "," + y + ")");
                }
            }
        }

        // for (int x = 0; x <= 10; x++) {
        //     for (int y = 0; y <= 10; y++) {
        //         if ((4*x + 5*y == 60)) {
        //             System.out.println("(" + x + "," + y + ")");
        //         }
        //     }
        // }
    }
}
