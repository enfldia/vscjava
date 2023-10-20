package a1020.Ram;


interface Calculator{
    int sum(int a, int b);
    
}

public class Ram3 {
    public static void main(String[] args) {
        // Calculator mc = (int a, int b) -> a+b;
        // Calculator mc = (a,b) -> a+b; 데이터 형을 상속받기 때문에 생략이 가능하다.
        // Calculator mc = Integer.sum(a, b);
        Calculator mc = Integer::sum;
        int result = mc.sum(3, 4);
        System.out.println(result);
    }
}
