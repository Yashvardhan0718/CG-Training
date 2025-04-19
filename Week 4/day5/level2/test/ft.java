package week4.day5.level2.test;

import org.junit.jupiter.api.Test;
import java.io.*;
import week4.day5.level2.main.file;
import static org.junit.jupiter.api.Assertions.*;

public class ft {
    file fp = new file();

    @Test void testWriteAndRead() throws IOException {
        String file = "testfile.txt";
        fp.writeToFile(file, "Hello");
        assertEquals("Hello", fp.readFromFile(file));
        new File(file).delete();
    }

    @Test void testFileNotFound() {
        assertThrows(IOException.class, () -> fp.readFromFile("nofile.txt"));
    }
}
