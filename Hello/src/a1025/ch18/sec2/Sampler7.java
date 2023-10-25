package a1025.ch18.sec2;

import java.io.FileInputStream;
import java.io.IOException;

public class Sampler7 {
    public static void main(String[] args) throws IOException {
        byte[] b = new byte[1024];
        FileInputStream input = new FileInputStream("c:/Temp/out.txt");
        input.read(b);
        System.out.println(new String(b));
        input.close();
    }

}
