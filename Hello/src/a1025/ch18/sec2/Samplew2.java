package a1025.ch18.sec2;

import java.io.FileOutputStream;
import java.io.IOException;

public class Samplew2 {
    public static void main(String[] args) throws IOException {
        FileOutputStream output = new FileOutputStream("c:/temp/out.txt");
        for(int i=1;i<11;i++){
            String data = i+"번째 줄입니다.\r\n";
            output.write(data.getBytes());
        }
        output.close();
    }

}
