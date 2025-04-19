package week4.day3.level3;

import java.io.*;

public class prim {
    public static void main(String[] args) {
        try (DataOutputStream out = new DataOutputStream(new FileOutputStream("students.dat"))) {
            out.writeInt(101);
            out.writeUTF("Alice");
            out.writeDouble(8.5);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (DataInputStream in = new DataInputStream(new FileInputStream("students.dat"))) {
            int roll = in.readInt();
            String name = in.readUTF();
            double gpa = in.readDouble();
            System.out.println(roll + " | " + name + " | GPA: " + gpa);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
