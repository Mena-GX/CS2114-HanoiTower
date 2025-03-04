// Virginia Tech Honor Code Pledge:
// Project 3 Spring 2024
// As a Hokie, I will conduct myself with honor and integrity at all times.
// I will not lie, cheat, or steal, nor will I accept the actions of those who
// do.
// -- Ximena Anahi Gomez De Dios (906590905)

package towerofhanoi;

import java.util.EmptyStackException;
import student.TestCase;

// -------------------------------------------------------------------------
/**
 * Testing the LinkedStack class to make sure all methods are working as they
 * should
 * 
 * @author menagdd
 * @version Feb 26, 2024
 */
public class LinkedStackTest
    extends TestCase
{
    // ~ Fields ................................................................
    private LinkedStack<String> theStack;

    // ~Public Methods ........................................................
    // ----------------------------------------------------------
    /**
     * Sets up the fields before every test method is run
     */
    public void setUp()
    {
        theStack = new LinkedStack<String>();
        theStack.push("one");
        theStack.push("two");
        theStack.push("three");
    }


    // ----------------------------------------------------------
    /**
     * Tests the size() method
     */
    public void testSize()
    {
        assertEquals(3, theStack.size());
    }


    // ----------------------------------------------------------
    /**
     * Tests the isEmpty() method
     */
    public void testIsEmpty()
    {
        assertFalse(theStack.isEmpty());
    }


    // ----------------------------------------------------------
    /**
     * Tests the clear() method
     */
    public void testClear()
    {
        theStack.clear();

        assertTrue(theStack.isEmpty());
    }


    // ----------------------------------------------------------
    /**
     * Tests the push() method
     */
    public void testPush()
    {
        theStack.push("four");

        assertEquals("four", theStack.peek());
    }


    // ----------------------------------------------------------
    /**
     * Tests the peek() method
     */
    public void testPeek()
    {
        assertEquals("three", theStack.peek());

        LinkedStack<String> ls = new LinkedStack<String>();

        Exception thrown = null;

        try
        {
            ls.peek();
        }
        catch (Exception e)
        {
            thrown = e;
        }

        assertNotNull(thrown);
        assertTrue(thrown instanceof EmptyStackException);
    }


    // ----------------------------------------------------------
    /**
     * Tests the pop() method
     */
    public void testPop()
    {
        assertEquals("three", theStack.pop());

        LinkedStack<String> ls = new LinkedStack<String>();

        Exception thrown = null;

        try
        {
            ls.peek();
        }
        catch (Exception e)
        {
            thrown = e;
        }

        assertNotNull(thrown);
        assertTrue(thrown instanceof EmptyStackException);
    }


    // ----------------------------------------------------------
    /**
     * Tests the toString() method
     */
    public void testToString()
    {
        String theStr = "[three, two, one]";

        assertEquals(theStr, theStack.toString());
    }
}
