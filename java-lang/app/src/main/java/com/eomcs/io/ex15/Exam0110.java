package com.eomcs.io.ex15;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.util.Arrays;
import java.util.Base64;
import java.util.Base64.Encoder;

public class Exam0110 {
  public static void main(String[] args) throws Exception {

    Encoder encoder = Base64.getEncoder();

    File file = new File("./temp/photo.jfif");
    FileInputStream in = new FileInputStream("./temp/photo.jfif");
    FileWriter out = new FileWriter("./temp/photo.txt");

    byte[] buf = new byte[(int) file.length()];
    int len = in.read(buf);
    System.out.printf("읽은 바이트 수: %d", len);

    String encodedStr = encoder.encodeToString(Arrays.copyOf(buf, len));

    out.write(encodedStr);

    in.close();
    out.close();
  }
}
