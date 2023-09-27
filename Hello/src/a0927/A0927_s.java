package a0927;

public class A0927_s {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        int z = (++x) + (y--);
        System.out.println(z);

        int score = 85;
        String reuslt = (!(score>90))? "가" : "나";
        System.out.println(reuslt);

        int pencils = 534;
        int sudents = 30;
        
        //학생 한 명이 가지는 연필 수
        int pencilsPerStudent = (pencils / sudents);
        System.out.println(pencilsPerStudent);

        //남은 연필 수
        int pencilsLeft = (pencils%sudents);
        System.out.println(pencilsLeft);

        int value = 356;
        System.out.println(value / 100 * 100);

        int lengthTop = 5;
        int lengthBottom = 10;
        int height = 7;
        double area =((lengthTop + lengthBottom)*height/2.0);
        // double area =((lengthTop + lengthBottom)*height*1.0/2);
        // double area =((double)(lengthTop + lengthBottom)*height/2);
        System.out.println(area);

        int q = 10;
        int a = 5;
        System.out.println((q>7) && (a<=5));
        System.out.println((q%3 == 2) || (a%2 != 1));
        System.out.println(q%3);
        System.out.println(a%2);

        double w = 5.0;
        double s = 0.0;
        double e = w%s;
        if (Double.isNaN(z)){
            System.out.println("0.0으로 나눌 수 없습니다.");
        }else {
            double result = e + 10;
            System.out.println("결과:" + result);
        }

    }
}
