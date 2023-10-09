package homework.a1006;

public class B2 {
    public static void main(String[] args) {
        double[] values = {1.5, 2.5, 3.0, 4.5, 5.0};
        double sum = 0;
        for(int i=0;i<values.length;i++){
            sum += values[i];
        }
        /* for (double value : values) {
            sum += value;
        } */
        System.out.println(sum);
        double avg = sum/values.length;
        
        System.out.println(avg);
    }
}
