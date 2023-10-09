package homework.a1006;

public class B3 {
    public static void main(String[] args) {
        
        int[] nums = {1, 2, 3, 2, 4, 2, 5};
        int targetValue = 2;
        int frequency = 0;
    
        for(int num :nums) {
            if(num == targetValue){
                frequency++;
            }
        }
        System.out.println(targetValue + "의 빈도수는 " + frequency + "이다");
    }
}
