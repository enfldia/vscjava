package a1004;

public class A1004_q3 {
    public static void main(String[] args) {
        int total = 0;
        int i = 0;
        for(i = 0; i<=100; i++){
            if(i%3 != 0){
                continue;
            }
            total += i;
            // if(i%3 == 0){
                // total += i;
            // }
        }
        System.out.println("1~"+ (i-1) + "까지의 3의 배수의 총합:" + total);
    }
}
