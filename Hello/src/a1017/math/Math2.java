package a1017.math;

public class Math2 {
    public static void main(String[] args) {
        System.out.println(Math.abs(-10));  //10
        System.out.println(Math.abs(-3.14));    //3.14
        System.out.println(Math.ceil(10.0));    //10.0
        System.out.println(Math.ceil(10.1));    //11.0
        System.out.println(Math.ceil(10.00000001)); //11.0

        System.out.println(Math.floor(10)); //10
        System.out.println(Math.floor(10.9));   //10

        System.out.println(Math.round(10.0));   //10.0
        System.out.println(Math.round(10.4));   //10.0
        System.out.println(Math.round(10.5));   //11.0

        System.out.println(Math.max(3.14, 3.14159));    //3.14519
        System.out.println(Math.min(3.14, 3.14159));    //3.14
        System.out.println();
        
        System.out.println(Math.max(-10, -11)); //-10
        System.out.println(Math.min(-10, -11)); //-11
        
        System.out.println((int)Math.pow(5, 2));    //25
        System.out.println((int)Math.sqrt(25)); //5
        
        System.out.println(Math.sin(Math.toRadians(30)));

        System.out.println(Math.sin(Math.PI/6));
        System.out.println(Math.tan(Math.toRadians(60)));

        System.out.println(Math.tan(Math.PI/4));

        System.out.println(Math.cos(Math.toRadians(60)));

        System.out.println(Math.PI/3);
    }
}
