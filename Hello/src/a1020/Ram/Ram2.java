package a1020.Ram;


interface Calculator{
    int sum(int a, int b);
    // int mul(int a, int b) //람다는 단 한개만 선언 할 수 있다.
}

public class Ram2 {
    public static void main(String[] args) {
        Calculator mc = (int a, int b) -> a+b;
        // Calculator mc = (a,b) -> a+b; 데이터 형을 상속받기 때문에 생략이 가능하다.
        int result = mc.sum(3, 4);
        System.out.println(result);
    }
}
