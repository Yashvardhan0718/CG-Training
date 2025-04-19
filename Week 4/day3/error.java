package week4.day3.level3;

import java.io.*;

public class error {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("largefile.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.toLowerCase().contains("error")) {
                    System.out.println(line);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

