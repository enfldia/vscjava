package a1014.sec10exam02;

public class CastingExample {
    public static void main(String[] args) {
        //인터페이스 변수 선언과 구현 객체 대입
        Vehicle vehicle = new Bus();

        //인터페이스를  통해서 호출
        vehicle.run();
        // vehicle.checkFare();   인터페이스 바이크 변수에 버스 객체 값을 대입한거지 버스 자체가 된게 아니다. (x)
        //바이크에는 checkFare() 메소드가 없어서 작동이 불가능함

        //강제 타입 변환 후 호출
        Bus bus = (Bus) vehicle;
        bus.run();
        bus.checkFare(); // 강제로 다운스케일링이 되어서 바이클이 버스와 같게 된다.
    }
}
