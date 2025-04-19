package week4.day3.level2;

import java.io.*;

public class ByteArray {
    public static void main(String[] args) throws IOException {
        File original = new File("original.jpg");
        File copy = new File("copy.jpg");

        byte[] data;

        try (FileInputStream in = new FileInputStream(original);
             ByteArrayOutputStream buffer = new ByteArrayOutputStream()) {
            int byteRead;
            while ((byteRead = in.read()) != -1) {
                buffer.write(byteRead);
            }
            data = buffer.toByteArray();
        }

        try (ByteArrayInputStream input = new ByteArrayInputStream(data);
             FileOutputStream out = new FileOutputStream(copy)) {
            int b;
            while ((b = input.read()) != -1) {
                out.write(b);
            }
        }

        System.out.println("Image copied as byte array.");
    }
}
