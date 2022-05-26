

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class ChordShifterTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class ChordShifterTest
{
    /**
     * Default constructor for test class ChordShifterTest
     */
    public ChordShifterTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {
    }

    @Test
    public void flatten()
    {
        LinesWithLiftedChords myLWLC = new LinesWithLiftedChords("              G",
            "we're driving Cadillacs in our dreams");
            
    }
    
    @Test
    public void liften()
    {
        LineWithInternalChords myLWIC = new LineWithInternalChords("we're driving {G} Cadillacs in our dreams");
        assertEquals("we're driving {G} Cadillacs in our dreams", myLWIC.toString());
        LinesWithLiftedChords theLWLC = ChordShifter.liften( myLWIC );
        assertEquals("              G/nwe're driving Cadillacs in our dreams", theLWLC.toString());
    }
}

