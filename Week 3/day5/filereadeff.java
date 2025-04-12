import java.io.*;

public class FileReadingEfficiency {

    public static void readWithFileReader(String filePath) throws IOException {
        FileReader reader = new FileReader(filePath);
        while (reader.read() != -1);
        reader.close();
    }

    public static void readWithInputStreamReader(String filePath) throws IOException {
        InputStreamReader reader = new InputStreamReader(new FileInputStream(filePath));
        while (reader.read() != -1);
        reader.close();
    }

    public static void measureTime(String filePath) throws IOException {
        long start = System.nanoTime();
        readWithFileReader(filePath);
        long fileReaderTime = System.nanoTime() - start;

        start = System.nanoTime();
        readWithInputStreamReader(filePath);
        long inputStreamReaderTime = System.nanoTime() - start;

        System.out.println("File: " + filePath);
        System.out.println("FileReader Time: " + fileReaderTime / 1_000_000.0 + " ms");
        System.out.println("InputStreamReader Time: " + inputStreamReaderTime / 1_000_000.0 + " ms");
        System.out.println();
    }

    public static void main(String[] args) throws IOException {
        measureTime("test_1mb.txt");
        measureTime("test_100mb.txt");
        measureTime("test_500mb.txt");
    }
}
