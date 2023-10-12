package homework.a1012;

public class A65 {
    public static void main(String[] args) {
        for(int i=1; i <=100; i++){
            if(i/10%10 == 3|)
            if(i%10 == 3|i%10 == 6|i%10 == 9){
                System.out.println("짝");
                continue;
            }
            System.out.println(i);
        }
    }
}
