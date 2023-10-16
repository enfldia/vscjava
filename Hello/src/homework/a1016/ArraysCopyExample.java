package homework.a1016;

import java.util.Arrays;

public class ArraysCopyExample {
    public static void main(String[] args) {
        int[] sourceArray = {1,2,3,4,5};
        int[] destinationArray = new int[sourceArray.length];
        System.arraycopy(sourceArray, 0, destinationArray, 0, sourceArray.length);
        System.out.println("sourceArray" + Arrays.toString(destinationArray));
    }
}
