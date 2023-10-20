package a1020.Ram.sec1;

public class LambdaExample {
    public static void main(String[] args) {
        action((x,y)->{
            int result =  x + y;
            System.out.println("result: "+result);
        });

        action((x, y)->{
            int result = x - y;
            System.out.println("result: "+result);
        });
    }

    public static void action(Calcuable calcuable){
        int x = 10;
        int y = 4;
        //데이터 처리
        calcuable.clculate(x, y);
    }
}
