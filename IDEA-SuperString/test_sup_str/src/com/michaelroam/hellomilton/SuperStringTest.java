package com.michaelroam.hellomilton;

import com.michaelroam.hellomilton.SuperString;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * The test class SuperStringTest.
 *
 * @author  Mike Roam
 * @version 2022 May 27
 *
 * New IntelliJ proj, w/o sample code. Using Java 11 & JUnit 5.
 * As suggested in intro
 * https://www.jetbrains.com/help/idea/creating-and-running-your-first-java-application.html#write-code
 * I've given this a package (com.michaelroam...
 * And have been able to compile, run Hello, and run SuperStringTest.
 * Has been told how to make JARS and has a run configuration to do so.
 *
 *
 *
 * Note: https://www.jetbrains.com/help/idea/testing.html#add-testing-libraries
 * has info about manually adding junit
 * (I'm trying java 11, and junit 5, pray for me)
 *
 * If junit isn't found, try IntelliJ's menu:
 * File:ProjectStructure:ProjectSettings:Libraries: "+"
 * choose fromMaven  (search w/ magnifyingGlass?) for something like
 * org.junit.jupiter:junit-jupiter:5.8.2
 *
 */
public class SuperStringTest
{
    /**
     * Default constructor for test class SuperStringTest
     */
    public SuperStringTest()
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

    // note: intelliJ's version is spelling out com.michaelroam.chordlifter.SuperString   ... overkill? courtesy? package? scope?
    @Test
    public void getWord2()
    {
        // given:
        SuperString supstr = new SuperString("Instructions for living a life:\nPay attention.\nBe astonished.\nTell about it.\n --Mary Oliver");

        // do:
        String actual = supstr.getWord( 2 );

        // then
        String expected = "for";
        assertEquals(expected, actual);
    }

    @Test
    public void getWord2yoiks()
    {
        // given:
        SuperString supstr = new SuperString("Instructions for living a life:\nPay attention.\nBe astonished.\nTell about it.\n --Mary Oliver");

        // do:
        String actual = supstr.getWord( 2 );

        // then
        String expected = "yoi" + "ks";
        assertEquals(expected, actual);
    }

    @Test
    public void getChord()
    {
        // given:
        SuperString supstr = new SuperString("{F G Em Am} /n {F}We're no strangers to {G}love.");

        // do:
        String actual = supstr.getChord( 1 );

        // then
        String expected = "{F}";
        assertEquals(expected, actual);
    }

    @Test
    public void getFirstChord( )
    {
        // given:
        SuperString supstr = new SuperString("{F}You know the rules and {G}so do I");

        // do:
        String actual = supstr.getFirstChord( );

        // check:
        String expected = "{F}";
        assertEquals(expected, actual);
    }

    @Test
    public void chopFirstChord( )
    {
        // given:
        SuperString supstr = new SuperString("{F}A full commitment's what I'm {G}thinking of");

        // do:
        String actual = supstr.chopFirstChord( );

        // check:
        String expected = "A full commitment's what I'm {G}thinking of";
        assertEquals(expected, actual);
    }

    @Test
    public void getFirstLyric( )
    {
        // given:
        SuperString supstr = new SuperString("Never gonna {F}give you {G}up, Never gonna {Em}let you {Am}down");
        // interesting: keep the space after "gonna" or NOT? What if it were deliberately two spaces??

        // do:
        String actual = supstr.getFirstLyric( );

        // check:
        String expected = "Never gonna";
        assertEquals(expected, actual);
    }

    @Test
    public void chopFirstLyric( )
    {
        // given:
        SuperString supstr = new SuperString("Never gonna r{F}un a{G}round and d{E}esert{Am} you");

        // do:
        String actual = supstr.chopFirstLyric( );

        // check:
        String expected = "{F}un a{G}round and d{E}esert{Am} you";
        assertEquals(expected, actual);
    }

    /*     * * * Silly to test this unless we know what the user is going to insert. Need to mock up!
    @Test
    public void userText()
    {
    // given:
    SuperString banjo = new SuperString();
    banjo.askUserForText();   // I put in by hand: (with quotes) "sometimes\nmelancholy leaves me breathless"
    assertEquals("sometimes\nmelancholy leaves me breathless", banjo.getText());
    }
     */

    /**
     * Trying to test getLine(x).
     * Edge cases:
     * [ ] null SuperString
     * [ ] using non-arg constructor (which makes "<empty text>"
     * [ ] empty SuperString
     * [ ] index out of bounds
     */
    @Test
    public void getLine()
    {
        // let's try null!??
        /* can it survive? NO: Can't call methods on a non-existent object, and can't
         * prevent someone from calling methods on a non-existent object.
         * IF we also have a static getLine( TextText myStr, int i )  THEN we could notice null
         * and return "".
         */

        // given:
        // SuperString txtOne = null;

        // do:
        // String actual = supstr.getLine(-1);

        // check:
        // String expected = "";
        // assertEquals(expected, actual);

        // assertEquals("", txtOne.getLine(-1) );
        // assertEquals("", txtOne.getLine(0) );
        // assertEquals("", txtOne.getLine(1) );
        // assertEquals("", txtOne.getLine(2) );

        // let's try empty but constructed. (non-arg constructor makes "<empty text>" !)
        // given:
        SuperString supstr = new SuperString( ); // can it survive?

        // do:
        String actual = supstr.getLine(-1);

        // check:
        String expected = "";
        assertEquals(expected, actual);

        // lots more tests, compressed, (not spelling out 'actual', 'expected').
        assertEquals("", supstr.getLine(0) );
        assertEquals("empty text", supstr.getLine(1) );
        assertEquals("", supstr.getLine(2) );

        // one liner without trailing '/n'
        // given:
        supstr.setText("line1");
        assertEquals("", supstr.getLine(-1));
        assertEquals("", supstr.getLine(0));
        assertEquals("line1", supstr.getLine(1));
        assertEquals("", supstr.getLine(2));

        // one liner WITH trailing '/n'
        // given:
        supstr.setText("line1/n");
        assertEquals("", supstr.getLine(-1));
        assertEquals("", supstr.getLine(0));
        assertEquals("line1", supstr.getLine(1));
        assertEquals("", supstr.getLine(2));

        // two liner WITH trailing '/n'
        // given:
        supstr.setText("line1/nline2/n");
        assertEquals("", supstr.getLine(0));
        assertEquals("line1", supstr.getLine(1));
        assertEquals("line2", supstr.getLine(2));
        assertEquals("", supstr.getLine(3));

        // two liner without trailing '/n'
        // given:
        supstr.setText("line1/nline2");
        // do and check:
        assertEquals("", supstr.getLine(0));
        assertEquals("line1", supstr.getLine(1));
        assertEquals("line2", supstr.getLine(2));
        assertEquals("", supstr.getLine(3));

        // two liner WITH trailing '/n'
        // given:
        supstr.setText("line1/nline2/n");
        // do and check:
        assertEquals("", supstr.getLine(0));
        assertEquals("line1", supstr.getLine(1));
        assertEquals("line2", supstr.getLine(2));
        assertEquals("", supstr.getLine(3));

        // three liner
        // given:
        supstr = new SuperString("line1/nline2/nline3");
        // do and check:
        assertEquals("line1/nline2/nline3", supstr.getText());
        assertEquals("", supstr.getLine(0));
        assertEquals("line1", supstr.getLine(1));
        assertEquals("line2", supstr.getLine(2));
        assertEquals("line3", supstr.getLine(3));
        assertEquals("", supstr.getLine(4));

        // // user input... silly to test
        // // supstr.askUserForText();  // if we could be sure they use "line1/nline2"
        // supstr.setText("line1/nline2");
        // assertEquals("", supstr.getLine(0));
        // assertEquals("line1", supstr.getLine(1));
        // assertEquals("line2", supstr.getLine(2));
        // assertEquals("", supstr.getLine(3));
    } // getLine( )

    /**
     * TODO make a more difficult test
     * [ ] with line breaks (?? can words wrap line: no, /n counts as space. Right??)
     *
     */
    @Test
    public void getWord()
    {
        // given:
        SuperString supstr = new SuperString("word1 word2  word.3");

        // do:
        String actual = supstr.getWord(-1);

        // check:
        String expected = "";
        assertEquals(expected, actual);

        // more tests, compressed, (not spelling out 'actual', 'expected').
        assertEquals("", supstr.getWord(0));
        assertEquals("wordl", supstr.getWord(1));
        assertEquals("word2", supstr.getWord(2));
        assertEquals("word.3", supstr.getWord(2));
        assertEquals("", supstr.getWord(10));
    }

    /**
     * TODO make a more difficult test
     * [ ] with line breaks (?? can words wrap line: no, /n counts as a char or NO??)
     */
    @Test
    public void getChar()
    {
        // given:
        SuperString supstr = new SuperString("line1");

        // do:
        String actual = supstr.getChar(-1);

        // check:
        String expected = "";
        assertEquals(expected, actual);

        // more tests, compressed, (not spelling out 'actual', 'expected').
        assertEquals("", supstr.getChar(0));
        assertEquals("l", supstr.getChar(1));
        assertEquals("i", supstr.getChar(2));
        assertEquals("", supstr.getChar(10));
    }
} // class SuperStringTest