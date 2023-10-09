package homework.a1006;

import java.util.Arrays;

public class B1 {
    public static void main(String[] args) {
        int[] num = {5,10,3,7,2,8};

        /* int max = num[0];
        for(int i=0; i<num.length;i++){
            if(max<num[i]){
                max = num[i];
            }
        }
        System.out.println("최대값은?"+max); */
        Arrays.sort(num);

        System.out.println(num[num.length-1]);
    }
}
