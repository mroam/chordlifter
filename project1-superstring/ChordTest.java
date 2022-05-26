import static org.junit.jupiter.api.Assertions.*;

class ChordTest {

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    @org.junit.jupiter.api.Test
    void sampleMethod() {
    }

    @org.junit.jupiter.api.Test
    public void ChordTest2()
    {
        Chord pam = new Chord();
        assertEquals(3, pam.sampleMethod(3));
    }
}
