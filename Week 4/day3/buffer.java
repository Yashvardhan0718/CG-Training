package week4.day3.level1;

import java.io.*;

public class buffer {
    public static void main(String[] args) throws IOException {
        copyWithBufferedStreams("bigfile.txt", "buffered_copy.txt");
        copyWithUnbufferedStreams("bigfile.txt", "unbuffered_copy.txt");
    }

    public static void copyWithBufferedStreams(String source, String dest) throws IOException {
        try (BufferedInputStream in = new BufferedInputStream(new FileInputStream(source));
             BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(dest))) {
            byte[] buffer = new byte[4096];
            long start = System.nanoTime();
            int bytesRead;
            while ((bytesRead = in.read(buffer)) != -1) {
                out.write(buffer, 0, bytesRead);
            }
            long end = System.nanoTime();
            System.out.println("Buffered copy time: " + (end - start) / 1_000_000 + " ms");
        }
    }

    public static void copyWithUnbufferedStreams(String source, String dest) throws IOException {
        try (FileInputStream in = new FileInputStream(source);
             FileOutputStream out = new FileOutputStream(dest)) {
            byte[] buffer = new byte[4096];
            long start = System.nanoTime();
            int bytesRead;
            while ((bytesRead = in.read(buffer)) != -1) {
                out.write(buffer, 0, bytesRead);
            }
            long end = System.nanoTime();
            System.out.println("Unbuffered copy time: " + (end - start) / 1_000_000 + " ms");
        }
    }
}
