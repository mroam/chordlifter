

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class LineWithInternalChordsTest.
 *
 * @author  Mike Roam
 * @version 2022 May 20
 */
public class LineWithInternalChordsTest
{
    /**
     * Default constructor for test class LineWithInternalChordsTest
     */
    public LineWithInternalChordsTest()
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
    public void assignNull()
    {
        LineWithInternalChords LWIC = new LineWithInternalChords();
        LWIC.setMyLine("test");
        assertEquals("test", LWIC.toString());
        LWIC.setMyLine(null);
        assertEquals("", LWIC.toString());
    }

    
    @Test
    public void toLifted()
    {
        LineWithInternalChords myLWIC = new LineWithInternalChords("we're driving {G} Cadillacs in our dreams");
        assertEquals("we're driving {G} Cadillacs in our dreams", myLWIC.toString());
        LinesWithLiftedChords theLWLC = myLWIC.toLifted( );
        assertEquals("              G/nwe're driving Cadillacs in our dreams", theLWLC.toString());
    }
} // class LineWithInternalChordsTest




