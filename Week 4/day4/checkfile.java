package week4.day4;

import java.io.*;

public class checkfile {
    public static void main(String[] args) {
        try (FileReader reader = new FileReader("data.txt")) {
            int ch;
            while ((ch = reader.read()) != -1) {
                System.out.print((char) ch);
            }
        } catch (IOException e) {
            System.out.println("File not found");
        }
    }
}
