package a1013.ch08sec02;

public class RemoteControlExample {
    public static void main(String[] args) {
        RemoteControl rc;

        //rc 변수에 Telecision 객체를 대입
        rc = new Television();
        rc.trunOn();
        //rx 변수에 Audio 객체를 대입(교체시킴)
        rc = new Audio();
        rc.trunOn();
    }
}
