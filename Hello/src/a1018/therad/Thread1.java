package a1018.therad;

public class Thread1 {
    public static void main(String[] args) {
        Sample sample = new Sample();
        sample.start(); //start()로 쓰레드를 실행한다.
    }
    
}

class Sample extends Thread{
    public void run(){ //thread 를 상속하면 run 메소드를 구현해야한다.
        System.out.println("thread run.");
    }
}
