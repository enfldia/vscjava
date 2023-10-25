package a1025.ch18.sec2;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteExample {
    public static void main(String[] args) {
        try {
            OutputStream os = new FileOutputStream("c:/Temp/test1.db"); //데이터 도착지를 test1.db 파일로 하는 바이트 출력 스트림 생성

            byte a = 10;    
            byte b = 20;
            byte c = 30;

            os.write(a);    //1byte 씩 출력
            os.write(b);
            os.write(c);

            os.flush();     //내부 버퍼에 잔류하는 바이트를 출력하고 버퍼를 비움
            os.close();     //출력 스트림을 닫아 사용한 메모를 해제
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
