package homework.a1018;

import java.util.ArrayList;

public class ArrayList1 {
    public static void main(String[] args) {
        
        ArrayList<Integer> arrList = new ArrayList<Integer>();
        
        arrList.add(1);
        arrList.add(2);
        arrList.add(3);
        arrList.add(4);
        arrList.add(5);
        int sum = 0;
        for(int e : arrList){
            sum += e;
            System.out.println(sum);
        }

        ArrayList<String> arrList2 = new ArrayList<String>();

        arrList2.add("apple");
        arrList2.add("banana");
        arrList2.add("chery");
        arrList2.add("date");

        arrList2.remove("banana");
        System.out.println(arrList2);

    }
}
