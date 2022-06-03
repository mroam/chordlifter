

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class SongTest.
 *
 * @author Mike Roam
 * @version 2022 May 19
 */
public class SongTest
{
    /**
     * Default constructor for test class SongTest
     */
    public SongTest()
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
    public void testSongText()
    {
        Song desi = new Song();
        assertNull(desi.play());
        desi.getText();
        assertEquals("Don't sit under the apple tree {Am} with anybody else.", desi.play());
    }

    @Test
    public void SongTest2()
    {
        Song yikes = new Song();
        yikes.getText();
        yikes.getText();
        assertEquals("hi", yikes.toString());
    }
}



