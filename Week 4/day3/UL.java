package week4.day3.level2;

import java.io.*;

public class UL {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
             BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"))) {

            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line.toLowerCase());
                writer.newLine();
            }

            System.out.println("Converted and saved to output.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
