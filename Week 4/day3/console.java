package week4.day3.level1;

import java.io.*;

public class console {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             FileWriter writer = new FileWriter("userinfo.txt")) {

            System.out.print("Enter name: ");
            String name = reader.readLine();
            System.out.print("Enter age: ");
            String age = reader.readLine();
            System.out.print("Favorite programming language: ");
            String language = reader.readLine();

            writer.write("Name: " + name + "\nAge: " + age + "\nLanguage: " + language);
            System.out.println("Data saved to userinfo.txt");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

