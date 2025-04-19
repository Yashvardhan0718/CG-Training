package week4.day5.level2.main;

import org.junit.jupiter.api.*;

import static org.junit.Assert.assertNotNull;

class DatabaseConnection {
    public void connect() { System.out.println("Connected"); }
    public void disconnect() { System.out.println("Disconnected"); }
}

class DatabaseConnectionTest {
    DatabaseConnection db;

    @BeforeEach void setUp() {
        db = new DatabaseConnection();
        db.connect();
    }

    @AfterEach void tearDown() {
        db.disconnect();
    }

    @Test void testConnection() {
        assertNotNull(db);
    }
}
