package a1025.ch18.sec2;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Samplew6 {
    public static void main(String[] args) throws IOException {
        PrintWriter pw = new PrintWriter("c:/Temp/out.txt");
        for(int i=1; i<11; i++){
            String data = i+" 번째 줄입니다.\r\n"; //줄바꿈
            pw.write(data);
        }
        pw.close();
        PrintWriter pw2 = new PrintWriter(new FileWriter("c:/Temp/out.txt",true));
        for(int i=21; i<31; i++){
            String data = i+" 번째 줄입니다.\r\n"; //줄바꿈
            pw2.write(data);
        }
        pw2.close();
    }

}
