package com.eomcs.io.ex15;

import java.io.FileOutputStream;
import java.io.FileReader;
import java.util.Base64;
import java.util.Base64.Decoder;

public class Exam0120 {
  public static void main(String[] args) throws Exception {

    Decoder decoder = Base64.getDecoder();

    FileReader in = new FileReader("./temp/photo.jfif");
    FileOutputStream out = new FileOutputStream("./temp/photox.txt");

    char[] buf = new char[1000000];
    int len  = in.read(buf);
    System.out.printf("읽은 바이트 수: %d", len);

    byte[] decodedBytes = decoder.decode(String.valueOf(buf, 0, len));

    out.write(decodedBytes);

    in.close();
    out.close();
  }
}
