package a1005;

import java.util.Arrays;

public class A1005_15 {
    public static void main(String[] args) {
        // 1.배열 요소의 합:
        int sum = 0;
        int[] array = { 1, 2, 3, 4, 5 };
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println("배열 요소의 합은" + sum);

        // 2.최대값과 최소값 찾기
        int[] array1 = { 10, 5, 8, 21, 3 };

        Arrays.sort(array1);

        int x = array1.length;

        System.out.println("배열 중 최대 값은" + array1[x - 1]);
        System.out.println("배열 중 최소 값은" + array1[0]);

        // 강사님 풀이
        // int[] array = { 10, 5, 8, 21, 3 };
        // int max = array[0];
        // int min = array[0];

        // for (int i = 1; i < array.length; i++) {
        // if (array[i] > max) {
        // max = array[i];
        // }
        // if (array[i] < min) {
        // min = array[i];
        // }
        // }

        // System.out.println("최대값: " + max);
        // System.out.println("최소값: " + min);

        // 3배열 요소의 평균
        double sum2 = 0;
        double[] array2 = { 2.5, 3.0, 1.5, 4.0, 2.0 };

        for (int i = 0; i < array2.length; i++) {
            sum2 += array2[i];
        }
        double avg = sum2 / array2.length;

        System.out.println("배열 요소의 평균 값은" + avg);

        // 강사님 풀이
        // double[] array = { 2.5, 3.0, 1.5, 4.0, 2.0 };
        // double sum = 0;

        // for (int i = 0; i < array.length; i++) {
        // sum += array[i];
        // }

        // double average = sum / array.length;
        // System.out.println("배열 요소의 평균: " + average);

        // 배열 요소 뒤집기
        String[] array3 = { "apple", "banana", "cherry", "date" };
        int a = array3.length;
        String[] reverseArr = new String[a];
        for (int i = a - 1, j = 0; i >= 0; i--, j++) {
            reverseArr[j] = array3[i];
        }
        System.out.println("array3:" + Arrays.toString(array3));
        System.out.println("reverseArr:" + Arrays.toString(reverseArr));

        // 강사님 풀이
        // String[] array = { "apple", "banana", "cherry", "date" };

        // for (int i = 0; i < array.length / 2; i++) {
        //     String temp = array[i];
        //     array[i] = array[array.length - 1 - i];
        //     array[array.length - 1 - i] = temp;
        // }

        // System.out.println("배열 요소 뒤집기:");
        // for (String str : array) {
        //     System.out.println(str);
        // }

    }
}
