package week4.day5.level2.test;

import org.junit.jupiter.api.Test;
import java.util.*;
import week4.day5.level2.main.*;
import static org.junit.jupiter.api.Assertions.*;

class ListManagerTest {
    ListManager manager = new ListManager();

    @Test void testAddElement() {
        List<Integer> list = new ArrayList<>();
        manager.addElement(list, 5);
        assertTrue(list.contains(5));
    }

    @Test void testRemoveElement() {
        List<Integer> list = new ArrayList<>(List.of(1, 2, 3));
        manager.removeElement(list, 2);
        assertFalse(list.contains(2));
    }

    @Test void testGetSize() {
        List<Integer> list = new ArrayList<>(List.of(1, 2, 3));
        assertEquals(3, manager.getSize(list));
    }
}

